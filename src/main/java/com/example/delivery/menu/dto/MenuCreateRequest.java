package com.example.delivery.menu.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;

@Getter
public class CreateMenuRequest {

    @NotBlank
    private String name;

//    int에는 null이 들어갈 수 없으므로 값을 안 적으면 Jackson이 0을 넣어줌. 따라서 @NotNull이 의미가 없음
    @Positive
    private int price;

    private String description;
}
