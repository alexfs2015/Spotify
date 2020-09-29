package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;

/* renamed from: pcg reason: default package */
public final class pcg implements wig<pcf> {
    private final wzi<fqn> a;
    private final wzi<sso> b;
    private final wzi<szp> c;
    private final wzi<ToolbarMenuHelper> d;

    private pcg(wzi<fqn> wzi, wzi<sso> wzi2, wzi<szp> wzi3, wzi<ToolbarMenuHelper> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pcg a(wzi<fqn> wzi, wzi<sso> wzi2, wzi<szp> wzi3, wzi<ToolbarMenuHelper> wzi4) {
        return new pcg(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new pcf((fqn) this.a.get(), (sso) this.b.get(), (szp) this.c.get(), (ToolbarMenuHelper) this.d.get());
    }
}
