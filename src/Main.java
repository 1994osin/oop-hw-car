import transport.Bus;
import transport.Car;
import transport.Car.*;
import transport.Train;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия",
                220, "бензин", 59.78, "МКПП", "седан", null, 5, true,
                null, new Insurance(LocalDate.of(2023, 1, 30), 8000, "FFF123FFF"));

        Car audi = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия",
                320, "бензин", 100, "АКПП", "купэ", "R899XX999", 4,
                true, new Key(true, true),
                new Insurance(LocalDate.of(2023, 12, 12), 17000, "12JJ232kk12"));

        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия",
                300, "дизель", 14.33, "АКПП", "кабриолет", "den099", 2,
                false, new Key(true, true),
                new Insurance(LocalDate.of(2022, 12, 1), 0, null));

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018,
                "Южная Корея", 240, "бензин", 66, "МКПП", "хэтчбэк", "В0999КП",
                6, false, new Key(true, false), null);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южная Корея", 250, "Бензин", 14.11, "АКПП", "седан", "В999ВВ123",
                5, true, new Key(false, false),
                new Insurance(LocalDate.of(2022, 12, 18), 0, null));

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", null,
                301, "дизель", 80, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский",
                11);

        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null,
                270, "дизель", 100, 1700, 120, "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);

        System.out.println(lastochka);
        System.out.println(leningrad);

        Bus bus1 = new Bus("ЗИЛ", "Р-88", 1999, "Россия", null, 120,
                "бензин", 188);
        Bus bus2 = new Bus("MAN", "h-122", 2020, "Германия", "черный", 0,
                "дизель", 89.899);
        Bus bus3 = new Bus("Лиаз", null, 2010, null, "зеленый", 140,
                "бензин", 10);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

        bus3.refill();

        System.out.println(bus3);

    }
}