package com.devsuperior.bds03.controllers.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FieldMessage implements Serializable {
    private static final long serialVersionUID = 6605334678641165685L;

    private String fieldName;
    private String message;
}
