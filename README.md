# Абстрактные классы и интерфейсы 

7.2. ArrayList и LinkedList

Задача
--------

Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. 
Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. 
Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.

Решение:
--------

    public static void compare2Lists() {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 1000;
        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }# Home_Practice_017_Colection
