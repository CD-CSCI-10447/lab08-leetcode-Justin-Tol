package edu.desu.b_homework;

import java.util.HashMap;
import java.util.Map;

public class Problem {
    public int countDuplicates(String data){
        Map<String, Integer> dupeCount = new HashMap<>();
        for (int i = 0; i<data.length();i++){
            for (int k = i+1;k<data.length();k++){
                String s =  data.substring(i,k);

                if (dupeCount.containsKey(s)){
                    int count = dupeCount.get(s) + 1;
                    dupeCount.put(s,count);
                } else {
                    dupeCount.put(s,1);
                }
            }
        }
        int dupe = 0;

        for(Map.Entry<String, Integer> entry : dupeCount.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if(value > dupe) {
                dupe = value;
            }
        }
        System.out.println(dupeCount);
        return dupe;
    }
}