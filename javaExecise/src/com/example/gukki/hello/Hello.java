//package com.example.gukki.hello;
//输入导入库
//import com.sun.source.tree.CaseTree;
//
//import javax.security.sasl.SaslClient;
//import java.awt.*;
//import java.awt.desktop.SystemEventListener;
//import java.security.PublicKey;
//import java.util.Arrays;
//import java.util.Scanner;

//public class Hello {
//    public static void main(String[] Args) {
//        System.out.println("hello");
//
//        int i = 2_000_000;
//        System.out.println(i);
//
//        float f1 = 3.14f;
//        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
//        double d = 1.79e308;
//        double d2 = -1.79e308;
//        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(d);
//        System.out.println(d2);
//        System.out.println(d3);
//
//        char a = 'A';
//        char zh = '中';
//        System.out.println(a);
//        System.out.println(zh);
//
//        String s = "hello";
//        System.out.println(s);
//        final double PI = 3.14; // PI是一个常量
////        PI = 300; // compile error!
//
//        int x = 9 / 2; //4
//        int y = 9 % 2; //1
//        System.out.println(x);
//        System.out.println(y);
//
//        int x1 = 2147483647;
//        int x2 = 1;
//        int x3 = x1 + x2;
//        System.out.println(x3);

//        int n = 7;
//        int n1 = n << 1;
//        int n2 = n << 2;
//        int n3 = n << 28;
//        int n4 = n << 29;
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//        System.out.println(n4);

//        int i = 167776589; // 00001010 00000000 00010001 01001101
//        int n = 167776512; // 00001010 00000000 00010001 00000000
//        System.out.println(i & n); // 167776512
//        short s = 1234;
//        int i = 123456;
//        int x = s + i;
//        short y = s + i;
//        System.out.println(x);
//        System.out.println(y);

//        int i = 1234567;
//        short s = (short) i;
//        System.out.println(s);

//        int n = 100;
//        int s = (1+100)*100/2;
//        System.out.println(s);
//        System.out.println(s==5050?"true":"false");

//        double x = 1.0/10;
//        double y = 1-9.0/10;
//        System.out.println(x);
//        System.out.println(y);
//        double z = Math.abs(x-y);
//        System.out.println(z<0.00000000000000001?"equal":"unequal");


//        double a = 1.2+24/5;
//        double b = 1.2+24.0/5;
//        double c = 1.2+24/5.0;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        double a=1.0;
//        double b=3.0;
//        double c=-4.0;
//        System.out.println((-Math.sqrt((b*b-4*a*c))-b)/2/a);
//        System.out.println((Math.sqrt((b*b-4*a*c))-b)/2/a);
//
//        double r1= 0;
//        double r2=0;

//        int n = 'A';
//        System.out.println(n);

//        String s = """
//             SELECT * FROM
//             users
//           WHERE id > 100
//           ORDER BY name DESC""";
//        System.out.println(s);
//        String s = "hello";
//        System.out.println(s);
//        s="world";
//        System.out.println(s);//s的指向变了

//        String s = "hello";
//        String t = s;
//        s="world";
//        System.out.println(s);//s的指向变了
//        System.out.println(t);

//        int a = 72;
//        int b = 105;
//        int c = 65281;
//
//        char i = (char) a;
//        char j = (char) b;
//        char k = (char) c;
//        System.out.println(i+j+k);
//        int[] ns=new int[5];
//        ns[0] = 1;
//        ns[1] = 2;
//        ns[2] = 3;
//        ns[3] = 4;
//        ns[4] = 5;
//        System.out.println(ns.length);
//        System.out.println(ns[6]);
//        String[] names ={"abc","fd","zj"};
//        String s = names[1];
//        names[1] ="bd";
//        System.out.println(s);

//        System.out.print("a,");
//        System.out.print("b,");
//        System.out.print("c，");
//        System.out.println();
//        System.out.println("end");

//        double d = 12900000;
//        System.out.println(d);

//        double d = 3.1415926;
//        System.out.printf("%.2f\n",d);
//        System.out.printf("%.4f\n",d);
////        System.out.print("%.4f\n",d);

//        int n = 12345000;
//        System.out.printf("n=%d,hex=%08x",n,n);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input your name: ");
//        String name = scanner.nextLine();
//        System.out.print("Input your age: ");
//        int age = scanner.nextInt();
//        System.out.printf("Hi,%s, you are %d\n",name,age);

//        Scanner scanner = new Scanner(System.in);
//        int GradeLast = scanner.nextInt();
//        int GradeThis = scanner.nextInt();
//        float a = (float) (GradeThis-GradeLast)/GradeLast;
//        System.out.printf("%.2f",a);

//        String s1 = "hello";
//        String s2 = "HELLO".toLowerCase();
//        System.out.println(s1);
//        System.out.println(s2);
//        if (s1 ==s2) {
//            System.out.println("s1==s2");
//        } else {
//            System.out.println("s1!=s2");
//        }
//        if(s1.equals(s2)) {
//            System.out.println("s1 equals s2");
//        } else {
//            System.out.println("s1 not equals s2");
//        }
//        String s3 = null;
//        if(s3!=null&&s3.equals("hello")) {
//            System.out.println("hello");
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input your name: ");
//        String name = scanner.nextLine();
//        System.out.print("Input your weight: ");
//        int weight = scanner.nextInt();
//        System.out.print("Input your height: ");
//        double height = scanner.nextDouble();
//        double bmi = (double) weight/height/height;
//        if(bmi < 18.5) {
//            System.out.printf("%s,you are so tiny",name);
//        } else if(bmi < 25) {
//            System.out.printf("%s, you are normal",name);
//        } else if(bmi < 28) {
//            System.out.printf("%s,you are little fat",name);
//        } else if(bmi < 32) {
//            System.out.printf("%s,you are fat",name);
//        } else {
//            System.out.printf("%s,you are too fat",name);
//        }

//        String fruit = "apple";
//        switch (fruit) {
//            case "apple" -> System.out.println("selected apple");
//            case "pear" -> System.out.println("selected pear");
//            case "mango" -> {
//                System.out.println("selected mango");
//                System.out.println("good choice");
//            }
//            default -> System.out.println("no fruit selected");
//        }

//        String fruit = "apple";
//        int opt = switch(fruit) {
//            case "apple" ->1;
//            case "pear" ,"mango"->2;
//            default -> 0;
//        };
//        System.out.println("opt =" +opt);

//        String fruit = "apple";
//        int opt = switch (fruit) {
//            case "apple" -> 1;
//            case "pear","mango" ->2;
//            default -> {
//                int code = fruit.hashCode();
//                yield code;
//            }
//        };
//        System.out.println("opt = "+opt);
//        System.out.print("Guess what: ");
//        Scanner scanner = new Scanner(System.in);
//        String name  = scanner.nextLine();
//        int opt = switch(name) {
//            case "jiandao"->1;
//            case "shitou" ->2;
//            default -> {
//                int code = name.hashCode();
//                yield code;
//            }
//        };
//        System.out.println("opt = " +opt);
//        int[] ns = {1,2,3,4,5,6,7};
//        System.out.println(Arrays.toString(ns));

//        int[] ns = {28,12,89,73,65,18,96,50,8,36};
//        System.out.println(Arrays.toString(ns));
//        Arrays.sort(ns);
//        for(int i = 0;i<ns.length-1;++i) {
//            for(int j = 0;j<ns.length-1;++j) {
//                if(ns[j] <= ns[j+1])
//                {
//                    int tmp = ns[j];
//                    ns[j] = ns[j+1];
//                    ns[j+1] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(ns));
//        if(Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
//            System.out.println("测试成功");
//        } else {
//            System.out.println("测试失败");
//        }
//    }
//        for(String arg:Args) {
//            if("--version".equals(arg)) {
//                System.out.println("v 1.0");
//                break;
//            }
//        }
//        System.out.println(1);
//        Student s= new Student("xiao ming",12,89);
//        Person p = new Student("Xiao Ming");
//        p.run();

//        Person ming = new Person("xiao ming",12);
//        Person hong = new Person("xiao hong",15);
//        ming.number=88;
//        System.out.println(hong.number);
//        hong.number=99;
//        System.out.println(ming.number);
//
//        Person.setNumber(101);
//        System.out.println(Person.number);
//        Person s=new Person("s",1);
//        Person m =new Person("m",2);
//        System.out.println(Person.getCount());
//
//    }
//}
//class Person {
//    protected String name;
//    protected int age;
//
//    public Person (String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
//class Student extends Person {
//    protected int score;
//    public Student(String name,int age,int score) {
//        super(name,age);
//        this.score = score;
//    }
//}
//interface Person {
//    String getName();
//    void run() ;
////        System.out.println(getName()+" run");
//}
//class Student implements Person {
//    private String name;
//    public Student(String name) {
//        this.name = name;
//    }
//    @Override
//    public String getName() {
//        return this.name;
//    }
//    @Override
//    public void run() {
//        System.out.println(this.getName()+" run run");
//    }

//class  Person {
//    public String name;
//    public int age;
//
//    public static int number;
//    public static int count=0;
//
//    public Person(String name,int age) {
//        this.name = name;
//        this.age = age;
//        count +=1;
//
//    }
//    public static void setNumber(int value) {
//        number = value;
//    }
//    public static final int getCount()
//    {
//        return count;
//    }
//}

//public class Hello {
//    public static void main(String[] Args) {
//        String name = " \thello\r\n";
//        System.out.println(name);
//        name.trim();
//        System.out.println(name);
//        System.out.println(name.trim());

//        String[] arr ={"A","B","C"};
//        String s = String.join("***",arr);
//        System.out.println(s);
//
//
//    }
//}
package com.example.gukki.hello;
import java.awt.desktop.PrintFilesEvent;
import java.awt.desktop.SystemSleepEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Hello {
    public static void main(String[] args) throws IOException {
        //传入文件路径
//        File file = new File("D:\\APP\\everything\\Everything.exe");
//        System.out.println(file);

//        File file = new File("..");
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getCanonicalPath());
//        文件和目录
//        File file1 = new File("C:\\Windows");
//        File file2 = new File("C:\\Windows\\notepad.exe");
//        File file3 = new File("C:\\Windows\\nothing");
//
//        System.out.println(file1.isFile());
//        System.out.println(file1.isDirectory());
//        System.out.println(file2.isFile());
//        System.out.println(file2.isDirectory());
//        System.out.println(file3.isFile());
//        System.out.println(file3.isDirectory());

        //创建和删除临时文件
//        File file1 = new File("C:\\Users\\HAO6\\Desktop");
//        File file = File.createTempFile("tmp-","txt");
//        file.deleteOnExit();
//        System.out.println(file.isFile());
//        System.out.println(file.getAbsolutePath());
        //遍历文件和目录
//        File file = new File("C:\\Users\\HAO6\\Desktop");
//        File[] fs1 = file.listFiles();
//        PrintFiles(fs1);
//        File[] fs2 = file.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.endsWith(".lnk");
//            }
//        });
//        PrintFiles(fs2);
//    }
//    static void PrintFiles(File[] files) {
//        System.out.println("=====");
//        if (files != null) {
//            for(File f : files) {
//                System.out.println(f);
//            }
//        }
//        System.out.println("=======");
//    }
        //path对象
        Path p1 = Paths.get(".","project","study");
        System.out.println(p1);
        Path p2 = p1.toAbsolutePath();
        System.out.println(p2);
        Path p3 = p2.normalize();
        System.out.println(p3);
        File f = p3.toFile();
        System.out.println(f);
        for(Path p : Paths.get("..").toAbsolutePath()) {
            System.out.println("   " + p);
        }

    }

}