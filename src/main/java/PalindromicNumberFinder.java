public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
     int palo= 0;
     for (int i=num+1; i>num; i++){
       if (testPalindromicNum(i)==true){
         palo=i;
         break;
       }else{
         palo=1;
       }
     }
     return palo;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      Integer myInt = num;
      String myString=myInt.toString();
      if(myString.equals(reverseNum(num))){
        return true;
      }else{
        return false;
      }

    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      Integer myInt = num;
      String myString=myInt.toString();
      String reverseStr= "";
      for (int i=0; i<myString.length();i++){
        reverseStr= reverseStr + myString.charAt(myString.length()-(1+i));
      }
      return reverseStr;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
