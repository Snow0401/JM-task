public class Transformer {
    public static int first;
    public static int second;
    public static String operator;
    public static String romeResult;
    public static String[] romeDigit = new String []{"nulla", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    public static String[] romeDozens = new String []{"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};

    public static void changeArabian (){ //раскладываем строку на отдельные элементы
        String[] subStr = Validator.input.split(" ");
        first = Integer.parseInt (subStr[0]);
        second = Integer.parseInt (subStr[2]);
        operator = subStr[1];
    }

    public static void changeRome () { //раскладываем строку на отдельные элементы, переводим римские цифры в арабские
        String[] subStr = Validator.input.split(" ");
        for (int i = 0; i < 10; i++){
            if (subStr[0].equals(romeDigit[i])){
                first = i;
            }
        }
        for (int i = 0; i < 10; i++){
            if (subStr[2].equals(romeDigit[i])){
                second = i;
            }
        }
        operator = subStr[1];

    }

    public static void translateToRome (){ //переводим результат в арабских цифрах обратно в римские
        if (Solution.result < 10) {
            romeResult = romeDigit[Solution.result];
        }
        else {
            int a = Solution.result / 10;
            int b = Solution.result % 10;
            if (b == 0) {
                romeResult = romeDozens [a-1];
            }
            else {
                romeResult = romeDozens[a-1] + romeDigit[b];
            }
        }
    }
}
