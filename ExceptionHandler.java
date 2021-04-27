package com.javarush.task.task32.task3209;

public class ExceptionHandler {
    //наш собственный обработчик исключений, в будушем будем его переопределять

    public static void log(Exception e) {
        //выводит в консоль краткое описание проблемы
        System.out.println(e.toString());
    }
}
