package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bbf reason: default package */
final class bbf implements bac {
    public static final bbf a = new bbf();
    private final List<azz> b;

    private bbf() {
        this.b = Collections.emptyList();
    }

    public bbf(azz azz) {
        this.b = Collections.singletonList(azz);
    }

    public final int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public final int b() {
        return 1;
    }

    public final List<azz> b(long j) {
        return j >= 0 ? this.b : Collections.emptyList();
    }

    public final long b_(int i) {
        bdl.a(i == 0);
        return 0;
    }
}
