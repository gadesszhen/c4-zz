import java.util.Scanner;

class Game{
    private int v=100;
    private int guess;
    Game(int guess){
        this.guess = guess;
    }
    public void output(){
        Scanner in = new Scanner(System.in);
        while (guess != v){
                if (guess < v) {
                    System.out.println("猜的有点小，再试试吧");
                    guess = in.nextInt();
                } else if (guess > v) {
                    System.out.println("猜的有点大，再试试吧");
                    guess = in.nextInt();
                }
        };
        System.out.println("恭喜你，猜对啦！");
    }
}

public class Test4 {
    public static void main(String[] args){
        System.out.println("欢迎来到猜数字游戏，请输入一个正整数：");
        Scanner in = new Scanner(System.in);
        int guess = in.nextInt();
        Game game = new Game(guess);
        game.output();
    }
}
