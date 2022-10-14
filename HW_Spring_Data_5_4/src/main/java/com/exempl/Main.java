package com.exempl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Домашнее задание 5
 * Задание 4 *
 * Создать репозиторий, который будет получать данные из БД.
 * В этом репозитории необходимо создать 2 метода, которые будут получать данные.
 * Запрос должен быть сформирован при помощи названий методов.
 * Также создайте 2 метода. Один из методов будет обновлять информацию в БД, а второй - удалять данные,
 * при помощи аннотации @Query и нативного запроса базы (используя параметр аннотации nativeQuery=true).
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
