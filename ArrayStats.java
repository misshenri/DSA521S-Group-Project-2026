// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class ArrayStats {
   public ArrayStats() {
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{12, 5, 8, 4, 15, 7, 20, 9};
      int var2 = var1.length;
      int var3 = 0;

      for(int var4 = 0; var4 < var1.length; ++var4) {
         var3 += var1[var4];
      }

      double var10 = (double)var3 / (double)var2;
      int var6 = var1[0];

      for(int var7 = 1; var7 < var1.length; ++var7) {
         if (var1[var7] > var6) {
            var6 = var1[var7];
         }
      }

      int var11 = var1[0];

      for(int var8 = 1; var8 < var1.length; ++var8) {
         if (var1[var8] < var11) {
            var11 = var1[var8];
         }
      }

      int var12 = 0;

      for(int var9 = 0; var9 < var1.length; ++var9) {
         if (var1[var9] > 10) {
            ++var12;
         }
      }

      System.out.println("Total students served: " + var2);
      System.out.println("Total service time: " + var3);
      System.out.println("Average service time: " + var10);
      System.out.println("Highest service time: " + var6);
      System.out.println("Lowest service time: " + var11);
      System.out.println("Services over 10 minutes: " + var12);
   }
}
