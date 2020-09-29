package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kna reason: default package */
public final class kna<E> implements kmv<E> {
    private final List<kmv<E>> a;

    private kna(List<kmv<E>> list) {
        this.a = list;
    }

    @SafeVarargs
    public static <E> kmv<E> a(kmv<E> kmv, kmv<E>... kmvArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(koa.a(kmv));
        for (kmv<E> a2 : kmvArr) {
            arrayList.add(koa.a(a2));
        }
        return new kna(arrayList);
    }

    public final kno subscribe(knw<E> knw) {
        final ArrayList arrayList = new ArrayList(this.a.size());
        for (kmv subscribe : this.a) {
            arrayList.add(subscribe.subscribe(knw));
        }
        return new kno() {
            public final void dispose() {
                for (kno dispose : arrayList) {
                    dispose.dispose();
                }
            }
        };
    }
}
