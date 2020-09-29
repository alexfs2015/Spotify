package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView.i;

/* renamed from: nlm reason: default package */
public final class nlm implements wig<i> {
    private final wzi<Context> a;
    private final wzi<gwm> b;

    private nlm(wzi<Context> wzi, wzi<gwm> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nlm a(wzi<Context> wzi, wzi<gwm> wzi2) {
        return new nlm(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (i) wil.a(gxu.b((Context) this.a.get(), (gwm) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
