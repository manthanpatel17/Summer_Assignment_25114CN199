public class CharacterPyramid 
{
  public static void main(String args[]) 
{
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print((char) (k + 64));
      }
      for (int l = i - 1; l >= 1; l--) {
        System.out.print((char) (l + 64));
      }
      System.out.println();
    }
  }
}
