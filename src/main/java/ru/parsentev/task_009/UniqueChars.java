package ru.parsentev.task_009;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class UniqueChars {
    private final String line;

    public UniqueChars(final String line) {
        this.line = line;
    }

    public int unique() {
        int count = 0;
        char[] array = line.toCharArray();
        char c = array[0];

        for (int j = 0; j < line.length(); j++) {
            if (c == array[j]) {
                count++;
            }
        }
        return count;
    }
}
