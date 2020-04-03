package design_paterns.creational.builder;

public class LunchOrderTeleTest {
    public static void main(String[] args) {
        LunchOrderTele lunchOrderBean = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }
}
