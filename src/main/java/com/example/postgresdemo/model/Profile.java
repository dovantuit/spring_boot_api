//package com.example.postgresdemo.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "profiles")
//public class Profile extends AuditModel {
//    @Id
//    @GeneratedValue(generator = "profile_generator")
//    @SequenceGenerator(
//            name = "profile_generator",
//            sequenceName = "profile_sequence",
//            initialValue = 1000
//    )
//    private Long id;
//
//    @Column(columnDefinition = "text")
//    private String text;
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "user_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnore
//    private User user;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//}
