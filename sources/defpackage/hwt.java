package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import io.reactivex.Observable;

/* renamed from: hwt reason: default package */
public final class hwt implements vua<hws> {
    private final wlc<SlotApi> a;
    private final wlc<AdRules> b;
    private final wlc<Observable<Boolean>> c;

    private hwt(wlc<SlotApi> wlc, wlc<AdRules> wlc2, wlc<Observable<Boolean>> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hwt a(wlc<SlotApi> wlc, wlc<AdRules> wlc2, wlc<Observable<Boolean>> wlc3) {
        return new hwt(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new hws((SlotApi) this.a.get(), (AdRules) this.b.get(), (Observable) this.c.get());
    }
}
