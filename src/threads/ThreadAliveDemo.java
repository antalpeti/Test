package threads;

public class ThreadAliveDemo {

  public static void main(String[] args) {

    Thread myThread;

    myThread = new Thread() {
      @Override
      public void run() {
        try {
          Thread.sleep(3000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("My Thread.");
      }
    };
    myThread.setName("My Thread");
    myThread.start();
    do {
      System.out.println(Thread.currentThread() + " is alive.");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    } while (myThread.isAlive());

    myThread = new Thread() {
      @Override
      public void run() {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("New Thread.");
        super.run();
      }
    };
    myThread.setName("New Thread");
    myThread.start();

  }
}
