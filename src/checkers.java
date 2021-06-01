public class checkers {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];

        System.out.println("\nWelcome to Checkers!\n");

        int play = 1;
        while (play == 1) {
            setUpBoard(arr);
            printBoard(arr);
            play = 0;
        }
    }

    public static void printBoard(String[][] arr) {
        int x = 0;
        for (int y = 0; y <= 8; y++) {
            for (x = 0; x <= 8; x++) {
                if (x == 8) {
                    System.out.println("+");
                } else {
                    System.out.print("+-----");
                }
            }
            if (y == 8) {
                System.out.println();
            } else {
                System.out.println("|  " + arr[y][0] + "  |  " + arr[y][1] + "  |  " + arr[y][2] + "  |  " + arr[y][3] + "  |  " + arr[y][4] + "  |  " + arr[y][5] + "  |  " + arr[y][6] + "  |  " + arr[y][7] + "  |");
            }
            /*if (y == 8){
                System.out.print("");
            }else{
                for (int i=0; i<=9; i++){
                    if (i == 9){
                        System.out.println("|");
                    }else{
                        if (x==9){
                            System.out.print("");
                        }else{
                            System.out.print("|  "+arr[y][x]+"  ");
                        }
                    }
                }
            }*/
        }
    }

    public static void setUpBoard(String[][] arr) {
        for (int y = 0; y < 8; y++) {
            if (y < 3) {
                if (y % 2 == 1) {
                    for (int x = 0; x < 8; x++) {
                        if (x % 2 == 0) {
                            arr[y][x] = "w";
                        } else {
                            arr[y][x] = " ";
                        }
                    }
                } else {
                    for (int x = 0; x < 8; x++) {
                        if (x % 2 == 1) {
                            arr[y][x] = "w";
                        } else {
                            arr[y][x] = " ";
                        }
                    }
                }
            } else if (y > 4) {
                if (y % 2 == 1) {
                    for (int x = 0; x < 8; x++) {
                        if (x % 2 == 0) {
                            arr[y][x] = "b";
                        } else {
                            arr[y][x] = " ";
                        }
                    }
                } else {
                    for (int x = 0; x < 8; x++) {
                        if (x % 2 == 1) {
                            arr[y][x] = "b";
                        } else {
                            arr[y][x] = " ";
                        }
                    }
                }
            } else {
                for (int x = 0; x < 8; x++) {
                    arr[y][x] = " ";
                }
            }
        }
    }
}
