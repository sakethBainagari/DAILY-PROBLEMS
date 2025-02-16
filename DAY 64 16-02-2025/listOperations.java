
//https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/list-operations?page=2&pageSize=10
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        s.nextLine();
        for(int i=0;i<n;i++){
            String inp = s.nextLine();
            String[] parts = inp.split(" ");
            switch (parts[0]){
                case "append":
                    int x1 = Integer.parseInt(parts[1]);
                    list.add(x1);
                    printList(list);
                    break;
                case "insert":
                    int pos = Integer.parseInt(parts[1]);
                    int x2 = Integer.parseInt(parts[2]);
                    list.add(pos,x2);
                    printList(list);
                    break;

                case "index":
                    int x3 = Integer.parseInt(parts[1]);
                    System.out.println(list.indexOf(x3));
                    break;
                case "reverse":
                    Collections.reverse(list);
                    printList(list);
                    break;

                case "count":
                    int x4 = Integer.parseInt(parts[1]);
                    int cnt = Collections.frequency(list,x4);
                    System.out.println(cnt);
                    break;
                case "length":
                    int len = list.size();
                    System.out.println(len);
                    break;
                case "sort":
                    Collections.sort(list);
                    printList(list);
                    break;
                case "extend":
                    list.addAll(new ArrayList<>(list));
                    printList(list);
                    break;
                default:
                    System.out.println("Invalid Command");
                    break; 
           }
        }
    }
    public static void printList(List<Integer> list){
        for( int num:list){
            System.out.print(num + " ");

        }
        System.out.println();
    }



}