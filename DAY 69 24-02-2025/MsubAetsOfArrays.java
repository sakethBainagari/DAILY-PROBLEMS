
//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/subsets-of-an-array?page=2&pageSize=10


import java.util.*;

public class MsubAetsOfArrays {

    public static void printList(List<Integer> list){
        for(int lis:list){
            System.out.print(lis+" ");
        }
        System.out.println();
    }

    public static void genSubArr(int[] a,int start,List<Integer> current){
        if(start == a.length){
            return;
        }

        current.add(a[start]);
        printList(current);
        genSubArr(a,start+1,current);
        current.remove(current.size()-1);
        genSubArr(a,start+1,current);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc  = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
            }

            Arrays.sort(a);
            List<List<Integer>> res = new ArrayList<>();

            genSubArr(a,0,new ArrayList<>());
            System.out.println();

        }
    }
}