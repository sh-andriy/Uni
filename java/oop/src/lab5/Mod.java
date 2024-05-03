package lab5;

import java.util.regex.Pattern;

// ката: https://www.codewars.com/kata/54746b7ab2bc2868a0000acf

public class Mod {
    public static Pattern mod4 = Pattern.compile("\\[(\\+|\\-)?(?<!\\d)-?(?:\\d*[02468][048]|\\d*[13579][26]|[048])(?!\\d)\\]");
}