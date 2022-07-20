public class ArlanHelper {
    public String drawQuad(int n) {
        String result = "";

        int lines = n;

        while(lines > 0) {
            lines--;

            int columns = n;
            while(columns > 0) {
                result += "*";
                columns--;
            }

            result += "\n";
        }

        return result;
    }

    public String drawRect(int width, int height, char c) {
        String result = "";
        int i = 0;
        int j = 0;
        while (i < height ) {
            j = 0;
            while (j < width) {
                result += c;
                j++;
            }
            result += "\n";
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //XX
        //XX
        //XX
        System.out.println(helper.drawRect(2, 3, 'X'));
    }
}