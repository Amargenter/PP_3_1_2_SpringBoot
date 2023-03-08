package ru.kata.pp_3_1_2_springboot.models;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Поле 'Имя' не должно быть пустым")
    @Size(min = 2, max = 50, message = "Имя должно состоять из 2-50 букв")
    private String name;

    @Min(value = 1, message = "Возраст должен быть больше 0")
    private Integer age;

    @NotEmpty(message = "Поле 'Email' не должно быть пустым")
    @Email(message = "Некорректный Email")
    private String email;

    public User() {
    }

    public User(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
