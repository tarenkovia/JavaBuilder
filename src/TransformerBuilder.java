public interface TransformerBuilder {

    //Этап 1 - выдача имени
    public TransformerBuilder setHeroName(String name);

    //Этап 2 - установка корпуса
    public TransformerBuilder fixBody();

    //Этап 3 - раскраска корпуса
    public TransformerBuilder fixPaint(String newPaint);

    //Этап 4 - установка фракции
    public TransformerBuilder setFraction();

    // Этап 5 - установка первого оружия
    public TransformerBuilder firstGun(String newFirstGun);

    // Этап 6 - установка второго оружия
    public TransformerBuilder secondGun(String newSecondGun);

    // Выпуск трансфомера
    public Transformer build();
}
