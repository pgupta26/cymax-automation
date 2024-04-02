package com.qualitesoft.core;


import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;


public class JavaFunction {

  public static String randomText (String name, int count) {

    String text = name + RandomStringUtils.randomAlphabetic(count);
    return text;
  }


  public static int getRandomNumber () {

    Random r = new Random(System.currentTimeMillis());

    return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
  }
}
