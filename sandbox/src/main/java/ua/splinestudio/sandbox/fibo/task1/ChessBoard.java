package chessboard;

class ChessBoard{
    private int height;
    private int width;
    private char ch;

    private final static String BLANK = " ";
    private final static String NEW_LINE = "\n";

    ChessBoard(int height, int width, char ch){
        this.height = height;
        this.width = width;
        this.ch = ch;
    }

    public StringBuilder createChessBoard(){
        StringBuilder chessBoard = new StringBuilder();
        for(int i = 0; i < this.height; i++) {
            if(i%2 == 1) {
                chessBoard.append(BLANK);
            }
            for(int j = 0; j < this.width; j++) {
                chessBoard.append(this.ch + BLANK);
            }
            chessBoard.append(NEW_LINE);
        }
        return chessBoard;
    }
}
