public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(2);
        stack.push(7);
        stack.push(1);
        stack.push(23);
        System.out.println(stack.min()); // мин 1
        System.out.println(stack.max()); // макс 23
        stack.pop(); // Удаляем 23
        stack.pop(); // удаляем 1
        System.out.println(stack.min()); // мин 2
        System.out.println(stack.max()); // макс 8
    }
}