package pl.nieckarz.customer;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
public class FraudCheckResponse {

    Boolean isFraudster;
}
