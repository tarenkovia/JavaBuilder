public class AutobotsTransformerBuilder implements TransformerBuilder {
    private String name;
    private String fraction;
    private String body;
    private String firstGun;
    private String secondGun;
    private String paint;

    public AutobotsTransformerBuilder() {
        super();
    }

    @Override
    public TransformerBuilder setHeroName(String name){
        this.name = name;
        System.out.println("Нашего нового друга зовут - " + name);
        return this;
    }

    @Override
    public TransformerBuilder fixPaint(String newPaint) {
        System.out.println("Нанесения раскраски на Автобота...");
        this.paint = newPaint;
        return this;
    }

    @Override
    public TransformerBuilder fixBody() {
        System.out.println("Установка мощного корпуса...");
        this.body = "Классический бронебойный корпус";
        return this;
    }

    @Override
    public TransformerBuilder setFraction(){
        this.fraction = "Автобот";
        System.out.println("Гравирока фракционной принадлежности");
        return this;
    }

    @Override
    public TransformerBuilder firstGun(String newFirstGun) {
        System.out.println("Установка первого боевого модуля...");
        this.firstGun = newFirstGun;
        return this;
    }

    @Override
    public TransformerBuilder secondGun(String newSecondGun) {
        System.out.println("Установка второго боевого модуля...");
        this.secondGun = newSecondGun;
        return this;
    }

    @Override
    public Transformer build() {
        Transformer autobot = new Transformer(name, body, paint, fraction, firstGun, secondGun);
        if (autobot.doQualityCheck()) {
            return autobot;
        } else {
            System.out.println("Автобот полностью собран и функционирует! Готов к бою!");
        }
        return null;
    }
}
