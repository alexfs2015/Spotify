package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;

/* renamed from: tlv reason: default package */
public final class tlv implements wig<Flowable<PlayerState>> {
    private final wzi<vcq> a;

    private tlv(wzi<vcq> wzi) {
        this.a = wzi;
    }

    public static tlv a(wzi<vcq> wzi) {
        return new tlv(wzi);
    }

    public final /* synthetic */ Object get() {
        vcq vcq = (vcq) this.a.get();
        return (Flowable) wil.a(vcq.a().a(BackpressureStrategy.LATEST).a(1).c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
