package DAY4.Session2;

import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalysis {
    public static void main(String[] args) {
        String[] words = {"a","c","f","c","a","a"};
        Map<String , Integer>freq = new HashMap<>();

        for(String word : words){
            freq.put(word, freq.getOrDefault(word , 0) + 1);



        }
        System.out.println(freq);  // frequency Printing
        String mostFrequentWord = null;
        int maxCount = 0;
        for(Map.Entry<String , Integer>entry:freq.entrySet()){ // the frequent element
            if(entry.getValue()>maxCount){
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }

        }
        System.out.println(mostFrequentWord);
        System.out.println(maxCount);
        System.out.println("unique word  ");

        for(Map.Entry<String , Integer>entry:freq.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }

}