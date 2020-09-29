package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: mee reason: default package */
public final class mee implements wig<med> {
    private final wzi<xii<Boolean>> a;
    private final wzi<kyk> b;
    private final wzi<kym> c;
    private final wzi<Flowable<PlayerState>> d;

    private mee(wzi<xii<Boolean>> wzi, wzi<kyk> wzi2, wzi<kym> wzi3, wzi<Flowable<PlayerState>> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mee a(wzi<xii<Boolean>> wzi, wzi<kyk> wzi2, wzi<kym> wzi3, wzi<Flowable<PlayerState>> wzi4) {
        return new mee(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new med((xii) this.a.get(), (kyk) this.b.get(), (kym) this.c.get(), (Flowable) this.d.get());
    }
}
