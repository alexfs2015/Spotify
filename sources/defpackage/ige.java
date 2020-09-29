package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdBreakState;
import io.reactivex.Observable;

/* renamed from: ige reason: default package */
public final class ige implements wig<igd> {
    private final wzi<Observable<AdBreakState>> a;
    private final wzi<igf> b;

    private ige(wzi<Observable<AdBreakState>> wzi, wzi<igf> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ige a(wzi<Observable<AdBreakState>> wzi, wzi<igf> wzi2) {
        return new ige(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new igd((Observable) this.a.get(), (igf) this.b.get());
    }
}
