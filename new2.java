public class new2 {
    public static void main(String[] args) {
        String arr[]={"kamlesh","mehta","kamlesh","lad","lad","ld","ld","a","a"};

        int max=100;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    if(arr[i].length()<max){
                        max=arr[i].length();
                    }
                }
            }
        }
        System.out.println(max);
        for(String a:arr){
            if(a.length()==max){
                System.out.print("is smallest :"+a);
                break;
            }
        }
    }
}
