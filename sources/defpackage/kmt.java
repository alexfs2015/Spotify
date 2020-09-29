package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: kmt reason: default package */
public final class kmt {
    @SafeVarargs
    public static <F, G extends F> Set<F> a(G... gArr) {
        HashSet hashSet = new HashSet(gArr.length);
        Collections.addAll(hashSet, koa.a((T[]) (Object[]) gArr));
        return hashSet;
    }
}
