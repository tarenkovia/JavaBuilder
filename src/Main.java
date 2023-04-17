public class Main {
    public static void main(String[] args) {
        TransformerBuilder transformerFrac1 = new AutobotsTransformerBuilder();
        FirstCybertronFactory manipulator1 = new FirstCybertronFactory(transformerFrac1);
        Transformer transformer1 = manipulator1.creatureTransformers("Бамбл Би", "Ярко-желтый",
                "Лазерная пушка", "Отбойный молот");
        System.out.println(transformer1);

        System.out.println();

        TransformerBuilder transformerFrac2 = new DecepticonsTransformerBuilder();
        FirstCybertronFactory manipulator2 = new FirstCybertronFactory(transformerFrac2);
        Transformer transformer2 = manipulator2.creatureTransformers("Стар Скрим", "Темно-серый",
                "Пулемет", "Разбойничий нож");
        System.out.println(transformer2);
    }
}