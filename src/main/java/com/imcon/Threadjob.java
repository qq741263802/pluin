package com.imcon;

 class Threadjob extends Thread{


    public void run()
    {
        System.out.println("线程启动");

    }
}


class TestThreadjob {

public static  void  main(String [] args)
{

    Threadjob mm=new Threadjob();
    mm.start();

}

}