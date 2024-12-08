public class Technology {
    public void enableZeroGravity(Factory factory) {
        System.out.println(" Активация невесомости на" + factory.getState());
        factory.changeState(FactoryState.ZERO_GRAVITY);
    }
}
