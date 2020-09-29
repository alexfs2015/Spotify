package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.SingleSource;

/* renamed from: mbf reason: default package */
public final class mbf implements vua<wuh<HubsJsonViewModel>> {
    private final wlc<sih> a;
    private final wlc<maw> b;

    private mbf(wlc<sih> wlc, wlc<maw> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mbf a(wlc<sih> wlc, wlc<maw> wlc2) {
        return new mbf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        wuh wuh;
        maw maw = (maw) this.b.get();
        String sih = ((sih) this.a.get()).toString();
        if (sih.endsWith(":regional") || sih.endsWith(":viral") || sih.endsWith(":language")) {
            wuh = vun.a((SingleSource<T>) maw.a(sih.substring(sih.lastIndexOf(58) + 1)));
        } else {
            wuh = vun.a((SingleSource<T>) maw.a());
        }
        return (wuh) vuf.a(wuh, "Cannot return null from a non-@Nullable @Provides method");
    }
}
