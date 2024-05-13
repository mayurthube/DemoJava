package com.program;

import java.util.*;
public class ThrowTheBall {
   
    public int timesThrown(int N, int M, int L) {
        int friends[]=new int[N];
        int res = 0;
        int i=0;
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        for(int j=0;j<N;j++){
            friends[j]=j+1;
        }
        for(int j=0;j<N;j++){
            hmap.put(j, 0);
        }
        int tempCount=0;
        while(hmap.get(i)<M){
            tempCount=hmap.get(i);
            tempCount=tempCount+1;
            hmap.put(i,tempCount);
            if(tempCount<M){
                if(tempCount%2==0){
                    i=leftPass(i,friends,L);
                }
                else{
                    i=rightPass(i,friends,L);
                }
            }
            else{
                
            }
        }
        
        Iterator itr=hmap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry pair=(Map.Entry)itr.next();
            int temp=(int)pair.getValue();
            res=res+temp;
        }
        
        if(res==1){
            return 0;
        }
        else{
            return res;
        }
        
    }
  
    private int leftPass(int k,int friends[],int L) {
        for(int p=0;p<L;p++){
            if(k==0){
                k=friends.length-1;
            }
            else
            k--;
        }
        return k;
    }

    private int rightPass(int k,int friends[],int L) {
        for(int p=0;p<L;p++){
            
            if(k==friends.length-1){
                k=0;
            }
            else
                k++;
            
        }
        return k;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            //eq(0,(new ThrowTheBall()).timesThrown(5, 3, 2),10);
            //eq(1,(new ThrowTheBall()).timesThrown(4, 1, 3),0);
            eq(2,(new ThrowTheBall()).timesThrown(10, 3, 5),4);
            //eq(3,(new ThrowTheBall()).timesThrown(15, 4, 9),15);
        } catch( Exception exx) {
            System.err.println(exx);
            exx.printStackTrace(System.err);
        }
    }
    private static void eq( int n, int a, int b ) {
        if ( a==b )
            System.err.println("Case "+n+" passed.");
        else
            System.err.println("Case "+n+" failed: expected "+b+", received "+a+".");
    }
    private static void eq( int n, char a, char b ) {
        if ( a==b )
            System.err.println("Case "+n+" passed.");
        else
            System.err.println("Case "+n+" failed: expected '"+b+"', received '"+a+"'.");
    }
    private static void eq( int n, long a, long b ) {
        if ( a==b )
            System.err.println("Case "+n+" passed.");
        else
            System.err.println("Case "+n+" failed: expected \""+b+"L, received "+a+"L.");
    }
    private static void eq( int n, boolean a, boolean b ) {
        if ( a==b )
            System.err.println("Case "+n+" passed.");
        else
            System.err.println("Case "+n+" failed: expected "+b+", received "+a+".");
    }
    private static void eq( int n, String a, String b ) {
        if ( a != null && a.equals(b) )
            System.err.println("Case "+n+" passed.");
        else
            System.err.println("Case "+n+" failed: expected \""+b+"\", received \""+a+"\".");
    }
    private static void eq( int n, int[] a, int[] b ) {
        if ( a.length != b.length ) {
            System.err.println("Case "+n+" failed: returned "+a.length+" elements; expected "+b.length+" elements.");
            return;
        }
        for ( int i= 0; i < a.length; i++)
            if ( a[i] != b[i] ) {
                System.err.println("Case "+n+" failed. Expected and returned array differ in position "+i);
                print( b );
                print( a );
                return;
            }
        System.err.println("Case "+n+" passed.");
    }
    private static void eq( int n, long[] a, long[] b ) {
        if ( a.length != b.length ) {
            System.err.println("Case "+n+" failed: returned "+a.length+" elements; expected "+b.length+" elements.");
            return;
        }
        for ( int i= 0; i < a.length; i++ )
            if ( a[i] != b[i] ) {
                System.err.println("Case "+n+" failed. Expected and returned array differ in position "+i);
                print( b );
                print( a );
                return;
            }
        System.err.println("Case "+n+" passed.");
    }
    private static void eq( int n, String[] a, String[] b ) {
        if ( a.length != b.length) {
            System.err.println("Case "+n+" failed: returned "+a.length+" elements; expected "+b.length+" elements.");
            return;
        }
        for ( int i= 0; i < a.length; i++ )
            if( !a[i].equals( b[i])) {
                System.err.println("Case "+n+" failed. Expected and returned array differ in position "+i);
                print( b );
                print( a );
                return;
            }
        System.err.println("Case "+n+" passed.");
    }
    private static void print( int a ) {
        System.err.print(a+" ");
    }
    private static void print( long a ) {
        System.err.print(a+"L ");
    }
    private static void print( String s ) {
        System.err.print("\""+s+"\" ");
    }
    private static void print( int[] rs ) {
        if ( rs == null) return;
        System.err.print('{');
        for ( int i= 0; i < rs.length; i++ ) {
            System.err.print(rs[i]);
            if ( i != rs.length-1 )
                System.err.print(", ");
        }
        System.err.println('}');
    }
    private static void print( long[] rs) {
        if ( rs == null ) return;
        System.err.print('{');
        for ( int i= 0; i < rs.length; i++ ) {
            System.err.print(rs[i]);
            if ( i != rs.length-1 )
                System.err.print(", ");
        }
        System.err.println('}');
    }
    private static void print( String[] rs ) {
        if ( rs == null ) return;
        System.err.print('{');
        for ( int i= 0; i < rs.length; i++ ) {
            System.err.print( "\""+rs[i]+"\"" );
            if( i != rs.length-1)
                System.err.print(", ");
        }
        System.err.println('}');
    }
    private static void nl() {
        System.err.println();
    }
// END CUT HERE
}

