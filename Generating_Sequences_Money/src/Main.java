import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
	Scanner scan = new Scanner(System.in);
	System.out.println(
			"This program will calculate the number of combinations \n"
			+ "that can be used to make the users desired monetary value \n"
			+ "using Dollars, Half Dollars, Quarters, Dimes, Nickles, and Pennies \n"
			+ "\n"
			+ "Please enter your desired value in the form of cents(1 dollar = 100 cents): "
			);
	
	int x = scan.nextInt();
    
    System.out.println("\nThere exists: " + distroCombination(x) + " ways of making " + x + " cents");

  }

  public static int distroCombination(int theBill)
  {
    int dollar = 100;
    int hD = 50;
    int quart = 25;
    int dime = 10;
    int nickle = 5;
    int penny = 1;
    int count = 0;

    for(int i = theBill/dollar; i >= 0; i--){
      if(theBill-(dollar*i) == 0){
        count++;
        //System.out.println("Dollars: " + (i));
      }else{
        for(int k = theBill/hD; k >= 0; k--){
          if(theBill-(dollar*i)-(hD*k) == 0){
            count++;
            //System.out.println("Dollars: " + (i) + " Halfs: " + (k));
          }else{
            for(int j = theBill/quart; j >= 0; j--){
              if(theBill-(dollar*i)-(hD*k)-(quart*j) == 0){
                count++;
                //System.out.println("Dollars: " + (i) + " Halfs: " + (k) + " Quarters: " + (j));
              }else{
                for(int l = theBill/dime; l >= 0; l--){
                  if(theBill-(dollar*i)-(hD*k)-(quart*j)-(dime*l) == 0){
                    count++;
                    //System.out.println("Dollars: " + (i) + " Halfs: " + (k) + " Quarters: " + (j) + " Dimes: " + (l));
                  }else{
                    for(int f = theBill/nickle; f >= 0; f--){
                      if(theBill-(dollar*i)-(hD*k)-(quart*j)-(dime*l)-(nickle*f) == 0){
                        count++;
                        //System.out.println("Dollars: " + (i) + " Halfs: " + (k) + " Quarters: " + (j) + " Dimes: " + (l) + " Nickles: " + (f));
                      }else{
                        for(int d = theBill/penny; d >= 0; d--){
                          if(theBill-(dollar*i)-(hD*k)-(quart*j)-(dime*l)-(nickle*f)-(penny*d) == 0){
                            count++;
                            //System.out.println("Dollars: " + (i) + " Halfs: " + (k) + " Quarters: " + (j) + " Dimes: " + (l) + " Nickles: " + (f) + " Pennies: " +(d));
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return count;
  }
}