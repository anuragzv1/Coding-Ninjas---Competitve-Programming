import java.util.Scanner;

class City{
    int start;
    int end;
    int happiness;

    City(int s , int e , int h){
        this.start = s;
        this.end = e;
        this.happiness = h;
    }
}


public class Main {

    public static double distance(City city1 , City city2){
        return Math.sqrt(Math.pow(city1.start - city2.start , 2) + Math.pow(city1.end - city2.end , 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        City arr[] = new City[n];
        for(int i = 0;i<n;i++){
            arr[i] = new City(sc.nextInt(), sc.nextInt() , sc.nextInt());
        }

        double dp[] = new double [n];
        dp[0] = arr[0].happiness;

        for(int i =1;i<n;i++){
            double cur_profit = -999999999.000;
            for(int j = i-1;j>=0;j--){
                cur_profit = Math.max(cur_profit , dp[j]+arr[i].happiness - distance(arr[i] , arr[j]));
            }
            dp[i] = cur_profit;
        }

        System.out.println(String.format("%6f",dp[n-1]));
    }

}


