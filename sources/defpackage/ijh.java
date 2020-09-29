package defpackage;

import com.comscore.util.log.LogLevel;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.util.Map;

/* renamed from: ijh reason: default package */
public final class ijh {
    private final RxResolver a;
    private final rwl b;
    private final wzi<Scheduler> c;

    ijh(RxResolver rxResolver, rwl rwl, wzi<Scheduler> wzi) {
        this.a = rxResolver;
        this.b = rwl;
        this.c = wzi;
    }

    public final ijg a(String str, Map<String, String> map, int i, Observable<AdSlotEvent> observable, iin iin, ket ket) {
        ijg ijg = new ijg(str, map, LogLevel.NONE, observable, iin, ket, this.a, this.b, this.c);
        return ijg;
    }
}
