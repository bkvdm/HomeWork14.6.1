public class Main {
    public static class Person {
        String name;
        String surname;
        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }
    public static void changePerson(Person person) {
        person.name = "Lyapis";
        person.surname = "Trubetskoy";
    }
    public static void main(String[] args) {
        Person person = new Person("Ilya", "Lagutenko");
        changePerson(person);
        System.out.println("person = " + person);
    }
}

//Объявите объект класса person с полями name и surname.
//Переопределите у него метод toString так, чтобы он возвращал строку из name и surname.
//Объявите метод changePerson, который принимает параметр типа Person под названием person.
//Внутри метода запишите в поле name строку “Ilya”, а в строку surname — “Lagutenko”.
//В методе main объявите переменную типа Person под названием person и запишите новый объект типа Person.
//Присвойте значение имени Lyapis, фамилии — Trubetskoy.
//В следующей строке вызовите метод changePerson и передайте в него эту переменную.