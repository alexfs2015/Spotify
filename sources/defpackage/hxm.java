package defpackage;

import android.app.Application;
import androidx.work.BackoffPolicy;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.SpotifyApplication;
import com.spotify.rcs.model.Fetch.Type;
import com.spotify.remoteconfig.worker.FetchPropertiesWorker;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: hxm reason: default package */
public final class hxm implements hkc, b {
    private final Application a;
    private final ujs b;
    private final ujq c;

    hxm(Application application, ujq ujq, ujs ujs) {
        this.a = application;
        this.c = ujq;
        this.b = ujs;
    }

    public final void X_() {
        ujs ujs = this.b;
        Logger.c("Cleaning persistance and terminating pending calls", new Object[0]);
        vur a2 = ujs.a.a();
        a2.a.b();
        a2.b.b();
        a2.d = null;
        ujs.a.a();
        xop.b("Unscheduling background work", new Object[0]);
        vuz.a();
        xop.b("Unscheduling daily background work", new Object[0]);
        if (vuz.b() != null) {
            sz.a().a("remote-config-fetch-daily");
        }
    }

    public final void a() {
        this.b.a.a().a();
        SpotifyApplication spotifyApplication = (SpotifyApplication) this.a;
        sz b2 = vuz.b();
        if (b2 != null) {
            xop.b("Enqueueing periodic work", new Object[0]);
            ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.REPLACE;
            ss a2 = vuz.a(Type.BACKGROUND_SYNC);
            a aVar = new a(FetchPropertiesWorker.class, 24, TimeUnit.HOURS, 12, TimeUnit.HOURS);
            a aVar2 = (a) aVar.a(a2);
            a aVar3 = new a();
            aVar3.a = true;
            aVar3.c = NetworkType.UNMETERED;
            b2.a("remote-config-fetch-daily", existingPeriodicWorkPolicy, (sx) ((a) ((a) aVar2.a(aVar3.a())).a(BackoffPolicy.EXPONENTIAL, 5, TimeUnit.MINUTES)).c());
        }
        sz b3 = vuz.b();
        if (b3 != null) {
            xop.b("Enqueuing delayed work", new Object[0]);
            ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
            a aVar4 = (a) new a(FetchPropertiesWorker.class).a(vuz.a(Type.DELAYED));
            TimeUnit timeUnit = TimeUnit.MINUTES;
            aVar4.c.g = timeUnit.toMillis(2);
            a aVar5 = (a) aVar4.a();
            a aVar6 = new a();
            aVar6.c = NetworkType.CONNECTED;
            b3.a("remote-config-fetch-delayed", existingWorkPolicy, Collections.singletonList((sv) ((a) ((a) aVar5.a(aVar6.a())).a(BackoffPolicy.EXPONENTIAL, 5, TimeUnit.MINUTES)).c()));
        }
    }

    public final void b() {
        vuz.a();
        ujs ujs = this.b;
        Logger.c("Terminating pending calls", new Object[0]);
        ujs.a.a();
    }

    public final String c() {
        return "RemoteConfig";
    }
}
