package trickyexamples;

public class CalculateReturning {
  public static void calculateReturning(int cost, int paid) {
    System.out.println("Cost: " + cost + " Paid: " + paid);
    System.out.println("Returns: ");
    if (cost % 5 >= 3) {
      cost += 5 - cost % 5;
    } else {
      cost -= cost % 5;
    }
    int diff = paid - cost;
    if (diff > 0) {
      int[] money = new int[] {20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};
      int[] pieces = new int[money.length];
      for (int i = 0; i < money.length; i++) {
        pieces[i] = diff / money[i];
        diff = diff % money[i];
        if (pieces[i] > 0) {
          System.out.println(money[i] + " : " + pieces[i]);
        }
        if (diff == 0) {
          break;
        }
      }
    } else {
      System.out.println("Paid more!");
    }
  }

  /**
   * Kiszámolja, hogy a fizetett és a fizetendõ összeg függvényében mennyit kell visszadnia a
   * pénztárosnak. Ideális esetben minimális számú cimletet kalkulál, de ha nem áll rendelkezésre
   * elegendõ címlet, akkor egyéb módot javasol.
   *
   * @param fizetendo a vásárló által fizetendõ összeg
   * @param fizetett a vásárló által fizetett összeg
   * @param tartalekCimletek rendelkezésre álló címletek
   */
  public static void getVisszajaro(int fizetendo, int fizetett, int[] tartalekCimletek) {
    System.out.println("Fizetendõ: " + fizetendo + " Fizetett: " + fizetett);
    if (fizetendo % 5 >= 3) {
      fizetendo += 5 - fizetendo % 5;
    } else {
      fizetendo -= fizetendo % 5;
    }
    int kulonbozetIdealis = fizetett - fizetendo;
    int kulonbozetRealis = fizetett - fizetendo;
    if (kulonbozetIdealis > 0) {
      System.out.println("Visszajáró: ");
      int[] penzek = new int[] {20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};
      int[] darabokIdealis = new int[penzek.length];
      int[] darabokRealis = new int[penzek.length];
      boolean idealisEset = true;
      // ideális eset kiszámolása
      for (int i = 0; i < penzek.length; i++) {
        darabokIdealis[i] = kulonbozetIdealis / penzek[i];
        if (tartalekCimletek[i] >= darabokIdealis[i]) {
          tartalekCimletek[i] -= darabokIdealis[i];
        } else {
          idealisEset = false;
          break;
        }
        kulonbozetIdealis = kulonbozetIdealis % penzek[i];
      }
      // ideális eset kiírása
      if (idealisEset) {
        for (int j = 0; j < darabokIdealis.length; j++) {
          if (darabokIdealis[j] > 0) {
            System.out.println(penzek[j] + " : " + darabokIdealis[j]);
          }
        }
      } else {
        // realis eset számolása
        for (int i = 0; i < tartalekCimletek.length; i++) {
          while (tartalekCimletek[i] > 0 && kulonbozetRealis >= penzek[i]) {
            kulonbozetRealis -= penzek[i];
            darabokRealis[i]++;
            tartalekCimletek[i]--;
          }
          if (kulonbozetRealis == 0) {
            break;
          }
        }
        if (kulonbozetRealis != 0) {
          System.out.println("Nem lehetseges visszaadni.");
        } else {
          for (int i = 0; i < darabokRealis.length; i++) {
            if (darabokRealis[i] > 0) {
              System.out.println(penzek[i] + " : " + darabokRealis[i]);
            }
          }
        }
      }
    } else {
      System.out.println("Fizess többet!");
    }
  }

  public static void main(String[] args) {
    calculateReturning(100, 20100);
    calculateReturning(1345, 9000);
    calculateReturning(1500, 12000);
    calculateReturning(1503, 12000);
    calculateReturning(992, 4800);
    calculateReturning(12, 20);
    calculateReturning(13, 20);
    System.out.println();
    System.out.println("1-3. eset:");
    getVisszajaro(12, 20, new int[] {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 105, 5});
    getVisszajaro(12, 20, new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3});
    getVisszajaro(12, 20, new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    System.out.println("4-6. eset:");
    getVisszajaro(13, 20, new int[] {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5});
    getVisszajaro(13, 20, new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5});
    getVisszajaro(13, 20, new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    System.out.println("5-9. eset:");
    getVisszajaro(1000, 10000, new int[] {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5});
    getVisszajaro(1000, 10000, new int[] {0, 0, 0, 5, 0, 1, 3, 10, 0, 1, 1, 1});
    getVisszajaro(1000, 10000, new int[] {0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1});
  }
}
