package edu.olezha.jsandbox.core;

public class LocalVar {

  private static int a;

  public static void main(String[] args) {
    System.out.println(a);

    int i, j, k = 1;
    /* assignment operators are evaluated right to left.
      https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html */
    i = j = k;
    System.out.println(i + " " + j + " " + k);
  }
}
