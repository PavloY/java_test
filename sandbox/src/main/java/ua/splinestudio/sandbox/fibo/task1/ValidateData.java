package chessboard;

class ValidateData{
    private static int height;
    private static int width;

    public static boolean checkParameters(String[] inputData){
        try{
            height = Integer.parseInt(inputData[0]);
            width = Integer.parseInt(inputData[1]);
        }catch(NumberFormatException e){
            System.out.println("Invalid parameters");
            return false;
        }
        if(height < 0 || width < 0){
            System.out.println("Invalid parameters");
            return false;
        }
        return true;
    }
}
