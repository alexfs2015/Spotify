package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: rag reason: default package */
public final class rag implements wig<kk> {
    private final wzi<Fragment> a;

    private rag(wzi<Fragment> wzi) {
        this.a = wzi;
    }

    public static rag a(wzi<Fragment> wzi) {
        return new rag(wzi);
    }

    public final /* synthetic */ Object get() {
        return (kk) wil.a(((Fragment) this.a.get()).t(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
