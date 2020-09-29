package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.Observable;

/* renamed from: kuf reason: default package */
public final class kuf implements wig<Observable<RadioSeedBundle>> {
    private final wzi<Observable<PlayerState>> a;
    private final wzi<jyk<RadioSeedBundle>> b;
    private final wzi<ktz> c;
    private final wzi<kui> d;
    private final wzi<kuk> e;

    public static Observable<RadioSeedBundle> a(Observable<PlayerState> observable, jyk<RadioSeedBundle> jyk, ktz ktz, kui kui, Object obj) {
        return (Observable) wil.a(CC.a(observable, jyk, ktz, kui, (kuk) obj), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Observable) this.a.get(), (jyk) this.b.get(), (ktz) this.c.get(), (kui) this.d.get(), this.e.get());
    }
}
