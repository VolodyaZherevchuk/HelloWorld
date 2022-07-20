class ATM {
    public int countBanknotes(int sum) {
        int count = 0;
        while (sum > 0) {
            if (sum >= 500) {
                sum -= 500;
                count++;
                continue;
            }
            if (sum >= 200) {
                sum -= 200;
                count++;
                continue;
            }

            if (sum >= 100) {
                sum -= 100;
                count++;
                continue;
            }

            if (sum >= 50) {
                sum -= 50;
                count++;
                continue;
            }

            if (sum >= 20) {
                sum -= 20;
                count++;
                continue;
            }

            if (sum >= 10) {
                sum -= 10;
                count++;
                continue;
            }

            if (sum >= 5) {
                sum -= 5;
                count++;
                continue;
            }

            if (sum >= 2) {
                sum -= 2;
                count++;
                continue;
            }

            if (sum >= 1) {
                sum -= 1;
                count++;
                continue;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        ATM bank = new ATM();
        System.out.println(bank.countBanknotes(526));
    }
}