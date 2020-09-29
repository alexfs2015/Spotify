package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: rny reason: default package */
public final class rny implements wig<roa> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<hhc> b;
    private final wzi<Boolean> c;

    private rny(wzi<Flowable<PlayerState>> wzi, wzi<hhc> wzi2, wzi<Boolean> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rny a(wzi<Flowable<PlayerState>> wzi, wzi<hhc> wzi2, wzi<Boolean> wzi3) {
        return new rny(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (roa) wil.a(((Boolean) this.c.get()).booleanValue() ? new rob((Flowable) this.a.get(), (hhc) this.b.get()) : new roc(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
