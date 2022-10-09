//This class compares a person by their birthday
//Each new created instance represent a person with the last name, first name, birthday
public class PersonComparableDates implements Comparable<PersonComparableDates> {
    private String myFirstName;
    private String myLastName;
    private Date myBirthDate;

    public PersonComparableDates() {
        myFirstName = "";
        myLastName = "";
        myBirthDate = new Date();
    }

    public PersonComparableDates(String myFirstName, String myLastName, int month, int day, int year) {
        this.myFirstName = myFirstName;
        this.myLastName = myLastName;
        myBirthDate = new Date(month, day, year);
    }

    public int compareTo(PersonComparableDates that) {
        if (this.myBirthDate.getYear() != that.myBirthDate.getYear())
            return that.myBirthDate.getYear() - this.myBirthDate.getYear();
        else if (this.myBirthDate.getMonth() != that.myBirthDate.getMonth())
            return that.myBirthDate.getMonth() - this.myBirthDate.getMonth();
        else
            return that.myBirthDate.getDay() - this.myBirthDate.getDay();
    }

    public Date getMyBirthDate() {
        return myBirthDate;
    }

    public String toString() {
        return myFirstName + " " + myLastName + "(" + myBirthDate + ")";
    }
}
