package defpackage;

import com.comscore.util.log.LogLevel;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.Map;

/* renamed from: igu reason: default package */
public final class igu {
    private final RxResolver a;
    private final rnf b;
    private final wlc<Scheduler> c;

    igu(RxResolver rxResolver, rnf rnf, wlc<Scheduler> wlc) {
        this.a = rxResolver;
        this.b = rnf;
        this.c = wlc;
    }

    public final igt a(String str, Map<String, String> map, int i, Observable<AdSlotEvent> observable, iga iga, kcs kcs) {
        igt igt = new igt(str, map, LogLevel.NONE, observable, iga, kcs, this.a, this.b, this.c);
        return igt;
    }
}
