class Main {
  public static void main(String[] args) {
    String firstName = "";
    String surname = "";
    String mothersMaidenName = "";
    String birthCity = "";

    String starwarsname;
    
    //Step 1: ask user for firstname
        firstName = Keyboard.getText("Please insert your first name.");
    //Step 2: ask user for surname
        surname = Keyboard.getText("Please insert your surname.");

    //Step 3: ask user for mothers maiden name
        mothersMaidenName = Keyboard.getText("Please insert your mother's maiden name.");
    //Step 4: ask user for city in which they were born
        birthCity = Keyboard.getText("Please insert your city of birth.");

    //Step 5: starwarsname = first 3 letter of surname + first 2 letters of first name + " " + first 3 letters of motehrs maiden name + first 2 letters of town you **were born in
    String nameSectionOne = surname.substring(0,3);
    String nameSectionTwo = firstName.substring(0,2);
    String nameSectionThree = mothersMaidenName.substring(0,3);
    String nameSectionFour = birthCity.substring(0,2);  
        starwarsname = nameSectionOne + nameSectionTwo.toLowerCase() + " " + nameSectionThree + nameSectionFour.toLowerCase();
    //Step 6: display "your star wars name is " + starwarsname
    System.out.println("Your Star Wars name is " + starwarsname);
  }
}
