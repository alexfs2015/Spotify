package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kjr reason: default package */
public final class kjr<E> implements kjm<E> {
    private final List<kjm<E>> a;

    @SafeVarargs
    public static <E> kjm<E> a(kjm<E> kjm, kjm<E>... kjmArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(kkr.a(kjm));
        for (kjm<E> a2 : kjmArr) {
            arrayList.add(kkr.a(a2));
        }
        return new kjr(arrayList);
    }

    private kjr(List<kjm<E>> list) {
        this.a = list;
    }

    public final kkf subscribe(kkn<E> kkn) {
        final ArrayList arrayList = new ArrayList(this.a.size());
        for (kjm subscribe : this.a) {
            arrayList.add(subscribe.subscribe(kkn));
        }
        return new kkf() {
            public final void dispose() {
                for (kkf dispose : arrayList) {
                    dispose.dispose();
                }
            }
        };
    }
}
