class Busyno{
       public static void main(String args[])
        {
         int num=456,a=num,b=0,c=0;
         while(num!=0){
              c++;
              b=num%10;
              if(c==1){
              if(b==7){
                 System.out.println("Busy number");
               }
               }
        num=num/10;
        }
        if(a%7==0){
            System.out.println("Busy number");
        }
       else{
            System.out.println("not a busy number");
        }
}
}