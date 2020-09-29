package defpackage;

import android.view.View;

/* renamed from: net reason: default package */
public final class net implements wig<View> {
    private final wzi<nfg> a;

    private net(wzi<nfg> wzi) {
        this.a = wzi;
    }

    public static net a(wzi<nfg> wzi) {
        return new net(wzi);
    }

    public final /* synthetic */ Object get() {
        return (View) wil.a(((nfg) this.a.get()).b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
