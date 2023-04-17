public class Main {
    public static void main(String[] args) {
        TransformerBuilder transformer = new AutobotsTransformerBuilder();
        FirstCybertronFactory manipulator = new FirstCybertronFactory(transformer);
        Transformer transformer1 = manipulator.creatureTransformers("Бамбл Би", "Ярко-желтый",
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
