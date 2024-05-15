package itmo.Laba11;

import java.util.*;

public class MyThread extends Thread
{
    private int threadNum;

    public MyThread(int threadNum)
    {
        super();
        this.threadNum = threadNum;
        System.out.println("Создан поток №" + this.threadNum);
    }

    @Override
    public void run()
    {
        System.out.println("Поток №" + this.threadNum + " стартован");

        for(int i = 1; i <= 100; i++)
        {
            System.out.println("Поток №" + this.threadNum + " выводит число: " + i);
        }

        System.out.println("Поток №" + this.threadNum + " завершил работу");
    }
}
