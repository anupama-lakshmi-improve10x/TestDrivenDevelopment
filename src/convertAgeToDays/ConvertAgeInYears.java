package convertAgeToDays;

public class ConvertAgeInYears {

    public int calcAge(int ageInYears) {
        if(ageInYears >= 0) {
            int ageInDays = ageInYears * 365;
            return ageInDays;
        } else {
            return -1;
        }

    }
}
