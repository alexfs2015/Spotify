package com.spotify.mobile.android.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.internal.crashes.report.CrashReport;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class SpotifyService extends Service implements lh {
    public Lifecycle A;
    public hhn B;
    public hhi C;
    public Handler D;
    public final his E = new his(this.Q, this.R, this.S, this.T);
    private final AtomicReference<Intent> F = new AtomicReference<>();
    private final hhj G = new b(this, 0);
    private Disposable H = Disposables.b();
    private Disposable I = Disposables.b();
    private Player J;
    private fpt K;
    private Locale L;
    private final Runnable M = new a(this, 0);
    private final lg N = new lg() {
        @lp(a = Event.ON_START)
        public void onStart() {
            SpotifyService.a(SpotifyService.this);
        }

        @lp(a = Event.ON_STOP)
        public void onStop() {
            SpotifyService.b(SpotifyService.this);
        }
    };
    /* access modifiers changed from: private */
    public boolean O;
    private Consumer<fpt> P = new Consumer() {
        public final void accept(Object obj) {
            SpotifyService.this.a((fpt) obj);
        }
    };
    private final c Q = new c() {
        public final void a() {
            Logger.b("ServiceActions.onServiceCreate", new Object[0]);
            SpotifyService spotifyService = SpotifyService.this;
            spotifyService.c.c();
            spotifyService.r.a(spotifyService.n);
            Logger.c("Service fully started", new Object[0]);
            if (spotifyService.b.c) {
                Logger.d("Orbit requested app be permanently stopped.", new Object[0]);
                spotifyService.stopSelf();
            }
        }

        public final void b() {
            Logger.b("ServiceActions.onServiceDestroy", new Object[0]);
            SpotifyService.d(SpotifyService.this);
        }
    };
    private final defpackage.hit.a R = new defpackage.hit.a() {
        public final void a() {
            Logger.b("CoreActions.startCore", new Object[0]);
            SpotifyService.e(SpotifyService.this);
        }

        public final void b() {
            Logger.b("CoreActions.stopCore", new Object[0]);
            SpotifyService.f(SpotifyService.this);
        }
    };
    private final defpackage.hit.b S = new defpackage.hit.b() {
        public final void a() {
            Logger.b("CorePluginActions.startCorePlugins", new Object[0]);
            SpotifyService.this.c();
        }

        public final void b() {
            Logger.b("CorePluginActions.stopCorePlugins", new Object[0]);
            SpotifyService.this.d();
        }
    };
    private final d T = new d() {
        public final void a() {
            Logger.b("SessionPluginActions.startSessionPlugins", new Object[0]);
            SpotifyService.g(SpotifyService.this);
        }

        public final void b() {
            Logger.b("SessionPluginActions.stopSessionPlugins", new Object[0]);
            SpotifyService.h(SpotifyService.this);
        }
    };
    public hhx a;
    public hft b;
    public hfk c;
    public hfi d;
    public hhw e;
    public rur f;
    public qqv g;
    public kza h;
    public hvl i;
    public jhw j;
    public hil k;
    public hfo l;
    public jhz m;
    public jia n;
    public hhs o;
    public wlc<Player> p;
    public Map<String, SpotifyServiceIntentProcessor> q;
    public rlh r;
    public hfm s;
    public hhl t;
    public vjo u;
    public hjd v;
    public rlj w;
    public hec x;
    public hhu y;
    public glm z;

    class a implements Runnable {
        private a() {
        }

        /* synthetic */ a(SpotifyService spotifyService, byte b) {
            this();
        }

        public final void run() {
            SpotifyService.this.d.e.a();
            for (vie vie : SpotifyService.this.x.b()) {
                String str = "Leaked subscription detected during shutdown";
                Logger.e(vie.a(String.format("Leaked subscription detected during shutdown: %s. Subscription was originally created here:", new Object[]{vie.a}), "The observable of the leaked subscription was originally created here:"), str, new Object[0]);
            }
        }
    }

    class b implements hhj {
        private b() {
        }

        /* synthetic */ b(SpotifyService spotifyService, byte b) {
            this();
        }

        public final void a(boolean z) {
            SpotifyService.this.O = z;
            String str = "All calls to the driver should happen only on the main thread";
            if (z) {
                his c = SpotifyService.this.E;
                jrh.b(str);
                Logger.b("onLoggedIn", new Object[0]);
                c.a = true;
                if (c.b > 1) {
                    c.b = 4;
                    c.d();
                }
                return;
            }
            his c2 = SpotifyService.this.E;
            jrh.b(str);
            Logger.b("onLoggedOut", new Object[0]);
            c2.a = false;
            if (c2.b > 1) {
                c2.b = Math.min(c2.b, 3);
                c2.d();
            }
        }
    }

    static /* synthetic */ void e(SpotifyService spotifyService) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fpt fpt) {
        this.K = fpt;
        Logger.b("onFlagsChanged", new Object[0]);
    }

    public final void b() {
        Logger.b("dispatchShutdownConditionsMet() invoked.", new Object[0]);
        his his = this.E;
        his.getClass();
        jxr jxr = new jxr(new defpackage.jxr.b() {
            public final void onFireExecution() {
                his.this.b();
            }
        });
        defpackage.jxr.a b2 = jxr.b();
        this.k.a(jxr);
        b2.a();
    }

    public final Lifecycle Y_() {
        return this.e.a;
    }

    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        Logger.c("Shutting down client since the task was removed!", new Object[0]);
        this.E.b();
    }

    public void onCreate() {
        Logger.c("Creating service", new Object[0]);
        long a2 = glm.a();
        vtj.a((Service) this);
        this.z.b("dsss_OnCreateInjection", glm.a() - a2);
        hhu hhu = this.y;
        if (hhu.a) {
            Intent intent = new Intent("com.spotify.android.spotlets.debugtools.BUG_REPORT_START");
            intent.setPackage(hhu.b.getPackageName());
            hhu.c.a(intent);
        }
        this.e.a(Event.ON_CREATE);
        super.onCreate();
        setTheme(2132017710);
        if (!this.b.c) {
            this.L = jrq.a((Context) this);
            this.A.a(this.N);
        }
    }

    public final void c() {
        Logger.c("performStartCorePlugins", new Object[0]);
        this.e.a(Event.ON_RESUME);
        this.h.a(true);
        for (defpackage.hup.a aVar : this.s.a) {
            glm glm = this.z;
            $$Lambda$SpotifyService$Mkz0wWrJcofb0jSSaoWXjRLvLo r3 = new Runnable() {
                public final void run() {
                    a.this.a();
                }
            };
            StringBuilder sb = new StringBuilder("dssc_");
            sb.append(aVar.c().toLowerCase(Locale.US));
            glm.a((Runnable) r3, sb.toString());
        }
        this.D.removeCallbacks(this.M);
        this.I = this.i.a.c((Consumer<? super T>) new hhk<Object>(this.G));
        this.v.a();
    }

    public final void d() {
        Logger.c("performStopCorePlugins", new Object[0]);
        this.e.a(Event.ON_PAUSE);
        this.h.a(false);
        for (defpackage.hup.a b2 : this.s.a) {
            b2.b();
        }
        Logger.c("performStopCorePlugins: Stopping services", new Object[0]);
        this.f.a();
        this.v.b(this.j);
        hjd hjd = this.v;
        if (hjd.d()) {
            ((hjh) hjd.i()).a();
        }
        this.v.b();
        this.g.c();
        this.I.bf_();
        this.m.c();
        if (this.j.g != null) {
            this.j.g.a();
        }
        this.o.b();
        this.D.postDelayed(this.M, 2000);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Locale a2 = jrq.a(configuration);
        if (a2 == null) {
            a2 = Locale.ENGLISH;
        }
        if (!a2.equals(this.L)) {
            hfi hfi = this.d;
            String a3 = SpotifyLocale.a(hfi.a);
            Logger.b("Setting core language to %s", a3);
            hfi.d.b(a3);
        }
        this.L = a2;
    }

    public void onDestroy() {
        Logger.c("Destroying service", new Object[0]);
        hhw hhw = this.e;
        hhw.a(Event.ON_STOP);
        hhw.a(Event.ON_DESTROY);
        hhu hhu = this.y;
        if (hhu.a) {
            Intent intent = new Intent("com.spotify.android.spotlets.debugtools.BUG_REPORT_STOP");
            intent.setPackage(hhu.b.getPackageName());
            hhu.c.a(intent);
        }
        this.E.c();
        super.onDestroy();
        Logger.c("Service has been destroyed", new Object[0]);
    }

    public IBinder onBind(Intent intent) {
        Logger.c("onBind called with intent: %s", intent);
        this.e.a(Event.ON_START);
        this.E.a();
        if (intent != null) {
            if (Cosmos.ACTION_COSMOS_PROXY.equals(intent.getAction())) {
                return this.c.p;
            }
        }
        return this.a;
    }

    public boolean onUnbind(Intent intent) {
        Logger.c("Last bind of \"%s\" disconnected!", intent.getAction());
        return false;
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        Logger.c("onStartCommand called with intent: %s", intent);
        this.e.a(Event.ON_START);
        this.F.getAndSet(null);
        this.E.a();
        if (intent == null) {
            return 2;
        }
        if (!this.b.b()) {
            Logger.e("Service not started - ignoring command: %s", this.b.a);
            return 2;
        } else if (intent.getAction() == null) {
            return 2;
        } else {
            String action = intent.getAction();
            jhd jhd = this.m.w;
            jhd.e();
            if (intent.getBooleanExtra("needs_foreground_start", false)) {
                Optional<huf> optional = this.o.c;
                if (optional.b()) {
                    ((huf) optional.c()).m = true;
                }
            }
            fpt fpt = this.K;
            if (fpt != null) {
                fpu.a(intent, (fpt) fay.a(fpt));
            }
            Logger.a("Processing intent %s", intent);
            SpotifyServiceIntentProcessor spotifyServiceIntentProcessor = (SpotifyServiceIntentProcessor) this.q.get(action);
            if (spotifyServiceIntentProcessor != null) {
                Result a2 = spotifyServiceIntentProcessor.a(this.O, intent, this.y.a(intent));
                Logger.a("Result for processing %s", a2);
                if (a2 == Result.NOT_PROCESSED) {
                    Logger.a("Intent processing did not complete, retaining intent %s until onLogin is done.", intent);
                    this.m.C.e();
                    this.F.set(intent);
                }
            } else {
                Assertion.a("Handling unexpected intent", action);
            }
            jhd.f();
            return 2;
        }
    }

    static /* synthetic */ void a(SpotifyService spotifyService) {
        spotifyService.E.a();
        OrbitServiceInterface a2 = spotifyService.c.a();
        if (a2.isCreated()) {
            a2.tryReconnectNow(false);
        }
        spotifyService.m.d.e();
    }

    static /* synthetic */ void b(SpotifyService spotifyService) {
        jhz jhz = spotifyService.m;
        if (jhz != null) {
            jhz.d.f();
        }
        spotifyService.c.b();
    }

    /* JADX INFO: finally extract failed */
    static /* synthetic */ void d(SpotifyService spotifyService) {
        spotifyService.w.d = CrashReport.Lifecycle.shutdown;
        spotifyService.l.a((hmw) new hgm());
        jhw jhw = spotifyService.j;
        Logger.b("State Handler Stopping", new Object[0]);
        jhw.b.c.c();
        jhw.a.b.c();
        hgi hgi = jhw.d;
        if (hgi.g && hgi.c != null) {
            hgi.d.unregisterMediaButtonEventReceiver(hgi.c);
        }
        for (defpackage.hgi.b b2 : hgi.b) {
            b2.b();
        }
        hgi hgi2 = jhw.d;
        hgi2.b();
        for (defpackage.hgi.b a2 : hgi2.b) {
            a2.a(false, false);
        }
        jhw.g.a();
        jhw.c.a.a();
        jij jij = jhw.f;
        jij.a.b(jij);
        jij.b.a();
        spotifyService.m.a();
        spotifyService.r.b(spotifyService.n);
        spotifyService.f.b();
        hhn hhn = spotifyService.B;
        if (!defpackage.kzd.a.a) {
            ArrayList<vie> a3 = Lists.a();
            a3.addAll(hhn.a.unsubscribeAndReturnLeaks());
            a3.addAll(hhn.b.b());
            a3.addAll((List) hhn.c.b.call());
            a3.addAll(hhn.d.b.a());
            a3.addAll(hhn.e.unsubscribeAndReturnLeaks());
            a3.addAll(hhn.f.m());
            a3.addAll(hhn.f.n());
            for (vie vie : a3) {
                String str = "Leaked subscription detected during shutdown";
                Logger.e(vie.a(String.format("Leaked subscription detected during shutdown: %s. Subscription was originally created here:", new Object[]{vie.a}), "The observable of the leaked subscription was originally created here:"), str, new Object[0]);
            }
        }
        hfk hfk = spotifyService.c;
        synchronized (hfk.b.a) {
            if (!hfk.b.b()) {
                Logger.e("Service can't shut down unless started first: %s", hfk.b.a);
            } else {
                hfk.b.a.a(0);
            }
        }
        hfi hfi = hfk.d;
        hfi.d = new hgn();
        hfi.e = new hgl();
        if (hfi.f != null) {
            hfi.f.a();
        }
        hfi.c.b = null;
        hfi.b.dispose();
        Logger.c("Shutting down Orbit", new Object[0]);
        hfk.i.a();
        try {
            hfk.a().stop();
            Logger.c("Orbit stopped", new Object[0]);
            hfk.i.b();
            if (!defpackage.kzd.a.a) {
                Looper looper = hfk.j;
                if (VERSION.SDK_INT >= 18) {
                    looper.quitSafely();
                } else {
                    looper.quit();
                }
                hfu hfu = hfk.c;
                if (!hfu.a.a(4000)) {
                    if (hfu.c.nextDouble() >= 0.99d) {
                        Assertion.b("Failed to shutdown Orbit in a timely fashion. (Throttled 99%)");
                    }
                    Process.killProcess(Process.myPid());
                }
                hfk.a().destroy();
                Logger.c("Orbit has been shut down", new Object[0]);
            }
            hft hft = hfk.b;
            hft.d = hft.b.c();
            spotifyService.A.b(spotifyService.N);
            spotifyService.stopSelf();
        } catch (Throwable th) {
            hfk.i.b();
            throw th;
        }
    }

    static /* synthetic */ void f(SpotifyService spotifyService) {
        Logger.c("performStopCore", new Object[0]);
        spotifyService.stopSelf();
    }

    static /* synthetic */ void g(SpotifyService spotifyService) {
        Logger.c("performStartSessionPlugins", new Object[0]);
        spotifyService.C.a();
        spotifyService.J = (Player) spotifyService.p.get();
        spotifyService.l.a((hmw) new hmt((Player) fay.a(spotifyService.J)));
        spotifyService.m.b();
        for (c cVar : spotifyService.t.a) {
            glm glm = spotifyService.z;
            $$Lambda$SpotifyService$szbAZP7mbb8kWYW0EZhr_SCgFSc r4 = new Runnable() {
                public final void run() {
                    c.this.ai_();
                }
            };
            StringBuilder sb = new StringBuilder("dsss_");
            sb.append(cVar.c().toLowerCase(Locale.US));
            glm.a((Runnable) r4, sb.toString());
        }
        spotifyService.f.a(spotifyService.J);
        spotifyService.H = spotifyService.x.a().c(spotifyService.P);
        spotifyService.v.a(spotifyService.j);
        spotifyService.o.a();
        spotifyService.g.b();
        Intent intent = (Intent) spotifyService.F.getAndSet(null);
        if (intent != null) {
            Logger.a("Resubmitting %s", intent);
            if (intent.getBooleanExtra("needs_foreground_start", false)) {
                spotifyService.u.a(spotifyService, intent, "SpotifyService", new Object[0]);
                return;
            }
            spotifyService.startService(intent);
        }
    }

    static /* synthetic */ void h(SpotifyService spotifyService) {
        Logger.c("performStopSessionPlugins", new Object[0]);
        for (c aj_ : spotifyService.t.a) {
            aj_.aj_();
        }
        spotifyService.f.a();
        qqv qqv = spotifyService.g;
        qqv.a();
        qqv.a.putExtra("logged_out", true);
        qqv.d();
        spotifyService.H.bf_();
        spotifyService.v.b(spotifyService.j);
        spotifyService.m.c();
        spotifyService.o.b();
        spotifyService.C.b();
    }
}
