
import java.util.*;
        
public class Examsys{


	public static void main(String[] args) 
	
        {
	   Scanner sc=new Scanner(System.in);
	   int ch;
		

		
				
           while(true) 
 	   {
	     System.out.println("01. JAVA");               //WILL ENTER TO JAVA QUESTION
	     System.out.println("02. C");                  //WILL ENTER TO C QUESTION
	     System.out.println("03. C++");                //WILL ENTER TO C++ QUESTION
	     System.out.println("04. PHP");		   //WILL ENTER TO HTML QUESTION
	     System.out.println("05. HTML");  		   //WILL ENTER TO HTML QUESTION
	     System.out.println("06. PYTHON");             //WILL ENTER TO PYTHON QUESTION
	     System.out.println("07. EXIT");               //WILL EXIT THE PROGRAM
	     System.out.println("Enter Your Choice: ");    //HERE THE USER WILL ENTER THIER CHOICE FOR QUESTION!
	     ch=sc.nextInt(); 
	     switch(ch)
	     {
		case 1:
                {
                    String q1 = "Q1. A process that involves recognizing and focusing on the important characteristics of a situation or object is known as: \n"
	   + "(a)Encapsulation\n(b)Abstraction\n(c)Inheritance\n(d)Polymorphism";

                    String q2 = "Q2. In Java, which if the following data type groups are of the same size?\n"
	   + "(a)int and long\n(b)double and int\n(c)long and float\n(d)int and float";
                    
                    String q3 = "Q3. Which of the following is class in Java?\n"
	   + "(a)Int\n(b)Float\n(c)String\n(d)Double";
                    
                    String q4 = "Q4. Which of these functions is called to display the output of an applet?\n"
	   + "(a)display()\n(b)print()\n(c)displayApplet()\n(d)PrintApplet()";
                    
                    String q5 = "Q5. Which of these methods can be used to output a sting in an applet?\n"
	   + "(a)display()\n(b)print()\n(c)trdient()\n(d)drawString()";
                    
                    String q6 = "Q6. Which of these operators is used to allocate memory to array variable in Java?\n"
	   + "(a)new\n(b)malloc\n(c)alloc\n(d)old";
                    
                    String q7 = "Q7. What will this code print?\n" +
                    "\n" +
                " int arr[] = new int [5];\n" +
                   
                " System.out.print(arr); \n"  +
                     "\n"       
	   + "(a)Garbage Value\n(b)00000\n(c)value stored in arr[0]\n(d)0";
                    
                    String q8 = "Q8. With x = 0, which of the following are legal lines of Java code for changing the value of x to 1?\n" +
"\n" +
" 1. x++;\n" +
"\n" +
" 2. x = x + 1;\n" +
"\n" +
" 3. x += 1;\n" +
"\n" +
" 4. x =+ 1;\n"
	   + "(a)1, 2 & 3\n(b)1 & 4\n(c)3 & 2\n(d)1, 2, 3 & 4";
                    
                    String q9 = "Q9. Which of these access specifiers can be used for an interface?\n"
	   + "(a)Public\n(b)Protected\n(c)Private\n(d)All of the mentioned";
                    
                    String q10 = "Q10. Which of these method of class String is used to obtain length of String object?\n"
	   + "(a)lengthof()\n(b)length()\n(c)Sizeof()\n(d)get()";
                    
                    
                Java [] javas = {
		new Java(q1, "b"),
		new Java(q2, "d"),
                new Java(q3, "c"),
                new Java(q4, "b"),
                new Java(q5, "d"),
                new Java(q6, "a"),
                new Java(q7, "a"),
                new Java(q8, "c"),
                new Java(q9, "a"),
                new Java(q10, "b"),
	};
	takeTest(javas);
        break;
                }
               
                
                case 2:
                {
                    String q1 = "Q1. #include<stdio.h>\n" +
"\n" +
"main() \n" +
"{ \n" +
"   const int a = 5; \n" +
"   \n" +
"   a++; \n" +
"   printf(\"%d\", a); \n" +
"}\n"
	   + "(a)5\n(b)6\n(c)Runtime Error\n(d)Compiler Error";

                    String q2 = "Q2. The keyword used to trdfer control from a function back to the calling function is\n"
	   + "(a)switch\n(b)goto\n(c)go back\n(d)return";
                    
                    String q3 = "Q3. If the two strings are identical, then strcmp() function returns\n"
	   + "(a)0\n(b)-1\n(c)1\n(d)Yes";

                    String q4 = "Q4. Which of the following is not logical operator?\n"
	   + "(a)&&\n(b)&\n(c)!\n(d)||";
                    
                    String q5 = "Q5. Which of the following cannot be checked in a switch-case statement?\n"
	   + "(a)Integer\n(b)Enum\n(c)Float\n(d)Character";
                    
                    String q6 = "Q6. What does the following declaration mean?\n" +
"int (*ptr)[10];\n"
	   + "(a)ptr is array of pointers to 10 integers\n(b)ptr is a pointer to an array of 10 integers\n(c)ptr is an array of 10 integers\n(d)ptr is an pointer to array";
                    
                    String q7 = "Q7. Input/output function prototypes and macros are defined in which header file?\n"
	   + "(a)math.h\n(b)conio.h\n(c)stdlib.h\n(d)stdio.h";
                    
                    String q8 = "Q8. What is stderr ?\n" 
           + "(a)standard error\n(b)standard error types\n(c)standard error streams\n(d)standard error defination";
                    
                    String q9 = "Q9. Which header file should be included to use functions like malloc() and calloc()?\n"
	   + "(a)string.h\n(b)stdlib.h\n(c)stdio.h\n(d)doc.h";
                      
                    String q10 = "Q10. In which numbering system can the binary number 1011011111000101 be easily converted to?\n"
	   + "(a)Decimal System\n(b)Hexadecimal System\n(c)Octat System\n(d)No Need To Convert";
                    
                    
                    
                    Clang [] clangs = {
		new Clang(q1, "d"),
		new Clang(q2, "d"),
                new Clang(q3, "a"),
		new Clang(q4, "b"),
                new Clang(q5, "c"),
		new Clang(q6, "b"),
                new Clang(q7, "d"),
		new Clang(q8, "c"),
                new Clang(q9, "a"),
		new Clang(q10, "a"),
                    };
                    takeTest(clangs);
			break;
                }
                

		case 3:
                {
                    String q1 = "Q1. Delaration a pointer more than once may cause ____ \n"
	   + "(a)Error\n(b)Abort\n(c)Trap\n(d)Null";

                    String q2 = "Q2. Which operation is used as Logical 'AND'\n"
	   + "(a)&&\n(b)&\n(c)||\n(d)+";
                    
                    String q3 = "Q3. An expression A.B in C++ med ____?\n"
	   + "(a)B is member of object A\n(b)A is member of object B\n(c)Product of A and B\n(d)None of the above.";
                    
                    String q4 = "Q4. ______ function is used to allocate space for array in memory.\n"
	   + "(a)malloc()\n(b)alloc()\n(c)calloc()\n(d)realloc()";
                    
                    String q5 = "Q5. Default constructor has ____ arguments.\n"
	   + "(a)No argument\n(b)One argument\n(c)Two argument\n(d)None of the above.";
                    
                    String q6 = "Q6. A class whos objects can not be created is known as _____?\n"
	   + "(a)Absent Class\n(b)Super Class\n(c)Dead Class\n(d)Abstract Class";
                    
                    String q7 ="Q7. A ponter pointing to a variable that is not initialized is called ____?\n"       
	   + "(a)Void Pointer\n(b)Null Pointer\n(c)Empty Pointer\n(d)Wild Pointer";
                    
                    String q8 = "Q8. Which class allows only one object to be created.\n"
	   + "(a)Nuclear Family Class\n(b)Abstruct Class\n(c)Sigleton Class\n(d)Numero Uno Class";
                    
                    String q9 = "Q9. Reusability of code in C++ is achieved through ____?\n"
	   + "(a)Polymorphism\n(b)Inheritance\n(c)Encapsulation\n(d)All";
                    
                    String q10 = "Q10. In CPP, members of a class are ______ by default.\n"
	   + "(a)Public\n(b)Static\n(c)Protected\n(d)Private";
                    
                    
                Cplus [] cpluss = {
		new Cplus(q1, "c"),
		new Cplus(q2, "a"),
                new Cplus(q3, "a"),
                new Cplus(q4, "c"),
                new Cplus(q5, "a"),
                new Cplus(q6, "d"),
                new Cplus(q7, "b"),
                new Cplus(q8, "c"),
                new Cplus(q9, "b"),
                new Cplus(q10, "d"),
	};
	takeTest(cpluss);
        break;
                }

case 4:
                {
                    String q1 = "Q1. PHP scripts are enclosed within _______?\n"
	   + "(a)<php> . . . </php>\n(b)<?php . . . ?>\n(c)?php . . . ?php\n(d)<p> . . . </p>";

                    String q2 = "Q2. Who is known as the father of PHP?\n"
	   + "(a)Willam Makepiece\n(b)Drek Kolkevi\n(c)Rasmus Lerdorf\n(d)List Barely";
                    
                    String q3 = "Q3. PHP is an example of ___________ scripting language.\n"
	   + "(a)Server-side\n(b)In-side\n(c)Client-side\n(d)Browser-side";
                    
                    String q4 = "Q4. PHP Stands for?\n"
	   + "(a)PHP Hyper Markup Preprocessor\n(b)PHP Hypertex Processor\n(c)PHP Hypertext Preprocessor\n(d)PHP Hyper Markup Processor";
                    
                    String q5 = "Q5. Which of the following variables is not a predefined variable?\n"
	   + "(a)$post\n(b)$request\n(c)$ask\n(d)$get";
                    
                    String q6 = "Q6. When you need to obtain the ASCII value of a character which of the following function you apply in PHP?\n"
	   + "(a)chr();\n(b)val();\n(c)asc();\n(d)ord();";
                    
                    String q7 ="Q7. Which of the following method sends input to a script via a URL?\n"       
	   + "(a) Get\n(b) Post\n(c) Both\n(d) None";
                    
                    String q8 = "Q8. PHP files have a default file extension of.dot \n"

	   + "(a).html\n(b).php\n(c).c\n(d).java";
                    
                    String q9 = "Q9.  Which of the following PHP statements will output Hello World on the screen? \n" + "\n" +
"(i) echo (“Hello World”); \n"  + "\n"  +
"(ii) print (“Hello World”); \n" + "\n"  + 
"(iii) printf (“Hello World”); \n" + "\n" +
"(iv) sprintf (“Hello World”);\n" + "\n"
	   + "(a)1 & 2\n(b)1 , 2 & 3\n(c)All\n(d)None";
                    
                    String q10 = "Q10.  Say we have two compare two strings which of the following function/functions can you use? \n" + 
"\n" +
"(i) strcmp() \n" + "\n" + 
"(ii) strcasecmp() \n" + "\n" +
"(iii) strspn() \n" + "\n" +
"(iv) strcspn()\n" + "\n"
	   + "(a)(i) and (ii)\n(b)(iii) and (iv)\n(c)All\n(d)None";
                    
                    
                Php [] phps = {
		new Php(q1, "b"),
		new Php(q2, "c"),
                new Php(q3, "a"),
                new Php(q4, "c"),
                new Php(q5, "d"),
                new Php(q6, "d"),
                new Php(q7, "a"),
                new Php(q8, "b"),
                new Php(q9, "b"),
                new Php(q10, "c"),
	};
	takeTest(phps);
        break;
                }



                
                case 5:
                {
                    String q1 = "Q1. What is the full form of HTML?\n"
	   + "(a)Hyper Tech Markup Language\n(b)Hyper Teach Markup Language\n(c)HyperText Markup Language\n(d)None of the above.";

                    String q2 = "Q2. Who is Known as the father of World Wide Web (WWW)?\n"
	   + "(a)Tim Berners-Lee\n(b)Tim Thompson\n(c)Charles Darwin\n(d)Robert Cailliau";
                    
                    String q3 = "Q3. What should be the first tag in any HTML document?\n"
	   + "(a)<html>\n(b)<head>\n(c)<body>\n(d)<title>";
                    
                    String q4 = "Q4. How can you make a bulleted list with numbers?\n"
	   + "(a)<ul>\n(b)<ol>\n(c)<dl>\n(d)<list>";
                    
                    String q5 = "Q5. HTML is what type of language ?\n"
	   + "(a)Scripting Language\n(b)Programming Language\n(c)Network Protocol\n(d)Markup Language";
                    
                    String q6 = "Q6. The year in which HTML was first proposed _______.\n"
	   + "(a)1970\n(b)1990\n(c)2000\n(d)1980";
                    
                    String q7 = "Q7.Apart from <b> tag, what other tag makes text bold ?\n"       
	   + "(a)<black>\n(b)<fat>\n(c)<strong>\n(d)<emp>";
                    
                    String q8 = "Q8. Which HTML tag produces the biggest heading?\n"
	   + "(a)<h1>\n(b)<h4>\n(c)<h7>\n(d)<h9>";
                    
                    String q9 = "Q9. HTML tags are surrounded by which type of brackets?\n"
	   + "(a)Curly\n(b)Square\n(c)Round\n(d)Angle";
                    
                    String q10 = "Q10. 	Tags and test that are not directly displayed on the page are written in _____ section.\n"
	   + "(a)<html>\n(b)<head>\n(c)<title>\n(d)<body>";
                    
                    
                Html [] htmls = {
		new Html(q1, "c"),
		new Html(q2, "a"),
                new Html(q3, "a"),
                new Html(q4, "b"),
                new Html(q5, "d"),
                new Html(q6, "b"),
                new Html(q7, "c"),
                new Html(q8, "a"),
                new Html(q9, "d"),
                new Html(q10, "b"),
	};
	takeTest(htmls);
        break;
                }
               
                

case 6:
                {
                    String q1 = "Q1. Which of the following symbols are used for comments in Python?\n"
	   + "(a)#\n(b)''\n(c)//\n(d)/**/";

                    String q2 = "Q2. Which keyword is used to define methods in Python?\n"
	   + "(a)Function\n(b)Method\n(c)Def\n(d)All of the above";
                    
                    String q3 = "Q3. Which of the following is correct way to declare string variable in Python?\n"
	   + "(a)fruit = banana\n(b)fruit = [banana]\n(c)fruit = (banana)\n(d)fruit = 'banana'";
                    
                    String q4 = "Q4. Which predefined Python function is used to find length of string?\n"
	   + "(a)stringlength()\n(b)strlen()\n(c)len()\n(d)length()";
                    
                    String q5 = "Q5. Syntax of constructor in Python?\n"
	   + "(a) def __init__()\n(b)def _init_()\n(c)_init_()\n(d)All of the above.";
                    
                    String q6 = "Q6. How to find the last element of list in Python? Assume `bikes` is the name of list.\n"
	   + "(a)bikes[0]\n(b)bikes[1]\n(c)bikes[lpos]\n(d)bikes[:-1]";
                    
                    String q7 ="Q7. What is correct syntax to copy one list into another?\n"       
	   + "(a) listA = listB[]\n(b) listA = listB[:]\n(c) listA = listB[]()\n(d) listA = listB";
                    
                    String q8 = "Q8. If a='Zarss', b='Shaikh' then what is the output of:\n"  + 
					"\n" + 
					"c = a-b \n" + "\n" + 
					"print(c) \n"

	   + "(a)ZarssShaikh\n(b)Zarss-Shaikh\n(c)TypeError: unsupported operand\n(d)None of the above";
                    
                    String q9 = "Q9. print(chr(ord('b')+1))\n"
	   + "(a)b\n(b)c\n(c)Syntax Error\n(d)b+c";
                    
                    String q10 = "Q10. If a='Zarss', b='Shaikh' then which of the following operation would show 'ZarssShaikh' as output?\n"
	   + "(a)a+b\n(b)a+''+b\n(c)a++b\n(d)All";
                    
                    
                Python [] pythons = {
		new Python(q1, "a"),
		new Python(q2, "c"),
                new Python(q3, "d"),
                new Python(q4, "c"),
                new Python(q5, "a"),
                new Python(q6, "b"),
                new Python(q7, "b"),
                new Python(q8, "c"),
                new Python(q9, "b"),
                new Python(q10, "d"),
	};
	takeTest(pythons);
        break;
                }




             }
           }
        }
                   
        public static void takeTest(Java [] javas) {
               
        int score = 0;
Scanner sc=new Scanner(System.in);

System.out.println("Enter Name= ");
String name=sc.nextLine();

System.out.println("Enter Rollno= ");
int rollno = sc.nextInt();

System.out.println("");
String n1ame=sc.nextLine();

            for (int i=0;i<javas.length;i++) {
                System.out.println(javas[i].a);
                String b = sc.nextLine();
                if (b.equals(javas[i].b)) {
                    score++;
                }
            }
System.out.println("Congratulation!" + " "+ name + " " + "Roll no.= " + " " + rollno + " " + "\n" + "You Scored " + score + "/" + javas.length + "\n");
             
}
        
         public static void takeTest(Clang [] clangs) {
               
        int sco = 0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name= ");
String name=sc.nextLine();
System.out.println("Enter Rollno= ");
int rollno = sc.nextInt();

System.out.println("");
String n1ame=sc.nextLine();
            for (int i=0;i<clangs.length;i++) {
                System.out.println(clangs[i].c);
                String d = sc.nextLine();
                if (d.equals(clangs[i].d)) {
                    sco++;
                }
            }
System.out.println("Congratulation!" + " "+ name + " " + "Roll no.= " + " " + rollno + " " + "\n" + "You Scored " + sco + "/" + clangs.length + "\n");
	

}
            

public static void takeTest(Cplus [] cpluss) {
               
        int s = 0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name= ");
String name=sc.nextLine();
System.out.println("Enter Rollno= ");
int rollno = sc.nextInt();

System.out.println("");
String n1ame=sc.nextLine();
            for (int i=0;i<cpluss.length;i++) {
                System.out.println(cpluss[i].p);
                String q = sc.nextLine();
                if (q.equals(cpluss[i].q)) {
                    s++;
                }
            }
System.out.println("Congratulation!" + " "+ name + " " + "Roll no.= " + " " + rollno + " " + "\n" + "You Scored " + s + "/" + cpluss.length + "\n");
	

             
}

public static void takeTest(Php [] phps) {
               
        int scoress = 0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name= ");
String name=sc.nextLine();
System.out.println("Enter Rollno= ");
int rollno = sc.nextInt();

System.out.println("");
String n1ame=sc.nextLine();
            for (int i=0;i<phps.length;i++) {
                System.out.println(phps[i].z);
                String s = sc.nextLine();
                if (s.equals(phps[i].s)) {
                    scoress++;
                }
            }
System.out.println("Congratulation!" + " "+ name + " " + "Roll no.= " + " " + rollno + " " + "\n" + "You Scored " + scoress + "/" + phps.length + "\n");
	
             
}



public static void takeTest(Html[] htmls) {
               
        int score1 = 0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name= ");
String name=sc.nextLine();
System.out.println("Enter Rollno= ");
int rollno = sc.nextInt();

System.out.println("");
String n1ame=sc.nextLine();
            for (int i=0;i<htmls.length;i++) {
                System.out.println(htmls[i].g);
                String h = sc.nextLine();
                if (h.equals(htmls[i].h)) {
                    score1++;
                }
            }
System.out.println("Congratulation!" + " "+ name + " " + "Roll no.= " + " " + rollno + " " + "\n" + "You Scored " + score1 + "/" + htmls.length + "\n");
             
}




public static void takeTest(Python [] pythons) {
               
        int scores = 0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name= ");
String name=sc.nextLine();
System.out.println("Enter Rollno= ");
int rollno = sc.nextInt();

System.out.println("");
String n1ame=sc.nextLine();
            for (int i=0;i<pythons.length;i++) {
                System.out.println(pythons[i].r);
                String s = sc.nextLine();
                if (s.equals(pythons[i].s)) {
                    scores++;
                }
            }
System.out.println("Congratulation!" + " "+ name + " " + "Roll no.= " + " " + rollno + " " + "\n" + "You Scored " + scores + "/" + pythons.length + "\n");
	

             
}


           }


class Java {
    String a;
	String b;

	public Java(String a, String b) {
		this.a = a;
		this.b = b;

}
}

class Php {
    String z;
	String s;

	public Php(String z, String s) {
		this.z = z;
		this.s = s;

}
}


class Python {
    String r;
	String s;

	public Python(String r, String s) {
		this.r = r;
		this.s = s;

}
}

class Clang {
    String c;
	String d;

	public Clang(String c, String d) {
		this.c = c;
		this.d = d;

}
}

class Html {
    String g;
	String h;

	public Html(String g, String h0) {
		this.g = g;
		this.h = h;

}
}

class Cplus {
    String p;
	String q;

	public Cplus(String p, String q) {
		this.p = p;
		this.q = q;

}
}



