public class Main {
    public static void main(String[] args) {
        TransformerBuilder transformer = new AutobotsTransformerBuilder();
        FirstCybertronFactory manipulator = new FirstCybertronFactory(transformer);
        Transformer transformer1 = manipulator.creatureTransformers("Бамбл Би", "Ярко-желтый",
                "Лазерная пушка", "Отбойный молот");
        System.out.println(transformer1);
    }
}