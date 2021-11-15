package ewa.africa.beansApplication.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
