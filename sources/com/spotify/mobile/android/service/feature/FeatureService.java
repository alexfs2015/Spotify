package com.spotify.mobile.android.service.feature;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.UnmappableValueException;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.CosmosServiceIntentBuilder;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FeatureService extends whv implements hlz {
    private static final Set<LoaderSource> k = Collections.unmodifiableSet(EnumSet.allOf(LoaderSource.class));
    /* access modifiers changed from: private */
    public static final com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, JSONArray> l = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.a("feature-service-overrides");
    private static final AtomicReference<fqn> y = new AtomicReference<>();
    private final fqs A = new hmk(new defpackage.hmk.a() {
        public final void a(String str, String str2) {
            FeatureService.this.c.a(new bk(str, str2));
        }
    });
    private final Consumer<SessionState> B = new Consumer<SessionState>() {
        public final /* synthetic */ void accept(Object obj) {
            SessionState sessionState = (SessionState) obj;
            String str = "n semolrnoctoNaei p ol ld";
            jtr.b("Not called on main looper");
            String str2 = "tsemec:as  osd%singaSetnh";
            Logger.a("Session state changed: %s", sessionState);
            boolean a2 = FeatureService.this.n;
            FeatureService.this.n = sessionState.loggedIn();
            if (!a2 || FeatureService.this.n) {
                if (!a2 && FeatureService.this.n) {
                    FeatureService.a(FeatureService.this, sessionState.currentUser());
                }
                return;
            }
            FeatureService.b(FeatureService.this);
        }
    };
    private final defpackage.md.a<JSONArray> C = new defpackage.md.a<JSONArray>() {
        public final mg<JSONArray> a() {
            FeatureService featureService = FeatureService.this;
            return new e(featureService, featureService.b);
        }

        public final /* synthetic */ void a(mg mgVar, Object obj) {
            JSONArray jSONArray = (JSONArray) obj;
            if (FeatureService.this.f.a) {
                int i = 0;
                while (i < jSONArray.length()) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        try {
                            fqm c = fqm.c(jSONObject.getString("identifier"));
                            Class<T> cls = c.e;
                            Class<Integer> cls2 = Integer.class;
                            try {
                                String str = "lesva";
                                String str2 = "value";
                                if (jvi.b(cls, Integer.class)) {
                                    FeatureService.this.u.put(c, Integer.valueOf(jSONObject.getInt(str2)));
                                } else {
                                    Class<Boolean> cls3 = Boolean.class;
                                    if (jvi.b(cls, Boolean.class)) {
                                        FeatureService.this.u.put(c, Boolean.valueOf(jSONObject.getBoolean(str2)));
                                    } else {
                                        Class<String> cls4 = String.class;
                                        if (jvi.b(cls, String.class)) {
                                            FeatureService.this.u.put(c, jSONObject.getString(str2));
                                        } else if (c instanceof fql) {
                                            FeatureService.this.u.put(c, c.b(jSONObject.getString(str2)));
                                        } else {
                                            String str3 = "atdmhnan l oen";
                                            StringBuilder sb = new StringBuilder("Cannot handle ");
                                            sb.append(c.e.getCanonicalName());
                                            Assertion.a(sb.toString());
                                        }
                                    }
                                }
                            } catch (JSONException e) {
                                String str4 = " bfeoeltv[t  alfoae gr gUau ol";
                                StringBuilder sb2 = new StringBuilder("Unable to get value for flag [");
                                sb2.append(c.a);
                                sb2.append(']');
                                Assertion.b(sb2.toString(), (Throwable) e);
                            } catch (UnmappableValueException e2) {
                                Assertion.a((Exception) e2);
                            }
                        } catch (IllegalStateException unused) {
                        }
                        i++;
                    } catch (JSONException e3) {
                        Assertion.a((Exception) e3);
                    }
                }
            }
            FeatureService.this.v.add(LoaderSource.OVERRIDES);
            if (FeatureService.this.c()) {
                FeatureService.this.i();
                FeatureService.this.f();
            }
        }
    };
    private final ServiceConnection D = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str = "Sesi SFer a jedrtrc sputcrn reSiotvfowoyo,vo sbeouncitoedetdfyru oe  retn";
            Logger.c("FeatureService bound to SpotifyService now, just to enforce destroy order", new Object[0]);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            String str = "or munsSe veeows ervr emrddevS ,yocS rrooFnuwceentctcpfSi eSe efdtoyoaectoepnibdifylt ciii";
            Logger.c("FeatureService now disconnected from SpotifyService, SpotifyService could be destroyed now", new Object[0]);
        }
    };
    public xii<Map<String, String>> a;
    public jyg b;
    public jlr c;
    public hlr d;
    public hmi e;
    public hml f;
    public FireAndForgetResolver g;
    public hxx h;
    public hjw i;
    public CosmosServiceIntentBuilder j;
    private hpg m;
    /* access modifiers changed from: private */
    public boolean n;
    private boolean o;
    private final IBinder p = new d();
    private fqn q;
    private final Set<f> r = new CopyOnWriteArraySet();
    private final Map<String, String> s = new HashMap(64);
    private final Map<String, Boolean> t = new HashMap(64);
    /* access modifiers changed from: private */
    public final Map<fqm<? extends Serializable>, Serializable> u = new IdentityHashMap(64);
    /* access modifiers changed from: private */
    public final Collection<LoaderSource> v = EnumSet.noneOf(LoaderSource.class);
    private xip w;
    private Disposable x = Disposables.b();
    private final fqs z = new hmk(new defpackage.hmk.a() {
        public final void a(String str, String str2) {
            FeatureService.this.c.a(new defpackage.hdr.b(str, str2));
        }
    });

    enum LoaderSource {
        PRODUCT_STATE_FLAG,
        ABBA_FLAG,
        OVERRIDES
    }

    public interface a {
        boolean setFlag(fqm<?> fqm, String str, boolean z);
    }

    public interface b {
        void onFlagsLoaded(boolean z);
    }

    public interface c {
        void onFlagsChanged(fqn fqn);
    }

    public class d extends Binder {
        public d() {
        }
    }

    static class e extends mf<JSONArray> {
        private final jyg i;

        e(Context context, jyg jyg) {
            super(context);
            this.i = (jyg) fbp.a(jyg);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public JSONArray d() {
            try {
                return this.i.a(this.d).a(FeatureService.l, new JSONArray());
            } catch (JSONException e) {
                String str = "tdsuoyCdlln  o oea";
                Logger.e(e, "Could not load key", new Object[0]);
                return new JSONArray();
            }
        }

        public final void f() {
            h();
        }
    }

    static class f implements c {
        private final WeakReference<c> a;
        private final String b;
        private final String c;

        f(c cVar) {
            fbp.a(cVar);
            this.b = cVar.getClass().getCanonicalName();
            Class enclosingClass = cVar.getClass().getEnclosingClass();
            this.c = enclosingClass == null ? "" : enclosingClass.getCanonicalName();
            this.a = new WeakReference<>(cVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return fbn.a((c) this.a.get(), (c) ((f) obj).a.get());
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{(c) this.a.get()});
        }

        public final void onFlagsChanged(fqn fqn) {
            Object obj = this.a.get();
            String str = this.b;
            String str2 = this.c;
            if (obj != null) {
                ((c) obj).onFlagsChanged(fqn);
                return;
            }
            Object[] objArr = {str, str2};
            String str3 = "  srt% ets ifeti?siyontssuytepog.ude rnniiee ti nfDoest o  er r%Lgf a igdsm";
            throw new NullPointerException(fbt.a("Listener of type %s defined at %s missing. Did you forget to unregister it?", objArr));
        }
    }

    static /* synthetic */ void a(FeatureService featureService, String str) {
        String str2 = "dnsrtaars-- lg io et";
        Logger.a(" -- starting loaders", new Object[0]);
        featureService.g();
        featureService.h();
        featureService.w = featureService.a.a((xis<? super T>) new xis() {
            public final void call(Object obj) {
                FeatureService.this.a((Map) obj);
            }
        }, (xis<Throwable>) $$Lambda$FeatureService$g7vbTrhttR_gMTjPhVbHzpKwmnU.INSTANCE);
        featureService.d.a(featureService.e.c(), str, (a) new a() {
            public final boolean setFlag(fqm fqm, String str, boolean z) {
                return FeatureService.this.a(fqm, str, z);
            }
        }, (b) new b() {
            public final void onFlagsLoaded(boolean z) {
                FeatureService.this.a(z);
            }
        });
        featureService.m = new hpg();
        hpg hpg = featureService.m;
        defpackage.md.a<JSONArray> aVar = featureService.C;
        defpackage.hpg.a aVar2 = (defpackage.hpg.a) hpg.b.get(aVar);
        if (aVar2 == null) {
            int i2 = hpg.a;
            hpg.a = i2 + 1;
            defpackage.hpg.a aVar3 = new defpackage.hpg.a(i2, aVar, 0);
            hpg.b.put(aVar, aVar3);
            aVar2 = aVar3;
        }
        if (!aVar2.c) {
            aVar2.c = true;
            if (!aVar2.d) {
                aVar2.b.a(aVar2.a, aVar2);
                aVar2.d = true;
            }
            aVar2.b.e();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        String str = "aatmuSlS tstenpdso eioFeeitda";
        Logger.e(th, "Failed to update SessionState", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Map map) {
        boolean z2;
        boolean z3 = false;
        for (fqm fqm : this.e.b()) {
            String str = (String) map.get(fqm.d.b);
            if (str != null) {
                try {
                    z2 = a(fqm, str, false);
                } catch (NumberFormatException unused) {
                    z3 |= a(fqm);
                    StringBuilder sb = new StringBuilder("Use of non-integer product state ");
                    sb.append(fqm.d.b);
                    sb.append('=');
                    sb.append(str);
                    Assertion.b(sb.toString());
                }
            } else {
                z2 = a(fqm);
            }
            z3 |= z2;
        }
        boolean add = this.v.add(LoaderSource.PRODUCT_STATE_FLAG) | z3;
        Logger.a("Product flags are loaded", new Object[0]);
        if (c() && add) {
            String str2 = "tesgoi r -fl nnetioiN-y";
            Logger.a(" -- Notifying listeners", new Object[0]);
            i();
            f();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2) {
        boolean add = z2 | this.v.add(LoaderSource.ABBA_FLAG);
        String str = "BeABdbloae f sg lAdra";
        Logger.a("ABBA flags are loaded", new Object[0]);
        if (c() && add) {
            Logger.a(" -- Notifying listeners", new Object[0]);
            i();
            f();
        }
    }

    private boolean a(fqm<?> fqm) {
        String str = fqm.f;
        return !fbn.a((String) this.s.put(fqm.a, str), str);
    }

    static /* synthetic */ void b(FeatureService featureService) {
        featureService.g();
        featureService.h();
        featureService.v.clear();
    }

    private void b(fqm<?> fqm) {
        this.u.remove(fqm);
        try {
            e();
        } catch (JSONException e2) {
            Assertion.b(e2.getMessage());
        }
        if (c()) {
            i();
            f();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(Throwable th) {
        String str = "!elettbtos ovre eipFde n straarpunS aiectcdatr eueurnencrersnbso rbri ciboohet uv";
        throw new RuntimeException("FeatureService encountered an error in the product state subscription observable!", th);
    }

    /* access modifiers changed from: private */
    public boolean c() {
        boolean containsAll = this.v.containsAll(k);
        Logger.b("isReadyForUse: %s (loaded %d out of %d sources)", Boolean.valueOf(containsAll), Integer.valueOf(this.v.size()), Integer.valueOf(k.size()));
        return containsAll;
    }

    private void d() {
        for (fqm b2 : new ArrayList(this.u.keySet())) {
            b(b2);
        }
        this.b.a(this).a().a(l).b();
    }

    private void e() {
        JSONArray jSONArray = new JSONArray();
        for (Entry entry : this.u.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            String str = "direfeitni";
            jSONObject.put("identifier", ((fqm) entry.getKey()).a);
            jSONObject.put("value", ((Serializable) entry.getValue()).toString());
            jSONArray.put(jSONObject);
        }
        this.b.a(this).a().a(l, jSONArray).b();
    }

    /* access modifiers changed from: private */
    public void f() {
        String str = "N gnsrtepinesoilfit";
        Logger.a("Notifying listeners", new Object[0]);
        for (c onFlagsChanged : this.r) {
            onFlagsChanged.onFlagsChanged((fqn) fbp.a(this.q));
        }
    }

    private void g() {
        hpg hpg = this.m;
        if (hpg != null) {
            hpg.a(this.C);
        }
    }

    private void h() {
        xip xip = this.w;
        if (xip != null) {
            xip.unsubscribe();
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        defpackage.fqq.a aVar = new defpackage.fqq.a();
        for (fqm fqm : this.e.b()) {
            aVar.a(fqm, (String) this.s.get(fqm.a));
            aVar.a(fqm, this.A);
        }
        for (fqm fqm2 : this.e.c()) {
            aVar.a(fqm2, (String) this.s.get(fqm2.a));
            Boolean bool = (Boolean) this.t.get(fqm2.a);
            if (bool != null && bool.booleanValue()) {
                aVar.a(fqm2, this.z);
            }
        }
        for (Entry entry : this.u.entrySet()) {
            aVar.a((fqm) entry.getKey(), (Serializable) entry.getValue());
        }
        this.q = aVar.a();
        y.set(this.q);
    }

    public final void a() {
        String str = "saouce %ntpeelc,dCn  nt=";
        Logger.c("Clean up, connected = %s", String.valueOf(this.o));
        if (this.o) {
            this.x.bd_();
            g();
            h();
            this.d.a();
            this.o = false;
        }
    }

    public final void a(c cVar) {
        String str = "rgsiin leeAtdsn";
        Logger.a("Adding listener", new Object[0]);
        fbp.a(cVar);
        f fVar = new f(cVar);
        if (!this.r.contains(fVar)) {
            this.r.add(fVar);
        }
        if (c()) {
            String str2 = "osdm,F i atnoeea sntiry g gfrnre-- ss ieltla ye";
            Logger.a(" -- Flags are ready to use, notifying listeners", new Object[0]);
            cVar.onFlagsChanged((fqn) fbp.a(this.q));
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(fqm<?> fqm, String str, boolean z2) {
        String str2;
        fbp.a(str);
        try {
            fqm.b(str);
            str2 = (String) this.s.put(fqm.a, str);
        } catch (UnmappableValueException e2) {
            StringBuilder sb = new StringBuilder("flag ");
            sb.append(fqm.a);
            String str3 = " ivsoulie  i ttsan oldva ";
            sb.append(" is set to invalid value ");
            sb.append(str);
            Assertion.a(sb.toString(), (Throwable) e2);
            str = fqm.f;
            str2 = (String) this.s.put(fqm.a, str);
        }
        this.t.put(fqm.a, Boolean.valueOf(z2));
        return !fbn.a(str2, str);
    }

    public final void b(c cVar) {
        fbp.a(cVar);
        String str = "insoebmgl vtiRnre";
        Logger.a("Removing listener", new Object[0]);
        f fVar = new f(cVar);
        if (!this.r.contains(fVar)) {
            Logger.d("FeatureService does not contain this listener: %s", cVar.toString());
            return;
        }
        this.r.remove(fVar);
    }

    public IBinder onBind(Intent intent) {
        return this.p;
    }

    public void onCreate() {
        super.onCreate();
        String str = "eo(Creb)at";
        Logger.a("onCreate()", new Object[0]);
        String str2 = "RLbfIiOt_EeCyvmlE.ArosKVTEEccR_.Ue.moncCe.iSttFaspoii.";
        String str3 = "orkacteSpciLeFevre";
        this.i.a(this.j.createCosmosServiceIntent(this).setAction("com.spotify.mobile.service.action.FEATURE_SERVICE_LOCK"), this.D, "FeatureServiceLock");
        this.x = this.h.a.a(this.B, (Consumer<? super Throwable>) $$Lambda$FeatureService$I7wc7FMsvl4V5stl7w2BPB9MtUo.INSTANCE);
        this.o = true;
    }

    public void onDestroy() {
        String str = "o()rteyDnts";
        Logger.a("onDestroy()", new Object[0]);
        a();
        this.i.a(this.D, "FeatureServiceLock");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        if (intent == null) {
            return 2;
        }
        String str = ".rstafoenidvr_rrecoi.ceutievaee";
        if ("feature_service.action.override".equals(intent.getAction())) {
            for (fqm fqm : this.e.a()) {
                String stringExtra = intent.getStringExtra(fqm.a);
                if (stringExtra != null) {
                    try {
                        Serializable b2 = fqm.b(stringExtra);
                        if (fqm.c.compareTo(this.f.a ? Overridable.INTERNAL : Overridable.ALWAYS) >= 0) {
                            this.u.put(fqm, b2);
                            try {
                                e();
                            } catch (JSONException e2) {
                                Assertion.b(e2.getMessage());
                            }
                            if (c()) {
                                i();
                                f();
                            }
                        } else {
                            String str2 = "a gmF";
                            StringBuilder sb = new StringBuilder("Flag ");
                            sb.append(fqm);
                            sb.append(" is not overridable");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } catch (UnmappableValueException e3) {
                        throw new RuntimeException(e3);
                    }
                }
            }
        } else {
            String str3 = "enldoeata.t_i._ecocviusvaeceroerfiersr";
            if ("feature_service.action.clear_overrides".equals(intent.getAction())) {
                d();
            }
        }
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        String str = "bUindbnn";
        Logger.c("onUnbind", new Object[0]);
        a();
        return super.onUnbind(intent);
    }
}
