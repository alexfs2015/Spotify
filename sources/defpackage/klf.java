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

/* renamed from: klf reason: default package */
public final class klf {
    private final Application a;
    private final jha b;
    private final rdf c;
    private final igw d;
    private final rqu e;
    private final gho f;
    private final kmb g;
    private final lud h;
    private final jvy i;
    private final ujc j;
    private final ProcessType k;
    private final OrbitLibraryLoader l;
    private final wlc<vfr> m;
    private final wlc<ppt> n;
    private final jsz o;
    private final Random p;

    klf(Application application, jha jha, rdf rdf, igw igw, rqu rqu, gho gho, wlc<vfr> wlc, kmb kmb, lud lud, jvy jvy, ujc ujc, ProcessType processType, jsz jsz, Random random, wlc<ppt> wlc2, OrbitLibraryLoader orbitLibraryLoader) {
        this.a = application;
        this.b = jha;
        this.c = rdf;
        this.d = igw;
        this.e = rqu;
        this.f = gho;
        this.m = wlc;
        this.g = kmb;
        this.h = lud;
        this.i = jvy;
        this.j = ujc;
        this.k = processType;
        this.o = jsz;
        this.p = random;
        this.n = wlc2;
        this.l = orbitLibraryLoader;
    }

    public final void a(glp glp) {
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
        kmb kmb = this.g;
        Application application = this.a;
        if (!a.a && kmb.c == ProcessType.MAIN) {
            long millis = TimeUnit.SECONDS.toMillis(10);
            kmb.a.a(jrf.a.b());
            kmb.a.a(glp);
            kmb.a.c = new rwc(kmb.a, MainActivity.class.getName(), millis);
            application.registerActivityLifecycleCallbacks(kmb.b);
            ColdStartLegacyHolder.setInstance(kmb.a);
        }
        if (handler != null) {
            handler.post(new $$Lambda$klf$6sLH8pSbEObY8Ftr_vEWhL3dx3Q(this));
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
        rna.a(application3, this.p, this.i.a(application3));
        if (handler != null) {
            handler.post(new $$Lambda$klf$eP91Y03UkE5V95innq8TD5LJtS8(this));
        }
        this.g.a.b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.j.a(this.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        akc.a(this.a.getApplicationContext(), this.e.d);
    }
}
