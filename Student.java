class Student{                             //Assignment1


 String name;
 String branch;
 int age;


void details(){

System.out.println("Details of the 5 students");
}



void Reading(){

System.out.println("Name=" +name+ ", Branch=" +branch+  ", Age=" +age);
}


public static void main(String args[]){

   Student krishna=new Student();
   Student Hemanthswamy=new Student();
   Student Rakshitha =new Student();
   Student Siddu =new Student();
   Student Soubhgya=new Student();


krishna.name="krishna";
krishna.branch="ECE";
krishna.age=22;

Hemanthswamy.name="Hemanth swamy";
Hemanthswamy.branch="CIVIL";
Hemanthswamy.age=23;



Rakshitha.name="Rakshitha";
Rakshitha.branch="CSE";
Rakshitha.age=24;

Siddu .name="Siddu ";
Siddu .branch="MECHANICAL";	
Siddu .age=25;

Soubhgya .name="Soubhgya ";
Soubhgya .branch="EEE";
Soubhgya .age=26;

Hemanthswamy.details();

krishna.Reading();

Hemanthswamy.Reading();

Rakshitha.Reading();

Siddu.Reading();

Soubhgya .Reading();




}

}