package javaTesting;

public class PrivateInterfaceMethodImpl implements PrivateInterfaceMethod {
    @Override
    public void testAbstract() {
        testDefault();
        System.out.println();
        PrivateInterfaceMethod.testStatic();
    }
}
