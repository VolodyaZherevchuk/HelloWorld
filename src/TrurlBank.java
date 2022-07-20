public class TrurlBank {
    public int sumQuads(int n) {
        int result = 0;

        while(n > 0) {
            result += n * n;
            n--;
        }

        return result;
    }

    public int countSumOfDigits(int number) {
        int sum = 0;
        String strNumber = Integer.toString(number);
        int lenNumber = strNumber.length();

        int i = 0;
        while (i < lenNumber) {
            sum += Character.getNumericValue(strNumber.charAt(i));

            i++;
        }
        return  sum;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(542));
    }
}