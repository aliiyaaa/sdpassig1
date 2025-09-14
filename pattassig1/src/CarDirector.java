public class CarDirector {
    public Car constructor(Builderr builder) {
        builder.setBrand("Toyota");
        builder.setModel("Camry");
        builder.setYear(2017);
        return builder.build();
    }
    public Car SportConstructor(Builderr builder) {
        builder.setBrand("BMW");

        builder.setModel("M5");

        builder.setYear(2018);
        return builder.build();
    }

}
