package ru.netology;
import com.github.javafaker.Faker;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Data
@NoArgsConstructor
public class DataGenerator {

    public static Faker faker = new Faker(new Locale("ru"));
    public static Faker fakereng = new Faker(new Locale("eng"));

    public static String getRandomCity() {
        List<String> list = Arrays.asList("Майкоп", "Горно-Алтайск", "Уфа", "Улан-Удэ",
                "Махачкала", "Магас", "Нальчик", "Элиста", "Черкесск", "Петрозаводск",
                "Сыктывкар", "Симферополь", "Йошкар-Ола", "Саранск", "Якутск", "Владикавказ",
                "Казань", "Кызыл", "Ижевск", "Абакан", "Грозный", "Чебоксары", "Барнаул", "Чита",
                "Петропавловск-Камчатский", "Краснодар", "Красноярск", "Пермь", "Владивосток",
                "Ставрополь", "Хабаровск", "Благовещенск", "Архангельск", "Астрахань", "Белгород",
                "Брянск", "Владимир", "Волгоград", "Вологда", "Воронеж", "Иваново", "Иркутск",
                "Калининград", "Калуга", "Кемерово", "Киров", "Кострома", "Курган", "Курск",
                "Санкт-Петербург", "Липецк", "Магадан", "Москва", "Мурманск", "Нижний Новгород",
                "Великий Новгород", "Новосибирск", "Омск", "Оренбург", "Орёл", "Пенза", "Псков",
                "Ростов-на-Дону", "Рязань", "Самара", "Саратов", "Южно-Сахалинск", "Екатеринбург",
                "Смоленск", "Тамбов", "Тверь", "Томск", "Тула", "Тюмень", "Ульяновск", "Челябинск",
                "Ярославль", "Нарьян-Мар", "Ханты-Мансийск", "Анадырь", "Салехард"
        );
        Random random = new Random();
        String randomCity = list.get(random.nextInt(list.size()));
        return randomCity;
    }

    public static String getNotCorrectCity() {
        String notCorrectCity = fakereng.address().cityName();
        return notCorrectCity;
    }

    public static String getCorrectDate(int days) {
        String dateOfDelivery = LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return dateOfDelivery;
    }

    public static String getNotCorrectDate() {
        String notCorrectDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return notCorrectDate;
    }

    public static String getRandomName() {
        String name = faker.name().lastName() + " " + faker.name().firstName();
        return name;
    }

    public static String getNotCorrectName() {
        String notCorrectName = fakereng.name().fullName();
        return notCorrectName;
    }

    public static String getNotCorrectNameWithYo() {
        String notCorrectName = "Семён";
        return notCorrectName;
    }

    public static String getRandomPhone() {
        String phone = faker.phoneNumber().phoneNumber();
        return phone;
    }

    public static String getNotCorrectPhone() {
        String phone ="+782543";
        return phone;
    }
}