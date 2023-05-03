public class Question_32 {
    int [] data;
    int tos;
    int size;

    Question_32(int cap){
        data=new int[cap];
        tos=-1;
       this.size=cap;
    }
    public void push(int x) {
        if (tos<size-1){
            tos++;
            data[tos]=x;
        }
    }
    public int pop() {
        if (tos==-1){
            return -1;
        }else {
            int val=data[tos];
            tos--;
            return val;
        }
    }
    public void increment(int k, int val) {
        int margin=(int) Math.min(k,data.length);
        for (int i=0;i<margin;i++){
            data[i]+=val;
        }
    }

    public static void main(String[] args) {
          Question_32  stk = new Question_32(3);
        stk.push(1);                          // stack becomes [1]
        stk.push(2);                          // stack becomes [1, 2]
        System.out.println(stk.pop());            // return 2 --> Return top of the stack 2, stack becomes [1]
        stk.push(2);                          // stack becomes [1, 2]
        stk.push(3);                          // stack becomes [1, 2, 3]
        stk.push(4);                          // stack still [1, 2, 3], Do not add another elements as size is 4
        stk.increment(5, 100);            // stack becomes [101, 102, 103]
        stk.increment(2, 100);            // stack becomes [201, 202, 103]
        System.out.println(stk.pop());            // return 103 --> Return top of the stack 103, stack becomes [201, 202];
        System.out.println(stk.pop());            // return 103 --> Return top of the stack 103, stack becomes [201, 202];

    }



}
