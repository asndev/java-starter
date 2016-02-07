package de.antonstepan.helper;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.CharSink;
import com.google.common.io.Files;

/**
 * Guava Wiki: https://github.com/google/guava/wiki
 * @author hknd
 *
 */
public class FileUtils {

  public static ImmutableList<String> readFile(String pathname) {
    ImmutableList<String> lines = null;
    try {
      lines = Files.asCharSource(new File(pathname), Charsets.UTF_8).readLines();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lines;
  }
  
  public static void writeFile(String pathname, List<String> lines) {
    CharSink sink = Files.asCharSink(new File(pathname), Charsets.UTF_8);
    try {
      sink.writeLines(lines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
}
