public class Calculator {
    public static void main(String[] args) {
        System.out.println("The Bill Calculator");

        //Save total number of diners
        int numberOfPersons = 4;

        //taxes
        double taxPercent = 8;
        double tipPercent = 15;

        //split up by people and what they ordered
        double personOneAppetizerCost = 9.99;
        double personOneMainCost = 23.99;
        double personOneDessertCost = 10.29;
        double personOneDrinkCost = 8.50;

        double personTwoAppetizerCost = 12.99;
        double personTwoMainCost = 18.99;
        double personTwoDessertCost = 9.99;
        double personTwoDrinkCost = 4.25;

        double personThreeAppetizerCost = 10.49;
        double personThreeMainCost = 26.79;
        double personThreeDessertCost = 10.29;
        double personThreeDrinkCost = 3.75;

        double personFourAppetizerCost = 13.79;
        double personFourMainCost = 25.99;
        double personFourDessertCost = 4.49;
        double personFourDrinkCost = 7.50;

        //using strings to declare data
        String personOneName = "Adeline";
        String personOneAppetizer = "Stuffed Ziti Fritta";
        String personOneMain = "Shrimp Scampi";
        String personOneDessert = "Sicilian Cheesecake";
        String personOneDrink = "Raspberry Lemonade";

        String personTwoName = "Brixton";
        String personTwoAppetizer = "Lasagna Fritta";
        String personTwoMain = "Fettuccine Alfredo";
        String personTwoDessert = "Lemon Cream Cake";
        String personTwoDrink = "Mango-Strawberry Iced Tea";

        String personThreeName = "Cora";
        String personThreeAppetizer = "Fried Mozzarella";
        String personThreeMain = "Tour of Italy";
        String personThreeDessert = "Zeppoli";
        String personThreeDrink = "Fresh Brewed Iced Tea";

        String personFourName = "Dean";
        String personFourAppetizer = "Classic Shrimp Scampi Fritta";
        String personFourMain = "Seafood Alfredo";
        String personFourDessert = "Dolcini";
        String personFourDrink = "Coke";

        //using booleans
        boolean leaveTip = true;
        boolean splitEvenly = true;

        //total of meal cost by person
        double personOneSubTotal = personOneAppetizerCost + personOneMainCost + personOneDessertCost + personOneDrinkCost;
        double personTwoSubTotal = personTwoAppetizerCost + personTwoMainCost + personTwoDessertCost + personTwoDrinkCost;
        double personThreeSubTotal = personThreeAppetizerCost + personThreeMainCost + personThreeDessertCost + personThreeDrinkCost;
        double personFourSubTotal = personFourAppetizerCost + personFourMainCost + personFourDessertCost + personFourDrinkCost;

        //calculate taxes per person
        double taxAmount = taxPercent / 100;
        double personOneTax = personOneSubTotal * taxAmount;
        double personTwoTax = personTwoSubTotal * taxAmount;
        double personThreeTax = personThreeSubTotal * taxAmount;
        double personFourTax = personFourSubTotal * taxAmount;

        //calculate tip per person
        double tipAmount = tipPercent / 100;
        double personOneTip = personOneSubTotal * tipAmount;
        double personTwoTip = personTwoSubTotal * tipAmount;
        double personThreeTip = personThreeSubTotal * tipAmount;
        double personFourTip = personFourSubTotal * tipAmount;

        //calculate the total cost of the meal, with tax and tip
        double mealSubTotal = personOneSubTotal + personTwoSubTotal + personThreeSubTotal + personFourSubTotal;
        double mealTax = mealSubTotal * taxAmount;
        double mealTip = mealSubTotal * tipAmount;
        double mealTotal = mealSubTotal + mealTax + mealTip;

        double costPerPersonEven = mealTotal / 4;

        double personOneTotal = personOneSubTotal + personOneTax + personOneTip;
        double personTwoTotal = personTwoSubTotal + personTwoTax + personTwoTip;
        double personThreeTotal = personThreeSubTotal + personThreeTax + personThreeTip;
        double personFourTotal = personFourSubTotal + personFourTax + personFourTip;

        //print it out
        System.out.printf("The Bill Calculator\n");
        System.out.printf("Total cost of meal: $%.2f including: $%.2f tax and $%.2f tip\n", mealTotal, mealTax, mealTip);
        System.out.printf("Amount each person pays if split evenly in 4 is: $%.2f\n", costPerPersonEven);
        System.out.printf("If not split evenly:\n");
        System.out.printf("%s's meal costs: $%.2f\n",personOneName, personOneTotal);
        System.out.printf("%s's meal costs: $%.2f\n", personTwoName, personTwoTotal);
        System.out.printf("%s's meal costs: $%.2f\n", personThreeName, personThreeTotal);
        System.out.printf("%s's meal costs: $%.2f\n", personFourName, personFourTotal);
    }
}
