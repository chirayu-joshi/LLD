public class Main {
    public static void main(String[] args) {
        // Initialize the context
        Context context = new Context();
        context.put("a", 2);
        context.put("b", 4);
        context.put("c", 8);
        context.put("d", 16);

        System.out.println("a = " + context.get("a") + ", b = " + context.get("b") + ", c = " + context.get("c") + ", d = " + context.get("d"));

        // ========== Example 1 :: a * b ==========
        AbstractExpression expression1 = new MultiplyNonTerminalExpression(
                new NumberTerminalExpression("a"),
                new NumberTerminalExpression("b")
        );

        System.out.println("Example 1: (a * b) = " + expression1.interpret(context));


        // ========== Example 2 :: ((a * b) + (c * d)) ==========
        AbstractExpression expression2 = new SumNonTerminalExpression(
                new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
                new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d"))
        );

        System.out.println("Example 2: ((a * b) + (c * d)) = " + expression2.interpret(context));


        // ========== Example 3 :: ((a * b) & (c * d)) ==========
        AbstractExpression expression3 = new BinaryNonTerminalExpression(
                new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
                new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d")),
                '&'
        );

        System.out.println("Example 3: ((a * b) & (c * d)) = " + expression3.interpret(context));
    }
}
