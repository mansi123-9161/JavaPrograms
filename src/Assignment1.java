import  java.util.Scanner;
class Assignment1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r,sum=0,temp;
        int sum1=0;
        //int n=454;//It is the number variable to be checked for palindrome
        int n=sc.nextInt();

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
            if(r%2==0)
            {
                sum1=sum1+r;
            }
        }
        if((temp==sum)  && (sum1>25))
            System.out.println("the given number"+temp+"palindrome number and greater than 25 ");
       if ((temp==sum)  && (sum1<25))
            System.out.println("the given number"+temp+"not palindrome and less than 25");
       if(temp !=sum)
       System.out.println("not palindrome");
    }
}