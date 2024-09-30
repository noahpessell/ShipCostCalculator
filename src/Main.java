//class ShippingCosts
//main()
//num itemPrice
//num shipCost
//OUTPUT “Enter your item price: “
//INPUT itemPrice
//if itemPrice >= 100 then
//   shipCost = 0
//else
//   shipCost = itemPrice * 0.02
//endIf
//totalPrice = itemPrice + shipCost
//OUTPUT "The cost of shipping on your $" + itemPrice “ item is “ + shipCost
//OUTPUT “The total price is $“ + totalPrice
//return
//end class
public class Main {
    public static void main(String[] args)
    {
        double itemPrice = 0;

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++)
        {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}