package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Test
    public void TestStackPush() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty());
    }

    @org.junit.Test
    public void TestStackPeek() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals("Hello world", stack.peek());
    }

    @org.junit.Test
    public void TestStackPop() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.push("World, hello");
        assertEquals("World, hello", stack.pop());
    }
}
