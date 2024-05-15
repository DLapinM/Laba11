package itmo.Laba11;

public class Counter
{
    private int count = 0;

    public synchronized void increment()
    {
            count = count + 1;
    }
    public synchronized int getCount()
    {
        return count;
    }
}

