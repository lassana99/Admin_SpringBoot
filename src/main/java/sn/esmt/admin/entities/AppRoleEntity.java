package sn.esmt.admin.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="approles")
public class AppRoleEntity {
    @Id//JPA ID est clée primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
    private int id;
    @Column(length = 150,nullable = false)
    private String name;

}
