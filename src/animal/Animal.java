package animal;

import java.util.Formatter;

public class Animal {

    private String name;

    private int age;

    public Animal(String name, int age) {
        // TODO 自動生成されたコンストラクター・スタブ
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
        }
    public void steName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;

    }
    public void say() {
        System.out.println(new Formatter().format("%sです。%d歳です。",this.name, this.age));

    }
}
