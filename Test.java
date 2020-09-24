import javax.management.MXBean;
import java.awt.*;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws URISyntaxException, IOException {
        System.out.println("/////       /////");
        System.out.println("     Diviner    ");
        System.out.println("                ");
        System.out.println("     by szhn    ");
        System.out.println("/////       /////");
        System.out.println();
        System.out.println("Debug?(yes=1 no=2)");
        Scanner scan4 = new Scanner(System.in);
        int debug = scan4.nextInt();
        int curyear = Calendar.getInstance().get(Calendar.YEAR), year;
        String stuff7 = "Дата";
        String stuff8 = "Время";
        String stuff9 = "Архитектура";
        String stuff10 = "ОС";
        String stuff11 = "Кол-во ядер";
        String stuff12 = "Версия JAVA";
        String stuff13 = "PC";
        String stuff14 = "Mem Usage";
        String stuff15 = "Compile Type";
        int date = Calendar.getInstance().get(Calendar.DATE), month = Calendar.getInstance().get(Calendar.MONTH);
        int hour = Calendar.getInstance().get(Calendar.HOUR), minute = Calendar.getInstance().get(Calendar.MINUTE), second = Calendar.getInstance().get(Calendar.SECOND);
        OperatingSystemMXBean bean = ManagementFactory.getOperatingSystemMXBean();
        RuntimeMXBean bean1 = ManagementFactory.getRuntimeMXBean();
        MemoryMXBean mem = ManagementFactory.getMemoryMXBean();
        CompilationMXBean comp = ManagementFactory.getCompilationMXBean();
        if (debug == 1) {
            System.out.println("//////Debug//////");
            System.out.println(stuff7 + " = " + date + ":" + month + ":" + curyear);
            System.out.println(stuff8 + " = " + hour + ":" + minute + ":" + second);
            System.out.println(stuff9 + " = " + bean.getArch());
            System.out.println(stuff10 + " = " + bean.getName());
            System.out.println(stuff11 + " = " + bean.getAvailableProcessors());
            System.out.println(stuff12 + " = " + bean1.getVmName() + " // // " + bean1.getVmVersion());
            System.out.println(stuff13 + " = " + bean1.getName());
            System.out.println(stuff14 + " = " + mem.getHeapMemoryUsage());
            System.out.println(stuff15 + " = " + comp.getName());
            System.out.println("//////Debug//////");
        } else if (debug == 2) {
            System.out.println("///Debug mode disabled///");
        }
        System.out.println();
        System.out.println("Start?(yes=1 no=2)");
        Scanner scan5 = new Scanner(System.in);
        int start = scan5.nextInt();
        if (start == 1) {
            System.out.println();
            System.out.println("//////Diviner//////");
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите возвраст");
            int age = scan.nextInt();
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Введите вес");
            Scanner scan2 = new Scanner(System.in);
            int height = scan1.nextInt();
            System.out.println("Введите пол (М=1 или Ж=2)");
            int pol = scan2.nextInt();
            year = curyear - age;
            Random r = new Random();
            int up = 10;
            int down = 5;
            int rand = r.nextInt(up);
            int rand2 = r.nextInt(down);
            int b = age + 1;
            int a = height + rand;
            int c = height - rand;
            int d = height + rand2;
            System.out.println("Введите вес");
            String stuff1 = "Твой возвраст";
            String stuff2 = "Твой вес";
            String stuff3 = "Твой вес через год(приблизительно)";
            String stuff4 = "Твой возвраст через год";
            String stuff5 = "Твой год рождения";
            String stuff6 = "Текующий год";
            System.out.println(stuff1 + " = " + age);
            System.out.println(stuff2 + " = " + height);
            if (pol == 1) {
                System.out.println(stuff3 + " = " + a);
            }
            if (pol == 2) {
                if(rand > 3){
                    System.out.println(stuff3 + " = " + c);
                }
                if(rand < 3){
                    System.out.println(stuff3 + " = " + d);
                }
            } else if (pol > 2) {
                System.out.println("Неправильно введён пол(М=1 или Ж=2)");
            }
            System.out.println(stuff4 + " = " + b);
//        System.out.println(stuff6 + " = "+ curyear);
            System.out.println(stuff5 + " = " + year);
            System.out.println("//////Diviner//////");
            System.out.println("Thanks for watching");
            Scanner scan3 = new Scanner(System.in);
            System.out.println("Open my GitHub?(1=yes 2=no)");
            int web = scan3.nextInt();
            URI u = new URI("https://github.com/szhn");
            Desktop desktop = java.awt.Desktop.getDesktop();
            if (web == 1) {
                desktop.browse(u);
                System.out.println("///Bye bye///");
            } else if (web == 2) {
                System.out.println("Created by szhn");
                System.out.println("///Bye bye///");
            }
        }
        else if(start == 2){
            System.out.println("///Ok Bye///");
            System.out.println("But maybe look my GitHub(1=yes 2=no)");
            Scanner scan3 = new Scanner(System.in);
            int web = scan3.nextInt();
            URI u = new URI("https://github.com/szhn");
            Desktop desktop = java.awt.Desktop.getDesktop();
            if (web == 1) {
                desktop.browse(u);
                System.out.println("///Bye bye///");
            }
            else if (web == 2) {
                System.out.println("Created by szhn");
                System.out.println("///Bye bye///");
            }
            else if (web > 2){
                System.out.println("incorrect");
                System.out.println("Created by szhn");
                System.out.println("///Bye bye///");
            }
        }
    }
}
