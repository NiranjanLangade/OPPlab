import java.util.*;

public class Question_15 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Niranjan");
        list.add("Rajkiran");
        list.add("Langade");

        System.out.println("Iterating using for loop : ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println();
        System.out.println("Iterating using advanced for loop : ");
        for(String word : list){
            System.out.println(word);
        }

        System.out.println();
        System.out.println("Iterating using iterator : ");
        ListIterator<String> i = list.listIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
