package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class User {
    private int userId;
    private String name;
    private String phoneNumber;
    private String password;
    private String account;
    private BigDecimal money;
}
