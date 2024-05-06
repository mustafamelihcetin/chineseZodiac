public class ChineseZodiac {
    private int birthYear;

    public ChineseZodiac(int birthYear) {
        this.birthYear = birthYear;
    }
    public String calculateZodiacSign(){
        int remainder = birthYear % 12;
        String zodiacSign = "";

        switch (remainder){
            case 0:
                zodiacSign = "Monkey";
                break;
            case 1:
                zodiacSign = "Rooster";
                break;
            case 2:
                zodiacSign = "Dog";
                break;
            case 3:
                zodiacSign = "Pig";
                break;
            case 4:
                zodiacSign = "Rat";
                break;
            case 5:
                zodiacSign = "Ox";
                break;
            case 6:
                zodiacSign = "Tiger";
                break;
            case 7:
                zodiacSign = "Rabbit";
                break;
            case 8:
                zodiacSign = "Dragon";
                break;
            case 9:
                zodiacSign = "Snake";
                break;
            case 10:
                zodiacSign = "Horse";
                break;
            case 11:
                zodiacSign = "Sheep";
                break;
            default:
                zodiacSign = "Invalid input";
                break;
        }
        return zodiacSign;
    }
}
