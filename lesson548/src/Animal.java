import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
            Animal[] animalM1 = { new Animal("Cat"), new Animal("Dog"), new Animal("Elephant"),
                    new Animal("Cock"), new Animal("Bull"), new Animal("Ant"),
                    new Animal("Tentecles"), new Animal("Worm")};
            ByteArrayOutputStream bai = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bai);
            oos.writeInt(animalM1.length);
            for (int i = 0; i < animalM1.length; i++) {
                oos.writeObject(animalM1[i]);
            }
            oos.flush();
            oos.close();
            Animal[] animalM2 = deserializeAnimalArray(bai.toByteArray());

    }

    private static Animal[] deserializeAnimalArray(byte[] toByteArray) {
    }
}


//    Реализуйте метод, который из переданного массива байт восстановит массив объектов Animal.
//    Массив байт устроен следующим образом. Сначала идет число типа int, записанное при помощи ObjectOutputStream.writeInt(size).
//    Далее подряд записано указанное количество объектов типа Animal, сериализованных при помощи ObjectOutputStream.writeObject(animal).
//
//        Если вдруг массив байт не является корректным представлением массива экземпляров Animal,
//        то метод должен бросить исключение java.lang.IllegalArgumentException.
//
//        Причины некорректности могут быть разные. Попробуйте подать на вход методу разные некорректные данные и посмотрите, какие исключения будут возникать.
//        Вот их-то и нужно превратить в IllegalArgumentException и выбросить. Если что-то забудете, то проверяющая система подскажет.
//        Главное не глотать никаких исключений, т.е. не оставлять нигде пустой catch.