package edu.olezha.jsandbox.core;

public class FinalRethrow {

    public static void main(String[] args) {
        try {
            try {
                throw new ArrayIndexOutOfBoundsException();
            } catch (Exception e) {
                System.out.println("catch Exception");
                throw e;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch ArrayIndexOutOfBoundsException");
        }
    }
}