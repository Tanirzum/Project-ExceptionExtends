public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Рекс");
        dog.putCollar();
        dog.putMuzzle();

        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            e.printStackTrace();
            if (!dog.isCollarPutOn) {
                System.out.println("Проверьте ошеник");
            } else if (!dog.isLeashPutOn) {
                System.out.println("Проверьте поводок");
            } else if (!dog.isMuzzlePutOn) {
                System.out.println("Проверьте намордник");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
