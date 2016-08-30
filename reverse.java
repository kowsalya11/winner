public class Reversedigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp,rev=0;
        int n;
        while(a!=0)
        {
            temp=a%10;
            rev=rev*10+temp;
            a=a/10;
            
        }System.out.println(""+rev);
    }
}