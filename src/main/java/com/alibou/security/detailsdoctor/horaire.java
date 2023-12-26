package com.alibou.security.detailsdoctor;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class horaire {
    private String jour;
    private String heure_depart;
    private String heure_arrivee;
}
