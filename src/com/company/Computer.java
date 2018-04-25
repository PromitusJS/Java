package com.company;

public class Computer {

    class Processor {
        private boolean isStart = false;
        public void start (){
            isStart=true;
            System.out.println("Started");
        }
        public void shutdown (){
            isStart=false;
            System.out.println("Finished");
        }
    }

    class RAM {
        private boolean isStart = false;
        public void start (){
            isStart=true;
            System.out.println("Started");
        }
        public void shutdown (){
            isStart=false;
            System.out.println("Finished");
        }


    }
    Processor i7 = new Processor();
    RAM transfer = new RAM();

}
