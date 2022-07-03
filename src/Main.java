public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.findTheDifference("cat", "caty");
    }

    public char findTheDifference(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int count = 0;

        for(int i = 0; i<tChar.length; i++) {
            for(int j = 0; j<sChar.length; j++) {
               if(sChar[j] == tChar[i]) {
                   count++;
               }
            }
            if(count == 0) {
                System.out.println(tChar[i]);
                return tChar[i];
            }
            count = 0;
        }
        return 'o';
    }
}
