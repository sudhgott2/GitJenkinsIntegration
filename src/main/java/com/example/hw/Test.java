package com.example.hw;


import lombok.*;

@NoArgsConstructor
@ToString
public class Test {
    private @Getter @Setter
    String firstName;

    private @Getter @Setter String lastName;
}
