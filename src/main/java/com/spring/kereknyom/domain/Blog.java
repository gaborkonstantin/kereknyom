package com.spring.kereknyom.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @OneToMany(mappedBy = "blog")
    private List<User> users;

    @Enumerated(EnumType.STRING)
    @Column(name = "visibility_level")
    private VisibilityLevel visibilityLevel;

    @Column(name = "category_id")
    private Integer createDate;

    @Column(name = "last_modified_date")
    private Integer lastModifiedDate;

    @Column(name = "view_count")
    private Integer viewCount;

}
