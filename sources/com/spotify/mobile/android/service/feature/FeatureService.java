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

public class FeatureService extends vtp implements hjh {
    private static final Set<LoaderSource> k = Collections.unmodifiableSet(EnumSet.allOf(LoaderSource.class));
    /* access modifiers changed from: private */
    public static final com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, JSONArray> l = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.a("feature-service-overrides");
    private static final AtomicReference<fpt> y = new AtomicReference<>();
    private final fpy A = new hjs(new defpackage.hjs.a() {
        public final void a(String str, String str2) {
            FeatureService.this.c.a(new bl(str, str2));
        }
    });
    private final Consumer<SessionState> B = new Consumer<SessionState>() {
        public final /* synthetic */ void accept(Object obj) {
            SessionState sessionState = (SessionState) obj;
            jrh.b("Not called on main looper");
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
    private final defpackage.ly.a<JSONArray> C = new defpackage.ly.a<JSONArray>() {
        public final /* synthetic */ void a(mb mbVar, Object obj) {
            JSONArray jSONArray = (JSONArray) obj;
            if (FeatureService.this.f.a) {
                int i = 0;
                while (i < jSONArray.length()) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        try {
                            fps c = fps.c(jSONObject.getString("identifier"));
                            Class<T> cls = c.e;
                            try {
                                String str = "value";
                                if (jtc.b(cls, Integer.class)) {
                                    FeatureService.this.u.put(c, Integer.valueOf(jSONObject.getInt(str)));
                                } else if (jtc.b(cls, Boolean.class)) {
                                    FeatureService.this.u.put(c, Boolean.valueOf(jSONObject.getBoolean(str)));
                                } else if (jtc.b(cls, String.class)) {
                                    FeatureService.this.u.put(c, jSONObject.getString(str));
                                } else if (c instanceof fpr) {
                                    FeatureService.this.u.put(c, c.b(jSONObject.getString(str)));
                                } else {
                                    StringBuilder sb = new StringBuilder("Cannot handle ");
                                    sb.append(c.e.getCanonicalName());
                                    Assertion.a(sb.toString());
                                }
                            } catch (JSONException e) {
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

        public final mb<JSONArray> a() {
            FeatureService featureService = FeatureService.this;
            return new e(featureService, featureService.b);
        }
    };
    private final ServiceConnection D = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Logger.c("FeatureService bound to SpotifyService now, just to enforce destroy order", new Object[0]);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            Logger.c("FeatureService now disconnected from SpotifyService, SpotifyService could be destroyed now", new Object[0]);
        }
    };
    public wud<Map<String, String>> a;
    public jvy b;
    public jjf c;
    public hiz d;
    public hjq e;
    public hjt f;
    public FireAndForgetResolver g;
    public hvl h;
    public hhc i;
    public CosmosServiceIntentBuilder j;
    private hmo m;
    /* access modifiers changed from: private */
    public boolean n;
    private boolean o;
    private final IBinder p = new d();
    private fpt q;
    private final Set<f> r = new CopyOnWriteArraySet();
    private final Map<String, String> s = new HashMap(64);
    private final Map<String, Boolean> t = new HashMap(64);
    /* access modifiers changed from: private */
    public final Map<fps<? extends Serializable>, Serializable> u = new IdentityHashMap(64);
    /* access modifiers changed from: private */
    public final Collection<LoaderSource> v = EnumSet.noneOf(LoaderSource.class);
    private wuk w;
    private Disposable x = Disposables.b();
    private final fpy z = new hjs(new defpackage.hjs.a() {
        public final void a(String str, String str2) {
            FeatureService.this.c.a(new defpackage.hay.b(str, str2));
        }
    });

    enum LoaderSource {
        PRODUCT_STATE_FLAG,
        ABBA_FLAG,
        OVERRIDES
    }

    public interface a {
        boolean setFlag(fps<?> fps, String str, boolean z);
    }

    public interface b {
        void onFlagsLoaded(boolean z);
    }

    public interface c {
        void onFlagsChanged(fpt fpt);
    }

    public class d extends Binder {
        public d() {
        }
    }

    static class e extends ma<JSONArray> {
        private final jvy i;

        e(Context context, jvy jvy) {
            super(context);
            this.i = (jvy) fay.a(jvy);
        }

        public final void f() {
            h();
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public JSONArray d() {
            try {
                return this.i.a(this.d).a(FeatureService.l, new JSONArray());
            } catch (JSONException e) {
                Logger.e(e, "Could not load key", new Object[0]);
                return new JSONArray();
            }
        }
    }

    static class f implements c {
        private final WeakReference<c> a;
        private final String b;
        private final String c;

        f(c cVar) {
            String str;
            fay.a(cVar);
            this.b = cVar.getClass().getCanonicalName();
            Class enclosingClass = cVar.getClass().getEnclosingClass();
            if (enclosingClass == null) {
                str = "";
            } else {
                str = enclosingClass.getCanonicalName();
            }
            this.c = str;
            this.a = new WeakReference<>(cVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return faw.a((c) this.a.get(), (c) ((f) obj).a.get());
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{(c) this.a.get()});
        }

        public final void onFlagsChanged(fpt fpt) {
            Object obj = this.a.get();
            String str = this.b;
            String str2 = this.c;
            if (obj != null) {
                ((c) obj).onFlagsChanged(fpt);
            } else {
                throw new NullPointerException(fbc.a("Listener of type %s defined at %s missing. Did you forget to unregister it?", str, str2));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(fps<?> fps, String str, boolean z2) {
        String str2;
        fay.a(str);
        try {
            fps.b(str);
            str2 = (String) this.s.put(fps.a, str);
        } catch (UnmappableValueException e2) {
            StringBuilder sb = new StringBuilder("flag ");
            sb.append(fps.a);
            sb.append(" is set to invalid value ");
            sb.append(str);
            Assertion.a(sb.toString(), (Throwable) e2);
            str = fps.f;
            str2 = (String) this.s.put(fps.a, str);
        }
        this.t.put(fps.a, Boolean.valueOf(z2));
        return !faw.a(str2, str);
    }

    /* access modifiers changed from: private */
    public boolean c() {
        boolean containsAll = this.v.containsAll(k);
        Logger.b("isReadyForUse: %s (loaded %d out of %d sources)", Boolean.valueOf(containsAll), Integer.valueOf(this.v.size()), Integer.valueOf(k.size()));
        return containsAll;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Map map) {
        boolean z2;
        boolean z3 = false;
        for (fps fps : this.e.b()) {
            String str = (String) map.get(fps.d.b);
            if (str != null) {
                try {
                    z2 = a(fps, str, false);
                } catch (NumberFormatException unused) {
                    z3 |= a(fps);
                    StringBuilder sb = new StringBuilder("Use of non-integer product state ");
                    sb.append(fps.d.b);
                    sb.append('=');
                    sb.append(str);
                    Assertion.b(sb.toString());
                }
            } else {
                z2 = a(fps);
            }
            z3 |= z2;
        }
        boolean add = this.v.add(LoaderSource.PRODUCT_STATE_FLAG) | z3;
        Logger.a("Product flags are loaded", new Object[0]);
        if (c() && add) {
            Logger.a(" -- Notifying listeners", new Object[0]);
            i();
            f();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(Throwable th) {
        throw new RuntimeException("FeatureService encountered an error in the product state subscription observable!", th);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2) {
        boolean add = z2 | this.v.add(LoaderSource.ABBA_FLAG);
        Logger.a("ABBA flags are loaded", new Object[0]);
        if (c() && add) {
            Logger.a(" -- Notifying listeners", new Object[0]);
            i();
            f();
        }
    }

    private void b(fps<?> fps) {
        this.u.remove(fps);
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

    private void d() {
        for (fps b2 : new ArrayList(this.u.keySet())) {
            b(b2);
        }
        this.b.a(this).a().a(l).b();
    }

    private void e() {
        JSONArray jSONArray = new JSONArray();
        for (Entry entry : this.u.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", ((fps) entry.getKey()).a);
            jSONObject.put("value", ((Serializable) entry.getValue()).toString());
            jSONArray.put(jSONObject);
        }
        this.b.a(this).a().a(l, jSONArray).b();
    }

    public IBinder onBind(Intent intent) {
        return this.p;
    }

    public boolean onUnbind(Intent intent) {
        Logger.c("onUnbind", new Object[0]);
        a();
        return super.onUnbind(intent);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        Overridable overridable;
        if (intent == null) {
            return 2;
        }
        if ("feature_service.action.override".equals(intent.getAction())) {
            for (fps fps : this.e.a()) {
                String stringExtra = intent.getStringExtra(fps.a);
                if (stringExtra != null) {
                    try {
                        Serializable b2 = fps.b(stringExtra);
                        if (this.f.a) {
                            overridable = Overridable.INTERNAL;
                        } else {
                            overridable = Overridable.ALWAYS;
                        }
                        if (fps.c.compareTo(overridable) >= 0) {
                            this.u.put(fps, b2);
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
                            StringBuilder sb = new StringBuilder("Flag ");
                            sb.append(fps);
                            sb.append(" is not overridable");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } catch (UnmappableValueException e3) {
                        throw new RuntimeException(e3);
                    }
                }
            }
        } else {
            if ("feature_service.action.clear_overrides".equals(intent.getAction())) {
                d();
            }
        }
        return 2;
    }

    public final void a(c cVar) {
        Logger.a("Adding listener", new Object[0]);
        fay.a(cVar);
        f fVar = new f(cVar);
        if (!this.r.contains(fVar)) {
            this.r.add(fVar);
        }
        if (c()) {
            Logger.a(" -- Flags are ready to use, notifying listeners", new Object[0]);
            cVar.onFlagsChanged((fpt) fay.a(this.q));
        }
    }

    public final void b(c cVar) {
        fay.a(cVar);
        Logger.a("Removing listener", new Object[0]);
        f fVar = new f(cVar);
        if (!this.r.contains(fVar)) {
            Logger.d("FeatureService does not contain this listener: %s", cVar.toString());
            return;
        }
        this.r.remove(fVar);
    }

    /* access modifiers changed from: private */
    public void f() {
        Logger.a("Notifying listeners", new Object[0]);
        for (c onFlagsChanged : this.r) {
            onFlagsChanged.onFlagsChanged((fpt) fay.a(this.q));
        }
    }

    public void onCreate() {
        super.onCreate();
        Logger.a("onCreate()", new Object[0]);
        this.i.a(this.j.createCosmosServiceIntent(this).setAction("com.spotify.mobile.service.action.FEATURE_SERVICE_LOCK"), this.D, "FeatureServiceLock");
        this.x = this.h.a.a(this.B, (Consumer<? super Throwable>) $$Lambda$FeatureService$I7wc7FMsvl4V5stl7w2BPB9MtUo.INSTANCE);
        this.o = true;
    }

    public void onDestroy() {
        Logger.a("onDestroy()", new Object[0]);
        a();
        this.i.a(this.D, "FeatureServiceLock");
        super.onDestroy();
    }

    public final void a() {
        Logger.c("Clean up, connected = %s", String.valueOf(this.o));
        if (this.o) {
            this.x.bf_();
            g();
            h();
            this.d.a();
            this.o = false;
        }
    }

    private void g() {
        hmo hmo = this.m;
        if (hmo != null) {
            hmo.a(this.C);
        }
    }

    private void h() {
        wuk wuk = this.w;
        if (wuk != null) {
            wuk.unsubscribe();
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        defpackage.fpw.a aVar = new defpackage.fpw.a();
        for (fps fps : this.e.b()) {
            aVar.a(fps, (String) this.s.get(fps.a));
            aVar.a(fps, this.A);
        }
        for (fps fps2 : this.e.c()) {
            aVar.a(fps2, (String) this.s.get(fps2.a));
            Boolean bool = (Boolean) this.t.get(fps2.a);
            if (bool != null && bool.booleanValue()) {
                aVar.a(fps2, this.z);
            }
        }
        for (Entry entry : this.u.entrySet()) {
            aVar.a((fps) entry.getKey(), (Serializable) entry.getValue());
        }
        this.q = aVar.a();
        y.set(this.q);
    }

    private boolean a(fps<?> fps) {
        String str = fps.f;
        return !faw.a((String) this.s.put(fps.a, str), str);
    }

    static /* synthetic */ void b(FeatureService featureService) {
        featureService.g();
        featureService.h();
        featureService.v.clear();
    }

    static /* synthetic */ void a(FeatureService featureService, String str) {
        Logger.a(" -- starting loaders", new Object[0]);
        featureService.g();
        featureService.h();
        featureService.w = featureService.a.a((wun<? super T>) new wun() {
            public final void call(Object obj) {
                FeatureService.this.a((Map) obj);
            }
        }, (wun<Throwable>) $$Lambda$FeatureService$EW5EE3QvNeTXMb9dbADzj9Pumj8.INSTANCE);
        featureService.d.a(featureService.e.c(), str, (a) new a() {
            public final boolean setFlag(fps fps, String str, boolean z) {
                return FeatureService.this.a(fps, str, z);
            }
        }, (b) new b() {
            public final void onFlagsLoaded(boolean z) {
                FeatureService.this.a(z);
            }
        });
        featureService.m = new hmo();
        hmo hmo = featureService.m;
        defpackage.ly.a<JSONArray> aVar = featureService.C;
        defpackage.hmo.a aVar2 = (defpackage.hmo.a) hmo.b.get(aVar);
        if (aVar2 == null) {
            int i2 = hmo.a;
            hmo.a = i2 + 1;
            defpackage.hmo.a aVar3 = new defpackage.hmo.a(i2, aVar, 0);
            hmo.b.put(aVar, aVar3);
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
}
