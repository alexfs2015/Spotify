package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.comscore.android.id.IdHelperAndroid;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.service.feature.AbbaFlagModel;
import com.spotify.mobile.android.service.feature.AbbaModel;
import com.spotify.mobile.android.service.feature.FeatureService;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.operators.observable.ObservablePublish;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: hiz reason: default package */
public final class hiz {
    private static b<Object, JSONObject> a = b.b("feature-service-cached-abba-values");
    private static final Map<ConnectionType, String> n;
    private final Context b;
    private final jjf c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final jvy e;
    private final RxResolver f;
    private final ObjectMapper g;
    /* access modifiers changed from: private */
    public Runnable h;
    private final wlc<vgy> i;
    private final hjb j;
    private final jrp k;
    private final Scheduler l;
    private final CompositeDisposable m = new CompositeDisposable();

    /* renamed from: hiz$a */
    static class a {
        public final long a;
        public final AbbaModel b;

        a(long j, AbbaModel abbaModel) {
            this.a = j;
            this.b = (AbbaModel) fay.a(abbaModel);
        }
    }

    static {
        EnumMap enumMap = new EnumMap(ConnectionType.class);
        n = enumMap;
        enumMap.put(ConnectionType.CONNECTION_TYPE_UNKNOWN, "unknown");
        n.put(ConnectionType.CONNECTION_TYPE_NONE, IdHelperAndroid.NO_ID_AVAILABLE);
        n.put(ConnectionType.CONNECTION_TYPE_GPRS, "gprs");
        n.put(ConnectionType.CONNECTION_TYPE_EDGE, "edge");
        n.put(ConnectionType.CONNECTION_TYPE_3G, "3g");
        n.put(ConnectionType.CONNECTION_TYPE_4G, "4g");
        n.put(ConnectionType.CONNECTION_TYPE_WLAN, "wlan");
        n.put(ConnectionType.CONNECTION_TYPE_ETHERNET, "ethernet");
    }

    hiz(Context context, jjf jjf, wlc<vgy> wlc, hjb hjb, jrp jrp, jvy jvy, RxResolver rxResolver, rnf rnf) {
        this.b = context;
        this.c = jjf;
        this.i = wlc;
        this.j = hjb;
        this.k = jrp;
        this.f = rxResolver;
        this.g = rnf.b();
        this.l = AndroidSchedulers.a(this.d.getLooper());
        this.e = jvy;
    }

    public final void a() {
        Runnable runnable = this.h;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.h = null;
        }
        this.m.bf_();
    }

    public final void a(List<fps<? extends Serializable>> list, String str, com.spotify.mobile.android.service.feature.FeatureService.a aVar, FeatureService.b bVar) {
        long b2 = this.k.b();
        this.m.c();
        Observable a2 = ObservablePublish.h(this.j.a().d().c((Function<? super T, ? extends R>) $$Lambda$hiz$0VT1_ALuGXV3WaJWnVowTsLYF8.INSTANCE).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$9MCdrqGjUqxybt9QefbyhDRDVU.INSTANCE)).a();
        this.m.a(a2.a((Consumer<? super T>) new $$Lambda$hiz$KfrsoAl0fugv44hhTACjernlRaI<Object>(this, b2, str), (Consumer<? super Throwable>) $$Lambda$hiz$qhNXvzmQp_JF84UfmKY4_yKTtDY.INSTANCE));
        this.m.a(a2.a(this.l).a((Consumer<? super T>) new $$Lambda$hiz$k3AELaMTpeI5nJd3m0p1xBdeyho<Object>(this, list, aVar, bVar), (Consumer<? super Throwable>) new $$Lambda$hiz$l45iK4X36dN6BaaDsL9vW3q02Dk<Object>(this)));
        this.m.a(a2.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$hiz$o8KolbDv2Jdkn4eqHqfwPCbZcR0<Object,Object>(this), false).a((Consumer<? super T>) $$Lambda$hiz$y4Bque0i_bxi9LRFmlXcwM8IeYY.INSTANCE, (Consumer<? super Throwable>) $$Lambda$hiz$dqDgeoNgVtQLpmftjvzPRnSCEmY.INSTANCE));
        this.m.a(a2.a((Consumer<? super T>) new $$Lambda$hiz$BWZUOGZtpDbKFzkxF7eBlNKU3U<Object>(this, str), (Consumer<? super Throwable>) $$Lambda$hiz$MOqOPhfU0_J03zaTIL_t1RijME.INSTANCE));
        final List<fps<? extends Serializable>> list2 = list;
        final com.spotify.mobile.android.service.feature.FeatureService.a aVar2 = aVar;
        final FeatureService.b bVar2 = bVar;
        final String str2 = str;
        AnonymousClass1 r2 = new Runnable() {
            private boolean a;

            public final void run() {
                if (!this.a) {
                    this.a = true;
                    hiz.a(hiz.this, list2, aVar2, bVar2, str2);
                    hiz.this.h = null;
                    return;
                }
                throw new IllegalStateException("can only load cached values once");
            }
        };
        this.h = r2;
        Runnable runnable = this.h;
        if (a(str)) {
            runnable.run();
        } else {
            this.d.postDelayed(runnable, (long) ((vgy) this.i.get()).a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(long j2, String str, a aVar) {
        long j3 = aVar.a;
        ConnectionType a2 = jtl.a(this.b);
        double b2 = (double) (this.k.b() - j2);
        Double.isNaN(b2);
        double d2 = b2 / 1000.0d;
        jjf jjf = this.c;
        c cVar = new c(d2, j3, a(str), (String) n.get(a2));
        jjf.a(cVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<fps>, for r7v0, types: [java.util.List, java.util.List<fps>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(java.util.List<defpackage.fps> r7, com.spotify.mobile.android.service.feature.FeatureService.a r8, com.spotify.mobile.android.service.feature.FeatureService.b r9, defpackage.hiz.a r10) {
        /*
            r6 = this;
            com.spotify.mobile.android.service.feature.AbbaModel r10 = r10.b
            java.util.HashMap r0 = new java.util.HashMap
            com.spotify.mobile.android.service.feature.AbbaFlagModel[] r1 = r10.getFlags()
            int r1 = r1.length
            r0.<init>(r1)
            com.spotify.mobile.android.service.feature.AbbaFlagModel[] r10 = r10.getFlags()
            int r1 = r10.length
            r2 = 0
            r3 = 0
        L_0x0013:
            if (r3 >= r1) goto L_0x0021
            r4 = r10[r3]
            java.lang.String r5 = r4.getFeatureName()
            r0.put(r5, r4)
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0021:
            java.util.Iterator r7 = r7.iterator()
            r10 = 0
        L_0x0026:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0050
            java.lang.Object r1 = r7.next()
            fps r1 = (defpackage.fps) r1
            fpz r3 = r1.d
            java.lang.String r3 = r3.b
            java.lang.Object r3 = r0.get(r3)
            com.spotify.mobile.android.service.feature.AbbaFlagModel r3 = (com.spotify.mobile.android.service.feature.AbbaFlagModel) r3
            if (r3 == 0) goto L_0x0043
            java.lang.String r4 = r3.getCell()
            goto L_0x0045
        L_0x0043:
            java.lang.String r4 = r1.f
        L_0x0045:
            if (r3 == 0) goto L_0x0049
            r3 = 1
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            boolean r1 = r8.setFlag(r1, r4, r3)
            r10 = r10 | r1
            goto L_0x0026
        L_0x0050:
            r9.onFlagsLoaded(r10)
            java.lang.Runnable r7 = r6.h
            if (r7 == 0) goto L_0x005f
            android.os.Handler r8 = r6.d
            r8.removeCallbacks(r7)
            r7 = 0
            r6.h = r7
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hiz.a(java.util.List, com.spotify.mobile.android.service.feature.FeatureService$a, com.spotify.mobile.android.service.feature.FeatureService$b, hiz$a):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        Runnable runnable = this.h;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.h.run();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(a aVar) {
        return this.f.resolve(new Request(Request.PUT, "sp://abba/v1/flags", Collections.emptyMap(), this.g.writeValueAsBytes(aVar.b)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, a aVar) {
        AbbaFlagModel[] flags;
        AbbaModel abbaModel = aVar.b;
        SpSharedPreferences a2 = this.e.a(this.b, str);
        JSONObject jSONObject = new JSONObject();
        for (AbbaFlagModel abbaFlagModel : abbaModel.getFlags()) {
            jSONObject.put(abbaFlagModel.getFeatureName(), abbaFlagModel.getCell());
        }
        a2.a().a(a, jSONObject).b();
    }

    private boolean a(String str) {
        return this.e.a(this.b, str).e(a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Optional a(wsj wsj) {
        wmg wmg = wsj.a.g;
        AbbaModel abbaModel = (AbbaModel) wsj.b();
        if (wmg == null || abbaModel == null) {
            return Optional.e();
        }
        return Optional.b(new a(wmg.b(), abbaModel));
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<fps>, for r5v0, types: [java.util.List, java.util.List<fps>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(defpackage.hiz r4, java.util.List<defpackage.fps> r5, com.spotify.mobile.android.service.feature.FeatureService.a r6, com.spotify.mobile.android.service.feature.FeatureService.b r7, java.lang.String r8) {
        /*
            jvy r0 = r4.e
            android.content.Context r4 = r4.b
            com.spotify.mobile.android.util.prefs.SpSharedPreferences r4 = r0.a(r4, r8)
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, org.json.JSONObject> r8 = a     // Catch:{ JSONException -> 0x0024 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0024 }
            r0.<init>()     // Catch:{ JSONException -> 0x0024 }
            defpackage.fay.a(r0)     // Catch:{ JSONException -> 0x0024 }
            android.content.SharedPreferences r4 = r4.a     // Catch:{ JSONException -> 0x0024 }
            java.lang.String r8 = r8.a     // Catch:{ JSONException -> 0x0024 }
            r1 = 0
            java.lang.String r4 = r4.getString(r8, r1)     // Catch:{ JSONException -> 0x0024 }
            if (r4 != 0) goto L_0x001e
            goto L_0x0029
        L_0x001e:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0024 }
            r0.<init>(r4)     // Catch:{ JSONException -> 0x0024 }
            goto L_0x0029
        L_0x0024:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x0029:
            java.util.Iterator r4 = r5.iterator()
            r5 = 0
            r8 = 0
        L_0x002f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r4.next()
            fps r1 = (defpackage.fps) r1
            fpz r2 = r1.d
            java.lang.String r2 = r2.b
            boolean r2 = r0.has(r2)
            if (r2 == 0) goto L_0x0053
            fpz r2 = r1.d     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r2 = r2.b     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r2 = r0.getString(r2)     // Catch:{ JSONException -> 0x0053 }
            r3 = 1
            boolean r1 = r6.setFlag(r1, r2, r3)     // Catch:{ JSONException -> 0x0053 }
            goto L_0x0059
        L_0x0053:
            java.lang.String r2 = r1.f
            boolean r1 = r6.setFlag(r1, r2, r5)
        L_0x0059:
            r8 = r8 | r1
            goto L_0x002f
        L_0x005b:
            r7.onFlagsLoaded(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hiz.a(hiz, java.util.List, com.spotify.mobile.android.service.feature.FeatureService$a, com.spotify.mobile.android.service.feature.FeatureService$b, java.lang.String):void");
    }
}
