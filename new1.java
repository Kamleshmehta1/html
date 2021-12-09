public class new1 {
    static void unCommon(int arr1[],int arr2[]){
        int i=0,j=0,k=0;
        while((i<arr1.length)&&(j<arr2.length)){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                k++;
            }
            else if(arr2[j]<arr1[i]){
                System.out.print(arr2[j]+" ");
                k++;
                j++;
            }
            else {
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            System.out.print(arr1[i]+" ");
            i++;
            k++;
        }
        while(j<arr2.length){
            System.out.print(arr2[j]+" ");
            j++;
            k++;
        }
        System.out.println("");
        System.out.print("Uncommon numbers: "+k);
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2};
        unCommon(arr1,arr2);
    }
}