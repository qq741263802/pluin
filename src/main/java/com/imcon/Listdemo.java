package com.imcon;
import java.util.*;
import com.common.Getuuid;
public class Listdemo {

    public void  Listtest()
    {

     /*   Notice no=new Notice(Getuuid.get32UUID(),"封装","mr_li",new Date());
        Notice no1=new Notice(Getuuid.get32UUID(),"多态","mr_li",new Date());
        Notice no2=new Notice(Getuuid.get32UUID(),"继承","mr_li",new Date());
        ArrayList list=new ArrayList();
        list.add(no);
        list.add(no1);
        list.add(no2);
        list.remove(1);

        for(int i=0; i<list.size();i++)
        {

            System.out.println(((Notice)list.get(i)).getTitle());
            System.out.println(((Notice)list.get(i)).getId());

        }*/

//        Set set = new HashSet();
//        set.add("封装");
//        set.add("封装1");
//        set.add("封装2");
//        Iterator it=set.iterator();
//        while (it.hasNext())
//        {
//
//            System.out.println(it.next());
//
//        }
        String name = "k2";

        Map<String,String> m=new HashMap<String, String>();
        m.put(Getuuid.get32UUID(),"k2");

        Iterator<String> it=m.values().iterator();
        //Iterator it=m.keySet().iterator();
      //  System.out.println(it.next());
        System.out.println(it.next().equals(name));







    }




}



