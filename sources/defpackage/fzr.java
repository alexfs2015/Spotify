package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;

/* renamed from: fzr reason: default package */
public final class fzr implements wig<ToolbarMenuHelper> {
    private final wzi<jlr> a;
    private final wzi<jvf> b;
    private final wzi<uqm> c;

    private fzr(wzi<jlr> wzi, wzi<jvf> wzi2, wzi<uqm> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static fzr a(wzi<jlr> wzi, wzi<jvf> wzi2, wzi<uqm> wzi3) {
        return new fzr(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ToolbarMenuHelper((jlr) this.a.get(), (jvf) this.b.get(), (uqm) this.c.get());
    }
}
