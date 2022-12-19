package com.rapidtech.springdasar.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MySingletoneTest {
    @Test
    void mySingletoneTest() {
        MySingletone mySingletone1 = MySingletone.getInstance();
        MySingletone mySingletone2 = MySingletone.getInstance();

        Assertions.assertSame(mySingletone1, mySingletone2);

    }
}