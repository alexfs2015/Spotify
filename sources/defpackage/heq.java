package defpackage;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

/* renamed from: heq reason: default package */
public final class heq<T> implements c<T, T> {
    private final List<c<T, T>> a;

    /* renamed from: heq$a */
    public static class a<T> {
        public final List<c<T, T>> a = new ArrayList(10);

        public final a<T> a(c<T, T> cVar) {
            this.a.add(cVar);
            return this;
        }
    }

    public final /* synthetic */ Object call(Object obj) {
        wud wud = (wud) obj;
        for (c a2 : this.a) {
            wud = wud.a(a2);
        }
        return wud;
    }

    private heq(List<c<T, T>> list) {
        this.a = list;
    }

    public static <T> heq<T> a(List<c<T, T>> list) {
        return new heq<>(Lists.a((Iterable<? extends E>) list));
    }
}
