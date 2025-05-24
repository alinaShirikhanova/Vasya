package l_16_05_2025.enums2;

public enum Season{
    WINTER("Зима"){


        @Override
        public String getWeather() {
            return "Низкая";
        }
    },
    SPRING("Весна"),
    SUMMER,
    AUTUMN;

    private String seasonName;


    Season(String seasonName) {
        this.seasonName = seasonName;
    }

    Season() {
    }

    public static void print(){
        System.out.println("Hello");
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getWeather(){
        return "Средняя";
    }
}
