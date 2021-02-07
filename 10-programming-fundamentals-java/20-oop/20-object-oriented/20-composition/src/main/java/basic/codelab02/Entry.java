package basic.codelab02;

import java.time.LocalDate;
import java.util.Objects;

public class Entry {

    private final String title;
    private final LocalDate startDate;

    public Entry(String title, LocalDate startDate) {
        this.title = title;
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return startDate.equals(entry.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate);
    }
}
