public class Main {
    public static void main(String[] args) {
        Groups programmers = new Groups("Программирование");
        Groups kolledg = new Groups("Колледж");
        Groups game = new Groups("Игры");
        Groups marvel = new Groups("Всё о марвел");

        User userFirst = new User("Иванушка");
        userFirst.subscribe(programmers);
        userFirst.subscribe(kolledg);
        userFirst.subscribe(game);
        User userSecond = new User("Кирюшка");
        userSecond.subscribe(programmers);
        userSecond.subscribe(kolledg);
        userSecond.subscribe(game);
        userSecond.subscribe(marvel);

        programmers.news("Всём привет это канал прогеров, если ты прогер или увдекаешься этим, заходи!!! Не пожалеешь :)");
        kolledg.news("В этом году будет целых 50 бюджетных месть на специальность \" Программирование\"");
        programmers.news("Вот вам набор свежишь нейронок для программирования");
        game.news("Подборка лучших игр по мнению критиков:");
        marvel.news("А вы уже посмотрели Стражи галактики 3?");
    }
}