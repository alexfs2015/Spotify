package com.spotify.intentrouter;

import java.util.ArrayList;
import java.util.List;

public class MatcherCollisionException extends RuntimeException {
    private static <T> List<gjx<T>> b(List<gjv<T>> list) {
        ArrayList arrayList = new ArrayList();
        for (gjv a : list) {
            arrayList.add(a.a());
        }
        return arrayList;
    }

    private static <T> String c(List<gjx<T>> list) {
        StringBuilder sb = new StringBuilder("Collision between the following routes:");
        for (gjx gjx : list) {
            sb.append("\n    ");
            sb.append(gjx.a());
        }
        return sb.toString();
    }

    public static <T> MatcherCollisionException a(List<gjv<T>> list) {
        return new MatcherCollisionException(b(list));
    }

    private <T> MatcherCollisionException(List<gjx<T>> list) {
        super(c(list));
    }
}
