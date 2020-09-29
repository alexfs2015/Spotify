package defpackage;

import java.util.Set;

/* renamed from: vch reason: default package */
public final class vch implements wig<vcg> {
    private final wzi<Set<vby>> a;
    private final wzi<fqn> b;

    private vch(wzi<Set<vby>> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vch a(wzi<Set<vby>> wzi, wzi<fqn> wzi2) {
        return new vch(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new vcg((Set) this.a.get(), (fqn) this.b.get());
    }
}
