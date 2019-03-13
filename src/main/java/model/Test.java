package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //nazwa klucza obcego po drugiej stronie
    @OneToMany(mappedBy ="test")
    private List<Question> questionList = new ArrayList<>();

    private String name;

    public Test(){}

    public Test (String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
