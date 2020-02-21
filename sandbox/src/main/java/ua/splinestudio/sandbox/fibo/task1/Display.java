package chessboard;

class  Display {
    public static void showProgramInfo(){
        System.out.println("If you want to use this program, You must start this program with parameters of " +
                "height and width.");
    }

    public static void showErrorMessage(){
        System.out.println("Invalid parameters");
    }

    public static void showMessage(){
        System.out.println("You didn't enter whole numbers");
    }

    public  static void showChessBoard(StringBuilder chessBoard){
        System.out.print(chessBoard);
    }
}
