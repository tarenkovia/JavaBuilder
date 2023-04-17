public class DecepticonsTransformerBuilder implements TransformerBuilder {
    private String name;
    private String fraction;
    private String body;
    private String firstGun;
    private String secondGun;
    private String paint;

    public DecepticonsTransformerBuilder() {
        super();
    }

    @Override
    public TransformerBuilder setHeroName(String name){
        this.name = name;
        System.out.println("Нашего врага зовут - " + name);
        return this;
    }

    @Override
    public TransformerBuilder fixPaint(String newPaint) {
        System.out.println("Нанесения раскраски на Десептикона...");
        this.paint = newPaint;
        return this;
    }

    @Override
    public TransformerBuilder fixBody() {
        System.out.println("Установка убойного корпуса корпуса...");
        this.body = "Бронебойный бой-коплект";
        return this;
    }

    @Override
    public TransformerBuilder setFraction(){
        this.fraction = "Десептикон";
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
        Transformer decepticon = new Transformer(name, body, paint, fraction, firstGun, secondGun);
        if (decepticon.doQualityCheck()) {
            return decepticon;
        } else {
            System.out.println("Десептикон готов к полному повиновению! Готов к уничтожению!");
        }
        return null;
    }
}
