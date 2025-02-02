package com.devsuperior.bds03.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_role")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Role implements Serializable {
    private static final long serialVersionUID = -102347617765968938L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;


    private String authority;


}
