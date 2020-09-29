package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.internal.parnerid.PartnerUserIdEndpoint;
import io.reactivex.Scheduler;

/* renamed from: ruw reason: default package */
public final class ruw implements wig<ruv> {
    private final wzi<SpSharedPreferences<Object>> a;
    private final wzi<PartnerUserIdEndpoint> b;
    private final wzi<Scheduler> c;

    private ruw(wzi<SpSharedPreferences<Object>> wzi, wzi<PartnerUserIdEndpoint> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ruw a(wzi<SpSharedPreferences<Object>> wzi, wzi<PartnerUserIdEndpoint> wzi2, wzi<Scheduler> wzi3) {
        return new ruw(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ruv((SpSharedPreferences) this.a.get(), (PartnerUserIdEndpoint) this.b.get(), (Scheduler) this.c.get());
    }
}
