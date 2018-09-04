package DP;

/**
 * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 */
public class RegularExpressionMatching {
    // solution one: recursion
    class Recursion {
        public boolean isMatch(String s, String p) {
            if (!p.contains("*")) {
                return sampleMatch(s, p);
            } else {
                return complexMatch(s, p);
            }
        }

        public boolean sampleMatch(String s, String p) {
            if (p.isEmpty()) {
                return s.isEmpty();
            }
            boolean firstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
            return firstMatch && sampleMatch(s.substring(1), p.substring(1));
        }

        public boolean complexMatch(String s, String p) {
            if (p.isEmpty()) {
                return s.isEmpty();
            }
            boolean firstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
            if (p.length() >1 && p.charAt(1) == '*') {
                return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
            } else {
                return firstMatch && isMatch(s.substring(1), p.substring(1));
            }
        }
    }
}

