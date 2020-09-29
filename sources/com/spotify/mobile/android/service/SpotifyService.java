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

public class SpotifyService extends Service implements lm {
    public Lifecycle A;
    public hkh B;
    public hkc C;
    public Handler D;
    public final hlk E = new hlk(this.Q, this.R, this.S, this.T);
    private final AtomicReference<Intent> F = new AtomicReference<>();
    private final hkd G = new b(this, 0);
    private Disposable H = Disposables.b();
    private Disposable I = Disposables.b();
    private Player J;
    private fqn K;
    private Locale L;
    private final Runnable M = new a(this, 0);
    private final ll N = new ll() {
        @lu(a = Event.ON_START)
        public void onStart() {
            SpotifyService.a(SpotifyService.this);
        }

        @lu(a = Event.ON_STOP)
        public void onStop() {
            SpotifyService.b(SpotifyService.this);
        }
    };
    /* access modifiers changed from: private */
    public boolean O;
    private Consumer<fqn> P = new Consumer() {
        public final void accept(Object obj) {
            SpotifyService.this.a((fqn) obj);
        }
    };
    private final c Q = new c() {
        public final void a() {
            String str = "ivsivrAseetaitSrrcon.Ceceoceen";
            Logger.b("ServiceActions.onServiceCreate", new Object[0]);
            SpotifyService spotifyService = SpotifyService.this;
            spotifyService.c.c();
            spotifyService.r.a(spotifyService.n);
            String str2 = "ulem reyiv ferastlScd";
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
    private final defpackage.hll.a R = new defpackage.hll.a() {
        public final void a() {
            String str = "orsaotetsCeCoscrnitrA";
            Logger.b("CoreActions.startCore", new Object[0]);
            SpotifyService.e(SpotifyService.this);
        }

        public final void b() {
            Logger.b("CoreActions.stopCore", new Object[0]);
            SpotifyService.f(SpotifyService.this);
        }
    };
    private final defpackage.hll.b S = new defpackage.hll.b() {
        public final void a() {
            String str = "rnsAPtPsigesrulnoogr.nustCiCaectio";
            Logger.b("CorePluginActions.startCorePlugins", new Object[0]);
            SpotifyService.this.c();
        }

        public final void b() {
            String str = "oonmceit.nsliCurnPgspiooCuPtAsreg";
            Logger.b("CorePluginActions.stopCorePlugins", new Object[0]);
            SpotifyService.this.d();
        }
    };
    private final d T = new d() {
        public final void a() {
            String str = "iesPcsiunasninsnluSisostgolnitt.ersSsAgo";
            Logger.b("SessionPluginActions.startSessionPlugins", new Object[0]);
            SpotifyService.g(SpotifyService.this);
        }

        public final void b() {
            String str = "ilnmoitnS.uslAgiPnsncsossosPituoeSsineg";
            Logger.b("SessionPluginActions.stopSessionPlugins", new Object[0]);
            SpotifyService.h(SpotifyService.this);
        }
    };
    public hkr a;
    public hip b;
    public hig c;
    public hie d;
    public hkq e;
    public seb f;
    public qzk g;
    public lcj h;
    public hxx i;
    public jkm j;
    public hlf k;
    public hik l;
    public jkp m;
    public jkq n;
    public hkm o;
    public wzi<Player> p;
    public Map<String, SpotifyServiceIntentProcessor> q;
    public run r;
    public hii s;
    public hkf t;
    public vwu u;
    public hlv v;
    public rup w;
    public hgy x;
    public hko y;
    public gnb z;

    class a implements Runnable {
        private a() {
        }

        /* synthetic */ a(SpotifyService spotifyService, byte b) {
            this();
        }

        public final void run() {
            SpotifyService.this.d.e.a();
            for (vvj vvj : SpotifyService.this.x.b()) {
                String str = "besihllghrearasr clidT showesrednnt es fproe euayle ikbt acab ooi:e ev";
                String str2 = "tnimcnporc sunkae u idtgeihtebtorsdLdeews du";
                String str3 = "Leaked subscription detected during shutdown";
                Logger.e(vvj.a(String.format("Leaked subscription detected during shutdown: %s. Subscription was originally created here:", new Object[]{vvj.a}), "The observable of the leaked subscription was originally created here:"), str3, new Object[0]);
            }
        }
    }

    class b implements hkd {
        private b() {
        }

        /* synthetic */ b(SpotifyService spotifyService, byte b) {
            this();
        }

        public final void a(boolean z) {
            SpotifyService.this.O = z;
            String str = "All calls to the driver should happen only on the main thread";
            if (z) {
                hlk c = SpotifyService.this.E;
                jtr.b(str);
                Logger.b("onLoggedIn", new Object[0]);
                c.a = true;
                if (c.b > 1) {
                    c.b = 4;
                    c.d();
                }
                return;
            }
            hlk c2 = SpotifyService.this.E;
            jtr.b(str);
            String str2 = "ogsuonOLteg";
            Logger.b("onLoggedOut", new Object[0]);
            c2.a = false;
            if (c2.b > 1) {
                c2.b = Math.min(c2.b, 3);
                c2.d();
            }
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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fqn fqn) {
        this.K = fqn;
        Logger.b("onFlagsChanged", new Object[0]);
    }

    static /* synthetic */ void b(SpotifyService spotifyService) {
        jkp jkp = spotifyService.m;
        if (jkp != null) {
            jkp.d.f();
        }
        spotifyService.c.b();
    }

    static /* synthetic */ void d(SpotifyService spotifyService) {
        spotifyService.A.b(spotifyService.N);
        spotifyService.w.d = CrashReport.Lifecycle.shutdown;
        spotifyService.l.a((hpn) new hji());
        jkm jkm = spotifyService.j;
        boolean z2 = true;
        String str = "gnsporpS tialttnHad eS";
        Logger.b("State Handler Stopping", new Object[0]);
        jkm.b.c.c();
        jkm.a.b.c();
        hje hje = jkm.d;
        if (hje.g && hje.c != null) {
            hje.d.unregisterMediaButtonEventReceiver(hje.c);
        }
        for (defpackage.hje.b b2 : hje.b) {
            b2.b();
        }
        hje hje2 = jkm.d;
        hje2.b();
        for (defpackage.hje.b a2 : hje2.b) {
            a2.a(false, false);
        }
        jkm.g.a();
        jkm.c.a.a();
        jkz jkz = jkm.f;
        jkz.a.b(jkz);
        jkz.b.a();
        spotifyService.m.a();
        spotifyService.r.b(spotifyService.n);
        spotifyService.f.b();
        hkh hkh = spotifyService.B;
        if (!defpackage.lcm.a.a) {
            ArrayList<vvj> a3 = Lists.a();
            a3.addAll(hkh.a.unsubscribeAndReturnLeaks());
            a3.addAll(hkh.b.b());
            a3.addAll((List) hkh.c.b.call());
            a3.addAll(hkh.d.b.a());
            a3.addAll(hkh.e.unsubscribeAndReturnLeaks());
            a3.addAll(hkh.f.m());
            a3.addAll(hkh.f.n());
            for (vvj vvj : a3) {
                String str2 = ":rbmrapioetlcoeo e%renntpi lnd.utsbrsenwug tik riw nchSdduait:oeL rcdiddsteyiscesu he  aa g";
                String str3 = "o  oo ascoeslhubsbl g ilasieee il:rdtikTrfeaoda ahenphrbete y trevewnc";
                String str4 = "eeeopbnsauesu uiwc dkieLoiddtrcrgnttdbhnd t ";
                String str5 = "Leaked subscription detected during shutdown";
                Logger.e(vvj.a(String.format("Leaked subscription detected during shutdown: %s. Subscription was originally created here:", new Object[]{vvj.a}), "The observable of the leaked subscription was originally created here:"), str5, new Object[0]);
            }
        }
        hig hig = spotifyService.c;
        synchronized (hig.b.a) {
            try {
                if (!hig.b.b()) {
                    String str6 = "esew lbsf /ds dtter s n/tusterhinira  %sacn:oSutc";
                    Logger.e("Service can't shut down unless started first: %s", hig.b.a);
                } else {
                    hig.b.a.a(0);
                }
            } finally {
                while (true) {
                }
            }
        }
        hie hie = hig.d;
        hie.d = new hjj();
        hie.e = new hjh();
        if (hie.f != null) {
            hie.f.b();
        }
        hie.c.b = null;
        hie.b.dispose();
        String str7 = "htttuontwngOi rib S";
        Logger.c("Shutting down Orbit", new Object[0]);
        hig.i.a();
        try {
            hig.a().stop();
            String str8 = "p trOdeippbso";
            Logger.c("Orbit stopped", new Object[0]);
            hig.i.b();
            if (!defpackage.lcm.a.a) {
                Looper looper = hig.j;
                if (VERSION.SDK_INT >= 18) {
                    looper.quitSafely();
                } else {
                    looper.quit();
                }
                hiq hiq = hig.c;
                if (!hiq.a.a(4000)) {
                    if (hiq.c.nextDouble() >= 0.99d) {
                        String str9 = "ead)roOltto (os%mlhnhi   tirFibtuTtt9  h.stiadwiyfn  el daeno";
                        Assertion.b("Failed to shutdown Orbit in a timely fashion. (Throttled 99%)");
                    }
                    Process.killProcess(Process.myPid());
                }
                hig.a().destroy();
                Logger.c("Orbit has been shut down", new Object[0]);
            }
            hip hip = hig.b;
            hip.d = hip.b.c();
            spotifyService.stopSelf();
        } catch (Throwable th) {
            hig.i.b();
            throw th;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:459)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:58)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:48)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    static /* synthetic */ void e(com.spotify.mobile.android.service.SpotifyService r1) {
        /*
            r0 = 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.service.SpotifyService.e(com.spotify.mobile.android.service.SpotifyService):void");
    }

    static /* synthetic */ void f(SpotifyService spotifyService) {
        Logger.c("performStopCore", new Object[0]);
        spotifyService.stopSelf();
    }

    static /* synthetic */ void g(SpotifyService spotifyService) {
        Logger.c("performStartSessionPlugins", new Object[0]);
        spotifyService.C.a();
        spotifyService.J = (Player) spotifyService.p.get();
        spotifyService.l.a((hpn) new hpk((Player) fbp.a(spotifyService.J)));
        spotifyService.m.b();
        for (c cVar : spotifyService.t.a) {
            gnb gnb = spotifyService.z;
            $$Lambda$SpotifyService$MVQUd1fvRJylbw7La_on7N_HEw r4 = new Runnable() {
                public final void run() {
                    c.this.ai_();
                }
            };
            StringBuilder sb = new StringBuilder("dsss_");
            sb.append(cVar.c().toLowerCase(Locale.US));
            gnb.a((Runnable) r4, sb.toString());
        }
        spotifyService.f.a(spotifyService.J);
        spotifyService.H = spotifyService.x.a().c(spotifyService.P);
        spotifyService.v.a(spotifyService.j);
        spotifyService.o.a();
        spotifyService.g.b();
        Intent intent = (Intent) spotifyService.F.getAndSet(null);
        if (intent != null) {
            String str = "uisgesstmbRtin ";
            Logger.a("Resubmitting %s", intent);
            String str2 = "tdsmeeeoadrg_s_frruotn";
            if (intent.getBooleanExtra("needs_foreground_start", false)) {
                spotifyService.u.a(spotifyService, intent, "SpotifyService", new Object[0]);
                return;
            }
            spotifyService.startService(intent);
        }
    }

    static /* synthetic */ void h(SpotifyService spotifyService) {
        String str = "nrSlotmrPfoSopeisougipnse";
        Logger.c("performStopSessionPlugins", new Object[0]);
        for (c aj_ : spotifyService.t.a) {
            aj_.aj_();
        }
        spotifyService.f.a();
        qzk qzk = spotifyService.g;
        qzk.a();
        String str2 = "elotgbgd_u";
        qzk.a.putExtra("logged_out", true);
        qzk.d();
        spotifyService.H.bd_();
        spotifyService.v.b(spotifyService.j);
        spotifyService.m.c();
        spotifyService.o.b();
        spotifyService.C.b();
    }

    public final Lifecycle Y_() {
        return this.e.a;
    }

    public final void b() {
        String str = "cdpMddbtnnv)sthnSewio(keu. oCdnooiitiast";
        Logger.b("dispatchShutdownConditionsMet() invoked.", new Object[0]);
        hlk hlk = this.E;
        hlk.getClass();
        jzr jzr = new jzr(new defpackage.jzr.b() {
            public final void onFireExecution() {
                hlk.this.b();
            }
        });
        defpackage.jzr.a b2 = jzr.b();
        this.k.a(jzr);
        b2.a();
    }

    public final void c() {
        String str = "oemrnsutCrilgeoSrtarpPf";
        Logger.c("performStartCorePlugins", new Object[0]);
        this.e.a(Event.ON_RESUME);
        this.h.a(true);
        for (defpackage.hxb.a aVar : this.s.a) {
            gnb gnb = this.z;
            $$Lambda$SpotifyService$VzisYXLp11Vu7Pn1FiWYYWA8Vlw r3 = new Runnable() {
                public final void run() {
                    a.this.a();
                }
            };
            StringBuilder sb = new StringBuilder("dssc_");
            sb.append(aVar.c().toLowerCase(Locale.US));
            gnb.a((Runnable) r3, sb.toString());
        }
        this.D.removeCallbacks(this.M);
        this.I = this.i.a.c((Consumer<? super T>) new hke<Object>(this.G));
        this.v.a();
    }

    public final void d() {
        String str = "nmgeflropperrptCuoiSso";
        Logger.c("performStopCorePlugins", new Object[0]);
        this.e.a(Event.ON_PAUSE);
        this.h.a(false);
        for (defpackage.hxb.a b2 : this.s.a) {
            b2.b();
        }
        String str2 = "lpmpoitSPtnrCi pervecoeogso:eugtS ssnifpr";
        Logger.c("performStopCorePlugins: Stopping services", new Object[0]);
        this.f.a();
        this.v.b(this.j);
        hlv hlv = this.v;
        if (hlv.c()) {
            ((hlz) hlv.h()).a();
        }
        this.v.b();
        this.g.c();
        this.I.bd_();
        this.m.c();
        if (this.j.g != null) {
            this.j.g.a();
        }
        this.o.b();
        this.D.postDelayed(this.M, 2000);
    }

    public IBinder onBind(Intent intent) {
        Logger.c("onBind called with intent: %s", intent);
        this.e.a(Event.ON_START);
        this.E.a();
        if (intent != null) {
            String str = "XCso.prM.e._S.RaOvii.ifottObmlPiyYSOcscsomneco";
            if (Cosmos.ACTION_COSMOS_PROXY.equals(intent.getAction())) {
                return this.c.p;
            }
        }
        return this.a;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Locale a2 = jua.a(configuration);
        if (a2 == null) {
            a2 = Locale.ENGLISH;
        }
        if (!a2.equals(this.L)) {
            hie hie = this.d;
            String a3 = SpotifyLocale.a(hie.a);
            Logger.b("Setting core language to %s", a3);
            hie.d.b(a3);
        }
        this.L = a2;
    }

    public void onCreate() {
        Logger.c("Creating service", new Object[0]);
        long a2 = gnb.a();
        whp.a((Service) this);
        long a3 = gnb.a() - a2;
        String str = "eojmOnsrasteeC_Iscdnni";
        this.z.b("dsss_OnCreateInjection", a3);
        hko hko = this.y;
        if (hko.a) {
            String str2 = "lBodoRnouT.iRaUOidEGPrdptTcsfpesobTye..tsol_tA._.gmSoRos";
            Intent intent = new Intent("com.spotify.android.spotlets.debugtools.BUG_REPORT_START");
            intent.setPackage(hko.b.getPackageName());
            hko.c.a(intent);
        }
        this.e.a(Event.ON_CREATE);
        super.onCreate();
        setTheme(2132017713);
        if (!this.b.c) {
            this.L = jua.a((Context) this);
            this.A.a(this.N);
        }
    }

    public void onDestroy() {
        Logger.c("Destroying service", new Object[0]);
        hkq hkq = this.e;
        hkq.a(Event.ON_STOP);
        hkq.a(Event.ON_DESTROY);
        hko hko = this.y;
        if (hko.a) {
            String str = "B_epmbbPUndTretg.oROoTGltl.EdsfOpdsotPsoio..ciyR_.sSoua";
            Intent intent = new Intent("com.spotify.android.spotlets.debugtools.BUG_REPORT_STOP");
            intent.setPackage(hko.b.getPackageName());
            hko.c.a(intent);
        }
        this.E.c();
        super.onDestroy();
        String str2 = " byedabsserehdrec  Stioeen";
        Logger.c("Service has been destroyed", new Object[0]);
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
            jjt jjt = this.m.w;
            jjt.e();
            if (intent.getBooleanExtra("needs_foreground_start", false)) {
                Optional<hwr> optional = this.o.c;
                if (optional.b()) {
                    ((hwr) optional.c()).m = true;
                }
            }
            fqn fqn = this.K;
            if (fqn != null) {
                fqo.a(intent, (fqn) fbp.a(fqn));
            }
            String str = "nsn oenti srtgte%Pci";
            Logger.a("Processing intent %s", intent);
            SpotifyServiceIntentProcessor spotifyServiceIntentProcessor = (SpotifyServiceIntentProcessor) this.q.get(action);
            if (spotifyServiceIntentProcessor != null) {
                Result a2 = spotifyServiceIntentProcessor.a(this.O, intent, this.y.a(intent));
                Logger.a("Result for processing %s", a2);
                if (a2 == Result.NOT_PROCESSED) {
                    String str2 = "ti pntncpuo%rdinsneepiL,lgnesnto  tlss i gedngotti ic i eI etninooaem n .odnnr";
                    Logger.a("Intent processing did not complete, retaining intent %s until onLogin is done.", intent);
                    this.m.C.e();
                    this.F.set(intent);
                }
            } else {
                String str3 = "nxnuteititencgneHpna d lte";
                Assertion.a("Handling unexpected intent", action);
            }
            jjt.f();
            return 2;
        }
    }

    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        String str = "eastneenl gnihtcd msrsih!neo odt sact Suewt vkw ";
        Logger.c("Shutting down client since the task was removed!", new Object[0]);
        this.E.b();
    }

    public boolean onUnbind(Intent intent) {
        Logger.c("Last bind of \"%s\" disconnected!", intent.getAction());
        return false;
    }
}
