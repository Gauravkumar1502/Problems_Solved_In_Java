package com.mycompany.problems;

import java.util.*;

public class stringProblem {    
    public static String problem1(String str,int num){
        List<String> words=splitString(str);        
        while(num>0){
            int n=(num%10)-1;
            String retStr=breakMerge(words.get(n));
            words.remove((n));
            words.add((n),retStr);
            num/=10;
        }    
        String output="";
        for(String s : words)            
            output+=s+" ";       
        
        return output;
    }     
    
    private static List<String> splitString(String str){
        int len=str.length();
        List<String> words=new ArrayList<>();
        String tmp="";
        for(int i=0;i<len;i++){
            if(str.charAt(i)==' '){
                words.add(tmp);
                tmp="";                
            } else{
                tmp+=str.charAt(i);               
            }  
        }
        words.add(tmp);
        return words;
    }
        
    private static String breakMerge(String str){
        int len=str.length();
        String tmp="";
        for(int i=(len/2)-1 ; i>=0 ; i--){
            tmp+=str.charAt(i);
        }                
        tmp=tmp.concat(str.substring(len/2, len));
        return tmp;
    }
    
    public static String abbreviationString(String str){
        List<String> words=splitString(str);
        String tmp="";        int index=0;
        for(int i=0;i<words.size();i++){
            if(words.get(i).length()>10){
                tmp=abbreviation(words.get(i));
                words.remove(words.get(i));
                words.add(i, tmp);
            }
        }                
        String output="";
        for(String s : words)            
            output+=s+" ";       
        
        return output;
    }
    private static String abbreviation(String str){
        String output="";
        output+=str.charAt(0);
        int n=str.length()-2, num=0;
        while(n>0){
            num+=(n%10);
            n/=10;        }
        output+=num;
        output+=str.charAt(str.length()-1);
        return output;
    }
}
