package utils;

public class TestUtils {
    public static final String TEXT_COLOR_GREEN = "\u001B[32m";
    public static final String TEXT_COLOR_RED = "\u001B[31m";
    public static final String TEXT_COLOR_RESET = "\u001B[0m";

    public static void printTestPassed(String testCase) {
        System.out.println(TEXT_COLOR_GREEN + testCase + " PASSED" + TEXT_COLOR_RESET);
    }

    public static void printTestFailed(String testCase) {
        System.out.println(TEXT_COLOR_RED + testCase + " FAILED" + TEXT_COLOR_RESET);
    }
}
