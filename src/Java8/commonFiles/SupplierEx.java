package Java8.commonFiles;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierEx /*implements Supplier<Date>*/ {
  /*  @Override
    public Date get() {
        return new Date();
    }*/

    public static void main(String[] args) {
        /*FunctionalInterface.commonFiles.SupplierEx supplierEx = new FunctionalInterface.commonFiles.SupplierEx();
        System.out.println(supplierEx.get());*/

        Supplier<java.util.Date> supplier = ()-> new Date();

        System.out.println(supplier.get());

    }
}
