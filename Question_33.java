import java.util.HashMap;
import java.util.LinkedList;

public class Question_33 {
    HashMap<Integer, LinkedList<Integer>> st;
    HashMap<Integer, Integer> fmap;
    int maxFreq;

    Question_33() {
        st = new HashMap<>();
        fmap = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int val) {
        int cfreq = fmap.getOrDefault(val, 0);
        cfreq++;
        fmap.put(val, cfreq);
        if (!st.containsKey(cfreq)) {
            st.put(cfreq, new LinkedList<>());
        }
        st.get(cfreq).addFirst(val);
        maxFreq = Math.max(maxFreq, cfreq);

    }

    public int pop() {
        int ans = st.get(maxFreq).removeFirst();
        int creq = fmap.get(ans);
        creq--;
        fmap.put(ans, creq);

        if (st.get(maxFreq).size() == 0) {
            maxFreq--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Question_33 freqStack = new Question_33();
        freqStack.push(5); // The stack is [5]
        freqStack.push(7); // The stack is [5,7]
        freqStack.push(5); // The stack is [5,7,5]
        freqStack.push(7); // The stack is [5,7,5,7]
        freqStack.push(4); // The stack is [5,7,5,7,4]
        freqStack.push(5); // The stack is [5,7,5,7,4,5]
        System.out.println(freqStack.pop());   // return 5, as 5 is the most frequent. The stack becomes [5,7,5,7,4].
        System.out.println(freqStack.pop());   // return 7, as 5 and 7 is the most frequent, but 7 is closest to the top. The stack becomes [5,7,5,4].
        System.out.println(freqStack.pop());  // return 5, as 5 is the most frequent. The stack becomes [5,7,4].
        System.out.println(freqStack.pop());   // return 4, as 4, 5 and 7 is the most frequent, but 4 is closest to the top. The stack becomes [5,7].
    }


}
