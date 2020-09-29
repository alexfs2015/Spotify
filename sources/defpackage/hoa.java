package defpackage;

import com.google.common.base.Optional;

/* renamed from: hoa reason: default package */
public final class hoa implements wig<hnz> {
    private final wzi<Optional<bmh>> a;

    private hoa(wzi<Optional<bmh>> wzi) {
        this.a = wzi;
    }

    public static hoa a(wzi<Optional<bmh>> wzi) {
        return new hoa(wzi);
    }

    public final /* synthetic */ Object get() {
        return new hnz((Optional) this.a.get());
    }
}
