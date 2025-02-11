package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "brick";
        }
        if (query.toLowerCase().contains("largest")) {
            int colon = query.lastIndexOf(":");
            String numbers = query.substring(colon+2);
            String numbersArr[] = numbers.split(", ");

            int[] toInts = new int[numbersArr.length];
            for(int i = 0;i < numbersArr.length;i++)
            {
               toInts[i] = Integer.parseInt(numbersArr[i]);
            }
            int max = 0;
            for(int i = 0;i < numbersArr.length;i++)
            {
               if (toInts[i] > toInts[max]) {
                    max = i;
               }
            }
            System.out.print(numbersArr[max]);
            return numbersArr[max];
        }
        if (query.toLowerCase().contains("moo"))  {
            return "cow";
        }
        return "";
    }
}
