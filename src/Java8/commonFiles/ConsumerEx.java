package Java8.commonFiles;

import java.util.function.Consumer;

public class ConsumerEx/* implements Consumer<String>*/ {
    /*@Override
    public void accept(String s) {
        System.out.println(s);
    }*/

    public static void main(String[] args) {
       /* FunctionalInterface.commonFiles.ConsumerEx consumerEx = new FunctionalInterface.commonFiles.ConsumerEx();
        consumerEx.accept("hi");*/

        Consumer<String> consumer = s-> System.out.println(s);
      consumer.accept("hello");
    }
}
