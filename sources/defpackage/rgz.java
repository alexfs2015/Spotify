package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;

/* renamed from: rgz reason: default package */
public final class rgz implements wig<rgy> {
    private final wzi<irb> a;
    private final wzi<PlayOrigin> b;

    private rgz(wzi<irb> wzi, wzi<PlayOrigin> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rgz a(wzi<irb> wzi, wzi<PlayOrigin> wzi2) {
        return new rgz(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rgy((irb) this.a.get(), (PlayOrigin) this.b.get());
    }
}
