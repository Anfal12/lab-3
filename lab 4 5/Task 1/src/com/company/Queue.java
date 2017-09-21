package com.company;

public class Queue {
    char []q;

    private int putloc,getloc;

    public Queue(int a){
        q=new char[a];
        int putloc = getloc = 0;
    }

    public char put(char b){
        if(putloc == q.length-1){
            System.out.println(" Whoops!  no Space left");
            return 0 ;
        }
        putloc=putloc+1;
        return q[putloc]=b;
    }

    public void get(){


        if(getloc < putloc||getloc == putloc){
            System.out.println(q[getloc]);
            getloc++;
            return;
        }
        if(getloc > putloc){
            System.out.println("Queue has no space");

            return;

        }
    }

}

