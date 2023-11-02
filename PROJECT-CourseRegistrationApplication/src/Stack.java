
import java.util.Scanner;

public class Stack {

    Node top;
    int size;
    int cnt = 0;
    Scanner input = new Scanner(System.in);

    public Stack(int size) {
        this.size = size;
    }

    public void push() {
        if (isFull()) {
            System.out.println("--- FULL ---");
        } else {
            System.out.print("name: ");
            String name = input.next();
            System.out.print("surname: ");
            String surname = input.next();
            System.out.print("identity: ");
            String identity = input.next();
            System.out.print("department: ");
            String department = input.next();
            Node newNode = new Node(name, surname, identity, department);
            newNode.next = top;
            top = newNode;
            cnt++;
            System.out.println("New learner was added in place of top.");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("--- EMPTY ---");
        } else {
            System.out.println("name: " + top.name);
            System.out.println("surname: " + top.surname);
            System.out.println("identity: " + top.identity);
            System.out.println("department: " + top.department);
            System.out.println("county: " + top.country);
            System.out.println("The learner was deleted in place of top ----->>>");
            top = top.next;
            cnt--;
        }
    }

    public void top() {
        if (isEmpty()) {
            System.out.println("--- EMPTY ---");
        } else {
            System.out.println("Top learner on the course list: ");
            System.out.println("name: " + top.name);
            System.out.println("surname: " + top.surname);
            System.out.println("identity: " + top.identity);
            System.out.println("department: " + top.department);
            System.out.println("county: " + top.country);
        }
    }

    public void print() {
        System.out.println("-------------------------------------------------------------------------------------------");
        if (isEmpty()) {
            System.out.println("--- EMPTY ---");
        } else {
            Node tmp = top;
            while (tmp != null) {
                System.out.println("name: " + tmp.name);
                System.out.println("surname: " + tmp.surname);
                System.out.println("identity: " + tmp.identity);
                System.out.println("department: " + tmp.department);
                System.out.println("county: " + tmp.country);
                tmp = tmp.next;
                System.out.println("-------------------------------------------------------------------------------------------");
            }
        }
    }

    public boolean isFull() {
        return (cnt == size);
    }

    public boolean isEmpty() {
        return (cnt == 0);
    }
}
