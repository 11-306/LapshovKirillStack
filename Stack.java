import java.util.Deque;
import java.util.LinkedList;

public class Stack {
    Deque<Integer> stack;
    Deque<Integer> minStack;
    Deque<Integer> maxStack;

    public Stack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
        maxStack = new LinkedList<>();
    }

    public void push(int x) {
        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }

        if (maxStack.isEmpty() || x >= maxStack.peek()) {
            maxStack.push(x);
        }
    }

    public int pop() {
        int popped = stack.pop(); // верхний элемент

        if (popped == minStack.peek()) { //сравнение с минимальным
            minStack.pop();
        }

        if (popped == maxStack.peek()) {   //сравнение с макс.
            maxStack.pop();
        }

        return popped;
    }

    public int min() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        } else {
            throw new IllegalStateException("Stack is empty"); // вывод в неподходящей ситуации
        }
    }

    public int max() {
        if (!maxStack.isEmpty()) {
            return maxStack.peek();
        } else {
            throw new IllegalStateException("Stack is empty"); // вывод в неподходящей ситуации
        }
    }
}

//    — Шеф, ну что за бред? Нафига вообще отклеивать эти этикетки от бананов?
//    — Для баланса Вселенной. Ведь где-то там, в Африке, такой же огузок, как ты, приклеивает эти этикетки.