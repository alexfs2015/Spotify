package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: mnb reason: default package */
public final class mnb implements wig<mna> {
    private final wzi<gtb> a;
    private final wzi<Flowable<PlayerState>> b;
    private final wzi<gsw> c;
    private final wzi<unq> d;

    private mnb(wzi<gtb> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<gsw> wzi3, wzi<unq> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mnb a(wzi<gtb> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<gsw> wzi3, wzi<unq> wzi4) {
        return new mnb(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mna(this.a, this.b, this.c, this.d);
    }
}
