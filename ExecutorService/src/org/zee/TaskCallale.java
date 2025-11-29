package org.zee;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class TaskCallale implements Callable {
    String str;
    int start;
    int end;

    public TaskCallale(String str, int start, int end) {
        this.str = str;
        this.start = start;
        this.end = end;
    }

    @Override
    public Map<Character,Long> call() throws Exception {
        Map<Character,Long> freqmap=new HashMap<>();
        for (int i = start; i  < end; i++) {
            freqmap.put(str.charAt(i),freqmap.getOrDefault(str.charAt(i),0l)+1);
        }
        return freqmap;
    }
}
