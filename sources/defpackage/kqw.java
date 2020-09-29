package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.Observable;

/* renamed from: kqw reason: default package */
public final class kqw implements vua<Observable<RadioSeedBundle>> {
    private final wlc<Observable<PlayerState>> a;
    private final wlc<jwc<RadioSeedBundle>> b;
    private final wlc<kqq> c;
    private final wlc<kqz> d;
    private final wlc<krb> e;

    public static Observable<RadioSeedBundle> a(Observable<PlayerState> observable, jwc<RadioSeedBundle> jwc, kqq kqq, kqz kqz, Object obj) {
        return (Observable) vuf.a(CC.a(observable, jwc, kqq, kqz, (krb) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Observable) this.a.get(), (jwc) this.b.get(), (kqq) this.c.get(), (kqz) this.d.get(), this.e.get());
    }
}
