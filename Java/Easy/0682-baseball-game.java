import java.util.Stack;

class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();
        for (String op : operations) {
            if (op.equals("C")) {
                scores.pop();
            } else if (op.equals("D")) {
                scores.push(scores.peek() * 2);
            } else if (op.equals("+")) {
                int top = scores.pop();
                int newTop = top + scores.peek();
                scores.push(top);
                scores.push(newTop);
            } else {
                scores.push(Integer.parseInt(op));
            }
        }
        int total = 0;
        while (!scores.isEmpty()) {
            total += scores.pop();
        }
        return total;
    }
}