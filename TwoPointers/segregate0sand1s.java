public class segregate0sand1s {
    void segregate0and1(int[] arr) {
        // code here
        int i=0; int j=arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
            }
            else if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
            }
           
        }
        
    }
}
