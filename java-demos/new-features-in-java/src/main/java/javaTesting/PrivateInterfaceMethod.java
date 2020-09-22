package javaTesting;

interface PrivateInterfaceMethod {
    void testAbstract();
    private void test(){
        System.out.println("test");
    }
    default void testDefault(){
        test();
        System.out.println("testDefault");
    }
    static void testStatic(){
        System.out.println("testStatic");
    }

}
