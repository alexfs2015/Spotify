package com.spotify.common.uri;

import java.util.HashSet;

public class Base62$1 extends HashSet<Character> {
    public Base62$1() {
        byte[] bArr = gdp.a;
        for (int i = 0; i < 62; i++) {
            add(Character.valueOf((char) (bArr[i] & 255)));
        }
    }
}
