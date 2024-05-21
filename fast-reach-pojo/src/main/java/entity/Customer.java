package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private int userId;
    private String name;
    private String phoneNumber;
    private String password;
    private String account;
    private String money;
}
