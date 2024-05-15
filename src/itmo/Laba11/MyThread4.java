package itmo.Laba11;

public class MyThread4 extends Thread
{
    private final Integer lock;
    private final String name;

    public MyThread4(Integer lock, String name)
    {
        this.lock = lock;
        this.name = name;
    }

    @Override
    public void run()
    {
        synchronized (lock)
        {
            while (true)
            {
                System.out.println("Поток: " + getName() + ", имя: " + name);
                lock.notify();
                try
                {
                    lock.wait();
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
