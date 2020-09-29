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

/* renamed from: hva reason: default package */
public final class hva implements hhi, b {
    private final Application a;
    private final txp b;
    private final txn c;

    public final String c() {
        return "RemoteConfig";
    }

    hva(Application application, txn txn, txp txp) {
        this.a = application;
        this.c = txn;
        this.b = txp;
    }

    public final void a() {
        this.b.a.a().a();
        SpotifyApplication spotifyApplication = (SpotifyApplication) this.a;
        sl b2 = vhu.b();
        if (b2 != null) {
            xal.b("Enqueueing periodic work", new Object[0]);
            ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.REPLACE;
            se a2 = vhu.a(Type.BACKGROUND_SYNC);
            a aVar = new a(FetchPropertiesWorker.class, 24, TimeUnit.HOURS, 12, TimeUnit.HOURS);
            a aVar2 = (a) aVar.a(a2);
            a aVar3 = new a();
            aVar3.a = true;
            aVar3.c = NetworkType.UNMETERED;
            b2.a("remote-config-fetch-daily", existingPeriodicWorkPolicy, (sj) ((a) ((a) aVar2.a(aVar3.a())).a(BackoffPolicy.EXPONENTIAL, 5, TimeUnit.MINUTES)).c());
        }
        sl b3 = vhu.b();
        if (b3 != null) {
            xal.b("Enqueuing delayed work", new Object[0]);
            ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
            a aVar4 = (a) new a(FetchPropertiesWorker.class).a(vhu.a(Type.DELAYED));
            TimeUnit timeUnit = TimeUnit.MINUTES;
            aVar4.c.g = timeUnit.toMillis(2);
            a aVar5 = (a) aVar4.a();
            a aVar6 = new a();
            aVar6.c = NetworkType.CONNECTED;
            b3.a("remote-config-fetch-delayed", existingWorkPolicy, Collections.singletonList((sh) ((a) ((a) aVar5.a(aVar6.a())).a(BackoffPolicy.EXPONENTIAL, 5, TimeUnit.MINUTES)).c()));
        }
    }

    public final void X_() {
        txp txp = this.b;
        Logger.c("Cleaning persistance and terminating pending calls", new Object[0]);
        vhm a2 = txp.a.a();
        a2.a.b();
        a2.b.b();
        a2.d = null;
        txp.a.a();
        xal.b("Unscheduling background work", new Object[0]);
        vhu.a();
        xal.b("Unscheduling daily background work", new Object[0]);
        if (vhu.b() != null) {
            sl.a().a("remote-config-fetch-daily");
        }
    }

    public final void b() {
        vhu.a();
        txp txp = this.b;
        Logger.c("Terminating pending calls", new Object[0]);
        txp.a.a();
    }
}
