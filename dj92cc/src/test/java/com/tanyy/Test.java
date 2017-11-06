package com.tanyy;

public class Test {

  public static void main(String[] args) {
    String s = "dancePlayer.openDown('132858','997155')";
    System.out.println( s.substring(s.indexOf(",")+2,s.length()-2));
    
  }
}
