package dev.scott.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "USER")
@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class User implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4754690297949743768L;

	@Id
    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "PROFILE_NAME")
    private String profileName;

    @Column(name = "AGE")
    private int age;

    @Column(name = "CITY")
    private String city;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "COUNTRY")
    private String country;

}
