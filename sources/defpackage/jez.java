package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: jez reason: default package */
public final class jez implements wig<ufi> {
    private final wzi<fqn> a;
    private final wzi<sso> b;
    private final wzi<Player> c;
    private final wzi<uhz> d;

    private jez(wzi<fqn> wzi, wzi<sso> wzi2, wzi<Player> wzi3, wzi<uhz> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static jez a(wzi<fqn> wzi, wzi<sso> wzi2, wzi<Player> wzi3, wzi<uhz> wzi4) {
        return new jez(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        fqn fqn = (fqn) this.a.get();
        ufi ufi = new ufi((sso) this.b.get(), (Player) this.c.get(), (uhz) this.d.get());
        ufi.a = fqn.b(sgn.a);
        return (ufi) wil.a(ufi, "Cannot return null from a non-@Nullable @Provides method");
    }
}
