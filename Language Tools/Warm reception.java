import java.util.*;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i =0;i<n;i++){
            int arr = sc.nextInt();
            ArrayList<Integer> small = new ArrayList<>();
            small.add(arr);
            small.add(0);
            list.add(small);
        }

        for(int i = 0;i<n;i++){
            int dep = sc.nextInt();
            ArrayList<Integer> small = new ArrayList<>();
            small.add(dep);
            small.add(1);
            list.add(small);
        }


        Collections.sort(list , new Comparator<ArrayList<Integer>>(){
            public int compare (ArrayList<Integer> l1 , ArrayList<Integer>l2){
                return l1.get(0)  - l2.get(0);
            }
        });

        int max=0,count=0;
        for(int i = 0;i<list.size();i++){
            if(list.get(i).get(1)==0)count++;
            else count--;
            max = Math.max(max , count);
        }

        System.out.println(max);
    }

}
