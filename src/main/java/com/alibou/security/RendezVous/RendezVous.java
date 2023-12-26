package com.alibou.security.RendezVous;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "RendezVous")
public class RendezVous {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String sexe;
    private String dateNaissance;
    private String Adresse;
    private String ville;
    private String dateRendezVous;
    private String speciality;
    private String id_Doctor;
    private Double longueur;
    private Double poids;
    private String maladie;
    private String zipCode;
    private String appointmentType;
    private String isconsultation ;
    private String owner;
    private String email;

}
