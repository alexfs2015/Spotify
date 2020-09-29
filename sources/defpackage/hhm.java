package defpackage;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hhm reason: default package */
public final class hhm<T> implements c<T, T> {
    private final List<c<T, T>> a;

    /* renamed from: hhm$a */
    public static class a<T> {
        public final List<c<T, T>> a = new ArrayList(10);

        public final a<T> a(c<T, T> cVar) {
            this.a.add(cVar);
            return this;
        }
    }

    private hhm(List<c<T, T>> list) {
        this.a = list;
    }

    public static <T> hhm<T> a(List<c<T, T>> list) {
        return new hhm<>(Lists.a((Iterable<? extends E>) list));
    }

    public final /* synthetic */ Object call(Object obj) {
        xii xii = (xii) obj;
        for (c a2 : this.a) {
            xii = xii.a(a2);
        }
        return xii;
    }
}
