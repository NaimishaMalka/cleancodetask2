public class tHCost {

public static void main(String[] args) {
// TODO Auto-generated method stub
HCCost hs = new HCCost();
System.out.println("The cost for the construction is: \n Rs " + hs.estimateCost("standardMaterial", 300.0, false));
System.out.println("The cost for the construction is: \n Rs" + hs.estimateCost("aboveStandardMaterial", 100.0, false));
System.out.println("The cost for the construction is:  \n Rs" + hs.estimateCost("highStandardMaterial", 150.0, false));
System.out.println("The cost for the construction is: \n Rs" + hs.estimateCost("highStandardMaterial", 200.0, true));
}

}
