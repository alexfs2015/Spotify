package com.spotify.intentrouter;

import java.util.ArrayList;
import java.util.List;

public class MatcherCollisionException extends RuntimeException {
    private <T> MatcherCollisionException(List<gli<T>> list) {
        super(c(list));
    }

    public static <T> MatcherCollisionException a(List<glg<T>> list) {
        return new MatcherCollisionException(b(list));
    }

    private static <T> List<gli<T>> b(List<glg<T>> list) {
        ArrayList arrayList = new ArrayList();
        for (glg a : list) {
            arrayList.add(a.a());
        }
        return arrayList;
    }

    private static <T> String c(List<gli<T>> list) {
        StringBuilder sb = new StringBuilder("Collision between the following routes:");
        for (gli gli : list) {
            sb.append("\n    ");
            sb.append(gli.a());
        }
        return sb.toString();
    }
}
