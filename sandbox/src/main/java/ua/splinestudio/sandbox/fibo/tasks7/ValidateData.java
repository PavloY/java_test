package numerical_sequence;

class ValidateData{
    public static boolean checkLength(String length){
        try{
            int intLength = Integer.parseInt(length);
            if(intLength < 0){
                System.out.println("Inputted length is incorrect");
                return false;
            }
            return true;
        }catch (NumberFormatException e){
            System.out.println("Inputted length is incorrect");
            return false;
        }
    }

    public static boolean checkMinValue(String minValue){
        try{
            Double.parseDouble(minValue);
            return true;
        }catch (NumberFormatException e){
            System.out.println("Inputted minimal value is incorrect");
            return false;
        }
    }
}
