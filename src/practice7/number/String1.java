package practice7.number;

public class String1 {
    private String str;
    private boolean isDigit = false;
    private int sum;
    private int count = 0;
    private int[] digits;

    public void sumDigits(String str) {

        //digits = new int[str.length()];
        String digits = "";
        for(int i =0; i < str.length(); i++){
            isDigit = Character.isDigit(str.charAt(i));
            if (isDigit == true) {
                digits += str.charAt(i) + "+";
                sum += Character.getNumericValue(str.charAt(i));
            }
        }

        System.out.println("sumDigits(" + str + ") -> " + sum + "(" + digits.substring(0,digits.length()-1) + ")");
    }
}
