package defpackage;

import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import io.reactivex.Observable;

/* renamed from: hzf reason: default package */
public final class hzf implements wig<hze> {
    private final wzi<SlotApi> a;
    private final wzi<AdRules> b;
    private final wzi<Observable<Boolean>> c;

    private hzf(wzi<SlotApi> wzi, wzi<AdRules> wzi2, wzi<Observable<Boolean>> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hzf a(wzi<SlotApi> wzi, wzi<AdRules> wzi2, wzi<Observable<Boolean>> wzi3) {
        return new hzf(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new hze((SlotApi) this.a.get(), (AdRules) this.b.get(), (Observable) this.c.get());
    }
}
