import java.util.*;


class Student{
    int a;
    int b;
    int c;
    int sum;
    String name;
    int rollNo;
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student starray [] = new Student [n];

        for(int i=0;i<n;i++){
            starray[i] = new Student();
            starray[i].name = sc.next();
            starray[i].a = sc.nextInt();
            starray[i].b = sc.nextInt();
            starray[i].c = sc.nextInt();
            starray[i].rollNo = i;
            starray[i].sum =  starray[i].a + starray[i].b + starray[i].c;
        }

        Arrays.sort(starray , new Comparator<Student>(){
            public int compare(Student s1 , Student s2){
                if(s1.sum==s2.sum){
                    return s1.rollNo - s2.rollNo;
                }else{
                    return s2.sum - s1.sum;
                }
            }
        });

		
        for(int i =0;i<n;i++){
            System.out.println((i+1)+" "+starray[i].name);
        }

    }
}
