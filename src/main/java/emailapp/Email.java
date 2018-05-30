package emailapp;

import lombok.Data;
import lombok.NonNull;

@Data
public class Email {

    @NonNull private  String fName;
    @NonNull private String lName;

    private String department;
    private String password;
    private String capacity;
    private String altEmail;
}
