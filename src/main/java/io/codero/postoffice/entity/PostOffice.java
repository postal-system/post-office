package io.codero.postoffice.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Data;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "post_office")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class PostOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "index")
    private Integer id;

    @Column(name = "office_name", nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(name = "operating_time", nullable = false)
    private String operationTime;

    @Column(columnDefinition = "jsonb")
    private String metadata;
}
