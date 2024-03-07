package sg.learn.builder;

/**
 * @标题
 * @描述信息
 * @作者 silly goose
 * @日期 2024/2/19
 */
public class Calzone extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false; // Default

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }


    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    public static void main(String[] args) {
        // 馅料内置
        Calzone calzone1 = new Calzone.Builder()
                .addTopping(Topping.蘑菇)
                .sauceInside()
                .build();
        // 馅料不内置
        Calzone calzone2 = new Calzone.Builder()
                .addTopping(Topping.蘑菇)
                .build();
    }
}
