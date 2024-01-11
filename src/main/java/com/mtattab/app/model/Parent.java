package com.mtattab.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true) // must-have for builder inheritance to work
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parent {

    String father;
    String mother;
}
