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

/* renamed from: hlr reason: default package */
public final class hlr {
    private static b<Object, JSONObject> a = b.b("feature-service-cached-abba-values");
    private static final Map<ConnectionType, String> n;
    private final Context b;
    private final jlr c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final jyg e;
    private final RxResolver f;
    private final ObjectMapper g;
    /* access modifiers changed from: private */
    public Runnable h;
    private final wzi<vud> i;
    private final hlt j;
    private final jtz k;
    private final Scheduler l;
    private final CompositeDisposable m = new CompositeDisposable();

    /* renamed from: hlr$a */
    static class a {
        public final long a;
        public final AbbaModel b;

        a(long j, AbbaModel abbaModel) {
            this.a = j;
            this.b = (AbbaModel) fbp.a(abbaModel);
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

    hlr(Context context, jlr jlr, wzi<vud> wzi, hlt hlt, jtz jtz, jyg jyg, RxResolver rxResolver, rwl rwl) {
        this.b = context;
        this.c = jlr;
        this.i = wzi;
        this.j = hlt;
        this.k = jtz;
        this.f = rxResolver;
        this.g = rwl.b();
        this.l = AndroidSchedulers.a(this.d.getLooper());
        this.e = jyg;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Optional a(xgo xgo) {
        xam xam = xgo.a.g;
        AbbaModel abbaModel = (AbbaModel) xgo.b();
        return (xam == null || abbaModel == null) ? Optional.e() : Optional.b(new a(xam.b(), abbaModel));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(a aVar) {
        return this.f.resolve(new Request(Request.PUT, "sp://abba/v1/flags", Collections.emptyMap(), this.g.writeValueAsBytes(aVar.b)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(long j2, String str, a aVar) {
        long j3 = aVar.a;
        ConnectionType a2 = jvt.a(this.b);
        double b2 = (double) (this.k.b() - j2);
        Double.isNaN(b2);
        double d2 = b2 / 1000.0d;
        jlr jlr = this.c;
        c cVar = new c(d2, j3, a(str), (String) n.get(a2));
        jlr.a(cVar);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<fqm>, for r5v0, types: [java.util.List<fqm>, java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(defpackage.hlr r4, java.util.List<defpackage.fqm> r5, com.spotify.mobile.android.service.feature.FeatureService.a r6, com.spotify.mobile.android.service.feature.FeatureService.b r7, java.lang.String r8) {
        /*
            jyg r0 = r4.e
            android.content.Context r4 = r4.b
            com.spotify.mobile.android.util.prefs.SpSharedPreferences r4 = r0.a(r4, r8)
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, org.json.JSONObject> r8 = a     // Catch:{ JSONException -> 0x0024 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0024 }
            r0.<init>()     // Catch:{ JSONException -> 0x0024 }
            defpackage.fbp.a(r0)     // Catch:{ JSONException -> 0x0024 }
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
            fqm r1 = (defpackage.fqm) r1
            fqt r2 = r1.d
            java.lang.String r2 = r2.b
            boolean r2 = r0.has(r2)
            if (r2 == 0) goto L_0x0053
            fqt r2 = r1.d     // Catch:{ JSONException -> 0x0053 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hlr.a(hlr, java.util.List, com.spotify.mobile.android.service.feature.FeatureService$a, com.spotify.mobile.android.service.feature.FeatureService$b, java.lang.String):void");
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

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<fqm>, for r7v0, types: [java.util.List<fqm>, java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(java.util.List<defpackage.fqm> r7, com.spotify.mobile.android.service.feature.FeatureService.a r8, com.spotify.mobile.android.service.feature.FeatureService.b r9, defpackage.hlr.a r10) {
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
            fqm r1 = (defpackage.fqm) r1
            fqt r3 = r1.d
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hlr.a(java.util.List, com.spotify.mobile.android.service.feature.FeatureService$a, com.spotify.mobile.android.service.feature.FeatureService$b, hlr$a):void");
    }

    private boolean a(String str) {
        return this.e.a(this.b, str).e(a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        Runnable runnable = this.h;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.h.run();
        }
    }

    public final void a() {
        Runnable runnable = this.h;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.h = null;
        }
        this.m.bd_();
    }

    public final void a(List<fqm<? extends Serializable>> list, String str, com.spotify.mobile.android.service.feature.FeatureService.a aVar, FeatureService.b bVar) {
        long b2 = this.k.b();
        this.m.c();
        Observable a2 = ObservablePublish.h(this.j.a().d().c((Function<? super T, ? extends R>) $$Lambda$hlr$s2INsKOWcuGoJDiLF1YTlBKWrA.INSTANCE).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$UnH2OQ8fuBCAz6XfjI5jm4CYBno.INSTANCE)).a();
        this.m.a(a2.a((Consumer<? super T>) new $$Lambda$hlr$Pyu6IuYxCdvuwchF3k69vIriHmg<Object>(this, b2, str), (Consumer<? super Throwable>) $$Lambda$hlr$zbsuxofYFJOzaCdHLIVWi6I7LA.INSTANCE));
        this.m.a(a2.a(this.l).a((Consumer<? super T>) new $$Lambda$hlr$vJW8MgNwL7Y8qzMIZ4CV7G1Hc<Object>(this, list, aVar, bVar), (Consumer<? super Throwable>) new $$Lambda$hlr$mPYGSlqvLpxfmRy6ov23uZhPQfE<Object>(this)));
        this.m.a(a2.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$hlr$qiUnc4Mill2XtPupoz6RQgMgkG8<Object,Object>(this), false).a((Consumer<? super T>) $$Lambda$hlr$gBr5AO82RudqUwkLCtmARgSmizc.INSTANCE, (Consumer<? super Throwable>) $$Lambda$hlr$A4uABimlMDQVJl1wgFsLlnJEEUw.INSTANCE));
        this.m.a(a2.a((Consumer<? super T>) new $$Lambda$hlr$luQAWg1ghSAmPoPSqjOdP58F8gQ<Object>(this, str), (Consumer<? super Throwable>) $$Lambda$hlr$WIrRPHsg3xyhVxsRr4mad8NnZII.INSTANCE));
        final List<fqm<? extends Serializable>> list2 = list;
        final com.spotify.mobile.android.service.feature.FeatureService.a aVar2 = aVar;
        final FeatureService.b bVar2 = bVar;
        final String str2 = str;
        AnonymousClass1 r2 = new Runnable() {
            private boolean a;

            public final void run() {
                if (!this.a) {
                    this.a = true;
                    hlr.a(hlr.this, list2, aVar2, bVar2, str2);
                    hlr.this.h = null;
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
            this.d.postDelayed(runnable, (long) ((vud) this.i.get()).a());
        }
    }
}
