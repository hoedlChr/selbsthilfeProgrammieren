public class newStringBeispiel 
{
    public static void main(String[] args) {
        String text = "Wörter starten mit Großbuchstaben";


        int counterSpace = 1;
        for(int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == ' ') {
                counterSpace++;
            }
        }


        int counterArrayLenght = 0;
        String[] myArray = new String[counterSpace];
        String helpMe = "";

        for(int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == ' ')
            {
//                helpMe += text.charAt(i) + "";
                myArray[counterArrayLenght] = helpMe;
                counterArrayLenght++;
                helpMe = "";
            }
            else if(i == (text.length() -1)){
                helpMe += text.charAt(i) + "";
                myArray[counterArrayLenght] = helpMe;
                counterArrayLenght++;
                helpMe = "";
            }
            else
            {
                helpMe += text.charAt(i) + "";
            }
        }


        String myLastString = "";
        for(int i = 0; i < myArray.length; i++)
        {
            char c = Character.toUpperCase(myArray[i].charAt(0));
            myArray[i] = myArray[i].replace(myArray[i].charAt(0), Character.toUpperCase(c));
            if(i == myArray.length-1)
            {
                myLastString += myArray[i];
            }
            else {
                myLastString += myArray[i] + " ";
            }
        }

        System.out.println("myLastString = \"" + myLastString + "\"");


        /*
        String myArray []= new String[text.split(" ").length];

        myArray = text.split(" ");
        
        for(int i = 0; i < myArray.length; i++)
        {
            System.out.println("myArray["+i+"] = " + myArray[i]);
        }
        */

    }
}
