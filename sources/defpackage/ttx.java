package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: ttx reason: default package */
public final class ttx implements wig<ttw> {
    private final wzi<Flowable<PlayerState>> a;

    private ttx(wzi<Flowable<PlayerState>> wzi) {
        this.a = wzi;
    }

    public static ttx a(wzi<Flowable<PlayerState>> wzi) {
        return new ttx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ttw((Flowable) this.a.get());
    }
}
