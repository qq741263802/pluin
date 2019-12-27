package com.imooc.test;

import java.util.List;

public class SingletonOne {

  private  SingletonOne()
  {


  }

  private static SingletonOne  si=new SingletonOne();


    public static SingletonOne getInstance()
    {

        return si;


    }

    public void  shlog()
    {

        String [] str ={"数组"};
        System.out.println("打印");



    }


}
