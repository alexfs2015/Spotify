package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bao reason: default package */
final class bao implements azl {
    public static final bao a = new bao();
    private final List<azi> b;

    public final int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public final int b() {
        return 1;
    }

    public bao(azi azi) {
        this.b = Collections.singletonList(azi);
    }

    private bao() {
        this.b = Collections.emptyList();
    }

    public final long b_(int i) {
        bcu.a(i == 0);
        return 0;
    }

    public final List<azi> b(long j) {
        return j >= 0 ? this.b : Collections.emptyList();
    }
}
