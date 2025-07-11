class Calculater {
    int a;   // instance variable

    public void print() {
        System.out.println(a);
    }

    public int add(int n1, int n2) {
        System.out.println("in add");
        int res = n1 + n2;
        return res;
    }

    public void multiply(int n1, int n2) {
        System.out.println(n1 * n2);
    }
}

public class Heap_StackMemory {
    public static void main(String[] args) {
        int num1 = 8;  // local variable (stack)
        int num2 = 9;  // local variable (stack)

        Calculater calc = new Calculater(); // object in heap, reference in stack

        int r1 = calc.add(num1, num2);  // local variable (stack)
        System.out.println(r1);         // output: 17
    }
}


// 🔹 Object Creation
// java

// Calculater calc = new Calculater();
// Heap: new Calculater() creates the object with instance variable a.
// Stack: calc holds the reference to the object.

// 🔹 Method Execution
// int r1 = calc.add(num1, num2);
// A stack frame is created for add().

// Inside it:
// n1 = 8, n2 = 9, res = 17
// Frame is destroyed after method ends.

// 🔹 Output
// in add
// 17


// ✅ Garbage Collection
// If the reference calc is set to null:
// calc = null;
// The object in the heap becomes unreachable and is eligible for garbage collection

// In this program, local variables like num1, num2, r1, and method parameters n1, n2 are stored in stack memory inside their respective method stack frames.
// The object created with new Calculater() is stored in the heap memory, along with its instance variable a.
// The reference variable calc is stored in the stack, and it points to the object in the heap.
// Each method call like add() creates a stack frame, which is destroyed after the method finishes.
// When the object becomes unreachable (e.g., calc = null), it is eligible for garbage collection.