package org.zee;

import java.util.HashMap;
import java.util.Map;

public class TaskCount implements Runnable{

    String str;
    int start;
    int end;
    Map<Character,Long> freqMap=new HashMap<>();

    public TaskCount(String str, int start, int end) {
        this.str = str;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <end ; i++) {
            freqMap.put(str.charAt(i),freqMap.getOrDefault(str.charAt(i),0l)+1);
        }
    }

    public Map<Character,Long> getFreqMap(){
        return freqMap;
    }
}
