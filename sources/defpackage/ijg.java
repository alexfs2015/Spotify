package defpackage;

import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableSkipWhile;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: ijg reason: default package */
public final class ijg {
    final String a;
    String b;
    final iin c;
    boolean d;
    long e;
    final Map<String, String> f;
    private final NavigableMap<Integer, ArrayList<String>> g = new TreeMap();
    private final int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private final ket l;
    private final RxResolver m;
    private final wzi<Scheduler> n;

    public ijg(String str, Map<String, String> map, int i2, Observable<AdSlotEvent> observable, iin iin, ket ket, RxResolver rxResolver, final rwl rwl, wzi<Scheduler> wzi) {
        this.a = str;
        this.h = i2;
        this.c = iin;
        this.l = ket;
        this.m = rxResolver;
        this.n = wzi;
        this.f = map;
        Observable c2 = observable.c((Function<? super T, ? extends R>) $$Lambda$y09uTlzqWf9z13tnhMZHRgtj_A.INSTANCE);
        $$Lambda$ijg$hj4Z0BrC2tE1Our6gulr6UdzgE r3 = new $$Lambda$ijg$hj4Z0BrC2tE1Our6gulr6UdzgE(this);
        ObjectHelper.a(r3, "predicate is null");
        RxJavaPlugins.a((Observable<T>) new ObservableSkipWhile<T>(c2, r3)).c(1).a((Predicate<? super T>) $$Lambda$ijg$Jy0j0r0cfYO3n8TTPO4Alvp03Lc.INSTANCE).a((Consumer<? super T>) new $$Lambda$ijg$HHsa9ulDBDXQTZbRJYN2U982xoA<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ijg$nXV9rqkV1ajqyWUHUsTCzZIq4vg<Object>(this));
        this.m.resolve(new Request(Request.SUB, "sp://videoplayer/v1/commands")).a((Scheduler) this.n.get()).subscribe(new Observer<Response>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
            }

            public final /* synthetic */ void onNext(Object obj) {
                HashMap hashMap;
                Response response = (Response) obj;
                ijg ijg = ijg.this;
                try {
                    hashMap = (HashMap) rwl.a().a().readValue(response.getBodyString(), HashMap.class);
                } catch (IOException unused) {
                    hashMap = new HashMap();
                }
                String str = MoatAdEvent.EVENT_TYPE;
                String str2 = "";
                if ((hashMap.get(str) instanceof String ? (String) hashMap.get(str) : str2).equals("advance") && !ijg.d) {
                    String str3 = "advance_reason";
                    if (hashMap.get(str3) instanceof String) {
                        str2 = (String) hashMap.get(str3);
                    }
                    if (str2.equals("fwdbtn")) {
                        ijg.d = true;
                        long a2 = jtp.a.a() - ijg.e;
                        Logger.b("video time event - currentime is %d and start time is %d skip at position %d", Long.valueOf(jtp.a.a()), Long.valueOf(ijg.e), Long.valueOf(a2));
                        iin iin = ijg.c;
                        String str4 = ijg.a;
                        String str5 = ijg.b;
                        long j = 0;
                        if (a2 > 0) {
                            j = a2;
                        }
                        iin.a("skipped", str4, str5, j, ijg.f);
                    }
                }
            }

            public final void onSubscribe(Disposable disposable) {
            }
        });
    }

    private void a(int i2, String str) {
        if (!this.g.containsKey(Integer.valueOf(i2))) {
            this.g.put(Integer.valueOf(i2), new ArrayList());
        }
        ((ArrayList) this.g.get(Integer.valueOf(i2))).add(str);
    }

    private void a(int i2, String str, long j2) {
        Logger.b("video time event : %d; adid = %s at position %d", Integer.valueOf(i2), this.a, Long.valueOf(j2));
        if (str.equalsIgnoreCase("moat_ad_event_complete")) {
            ket ket = this.l;
            if (ket != null) {
                ket.a();
            }
            return;
        }
        if ("viewed".equals(str)) {
            if (!this.j) {
                this.j = true;
            } else {
                return;
            }
        }
        this.c.a(str, this.a, this.b, j2, this.f);
        this.l.a(str, (long) i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Ad ad) {
        a(1, "viewed");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.c("Error getting ad with id of %s for video progress tracker", this.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean c(Ad ad) {
        return !ad.id().equals(this.a);
    }

    private void d(long j2) {
        this.d = false;
        double d2 = (double) j2;
        Double.isNaN(d2);
        a((int) (0.25d * d2), "first_quartile");
        Double.isNaN(d2);
        a((int) (0.5d * d2), "midpoint");
        Double.isNaN(d2);
        a((int) (0.75d * d2), "third_quartile");
        Double.isNaN(d2);
        a((int) (d2 * 0.95d), "moat_ad_event_complete");
        int i2 = this.h;
        if (j2 > ((long) i2)) {
            a(i2, "viewed");
        }
    }

    public final void a(long j2) {
        while (!this.g.isEmpty()) {
            int intValue = ((Integer) this.g.firstKey()).intValue();
            if (((long) intValue) <= j2) {
                Iterator it = ((ArrayList) this.g.pollFirstEntry().getValue()).iterator();
                while (it.hasNext()) {
                    a(intValue, (String) it.next(), j2);
                }
            } else {
                return;
            }
        }
    }

    public final void a(Map<String, String> map, long j2) {
        Logger.b("video error has occurred", new Object[0]);
        this.k = true;
        HashMap hashMap = new HashMap(map);
        hashMap.putAll(this.f);
        if (!this.d) {
            this.d = true;
            this.c.a("errored", this.a, this.b, j2, hashMap);
        }
        Logger.b("video_event: %s + quality: %s at position %d", "errored", hashMap, Long.valueOf(j2));
    }

    public final void a(boolean z, long j2) {
        if (!this.k) {
            if (z) {
                Logger.b("video play/resume event : %s", this.a);
                if (this.i) {
                    this.l.a("resumed", j2);
                    return;
                }
                this.c.a("started", this.a, this.b, j2, this.f);
                this.l.a("started", j2);
                return;
            }
            Logger.b("video pause event : %s", this.a);
            this.l.a("paused", j2);
            this.i = true;
        }
    }

    public final void b(long j2) {
        Logger.b("onDurationDetermined %s \t %s", this.a, Long.valueOf(j2));
        d(j2);
        this.e = jtp.a.a();
        this.b = String.valueOf(j2 / 1000);
        this.l.a(j2);
    }

    public final void c(long j2) {
        Logger.b("onCompletion Reached: %s at position %d", this.a, Long.valueOf(j2));
        if (!this.k) {
            if (!this.d) {
                this.c.a("ended", this.a, this.b, j2, this.f);
                this.d = true;
            }
            if (!this.j) {
                this.c.a("viewed", this.a, this.b, j2, this.f);
            }
        }
    }
}
