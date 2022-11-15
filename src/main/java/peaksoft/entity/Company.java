package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.rmi.Remote;
import java.util.List;

@Entity
@Table(name = "companies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String locatedCountry;

    @ToString.Exclude
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "company")
    private List<Course> courses;
}
