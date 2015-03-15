package keywords;

public class SyncronizeKeyword {
  private static Integer iValue = new Integer(0);
  private Double dValue = new Double(0D);
  private Short sValue = new Short((short) 0);

  public static void main(String[] args) throws InterruptedException {
    final SyncronizeKeyword sk = new SyncronizeKeyword();
    for (int i = 0; i < 3; i++) {
      Thread t = new Thread() {

        @Override
        public void run() {
          while (iValue < 30 && sk.dValue < 30 && sk.sValue < 30) {
            try {
              modifyIntegerValue();
              System.out.println(this.getName() + ":" + " : iValue: " + iValue);
              Thread.sleep((long) (Math.random() * 1000));
              sk.modifyDoubleValue();
              System.out.println(this.getName() + ":" + ": dValue: " + sk.dValue);
              Thread.sleep((long) (Math.random() * 2000));
              sk.modifyShortValue();
              System.out.println(this.getName() + ":" + ": sValue: " + sk.sValue);
              Thread.sleep((long) (Math.random() * 3000));
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      };
      t.start();
    }
  }

  private synchronized void modifyDoubleValue() {
    dValue += 1;
  }

  private void modifyShortValue() {
    synchronized (sValue) {
      sValue++;
    }
  }

  private static void modifyIntegerValue() {
    ++iValue;
  }
}
