package fibonacci_number;

class ValidateData{
    public static boolean checkMode(String stringMode){
        return stringMode.equals("1") || stringMode.equals("2");
    }

    public static boolean checkLength(String length){
        try{
            int ourLength = Integer.parseInt(length);
            if(ourLength < 0){
                System.out.println("Inputted length is incorrect");
                return false;
            }
            return  true;
        }catch(NumberFormatException e){
            System.out.println("Inputted length is incorrect");
            return false;
        }
    }
    public static boolean checkInterval(String[] interval){
        try{
            Double.parseDouble(interval[0]);
            double high = Double.parseDouble(interval[1]);
            if(high < 0){
                System.out.println("Inputted interval is incorrect");
                return false;
            }
            return true;
        }catch (NumberFormatException e){
            System.out.println("Inputted interval values are incorrect");
            return false;
        }
    }
}
