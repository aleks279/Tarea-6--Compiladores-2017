package tarea6;

import java.io.*;
import java_cup.runtime.*;
import tree.*;

class Calculator {
    public static void main (String [] args)
    {
        PromptReader prompt = new PromptReader(System.in, System.out);

        try {
        	String calculatorFlex = "./src/tarea6/calculator.flex";
    		File jflexFile = new File(calculatorFlex);

    		jflex.Main.generate(jflexFile);
    		
    		System.out.println("ITCR");
    		System.out.println("Ing en Computacion");
    		System.out.println("Compiladores e Interpretes");
    		System.out.println("Prof. Fabian Fallas Moya");
    		System.out.println("Tarea 6");
    		System.out.println("Saul Zamora");
    		System.out.println("");
    		System.out.println("Digite la expresion a evaluar:");

            while (true) {
                String st = prompt.promptLine();
                Environment env = new Environment();

                parser p = new parser(new Lexer(new StringReader(st)));

                Symbol s = p.parse();

                Tree tree = (Tree) s.value;

                env.print();
                tree.print();
                System.out.println("");
                System.out.println("Result = " + tree.eval(env));
            }
        }
        catch (Exception e) {
            System.out.println("Parsing error.");
            System.out.println(e);
        };
    }
}
