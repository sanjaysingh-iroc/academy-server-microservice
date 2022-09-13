package com.iroc.spring.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Getter
@Setter
public class AcedemyDetails implements Serializable {

    private int id;

    private String acedemyName;

    private String establishmentDate;

    private String email;

    private String mobile;

    private String phoneNo;

    private String address;

    private String logoImg;

}
