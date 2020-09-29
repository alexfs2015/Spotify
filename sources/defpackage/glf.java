package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: glf reason: default package */
public final class glf<T> {
    final List<glg<T>> a;

    /* renamed from: glf$a */
    public static class a<T> {
        public final List<glg<T>> a = new ArrayList();

        public final a<T> a(gli<T> gli, gld<T> gld) {
            this.a.add(new glb(gli, gld));
            return this;
        }
    }

    private glf(List<glg<T>> list) {
        this.a = list;
    }

    public /* synthetic */ glf(List list, byte b) {
        this(list);
    }
}
