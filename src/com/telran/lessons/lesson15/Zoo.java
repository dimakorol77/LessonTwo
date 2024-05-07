package com.telran.lessons.lesson15;


    public class Zoo {
        // Внутренний класс Monkey
        public class Monkey {
            // Внутренний класс Banana в классе Monkey
            public class Banana {
                // Поле sort, представляющее сорт банана
                String sort = "Yellow";

                // Метод для получения сорта банана
                public String getSort() {
                    return sort;
                }
            }
        }
    }


