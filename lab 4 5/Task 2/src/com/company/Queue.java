package com.company;

public class Queue {


        private final int x=0;
        char []q;


        private int putloc,getloc;


        public Queue(char[] a){

            for(int i=0;i<a.length;i++){
                System.out.println(a[i]);
            }

        }
        public Queue(Queue A){
            q=new char[A.x];
            putloc=A.putloc;
            getloc=A.getloc;
        }

        public Queue(int x){
            q=new char[x];
            int putloc=getloc=0;
        }

        public char put(char character){
            if(putloc==q.length-1){
                System.out.println( "Whoops!  no Space left: ");
                return 0 ;
            }
            putloc=putloc+1;
            return q[putloc]=character;
        }

        public void get(){


            if(getloc<putloc||getloc==putloc){
                System.out.println(q[getloc]);
                getloc++;
                return;
            }
            if(getloc>putloc){
                System.out.println("Queue has no space");
                return;
            }
        }

    }