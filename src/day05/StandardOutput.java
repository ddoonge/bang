package day05;

public class StandardOutput {
    public int output(int num) {
        return num;
    }

    public int output(String str, int num1) {
        return (num1);
    }

    public double output(double num) {
        return num;
    }

    public String output(String str, int x, int y){
        return null;
    }

    public boolean output(int x, int y) {
        boolean isSame = false;
        if (x == y) {
            isSame = true;
        }
        return isSame;
    }
}
