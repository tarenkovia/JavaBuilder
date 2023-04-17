public class FirstCybertronFactory {
    private TransformerBuilder energon;

    public FirstCybertronFactory(TransformerBuilder energon) {
        super();
        this.energon = energon;
        if (this.energon == null) {
            throw new IllegalArgumentException("Завод не может функционировать без Энергона!");
        }
    }

    public Transformer creatureTransformers(String name, String paint, String firstGun, String secondGun) {
        return energon.setHeroName(name).fixBody().fixPaint(paint).setFraction().firstGun(firstGun).secondGun(secondGun).build();
    }
}
