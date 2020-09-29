package defpackage;

import android.content.Context;
import android.os.Process;
import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: rvk reason: default package */
public final class rvk implements rvj {
    private final Context a;
    private final rur b;
    private final rux c;
    private CountDownLatch d = new CountDownLatch(0);
    private final rup e;
    private final ruo f;
    private final rvh g;
    private final rwl h;
    private final boolean i;

    public rvk(Context context, rur rur, rup rup, rux rux, ruo ruo, rvh rvh, rwl rwl, boolean z) {
        this.a = context;
        this.b = rur;
        this.e = rup;
        this.f = ruo;
        this.g = rvh;
        this.h = rwl;
        this.i = z;
        this.c = rux;
    }

    private Map<String, String> a(File file) {
        try {
            return (Map) this.h.b().readValue(file, (TypeReference) new TypeReference<Map<String, String>>() {
            });
        } catch (IOException e2) {
            Logger.d("Unable to read json file: '%s', error message: '%s'", file.getAbsolutePath(), e2.getMessage());
            return Collections.emptyMap();
        }
    }

    private void a(aio aio) {
        fdz R_ = this.e.a().c.entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            if (rul.a.contains(entry.getKey())) {
                aio.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void a(aio aio, File file) {
        if (file.exists()) {
            Logger.c("Initializing crashlytics extras from '%s'", file.getAbsolutePath());
            for (Entry entry : a(file).entrySet()) {
                Logger.c("Extra crashlytics key: '%s' -> '%s'", entry.getKey(), entry.getValue());
                aio.a((String) entry.getKey(), (String) entry.getValue());
            }
            return;
        }
        Logger.c("Crashlytics extras file '%s' does not exist", file.getAbsolutePath());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        this.d = new CountDownLatch(1);
        this.g.a(false);
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Thread thread, Throwable th) {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.d.countDown();
    }

    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler($$Lambda$rvk$rOxg7WjdJ7eZXMmOeXn0Kddc8CQ.INSTANCE);
        Optional a2 = this.c.a(this.a.getFilesDir());
        if (a2.b()) {
            this.b.a(((rus) a2.c()).b);
            rux.b(((rus) a2.c()).a);
        }
        a aVar = new a(this.a);
        aVar.a = false;
        if (this.f.b) {
            aVar.a(new agx(), new ake());
        } else {
            aVar.a(new agx());
        }
        wja.a(aVar.a());
        Thread.setDefaultUncaughtExceptionHandler(new $$Lambda$rvk$oEQy_zYhTQUtWucJha0ciBa_YA0(this, new rvl(this, Thread.getDefaultUncaughtExceptionHandler(), this.b, this.e)));
        if (this.i) {
            a(agx.d().a, new File(this.a.getExternalFilesDir(null), "crashlytics.json"));
        }
        a(agx.d().a);
        this.b.a((Runnable) new $$Lambda$rvk$eSDC1nUZUM1sVuQyzJMjaRFjU(this));
    }

    public final void a(long j) {
        try {
            Logger.b("No upload timeout: %b", Boolean.valueOf(this.d.await(5000, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
        }
    }
}
