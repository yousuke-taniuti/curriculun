package check;

import constants.Constants;

public class Check {

    private static String firstName = "谷内";
    private static String lastName = "洋介";

    public  Check() {
        super();
    }
      Check(String firstName, String lastName){
              Check.firstName = firstName;
              Check.lastName = lastName;
      }
       public void setFirstName(String firstName) {
                Check.firstName = firstName;
    }
       public void setLastName(String lastName) {
                 Check.lastName = lastName;
    }

       public String getFirstName() {
           return firstName;
    }
       public String getLastName() {
           return lastName;
    }

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
       String printName = firstName + lastName;
        System.out.println("printNameメソッド " + "→ " + printName);

     Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
        pet.introduce();
        RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        robotPet.introduce();
    }



    }

