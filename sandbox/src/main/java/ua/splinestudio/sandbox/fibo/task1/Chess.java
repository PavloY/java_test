package chessboard;

/*
Вывести шахматную доску с заданными размерами высоты и ширины, по принципу:
* * * * * *
 * * * * * *
* * * * * *
 * * * * * *
Программа запускается через вызов главного класса с параметрами.
*/

public class Chess {
	
	public static void main(String[] args) {
		
		if(args.length == 0) {
			Display.showProgramInfo();
		}
		else if (args.length == 2) {
			Chess.ourProgramRun(args);
		}else {
			Display.showErrorMessage();
		}	
	}

	public static void ourProgramRun(String[] args){
		if(ValidateData.checkParameters(args)){
			ChessBoard chessBoard = new ChessBoard(Integer.parseInt(args[0]), Integer.parseInt(args[1]), '*');
			StringBuilder chessBordObject = chessBoard.createChessBoard();
			Display.showChessBoard(chessBordObject);
		}else{
			Display.showMessage();
		}
	}
}

