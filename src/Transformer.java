public class Transformer {
    private String name;
    private String fraction;
    private String body;
    private String firstGun;
    private String secondGun;
    private String paint;

    public Transformer() {
        super();
    }

    public Transformer(String name, String fraction, String body, String firstGun, String secondGun, String paint) {
        this.name = name;
        this.fraction = fraction;
        this.body = body;
        this.firstGun = firstGun;
        this.secondGun = secondGun;
        this.paint = paint;
    }

    public String getName() {
        return name;
    }
    public String getFirstGun(){
        return firstGun;
    }
    public String getSecondGunGun(){
        return secondGun;
    }
    public void setFirstGun(String newFirstGun) {
        this.firstGun = newFirstGun;
    }
    public void setSecondGun(String newSecondGun) {
        this.secondGun = newSecondGun;
    }
    public String getBody() {
        return body;
    }
    public void setPaint(String newPaint) {
        this.paint = newPaint;
    }
    public String getPaint() {
        return paint;
    }
    public String getFraction() {
        return fraction;
    }
    public void setFraction(String newFraction) {
        this.fraction = newFraction;
    }

    public boolean doQualityCheck() {
        return (firstGun != null && !firstGun.trim().isEmpty()) && (body != null && !body.trim().isEmpty())
                && (paint != null && !paint.trim().isEmpty()) && (secondGun != null && !secondGun.trim().isEmpty());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Трансформер:\nИмя - ").append(name).append("\nФракция - ").append(fraction).append("\nКорпус - ").
                append(body).append("\nРаскраска - ").append(paint).append("\nПервое оружие -").
                append(firstGun).append("\nВторое оружие - ").append(secondGun);
        return builder.toString();
    }

}