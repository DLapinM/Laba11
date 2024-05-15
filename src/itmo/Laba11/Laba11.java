package itmo.Laba11;

import java.util.*;
import java.util.concurrent.CountDownLatch;

public class Laba11
{
    public static void main(String[] args)
    {
        /** Лаба 11. Упражнения 1 и 2. */

        for (int j=1;j<=10;j++)
        {
            new MyThread(j).start();
        }

        /** Лаба 11. Упражнение 3. */

        int n = 100;

        Counter counter = new Counter();
        Thread[] runnable = new Thread[n];
        CountDownLatch latch = new CountDownLatch(n);

        for (int i = 0; i < n; i++)
        {
            runnable[i] = new Thread(new MyThreadForCounter(counter, latch));
            runnable[i].start();
        }

        try
        {
            latch.await();
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());

        /** Лаба 11. Упражнение 4. */

        Integer lock = 0;

        MyThread4 th1 = new MyThread4(lock, "Поток 1");
        MyThread4 th2 = new MyThread4(lock, "Поток 2");

        th1.start();
        th2.start();

    }
}
