package codelab07;

import java.util.StringJoiner;

public class StringConcat {

    public static void main(String[] args) {
        String[] lorem = {"Lorem", "ipsum", "dolor", "sit", "amet"};
        System.out.println(joinLorem(lorem));
        System.out.println(buildLorem(lorem));
    }

    /**
     * Implement the joinLorem method to make the test succeed.
     * Hints: Look up information on StringJoiner, then create an object and use it.
     */
    static String joinLorem(String[] wordsToJoin) {
        StringJoiner result = new StringJoiner(" ", "", ".");
        for (String word : wordsToJoin) {
            result.add(word);
        }
        return result.toString();
    }

    /**
     * Implement the buildLorem method to make the test succeed.
     * Hints: Look up information on StringBuilder, then create an object and use it.
     */
    static String buildLorem(String[] wordsToBuild) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < wordsToBuild.length; index++) {
            result.append(wordsToBuild[index]);
            if (index != wordsToBuild.length - 1) {
                result.append(" ");
            }
        }
        result.append(".");
        return result.toString();
    }

}
