package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kbe reason: default package */
public final class kbe {
    final kca a;
    final kbk b;
    final boolean c;
    private final List<kao> d;

    /* renamed from: kbe$a */
    public static class a {
        final List<kao> a = new ArrayList();
        kca b;
        kbk c;
        boolean d;

        public final a a(String str, List<jyi> list) {
            this.c = new kbk(str, list);
            return this;
        }
    }

    /* synthetic */ kbe(List list, kca kca, kbk kbk, boolean z, byte b2) {
        this(list, kca, kbk, z);
    }

    private kbe(List<kao> list, kca kca, kbk kbk, boolean z) {
        this.d = list;
        this.a = kca;
        this.b = kbk;
        this.c = z;
    }

    public final kao a(int i) {
        return (kao) this.d.get(i);
    }
}
