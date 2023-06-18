package com.example.test2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyEasyTest {

    @Test
    public void assertThatOnePlusOneIsTwo(){
         int somme = 1 + 1;
         assertThat(somme).isNotNull();
         assertThat(somme).isEqualTo(2);
    }


    @Test
    public void assertThatOnePlusTwoIsThree(){
        int somme = 2 + 1;
        assertThat(somme).isNotNull();
        assertThat(somme).isEqualTo(3);
    }
}
