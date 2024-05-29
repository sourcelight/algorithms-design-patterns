package rick.example.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.util.*;

class StockPriceTest {

    @Test
    void update() {
    }

    @Test
    void current() {

        StockPrice1 stockPrice = new StockPrice1();
        stockPrice.update(1, 10);
        //stockPrice.update(2, 10);
        //stockPrice.update(3, 10);
        //stockPrice.update(4, 10);
        stockPrice.update(2, 5);
        //stockPrice.update(1, 3);
        int actualStock = stockPrice.current();
        int expectedStock = 5;
        Assert.assertEquals(expectedStock, actualStock);

        int actualStock1 =  stockPrice.max();
        int expectedStock1 = 10;
        Assert.assertEquals(expectedStock1, actualStock1);

        stockPrice.update(1, 3);
        int actualStock2 =  stockPrice.max();
        int expectedStock2 = 5;
        Assert.assertEquals(expectedStock2, actualStock2);
        Collection<String> c = new TreeSet<String>();
        LinkedList<String> l = new LinkedList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        System.out.println("before"+l);
        Iterator<String> itr= l.iterator();

        while(itr.hasNext()){
            String str= itr.next();
            System.out.println("single element: "+str);
            itr.remove();
        }
        System.out.println("after"+l);


    }

    @Test
    void maximum() {
    }

    @Test
    void minimum() {
    }
}