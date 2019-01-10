package cn.zzk.demo;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class test22 {
       
    public static void main(String[] args) {
        ConcurrentMap<String,Integer> con=new ConcurrentHashMap<String,Integer>();
        Hashtable<String,Integer>  gg=new Hashtable<>();
        con.put("1",11);
        con.put("2",22);
        con.put("3",333);
        con.put("4",444);
        con.put("5",444);
        con.put("6",444);
        con.put("7",444);
        con.put("8",444);
        con.put("9",444);
        con.put("10",444);
        con.put("11",444);
        con.put("12",444);
        con.put("13",444);
        con.put("14",444);
        con.put("15",444);
        con.put("16",444);
        con.put("17",444);
        con.put("18",444);
        con.put("19",444);
        System.out.println(con.get("1"));
    }
}
