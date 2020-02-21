package ua.splinestudio.sandbox.fibo.tasks6;

class ValidateData {
    public static boolean checkData(String[] inputtedData) {
        for (int i = 0; i < inputtedData.length; i++) {
            try {
                Integer.parseInt(inputtedData[i]);
            } catch (NumberFormatException e) {
                System.out.println("Inputted ticket number is incorrect");
                return false;
            }
            if (inputtedData[i].length() > 6) {
                System.out.println("You entered more then six-digit ticket");
                return false;
            }
        }
        if (Integer.parseInt(inputtedData[0]) > Integer.parseInt(inputtedData[1])) {
            System.out.println("Started ticket number can't be more than the finish one.");
            return false;
        }
        return true;
    }
}
