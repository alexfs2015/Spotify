package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.internal.parnerid.PartnerUserIdEndpoint;
import io.reactivex.Scheduler;

/* renamed from: rlq reason: default package */
public final class rlq implements vua<rlp> {
    private final wlc<SpSharedPreferences<Object>> a;
    private final wlc<PartnerUserIdEndpoint> b;
    private final wlc<Scheduler> c;

    private rlq(wlc<SpSharedPreferences<Object>> wlc, wlc<PartnerUserIdEndpoint> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rlq a(wlc<SpSharedPreferences<Object>> wlc, wlc<PartnerUserIdEndpoint> wlc2, wlc<Scheduler> wlc3) {
        return new rlq(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rlp((SpSharedPreferences) this.a.get(), (PartnerUserIdEndpoint) this.b.get(), (Scheduler) this.c.get());
    }
}
