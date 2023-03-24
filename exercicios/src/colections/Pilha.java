package colections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		 livros.add("Harry Potter");
		 livros.push("new book");
		 
		 System.out.println(livros.peek());
		 System.out.println(livros.element());
		 
		 System.out.println(livros.pop());
		 System.out.println(livros.remove());
		 System.out.println(livros.poll());
	}
}
