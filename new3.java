public class new3{
    public static int atoi(String s){
        int result=0;
        for(int i=0;i<s.length();i++){
            result=result*10+s.charAt(i)-'0';
        }
        return result;
    }
    public static String convert(String s[],int blank[]){
        String random="";
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length();j++){
                if(s[i].charAt(j)!=' '){
                    random+=s[i].charAt(j);
                }
            }
        }
        return random;
    }
    public static void main(String[] args) {
        String s[]={"1 2 3","4 5 6","7 8 9"};
        int blank[]=new int[50];
        String random=convert(s,blank);
        int arr[]=new int[random.length()];
        for(int i=0;i<random.length();i++){
            arr[i]=atoi(String.valueOf(random.charAt(i)));
        }
        int sum=0;
        for(int a:arr){
            sum=sum+a;
        }
        System.out.print(sum);
        
    }
}