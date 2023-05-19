import static org.junit.jupiter.api.Assertions.*;
class TransformerTest {
    @org.junit.jupiter.api.Test
    void testSetName() {
        Transformer transformer = new Transformer("Бамбл Би", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        String name = "Бамбл Би";
        assertEquals("Бамбл Би", transformer.setName(name));
        //assertEquals("Василий", transformer.setName(name));
    }
    @org.junit.jupiter.api.Test
    void testSetFirstGun() {
        Transformer transformer = new Transformer("Бамбл Би", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        String gun = "Моргенштерн";
        assertEquals("Моргенштерн", transformer.setFirstGun(gun));
        //assertEquals("Трибушет", transformer.setFirstGun(gun));
    }

    @org.junit.jupiter.api.Test
    void testSetSecondGun() {
        Transformer transformer = new Transformer("Бамбл Би", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        String gun = "Гатлинг лазер";
        assertEquals("Гатлинг лазер", transformer.setSecondGun(gun));
        //assertEquals("Лазерный пистолет", transformer.setSecondGun(gun));
    }

    @org.junit.jupiter.api.Test
    void testSetBody() {
        Transformer transformer = new Transformer("Бамбл Би", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        String body = "Легкая броня";
        assertEquals("Легкая броня", transformer.setBody(body));
        //assertEquals("Армированный корпус", transformer.setBody(body));
    }

    @org.junit.jupiter.api.Test
    void testSetPaint() {
        Transformer transformer = new Transformer("Бамбл Би", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        String paint = "Кислотно-зеленый";
        assertEquals("Кислотно-зеленый", transformer.setPaint(paint));
        //assertEquals("Зеленый в горошек", transformer.setPaint(paint));
    }

    @org.junit.jupiter.api.Test
    void testSetFraction() {
        Transformer transformer = new Transformer("Бамбл Би", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        String frac = "Десептикон";
        assertEquals("Десептикон", transformer.setFraction(frac));
        //assertEquals("Отшельник", transformer.setFraction(frac));
    }

    @org.junit.jupiter.api.Test
    void testDoQualityCheck() {
        Transformer transformer = new Transformer("Бамбл Би", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        Boolean quality = true;
        assertEquals(quality, transformer.doQualityCheck());
        Transformer transformer1 = new Transformer("Rom", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "", "Ярко-желтый");
        //assertEquals(quality, transformer1.doQualityCheck());
        Transformer transformer2 = new Transformer("Rom", "Автобот", null ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        //assertEquals(quality, transformer2.doQualityCheck());
    }

    @org.junit.jupiter.api.Test
    void testGetName() {
        Transformer transformer = new Transformer("Бамбл Би", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        String name = "Бамбл Би";
        String name1 = "Бубль гум";
        assertEquals(name, transformer.getName());
        //assertEquals(name1, transformer.getName());
    }

    @org.junit.jupiter.api.Test
    void testGetFirstGun() {
        Transformer transformer = new Transformer("Бамбл Би", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        String gun = "Лазерная пушка";
        String gun1 = "Царь пушка";
        assertEquals(gun, transformer.getFirstGun());
        //assertEquals(gun1, transformer.getFirstGun());
    }

    @org.junit.jupiter.api.Test
    void testGetSecondGun() {
        Transformer transformer = new Transformer("Бамбл Би", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        String gun = "Отбойный молот";
        String gun1 = "Железная дева";
        assertEquals(gun, transformer.getSecondGunGun());
        //assertEquals(gun1, transformer.getSecondGunGun());
    }

    @org.junit.jupiter.api.Test
    void testGetBody() {
        Transformer transformer = new Transformer("Бамбл Би", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        String body = "Бронебойный бой-коплект";
        String body1 = "Деревянный корпус";
        assertEquals(body, transformer.getBody());
        //assertEquals(body1, transformer.getBody());
    }

    @org.junit.jupiter.api.Test
    void testGetPaint() {
        Transformer transformer = new Transformer("Бамбл Би", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        String paint = "Ярко-желтый";
        String paint1 = "Грязно - красный";
        assertEquals(paint, transformer.getPaint());
        //assertEquals(paint1, transformer.getPaint());
    }

    @org.junit.jupiter.api.Test
    void testGetFraction() {
        Transformer transformer = new Transformer("Бамбл Би", "Автобот", "Бронебойный бой-коплект" ,
                "Лазерная пушка", "Отбойный молот", "Ярко-желтый");
        String frac = "Автобот";
        String frac1 = "Десептикон";
        assertEquals(frac, transformer.getFraction());
        //assertEquals(frac1, transformer.getFraction());
    }

}
