package defpackage;

import com.google.common.collect.ImmutableSet;

/* renamed from: gtm reason: default package */
public final class gtm implements wig<ImmutableSet<mjt>> {
    private final wzi<mjg> a;

    private gtm(wzi<mjg> wzi) {
        this.a = wzi;
    }

    public static gtm a(wzi<mjg> wzi) {
        return new gtm(wzi);
    }

    public final /* synthetic */ Object get() {
        return (ImmutableSet) wil.a(ImmutableSet.d((mjg) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
