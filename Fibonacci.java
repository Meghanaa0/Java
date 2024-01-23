class Fibonacci{
       public static void main(String args[]){
              int f=0,s=1,t=0,a=1;
               System.out.print("\t"+f);
                System.out.print("\t"+s);
               while(a<=8){
                  t=f+s;
                  f=s;
                  s=t;
                  a++;
                  System.out.print("\t"+t);
            }
}
}