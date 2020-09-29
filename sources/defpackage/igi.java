package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdBreakState;
import io.reactivex.Observable;

/* renamed from: igi reason: default package */
public final class igi implements wig<igh> {
    private final wzi<Observable<AdBreakState>> a;
    private final wzi<ifz> b;

    private igi(wzi<Observable<AdBreakState>> wzi, wzi<ifz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static igi a(wzi<Observable<AdBreakState>> wzi, wzi<ifz> wzi2) {
        return new igi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new igh((Observable) this.a.get(), (ifz) this.b.get());
    }
}
