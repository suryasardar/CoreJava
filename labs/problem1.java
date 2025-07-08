import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int b[][]={{1,2,3},{4,5,6},{7,8,9}};
int sum[][]=new int[a.length][a[0].length];

int j=0;
for(int i=0; i<a.length; i++){
        sum[j][i]=a[j][i] + b[j][i];
        if(i==a[0].length-1){
            if(j==a.length-1){
                break;
            }
            j++;
            i=-1;
        } 
}

for(int i=0; i<sum.length; i++){
    for(int k=0; k<sum[0].length; k++){
        System.out.print(sum[i][k]+ "|" );
    }
    System.out.println();
}

    }
}