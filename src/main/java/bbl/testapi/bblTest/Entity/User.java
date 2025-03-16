package bbl.testapi.bblTest.Entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @Column(name="userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    private String name;
    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    private String username;
    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    private String email;



    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    private String phone;

    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    private String website;


    @Embedded
    @Valid
    private Company company;
    @Embedded
    @Valid
    private Address address;
}

@NoArgsConstructor
@Getter
@Setter
@Embeddable
class Address{
    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    private String street;

    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    private String suite;
    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    private String city;

    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    private String zipcode;

    @Embedded
    private Geo geo;

}

@NoArgsConstructor
@Getter
@Setter
@Embeddable
class Geo{
    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    private String lat;

    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    private String lng;
}

@NoArgsConstructor
@Getter
@Setter
@Embeddable
class Company{
    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    @Column(name="Company_name")
    private String name;

    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    private String catchPhrase;
    @NotBlank(message = "Name is required")
    @NotNull(message = "Name is required")
    private String bs;
}
