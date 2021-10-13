class flower{
  
string name;
string color;
int noOfpetals;

void shredfragrance(){
System.out.println(name+ "is shredding fragrance...!");
}

void bloom(){

System.out.println(name+ "is blooming..!");
}

public static void main(String args[]){

       flower rose=new flower();

rose.name="Rose";
rose.color="Red";
rose.noOfpetals=7;

rose.shredfragrance();
rose.bloom();
}

}