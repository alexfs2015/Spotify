package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kde reason: default package */
public final class kde {
    final keb a;
    final kdk b;
    final boolean c;
    private final List<kco> d;

    /* renamed from: kde$a */
    public static class a {
        final List<kco> a = new ArrayList();
        keb b;
        kdk c;
        boolean d;

        public final a a(String str, List<kai> list) {
            this.c = new kdk(str, list);
            return this;
        }
    }

    private kde(List<kco> list, keb keb, kdk kdk, boolean z) {
        this.d = list;
        this.a = keb;
        this.b = kdk;
        this.c = z;
    }

    /* synthetic */ kde(List list, keb keb, kdk kdk, boolean z, byte b2) {
        this(list, keb, kdk, z);
    }

    public final kco a(int i) {
        return (kco) this.d.get(i);
    }
}
