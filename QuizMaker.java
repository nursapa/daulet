package sample;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class QuizMaker {
    public QuizMaker() {
    }

    public static void main(String[] var0) throws Exception {
        Quiz var1 = Quiz.loadFromFile(var0[0]);
        if (var1 != null) {
            var1.start();
        }

    }
}

