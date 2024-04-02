package com.qualitesoft.utils;


import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Slf4j
public class FileUtil {

  private static final String DEFAULT_TESTDATA_PATH = "src/test/resources/testdata/";


  private FileUtil () {

  }


  public static String getStringFromFile (String fileName) throws IOException {

    Path path = Paths.get(DEFAULT_TESTDATA_PATH + fileName);
    StringBuilder sb = new StringBuilder();
    try {
        Files.readAllLines(path).forEach(sb::append);
    } catch (IOException e) {

        //log.error("File \"" + path + "\" is not found.");
        throw new IOException("File \"" + path + "\" is not found.");
    }

    if (sb.toString().isEmpty()) {
      //log.error("File \"" + path + "\" is empty.");
      throw new IOException("File \"" + path + "\" is empty.");
    }
    return sb.toString();
  }
}
