package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: twx reason: default package */
public final class twx implements wig<tww> {
    private final wzi<Flowable<PlayerState>> a;

    private twx(wzi<Flowable<PlayerState>> wzi) {
        this.a = wzi;
    }

    public static twx a(wzi<Flowable<PlayerState>> wzi) {
        return new twx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tww((Flowable) this.a.get());
    }
}
