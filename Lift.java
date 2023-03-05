package HomeWork05032023;

public class Lift {
    public static int numberOfLifts(int floors, int stepUp, int stepDown) {
        int lifts = 0; // количество подъемов
        int position = 0; // текущая позиция лифта

        while (position < floors) {
            position += stepUp; // поднимаемся на stepUp этажей
            lifts++; // увеличиваем количество подъемов

            if (position >= floors) {
                break; // если мы уже на последнем этаже или выше, выходим из цикла
            }

            position -= stepDown; // спускаемся на stepDown этажей
        }

        return lifts;
    }
}


