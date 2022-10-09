import java.util.*;
//This is the client of the PersonComparableDates object

public class PersonComparableDatesClient {
    public static void main(String[] args) {
        ArrayList<PersonComparableDates> people = new ArrayList<PersonComparableDates>();

        people.add(new PersonComparableDates("George", "Washington", 2, 22, 1732));
        people.add(new PersonComparableDates("Paul", "Marques", 3, 27, 1969));
        people.add(new PersonComparableDates("Kermit", "The Frog", 9, 27, 1976));
        people.add(new PersonComparableDates("SquarePants", "SpongeBob", 5, 1, 1999));
        people.add(new PersonComparableDates("Charlie", "Brown", 10, 3, 1950));
        people.add(new PersonComparableDates("Rocky", "Horror", 8, 14, 1975));
        people.add(new PersonComparableDates("Moses", "RedSea", 4, 3, -2345));
        people.add(new PersonComparableDates("Isaac", "Newton", 1, 4, 1643));
        people.add(new PersonComparableDates("William", "Shakespeare", 4, 26, 1564));
        people.add(new PersonComparableDates("Oprah", "Winfrey", 1, 29, 1954));

        PersonComparableDates theOldest = findOldest(people);
        PersonComparableDates theYoungest = findYoungest(people);

        System.out.println(" The oldest Person_Comparable_Dates: " + theOldest + "\n");
        System.out.println(" The youngest Person_Comparable_Dates: " + theYoungest);

    } // main

    public static PersonComparableDates findOldest(ArrayList<PersonComparableDates> PersonComparableDatesList) {
        PersonComparableDates largest = PersonComparableDatesList.get(0);
        for (int i = 1; i < PersonComparableDatesList.size(); i++) {
            if (largest.compareTo(PersonComparableDatesList.get(i)) < 0)
                largest = PersonComparableDatesList.get(i);
        }
        return largest;
    } // findOldest

    public static PersonComparableDates findYoungest(ArrayList<PersonComparableDates> PersonComparableDatesList) {
        PersonComparableDates smallest = PersonComparableDatesList.get(0);
        for (int i = 1; i < PersonComparableDatesList.size(); i++) {
            if (smallest.compareTo(PersonComparableDatesList.get(i)) > 0)
                smallest = PersonComparableDatesList.get(i);
        }
        return smallest;
    } // findYoungest
}
