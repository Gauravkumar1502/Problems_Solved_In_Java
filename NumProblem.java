package com.mycompany.problems;
public class NumProblem {    
    
    public static int problem1(int num){
        int outputNum=0;
        int len=length(num);
        int nextDigit=len;
        while(num>0){
            System.out.print(num%10+" ^ "+nextDigit+ "  = " );
            outputNum+=( Math.pow(num%10,nextDigit) );
            System.out.println(Math.pow(num%10,nextDigit));
            nextDigit=num%10;            
            num/=10;
        }
        return outputNum;
    }
    
    private static int length(int num){
        int len=0;
        while(num>0){
           num/=10;
           len++;
        }
        return len;
    }
    
    public static int findPosition_InFabonacci(int num){
        int position=0;
        int a=0,b=1;
        int c=a+b;
        if(num==0)
            return 1;
        else if(num==1)
            return 2;
        else{
            position=3;
            while(c<=num){
                if(c==num)                
                    return position;
                a=b;
                b=c;
                c=a+b;
                position++;
            }
        }
        return -1;
    }    
}
