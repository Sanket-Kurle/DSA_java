import java.util.*;
public class takeInput {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = Integer.parseInt(scn.nextLine());
    String name=scn.nextLine();

    System.out.println("hello "+name+" Your asked counting is :");
    for(int i=1;i<=n;i++){
      System.out.println(i);
    }
  }
}
