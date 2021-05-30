package com.world_of_anonymous.core_java.journaldev;

public class DeadLock {
  public static void main(String[] args) throws InterruptedException {
    Object obj1 = new Object();
    Object obj2 = new Object();
    Object obj3 = new Object();

    Thread t1 = new Thread(new SyncThread(obj1, obj2), "t1");
    Thread t2 = new Thread(new SyncThread(obj2, obj3), "t2");
    Thread t3 = new Thread(new SyncThread(obj3, obj1), "t3");

    t1.start();
    Thread.sleep(5000);
    t2.start();
    Thread.sleep(5000);
    t3.start();
  }
}

class SyncThread implements Runnable {

  private Object object1;
  private Object object2;

  public SyncThread(Object object1, Object object2) {
    this.object1 = object1;
    this.object2 = object2;
  }

  @Override
  public void run() {
    String name = Thread.currentThread().getName();
    System.out.println(name + " acquire lock on "+object1);
    synchronized (object1) {
      System.out.println(name + " acquire lock on "+object1);
      work();
      System.out.println(name + " acquire lock on "+object2);
      synchronized (object2) {
        System.out.println(name + " acquire lock on "+object2);
        work();
      }
      System.out.println(name + " release lock on "+object2);
    }
    System.out.println(name + " release lock on "+object1);
    System.out.println("Finish Execution");
  }

  private void work() {
    try {
      Thread.sleep(30000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
