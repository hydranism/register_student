/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register_system;

import java.util.Scanner;
import java.io.*;
import java.util.*;
/**
 *
 * @author Spectre
 */
public class operation {
    public static Scanner keyboard = new Scanner(System.in);
    public int N;
    public static float datas[] = new float[20];
     public static String IdCourse,Str,ID;
     public static String NameCourse,Name,fac,major,year,addresss,phone,lastt;
     public static int Credit,last;
     public static String Day,Room,Time;
     //out.write(ID+"  "+Name+"  "+last+"  "+fac+"  "+major+"  "+year+" "+addresss+" "+phone+"  \r\n");
    private Object Course_Reg;

    public operation(int x) {      // Constructor ไม่มี  ไม่ใช้ ก็ได้
        N = x;
    }

   
    public void SubjectScheduler() {  //เพิ่มรายวิชา 
         
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 Scanner sc = new Scanner(System.in);
        try {
            BufferedWriter out = new  BufferedWriter(new FileWriter("Course_Reg.txt"));
              System.out.println("\nใส่จำนวนวิชาที่ทำการลงทะเบียน : ");
             N = keyboard.nextInt();
            
             for(int i=1; i<=N; i++)
             {  System.out.print(1+"> รหัสวิชา : ");
                //IdCourse = sc.next();
                    IdCourse = br.readLine();
                System.out.print("   ชื่อวิชา : ");
                    NameCourse = br.readLine();
                //NameCourse = sc.next();
                System.out.print("   จำนวนหน่วยกิต : ");
                    Str = br.readLine();
                Credit=Integer.parseInt(Str);
                System.out.print("   วันที่เรียน : ");
                    Day = br.readLine();
                 System.out.print("   ห้องเรียน : ");
                    Room =br.readLine();
                  System.out.print("   เวลาเรียน : ");
                    Time = br.readLine();
                out.write(IdCourse+"  "+NameCourse+"  "+Credit+"  "+Day+"  "+Room+"  "+Time+"  \r\n");
             }
            
            out.close();
            System.out.println("\n** File created successfully\n");
            
         }
        catch (IOException e) {
      }
    }
    
           
        public void Display_SubjectScheduler() { //แสดงข้อมูลที่ลงทะเบียน
        System.out.println("\nรายวิชาที่ลงทะเบียน");
                try {
            BufferedReader in = new BufferedReader (new FileReader("Course_Reg.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
         }
       catch (IOException e) {
         }
    }
        
          public  void Add_SubjectScheduler(  )
    {
    	try{
    		//String data = "19999 Valilake U.\n";

    		File file =new File("Course_Reg.txt");

    		// ถ้ายังไม่มี file ให้สร้าง file ใหม่
    		if(!file.exists()){
    			file.createNewFile();
    		}

    		 // เปิด file แบบ  append file เพื่อจัดเก็บข้อมูลแบบต่อท้าย
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                Scanner sc = new Scanner(System.in);
    		FileWriter  fileWritter  =  new  FileWriter(file.getName(),true);
    	   	BufferedWriter  bufferWritter  =  new  BufferedWriter(fileWritter);
                 System.out.println("\n ใส่จำนวนวิชาที่ทำการลงทะเบียน : ");// แสดงจำนวนรอย
                 N = keyboard.nextInt();
            
                for(int i=1; i<=N; i++)
                    {  
                         System.out.print(1+"> รหัสวิชา : ");
                            //IdCourse = sc.next();
                         IdCourse = br.readLine();
                         System.out.print("   ชื่อวิชา : ");
                         NameCourse = br.readLine();
                        //NameCourse = sc.next();
                         System.out.print("   จำนวนหน่วยกิต : ");
                           Str = br.readLine();
                         Credit=Integer.parseInt(Str);
                         System.out.print("   วันที่เรียน : ");
                        Day = br.readLine();
                          System.out.print("   ห้องเรียน : ");
                        Room =br.readLine();
                          System.out.print("   เวลาเรียน : ");
                            Time = br.readLine();
                         bufferWritter.write(IdCourse+"  "+NameCourse+"  "+Credit+"  "+Day+"  "+Room+"  "+Time+"  \r\n");
             }
    	   	//bufferWritter.write(data);
    	   	bufferWritter.close();

			// เปิด file เพื่ออ่านข้อมูล
	       	System.out.println("\n** Display datas in file");
		    BufferedReader  in  =  new BufferedReader (new  FileReader("Course_Reg.txt"));
         	String str;
         	while ((str = in.readLine()) != null)
                    { 
                        System.out.println(str);  
                    }
         	in.close( );

    	} catch(IOException e) {
    		e.printStackTrace();
    	   }
    }
          
          public  void Add_Student(  )
    {
    	try{
    		//String data = "19999 Valilake U.\n";

    		File file =new File("Student.txt");

    		// ถ้ายังไม่มี file ให้สร้าง file ใหม่
    		if(!file.exists()){
    			file.createNewFile();
    		}

    		 // เปิด file แบบ  append file เพื่อจัดเก็บข้อมูลแบบต่อท้าย
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 Scanner sc = new Scanner(System.in);
    		FileWriter  fileWritter  =  new  FileWriter(file.getName(),true);
    	   	BufferedWriter  bufferWritter  =  new  BufferedWriter(fileWritter);
                 System.out.println("\n ใส่จำนวนนิสิตทำการลงทะเบียน : ");// แสดงจำนวนรอย
             N = keyboard.nextInt();
            
            for(int i=1; i<=N; i++)
             {  System.out.print(1+"> รหัสนิสิต    : ");
                //IdCourse = sc.next();
                    ID = br.readLine();
                System.out.print("   ชื่อ : ");
                    Name = br.readLine();
                //NameCourse = sc.next();
                System.out.print("   นามสกุล : ");
                    lastt = br.readLine();
                //last=Integer.parseInt(lastt);
                System.out.print("   คณะ : ");
                    fac = br.readLine();
                 System.out.print("   สาขา : ");
                    major =br.readLine();
                  System.out.print("   ชั่นปี : ");
                    year = br.readLine();
                     System.out.print("   ที่อยู่ : ");
                    addresss = br.readLine();
                     System.out.print("   เบอร์โทร : ");
                    phone = br.readLine();
                bufferWritter.write(ID+"  "+Name+"    "+lastt+"   "+fac+" "+major+"   "+year+"    "+addresss+"    "+phone+"  \r\n");
             }
    	   	//bufferWritter.write(data);
    	   	bufferWritter.close();

			// เปิด file เพื่ออ่านข้อมูล
	       	System.out.println("\n** Display datas in file");
		    BufferedReader  in  =  new BufferedReader (new  FileReader("Student.txt"));
         	String str;
         	while ((str = in.readLine()) != null)
                    { 
                        System.out.println(str);  
                    }
         	in.close( );

    	} catch(IOException e) {
    		e.printStackTrace();
    	   }
    }
        public void Display_Student() { //แสดงข้อมูลที่ลงทะเบียน
        System.out.println("\nรายวิชาที่ลงทะเบียน");
                try {
            BufferedReader in = new BufferedReader (new FileReader("Student.txt"));
            String strr;
            while ((strr = in.readLine()) != null) {
                System.out.println(strr);
            }
            System.out.println(strr);
         }
       catch (IOException e) {
         }
    }
          
        public void Student() {  //เพิ่มรายชื่อนิสิต
         
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 Scanner sc = new Scanner(System.in);
        try {
            BufferedWriter out = new  BufferedWriter(new FileWriter("Student.txt"));
              System.out.println("\n ใส่จำนวนคน : ");// แสดงจำนวนรอย
             N = keyboard.nextInt();
            
            for(int i=1; i<=N; i++)
             {  System.out.print(1+"> รหัสนิสิต    : ");
                //IdCourse = sc.next();
                    ID = br.readLine();
                System.out.print("   ชื่อ : ");
                    Name = br.readLine();
                //NameCourse = sc.next();
                System.out.print("   นามสกุล : ");
                    lastt = br.readLine();
                //last=Integer.parseInt(lastt);
                System.out.print("   คณะ : ");
                    fac = br.readLine();
                 System.out.print("   สาขา : ");
                    major =br.readLine();
                  System.out.print("   ชั่นปี : ");
                    year = br.readLine();
                     System.out.print("   ที่อยู่ : ");
                    addresss = br.readLine();
                     System.out.print("   เบอร์โทร : ");
                    phone = br.readLine();
                out.write(ID+"  "+Name+"    "+lastt+"   "+fac+" "+major+"   "+year+"    "+addresss+"    "+phone+"  \r\n");
             }
            out.close();
            System.out.println("\n** File created successfully\n");
            
         }
        catch (IOException e) {
      }
    }
    public void SearchData() {
        System.out.println("\n*** Search Data\n");
        // . . . 
    }
}
