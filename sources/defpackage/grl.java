package defpackage;

import com.google.common.collect.ImmutableSet;

/* renamed from: grl reason: default package */
public final class grl implements vua<ImmutableSet<mfh>> {
    private final wlc<meu> a;

    private grl(wlc<meu> wlc) {
        this.a = wlc;
    }

    public static grl a(wlc<meu> wlc) {
        return new grl(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ImmutableSet) vuf.a(ImmutableSet.d((meu) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
