package pl.nieckarz.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CustomerRegistrationRequest {

    String firstName;
    String lastName;
    String email;
}
