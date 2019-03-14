package cn.blackfish.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        // 使用 System.in 创建 BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str;
//        System.out.println("Enter lines of text.");
//        System.out.println("Enter 'end' to quit.");
//        do {
//            str = br.readLine();
//            System.out.println(str);
//        } while (!str.equals("end"));

//        Map<Object, Object> map = new HashMap<>();
//        map.put("1","nvlang");
//        map.put("2","nanhai");
//        Set<Map.Entry<Object, Object>> entries = map.entrySet();
//        Set<Object> objects = map.keySet();
//        for (Object key: objects
//             ) {
//        }
//        for (Map.Entry entry: entries
//             ) {
//            System.out.println((String) entry.getKey()+":"+(String) entry.getValue()+"---");
//
//        }
        dispatch();
    }

    public  static  void dispatch(){

        int[] ints = new int[50];
        Map<Object, Object> map = new HashMap<>();

        for(int i=1;i<=100;i++){

            if(i%2==0){
                map.put(7+i/2-1,i);
            }else{
                ints[(i-1)/2] = i;
            }
        }

        for (int i:ints) {
            System.out.println(i);
        }

        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        for (Map.Entry<Object, Object> entry: entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}


