public class MMFigure implements Figure{
    private int number;
    private final int numOfUpperParts = 5;
    private final int numOfLowerParts = 7;

    public MMFigure() {
    }

    public MMFigure(int number) {
        setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void displayFigure() {
        displayUpperPart();
        displayLowerPart();
    }

    private void displayLowerPart() {
        int stars = number;
        int minuses = number / 2;
        int middleMinuses = 1;
        int middleStars = (number * 2) - 1;

        for (int i = (number + 1)/ 2; i < number + 1; i++) {

            //Display 2 times M
            for (int l = 0; l < 2; l++) {

                for (int j = 1; j <= numOfLowerParts; j++) {
                    if (j == 1 || j == 7) {
                        for (int k = 0; k < minuses; k++) {

                            System.out.print("-");
                        }
                    } else if (j == 2 || j == 6) {
                        for (int k = 0; k < stars; k++) {

                            System.out.print("*");
                        }
                    } else if (j == 3 || j == 5) {
                        for (int k = 0; k < middleMinuses; k++) {

                            System.out.print("-");
                        }
                    } else {
                        for (int k = 0; k < middleStars; k++) {

                            System.out.print("*");
                        }
                    }
                }
            }
            minuses--;
            middleMinuses += 2;
            middleStars -= 2;
            System.out.println();
        }
    }

    private void displayUpperPart() {
        int stars = number;
        int minuses = number;
        int middleMinuses = number;

        for (int k = 0; k < (number + 1)/ 2; k++) {

            //Display 2 times M
            for (int l = 0; l < 2; l++) {

                for (int i = 1; i <= numOfUpperParts; i++) {
                    if (i == 3) {
                        for (int j = 0; j < middleMinuses; j++) {

                            System.out.print("-");
                        }
                    } else if (i == 1 || i == 5) {
                        for (int j = 0; j < minuses; j++) {

                            System.out.print("-");
                        }
                    } else {
                        for (int j = 0; j < stars; j++) {

                            System.out.print("*");
                        }
                    }
                }
            }
            stars += 2;
            minuses--;
            middleMinuses -= 2;
            System.out.println();
        }
    }
}







