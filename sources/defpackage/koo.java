package defpackage;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import com.spotify.core.http.HttpConnection;
import com.spotify.mobile.android.core.internal.HttpConnectionFactoryImpl;
import com.spotify.mobile.android.orbit.OrbitLibraryLoader;
import com.spotify.mobile.android.orbit.OrbitLibraryLoader.LibraryLoader;
import com.spotify.music.MainActivity;
import com.spotify.music.features.bmw.lockscreen.LockScreenController;
import com.spotify.music.internal.util.process.ProcessType;
import com.spotify.music.libs.performance.tracking.ColdStartLegacyHolder;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: koo reason: default package */
public final class koo {
    private final Application a;
    private final jjp b;
    private final rmd c;
    private final ijj d;
    private final saf e;
    private final giz f;
    private final kpk g;
    private final lyc h;
    private final jyg i;
    private final uun j;
    private final ProcessType k;
    private final OrbitLibraryLoader l;
    private final wzi<vsu> m;
    private final wzi<pyp> n;
    private final jvf o;
    private final Random p;

    koo(Application application, jjp jjp, rmd rmd, ijj ijj, saf saf, giz giz, wzi<vsu> wzi, kpk kpk, lyc lyc, jyg jyg, uun uun, ProcessType processType, jvf jvf, Random random, wzi<pyp> wzi2, OrbitLibraryLoader orbitLibraryLoader) {
        this.a = application;
        this.b = jjp;
        this.c = rmd;
        this.d = ijj;
        this.e = saf;
        this.f = giz;
        this.m = wzi;
        this.g = kpk;
        this.h = lyc;
        this.i = jyg;
        this.j = uun;
        this.k = processType;
        this.o = jvf;
        this.p = random;
        this.n = wzi2;
        this.l = orbitLibraryLoader;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        akq.a(this.a.getApplicationContext(), this.e.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.j.a(this.a);
    }

    public final void a(gne gne) {
        Handler handler;
        String str = "dmi_initApplication";
        this.g.a.a(str);
        if (this.k == ProcessType.MAIN) {
            HandlerThread handlerThread = new HandlerThread("AppInitThread");
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
        } else {
            handler = null;
        }
        kpk kpk = this.g;
        Application application = this.a;
        if (!a.a && kpk.c == ProcessType.MAIN) {
            long millis = TimeUnit.SECONDS.toMillis(10);
            kpk.a.a(jtp.a.b());
            kpk.a.a(gne);
            kpk.a.c = new sfm(kpk.a, MainActivity.class.getName(), millis);
            application.registerActivityLifecycleCallbacks(kpk.b);
            ColdStartLegacyHolder.setInstance(kpk.a);
        }
        if (handler != null) {
            handler.post(new $$Lambda$koo$HDQFPD2Dwxp7b_4m83wuPd6gXo(this));
        }
        if (this.k == ProcessType.MAIN) {
            this.l.startLibraryLoading(this.a, new LibraryLoader());
            HttpConnection.initialize(new HttpConnectionFactoryImpl(this.f.b));
        }
        Application application2 = this.a;
        application2.registerActivityLifecycleCallbacks(new LockScreenController(application2));
        this.a.registerActivityLifecycleCallbacks(this.b);
        this.a.registerActivityLifecycleCallbacks(this.d);
        this.a.registerActivityLifecycleCallbacks(this.c);
        this.h.a(this.a);
        Application application3 = this.a;
        rwg.a(application3, this.p, this.i.a(application3));
        if (handler != null) {
            handler.post(new $$Lambda$koo$KNNJUrz_p9dLhtspFvAuzCHwGE(this));
        }
        this.g.a.b(str);
    }
}
