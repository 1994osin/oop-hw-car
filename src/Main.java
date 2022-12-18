import transport.Car;
import transport.Car.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия",
                "МКПП", "седан", null, 5, true,
                null,
                new Insurance(LocalDate.of(2023, 1, 30), 8000, "FFF123FFF"));

        Car audi = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия",
                "АКПП", "купэ", "R899XX999", 4, true,
                new Key(true, true),
                new Insurance(LocalDate.of(2023, 12, 12), 17000, "12JJ232kk12"));

        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия",
                "АКПП", "кабриолет", "den099", 2, false,
                new Key(true, true),
                new Insurance(LocalDate.of(2022, 12, 1), 0, null));

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея",
                "МКПП", "хэтчбэк", "В0999КП", 6, false,
                new Key(true, false),
                null);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея",
                "АКПП", "седан", "В999ВВ123", 5, true,
                new Key(false, false),
                new Insurance(LocalDate.of(2022, 12, 18), 0, null));

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        hyundai.getInsurance().printExpired();
        audi.getInsurance().printIsCorrectNumber();

    }
}