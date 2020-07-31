import java.util.Scanner;

class prices {
  double carpetN = .5;
  String carpetNS = "0.50";
  double carpetP = 1.5;
  String carpetPS = "1.50";
  double carpetU = 3;
  String carpetUS = "3.00";

  double tileN = 3;
  String tileNS = "3.00";
  double tileP = 5;
  String tilePS = "5.00";

  double woodN = 2.5;
  String woodNS = "2.50";
  double woodP = 4;
  String woodPS = "4.00";
}

class catalogHold {
  Scanner scanner = new Scanner(System.in);
  prices p = new prices();
  // Holds the catalog options.
  void carpet() {
    System.out.println();
    System.out.println("Carpet:");
    System.out.println("In our carpet selection we offer 3 different grades of");
    System.out.println("durability being Normal, Premium, and Ultra.");
    System.out.println();
    System.out.println("Prices: ");
    System.out.println("Normal = $" + p.carpetNS + " sq. ft [Short Nap]");
    System.out.println("Premium = $" + p.carpetPS + " sq. ft [Long Nap]");
    System.out.println("Ultra = $" + p.carpetUS + " sq. ft [Long Durable Nap]");
    System.out.println();
    System.out.println("We offer all 3 of these options in various colors let");
    System.out.println("us know in the quote what color you would like.");
    System.out.println();
    System.out.println("Press any key then [Enter] when ready to exit");
    scanner.next().charAt(0);
  }

  void tile()  {
    System.out.println();
    System.out.println("Tile:");
    System.out.println("In our tile selection we offer 2 different grades of");
    System.out.println("durability being Normal and Premium.");
    System.out.println();
    System.out.println("Prices: ");
    System.out.println("Normal = $" + p.tileNS + " sq. ft");
    System.out.println("Premium = $" + p.tilePS + " sq. ft [Premium Grout and Durable Tile]");
    System.out.println();
    System.out.println("We offer beige, grey, pink, white, and black tile.");
    System.out.println();
    System.out.println("Press any key then [Enter] when ready to exit");
    scanner.next().charAt(0);
  }

  void wood() {
    System.out.println();
    System.out.println("Wood:");
    System.out.println("In our wood selection we offer 2 different grades of");
    System.out.println("durability being Normal and Premium");
    System.out.println();
    System.out.println("Prices: ");
    System.out.println("Normal = $" + p.woodNS + " sq. ft");
    System.out.println("Premium = $" + p.woodPS + " sq. ft [Durable]");
    System.out.println();
    System.out.println("We offer brown, black, light brown, and light grey.");
    System.out.println();
    System.out.println("Press any key then [Enter] when ready to exit");
    scanner.next().charAt(0);
  }
}

class method {
  Scanner scanner = new Scanner(System.in);
  catalogHold c = new catalogHold();
  prices p = new prices();
  double price;
  String priceS;
  double priceT;

  void catalog() {
    System.out.println();
    System.out.println("Welcome to the Catalog!");
    System.out.println("[1] Carpet");
    System.out.println("[2] Tile");
    System.out.println("[3] Wood");
    System.out.println("[4] Main Menu");
    System.out.print("Choice: ");
    char cchoice = scanner.next().charAt(0);
    switch(cchoice) {
      case '1' :
        c.carpet();
        catalog();
        break;
      case '2' :
        c.tile();
        catalog();
        break;
      case '3' :
        c.wood();
        catalog();
        break;
      case '4' :
        menu();
        break;
      default :
        System.out.println();
        System.out.println("Invalid Selection");
        catalog();
    }
  }

  void calc() {
    int check = 1;
    int counter = 0;
    double width;
    int widthi;
    double length;
    int lengthi;

    System.out.println();
    System.out.println("Welcome to the area calculator system!");
    System.out.println();
    System.out.println("Please note that reference is stretched a");
    System.out.println("little vertically based on font size");
    System.out.println();

    while(check == 1) {
      counter++;
      System.out.print("What is the width of room " + counter + "? ");
      width = scanner.nextDouble();
      System.out.print("What is the length of room " + counter + "? ");
      length = scanner.nextDouble();

      widthi = (int)width;
      lengthi= (int)length;

      char[][] picture = new char[lengthi+5][(widthi*2)+5];

      for(int i = 0; i < (widthi*2)+1; i++) {
        i++;
        picture[0][i] = '_';
        picture[0][i+1] = '_';
        picture[lengthi+1][i] = '=';
        picture[lengthi+1][i+1] = '=';
      }
      for(int i = 1; i < lengthi+1; i++) {
        picture[i][0] = '|';
        picture[i][widthi*2] = '|';
      }
      for(int i = 0; i < lengthi+3; i++) {
        System.out.println();
        for(int j = 0; j < (widthi*2)+1; j++) {
          System.out.print(picture[i][j]);
        }
      }
      System.out.println();

      double area = width*length;
      System.out.println("Total Area = " + area);
      System.out.println("Calculate Another room?[y][n]");
      char option = scanner.next().charAt(0);
      if(option == 'y') {}
      if(option == 'n') {
        check = 0;
      }
    }
    menu();
  }

  void quote() {
    System.out.println();
    System.out.println("Welcome to the Quote System!");
    System.out.println();
    System.out.println("Please select the type of flooring you would like!");
    System.out.println("(At any time select the menu option to cancel the quote)");
    System.out.println();
    System.out.println("[1] Carpet");
    System.out.println("[2] Tile");
    System.out.println("[3] Wood");
    System.out.println("[4] Main Menu");
    System.out.print("Choice: ");
    char qchoice = scanner.next().charAt(0);
    
    switch(qchoice) {
      case '1' :
        System.out.println("Which grade of carpet would you like?");
        System.out.println("[1] Normal");
        System.out.println("[2] Premium");
        System.out.println("[3] Ultra");
        System.out.println("[4] Main Menu");
        System.out.print("Choice: ");
        char carpetChoice = scanner.next().charAt(0);

        switch(carpetChoice) {
          case '1' :
            priceS = p.carpetNS;
            price = p.carpetN;
            break;
          case '2' :
            priceS = p.carpetPS;
            price = p.carpetP;
            break;
          case '3' :
            priceS = p.carpetUS;
            price = p.carpetU;
            break;
          case '4' :
            menu();
            break;
        }
        System.out.println("The price for that carpet is $" + priceS + " per square foot.");
        System.out.print("How many square feet would you like to purchase?: ");
        double areaCarpet = scanner.nextDouble();
        priceT = areaCarpet * price;
        System.out.print("What Color would you like?: ");
        String colorCarpet = scanner.nextLine();
        colorCarpet = scanner.nextLine();
        System.out.println("For " + areaCarpet + " square feet of " + colorCarpet + " carpet at $" +
                            priceS + " will cost a total of $" + priceT);
        System.out.println();
        System.out.println("Press any key and then [Enter] to return to main menu.");
        scanner.next().charAt(0);
        menu();
        break;

      case '2' :
        System.out.println("Which grade of tile would you like?");
        System.out.println("[1] Normal");
        System.out.println("[2] Premium");
        System.out.println("[3] Main Menu");
        System.out.print("Choice: ");
        char tileChoice = scanner.next().charAt(0);

        switch(tileChoice) {
          case '1' :
            priceS = p.tileNS;
            price = p.tileN;
            break;
          case '2' :
            priceS = p.tilePS;
            price = p.tileP;
            break;
          case '3' :
            menu();
            break;
        }
        System.out.println("The price for that tile is $" + priceS + " per square foot.");
        System.out.print("How many square feet would you like to purchase?: ");
        double areaTile = scanner.nextDouble();
        priceT = areaTile * price;
        System.out.print("What Color would you like?: ");
        String colorTile = scanner.nextLine();
        colorTile = scanner.nextLine();
        System.out.println("For " + areaTile + " square feet of " + colorTile + " tile at $" +
                            priceS + " will cost a total of $" + priceT);
        System.out.println();
        System.out.println("Press any key and then [Enter] to return to main menu.");
        scanner.next().charAt(0);
        menu();
        break;

      case '3' :
        System.out.println("Which grade of wood would you like?");
        System.out.println("[1] Normal");
        System.out.println("[2] Premium");
        System.out.println("[3] Main Menu");
        System.out.print("Choice: ");
        char woodChoice = scanner.next().charAt(0);

        switch(woodChoice) {
          case '1' :
            priceS = p.woodNS;
            price = p.woodN;
            break;
          case '2' :
            priceS = p.woodPS;
            price = p.woodP;
            break;
          case '3' :
            menu();
            break;
        }
        System.out.println("The price for that wood is $" + priceS + " per square foot.");
        System.out.print("How many square feet would you like to purchase?: ");
        double areaWood = scanner.nextDouble();
        priceT = areaWood * price;
        System.out.print("What Color would you like?: ");
        String colorWood = scanner.nextLine();
        colorWood = scanner.nextLine();
        System.out.println("For " + areaWood + " square feet of " + colorWood + " wood at $" +
                            priceS + " will cost a total of $" + priceT);
        System.out.println();
        System.out.println("Press any key and then [Enter] to return to main menu.");
        scanner.next().charAt(0);
        menu();
        break;

      case '4' :
        menu();
        break;

      default :
        System.out.println();
        System.out.println("Invalid Selection");
        quote();
    }
  }
  
  void menu() {
    // Display Menu Options
    System.out.println();
    System.out.println("Main Menu");
    System.out.println("[1] Flooring Catalog");
    System.out.println("[2] Area Calculator");
    System.out.println("[3] Quote System");
    System.out.println("[4] Exit Program");
    System.out.print("Choice: ");
    char mchoice = scanner.next().charAt(0);

    // Switch Statement controling menu options
    switch(mchoice) {
      case '1' :
        catalog();
        break;
      case '2' :
        calc();
        break;
      case '3' :
        quote();
        break;
      case '4' :
        // Nothing here as this exits the menu.
        break;
      default :
        System.out.println();
        System.out.println("Invalid Selection");
        menu();
    }
  }
}

class Flooring {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    method m = new method();

    // Welcome Screen
    System.out.println("Welcome to Bob's Floors Inc.");
    System.out.println("Press any key and then [Enter] to continue");
    scanner.next().charAt(0);

    // Main Menu
    m.menu();

    //Exit Program
    System.out.println();
    System.out.println("Program Ended");
  }
}