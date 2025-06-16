public class Clock{
 public static void main(String[] args){

int[] arr = {1,3,5,4,7,7};

int n = 6;
int Largest = -1;
int secondL = -1;
for(int i = 0;i<n;i++){
if(arr[i]>Largest){
secondL = Largest;
Largest = arr[i];
}
if(arr[i]>secondL && arr[i]<Largest){
secondL = arr[i];

}
}
 System.out.println(secondL);	
}
}