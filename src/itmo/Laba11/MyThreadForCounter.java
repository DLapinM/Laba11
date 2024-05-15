package itmo.Laba11;

import java.util.concurrent.CountDownLatch;

public class MyThreadForCounter implements Runnable
{
    private final Counter c;
    private final CountDownLatch l;

    public MyThreadForCounter(Counter c, CountDownLatch l)
    {
        this.c = c;
        this.l = l;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 1000; i++)
        {
            c.increment();
        }
        l.countDown();
    }
}
