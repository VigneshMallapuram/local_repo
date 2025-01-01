class Userthread extends Thread{
    public void run(){
    int x=0;
    while(x<10){
    System.out.println(x +"in thread1");
    x++;
    this.yield();
    /*try{
    Thread.sleep(2000);}
    catch(InterruptedException c){
    System.out.println(c);}*/
    }}}
    
    class Userthread1 extends Thread{
    public void run(){
    int x=10;
    while(x>0){
    System.out.println(x);
    x--;
    (Thread.currentThread()).yield();
    /*try{
    Thread.sleep(2000);}
    catch(InterruptedException c){
    System.out.println(c);}*/
    }}}
    
    class UserthreadDemo{
    public static void main(String args[]) throws Exception{
    Userthread t1=new Userthread();
    Userthread1 t2=new Userthread1();
    //System.out.println(t1);
    //System.out.println(t2);
    //t1.setPriority(2);
    //t2.setPriority(8);
    t1.start();
    t2.start();
    }}
    