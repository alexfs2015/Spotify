package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: gju reason: default package */
public final class gju<T> {
    final List<gjv<T>> a;

    /* renamed from: gju$a */
    public static class a<T> {
        public final List<gjv<T>> a = new ArrayList();

        public final a<T> a(gjx<T> gjx, gjs<T> gjs) {
            this.a.add(new gjq(gjx, gjs));
            return this;
        }
    }

    public /* synthetic */ gju(List list, byte b) {
        this(list);
    }

    private gju(List<gjv<T>> list) {
        this.a = list;
    }
}
