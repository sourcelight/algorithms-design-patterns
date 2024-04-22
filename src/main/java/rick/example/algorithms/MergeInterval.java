/**
 * @author: Riccardo_Bruno
 * @project: design-pattern
 */


package rick.example.algorithms;


import java.util.*;

class Interval {
    int start;
    int end;

    public Interval() {
    }

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Interval{" + "start=" + start + ", end=" + end + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return start == interval.start && end == interval.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
}

public class MergeInterval {


    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> mergedIntervals = new LinkedList<>();

        Set<Interval> set = new HashSet<>();

        Collections.sort(intervals, (i1, i2) -> i1.start - i2.start);

//        Collections.sort(intervals, (a,b) -> Integer.compare(a.start,b.start));

        if (intervals == null || intervals.isEmpty()) {
            return mergedIntervals;
        }

        if (intervals.size() < 2) {
            return intervals;
        }

        Iterator<Interval> intIterator = intervals.iterator();

        Interval firstInterval = intIterator.next();
        int start = firstInterval.start;
        int end = firstInterval.end;


        while (intIterator.hasNext()) {

            Interval next = intIterator.next();
            if (next.start <= end) {
                end = Math.max(end, next.end);
            } else {
                mergedIntervals.add(new Interval(start, end));
                start = next.start;
                end = next.end;
            }
            Interval newI = new Interval(start, end);
            if (!set.contains(newI)) {
                mergedIntervals.add(newI);
                set.add(newI);
            }
        }


        return mergedIntervals;
    }

    //Steps
    //we check interceptions
    //we merge the 2 intervals
    //we proceed with the followings

    static boolean check(Interval i1, Interval i2) {
        if (i2.start > i1.start || i2.end > i1.start) {
            return false;
        }
        return true;
    }

    static Interval mergeIntervals(Interval i1, Interval i2) {
        Interval interval = new Interval();

        if (i1.start <= i2.start) {
            interval.setStart(i1.start);
        } else {
            interval.setStart(i2.start);
        }

        if (i1.end <= i2.end) {
            interval.setEnd(i2.end);
        } else {
            interval.setEnd(i1.end);
        }
        return interval;
    }

    ;


    public static void main(String[] args) {


        List<Interval> inputIntervals = new ArrayList<>();
        inputIntervals.add(new Interval(1, 4));
        inputIntervals.add(new Interval(2, 5));
        inputIntervals.add(new Interval(7, 9));
        //inputIntervals.add(new Interval(4, 5));

//        System.out.println("Before Ordering:" + inputIntervals);
//
//        Collections.sort(inputIntervals, (i1, i2) -> (i1.start - i2.start));
//
//        System.out.println("After Ordering:" + inputIntervals);


        List<Interval> inputIntervals1 = new ArrayList<>();
        inputIntervals1.add(new Interval(6, 7));
        inputIntervals1.add(new Interval(2, 4));
        inputIntervals1.add(new Interval(5, 9));


        List<Interval> inputIntervals2 = new ArrayList<>();
        inputIntervals2.add(new Interval(1, 4));
        inputIntervals2.add(new Interval(2, 6));
        inputIntervals2.add(new Interval(3, 5));


//        System.out.println("before merging:"+inputIntervals);
//        System.out.println("after merging:"+merge(inputIntervals));

//        System.out.println("after merging:"+merge(inputIntervals1));

        System.out.println("after merging:" + merge(inputIntervals2));


    }

}
