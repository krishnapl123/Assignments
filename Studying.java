class Studying{


 String name;
 String branch;
 int age;

void Reading(){

System.out.println(name+ " is studying in " +branch+ " branch at the age " +age);
}

public static void main(String args[]){

   student krishna=new student();
   student Hemanthswamy=new student();
    student Rakshitha =new student();
   student Siddu =new student();
   student Soubhgya=new student();


Hemanthswamy.name="Hemanth swamy";
Hemanthswamy.branch="CIVIL";
Hemanthswamy.age=23;

krishna.name="krishna";
krishna.branch="ECE";
krishna.age=22;

Rakshitha.name="Rakshitha";
Rakshitha.branch="CSE";
Rakshitha.age=24;

Siddu .name="Siddu ";
Siddu .branch="MECHANICAL";
Siddu .age=25;

Soubhgya .name="Soubhgya ";
Soubhgya .branch="EEE";
Soubhgya .age=26;



krishna.Reading();

Hemanthswamy.Reading();

Rakshitha.Reading();

Siddu.Reading();

Soubhgya .Reading();
}

}