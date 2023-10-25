package string.numbertowords;

public class Main {

    private static final String[] oneToNineteen = new String[]{
            "",
            "One",
            "Two",
            "Three",
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine",
            "Ten",
            "Eleven",
            "Twelve",
            "Thirteen",
            "Fourteen",
            "Fifteen",
            "Sixteen",
            "Seventeen",
            "Eighteen",
            "Nineteen"
    };

    private static final String[] twentyToNinety = new String[]{
            "",
            "Ten",
            "Twenty",
            "Thirty",
            "Forty",
            "Fifty",
            "Sixty",
            "Seventy",
            "Eighty",
            "Ninety"
    };

    private static final String[] powerOfTens = new String[]{
            "Hundred",
            "Thousand",
            "Million",
            "Billion"
    };

    public static void main(String[] args) {
        System.out.println(numberToWords(2_147_483_647));
    }

    public static String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }
        StringBuilder builder = new StringBuilder();
        convert(num, builder);
        return builder.toString().trim();
    }

    public static void convert(int n, StringBuilder builder){
        if(n == 0){
            return;
        }

        if(n < 20){
            builder.append(oneToNineteen[n]);
            builder.append(" ");
        }else if(n < 100){
            builder.append(twentyToNinety[n/10]);
            builder.append(" ");
            convert(n%10, builder);
        }else if(n<1000){
            convert(n/100, builder);
            builder.append(powerOfTens[0]);
            builder.append(" ");
            convert(n%100, builder);
        }else if(n<1000000){
            convert(n/1000, builder);
            builder.append(powerOfTens[1]);
            builder.append(" ");
            convert(n%1000, builder);
        }else if(n<1000000000){
            convert(n/1000000, builder);
            builder.append(powerOfTens[2]);
            builder.append(" ");
            convert(n%1000000, builder);
        }else{
            convert(n/1000000000, builder);
            builder.append(powerOfTens[3]);
            builder.append(" ");
            convert(n%1000000000, builder);
        }
    }
}
