package ArrayList; /**
 * Created by Echo01 on 2/19/2017.
 */
import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListClass {

    private ArrayList arrayList;

    ArrayListClass(){
        arrayList = new ArrayList();//creates empty array list object with init size of 10
    }
    ArrayListClass(int n){
        arrayList = new ArrayList(n);//creates an array list with a user defined size
    }
    ArrayListClass(Collection c){
        arrayList = new ArrayList(c);//create an Array List with a collection object
    }


    ArrayList insert(int n){
       arrayList.add(n);//new_size = (current_size * 1.5)+1 ----> rule followed internally for creating a new array list and then copying elements into it
       return arrayList;
    }
    ArrayList insert(int x,int y){
        arrayList.add(x,y);
        return arrayList;
    }
    ArrayList insert(ArrayList listArray){
       arrayList.addAll(listArray);//Copy a different collection object
       return arrayList;
    }
    void removeFromList(int index,ArrayList a){
        arrayList=a;
      a.remove(index);//Remove an object at the specified index
    }
    void removeFromList(int index){
        arrayList.remove(index);
    }
    void removeAllElements(ArrayList a){
       a.clear();//Clear all the elements from the array list
    }
    void increaseSizeBy(int m){
        arrayList.ensureCapacity(arrayList.size()+m);//set minCapacity in advance
    }
    Object[] convertToArray(){
        return arrayList.toArray();//convert array list as an array
    }
    int getSizeofArrayList(){
        return arrayList.size();//returns the number of elements a.k.a. size of the ArrayList
    }
    ArrayList getArrayList(){
        return arrayList;
    }

}
