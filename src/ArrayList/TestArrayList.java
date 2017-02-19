package ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

/**
 * Created by Echo01 on 2/19/2017.
 */
public class TestArrayList {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        //List m1 = Collections.synchronizedList(a.getArrayList()); -->> synchronized ArrayList creation method

        ArrayListClass a = new ArrayListClass(m);
        for(int i=0;i<m;i++){
            a.insert(i);
        }
        Object k2[]=a.convertToArray();
        System.out.println("Initial array list A:");
        for(Object obj : k2){
            System.out.print(obj+" ");
        }
        System.out.println("");
        for(int i=0;i<m;i++){
            a.insert(i,i+10);
        }
        k2=a.convertToArray();
        System.out.println("Array list A after modified insert method: ");
        for(Object obj : k2){
            System.out.print(obj+" ");
        }
        System.out.println();
        for(int i=0;i<m;i++){
            a.removeFromList(i);
        }
        k2=a.convertToArray();
        System.out.println("Array list A after some removal from the beginning: ");
        for(Object obj : k2){
            System.out.print(obj+" ");
        }
        System.out.println();
        //Note that the memory address is dynamic,so the output is not continuous as expected.SO please be careful

        ArrayListClass b = new ArrayListClass(m);
        for(int i=1;i<=m;i++){
            b.insert(i);
        }
        Object k[] = b.convertToArray();
        System.out.println("Contents of OBJ B converted into an array");
        for(Object obj : k){
            System.out.print(obj+" ");
        }
        System.out.println(" ");

        ArrayListClass c = new ArrayListClass(b.getArrayList());
        c.increaseSizeBy(c.getSizeofArrayList());
        Object k3[] = c.convertToArray();
        System.out.println("Contents of OBJ C converted into an array");
        for(Object obj : k3){
            System.out.print(obj+" ");
        }
        System.out.println(" ");
        // Do not do the following three lines.This will screw your JVM heap resulting in your CPU getting juiced out.
        //It results in an infinite loop for as long as the heap holds out
        /*long mb = 1048576;
        Runtime runtime = Runtime.getRuntime();
        long count = 0;
         for(int i=0;i<c.getSizeofArrayList();i++){
             c.insert(i);
             count = runtime.freeMemory()/mb;  //Compute the remaining heap space
             System.out.println(count);
             System.out.println(c);
             //System.gc(); <--Explicitly call Garbage Collector
        }*/
    }
}
