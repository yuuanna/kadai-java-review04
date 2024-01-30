package animal;

import java.util.Formatter;

public class Human extends Animal implements Thinkable{

    private String hobby;
    
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    public Human(String name, int age, String hobby) {
        super(name, age);
        
        this.hobby = hobby;
    }
    
    public void think() {
        
        System.out.println(new Formatter().format("私は%sについて考えています。", this.hobby));
        
    }
}
