public class SecondLargestElement{
 public static void main(String[] args){

 int[] arr = {1,2,4,7,7,5};

 //int[] arr = {1,2,4,7,7,5};

int n = 6;
int largest = -1;

int secondL = -1;
 for(int i=0;i<n;i++){

 if(arr[i]>largest){
 secondL = largest;
 largest = arr[i];
}

if(arr[i]>secondL && arr[i] < largest){
 secondL = arr[i];
}

}
System.out.println(secondL);


 }

 }