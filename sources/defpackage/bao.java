package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bao reason: default package */
final class bao implements bac {
    private final List<azz> a;

    public bao(List<azz> list) {
        this.a = list;
    }

    public final int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public final int b() {
        return 1;
    }

    public final List<azz> b(long j) {
        return j >= 0 ? this.a : Collections.emptyList();
    }

    public final long b_(int i) {
        bdl.a(i == 0);
        return 0;
    }
}
