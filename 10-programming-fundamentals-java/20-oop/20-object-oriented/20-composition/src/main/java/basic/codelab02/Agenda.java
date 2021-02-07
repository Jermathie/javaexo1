package basic.codelab02;

import java.time.LocalDate;
import java.util.Arrays;

public class Agenda {

    private static final int MAX_ALLOWED_ENTRIES = 25;

    private final Person owner;
    private final String name;
    private final Entry[] entries;
    private int indexOfNextEntry = 0;

    public Agenda(Person owner, String name) {
        this.owner = owner;
        this.name = name;
        this.entries = new Entry[MAX_ALLOWED_ENTRIES];
    }

    /**
     * Add entry to agenda
     * @param newEntryToAdd entry to try and add to the agenda
     * @return  true if newEntryToAdd was successfully added to the agenda
     *          false if newEntryToAdd was not added to the agenda
     */
    public boolean addEntry(Entry newEntryToAdd) {
        if(newEntryToAdd == null) {
            return false;
        }
        if(getIndexOfNextEntry() >= MAX_ALLOWED_ENTRIES) {
            return false;
        }

        if (isThereAnEntryOnTheSameDayAs(newEntryToAdd)) {
            return false;
        }

        entries[getIndexOfNextEntry()] = newEntryToAdd;
        indexOfNextEntry++;
        return true;
    }

    private boolean isThereAnEntryOnTheSameDayAs(Entry newEntryToAdd) {
        for(int index = 0; index < getIndexOfNextEntry(); index++) {
            if(newEntryToAdd.equals(entries[index])) {
                return true;
            }
        }
        return false;
    }

    private int getIndexOfNextEntry() {
        return indexOfNextEntry;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "owner=" + owner +
                ", name='" + name + '\'' +
                ", entries=" + Arrays.toString(entries) +
                ", indexOfNextEntry=" + indexOfNextEntry +
                '}';
    }

    public static void main(String[] args) {
        Agenda jimmyAgenda = new Agenda(new Person("Jimmy", "jimmy@mail.be"), "Jimmy's agenda");
        System.out.println(jimmyAgenda);

        boolean isEntryAdded = jimmyAgenda.addEntry(new Entry("Do a presentation on Poly.", LocalDate.of(2019, 1, 23)));
        System.out.println(isEntryAdded);
        boolean isEntryAdded2 = jimmyAgenda.addEntry(new Entry("Do another presentation on Poly.", LocalDate.of(2019, 1, 24)));
        System.out.println(isEntryAdded2);
        boolean isEntryAdded3 = jimmyAgenda.addEntry(new Entry("Do a third presentation on Poly.", LocalDate.of(2019, 1, 25)));
        System.out.println(isEntryAdded3);

        System.out.println("-------- \n" + jimmyAgenda);
    }

}
