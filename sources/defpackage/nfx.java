package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView.i;

/* renamed from: nfx reason: default package */
public final class nfx implements vua<i> {
    private final wlc<Context> a;
    private final wlc<gum> b;

    private nfx(wlc<Context> wlc, wlc<gum> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nfx a(wlc<Context> wlc, wlc<gum> wlc2) {
        return new nfx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (i) vuf.a(gvt.b((Context) this.a.get(), (gum) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
