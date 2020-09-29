package defpackage;

import com.google.common.base.Optional;

/* renamed from: hli reason: default package */
public final class hli implements vua<hlh> {
    private final wlc<Optional<blq>> a;

    private hli(wlc<Optional<blq>> wlc) {
        this.a = wlc;
    }

    public static hli a(wlc<Optional<blq>> wlc) {
        return new hli(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hlh((Optional) this.a.get());
    }
}
