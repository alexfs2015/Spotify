package defpackage;

import com.google.common.base.Optional;

/* renamed from: gic reason: default package */
public final class gic implements vua<gib> {
    private final wlc<String> a;
    private final wlc<String> b;
    private final wlc<Optional<String>> c;
    private final wlc<Optional<String>> d;

    private gic(wlc<String> wlc, wlc<String> wlc2, wlc<Optional<String>> wlc3, wlc<Optional<String>> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static gic a(wlc<String> wlc, wlc<String> wlc2, wlc<Optional<String>> wlc3, wlc<Optional<String>> wlc4) {
        return new gic(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new gib(this.a, this.b, this.c, this.d);
    }
}
