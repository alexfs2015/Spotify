package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: npc reason: default package */
public final class npc implements wig<npb> {
    private final wzi<a> a;
    private final wzi<sgb> b;
    private final wzi<sso> c;
    private final wzi<rmf> d;

    private npc(wzi<a> wzi, wzi<sgb> wzi2, wzi<sso> wzi3, wzi<rmf> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static npc a(wzi<a> wzi, wzi<sgb> wzi2, wzi<sso> wzi3, wzi<rmf> wzi4) {
        return new npc(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new npb((a) this.a.get(), (sgb) this.b.get(), (sso) this.c.get(), (rmf) this.d.get());
    }
}
