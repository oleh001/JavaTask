package task3;

/**
 * Created by user on 28.07.2016.
 */
public class Field implements MineSweeper {
    int N;
    int M;
    String[][] field = null;

    public void setMineField(String mineField) throws IllegalArgumentException {
        String[] fil = mineField.split("\n");
        this.N = fil[0].length();
        this.M = fil.length;
        field = new String[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++) {
                this.field[i][j] = String.valueOf(fil[i].charAt(j));
            }
    }

    public String getHintField() throws IllegalStateException {
        String fil = "";
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                fil += this.field[i][j];
            }
            if (i < M - 1) {
                fil += "\\n";
            }
        }
        return fil;
    }

    public static void main(String[] args) {
        Field fieldd = new Field();
        fieldd.setMineField("*211\\n12*1\\n0111");

        System.out.println(fieldd.getHintField().toString());
    }
}
