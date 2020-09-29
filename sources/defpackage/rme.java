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

/* renamed from: rme reason: default package */
public final class rme implements rmd {
    private final Context a;
    private final rll b;
    private final rlr c;
    private CountDownLatch d = new CountDownLatch(0);
    private final rlj e;
    private final rli f;
    private final rmb g;
    private final rnf h;
    private final boolean i;

    public rme(Context context, rll rll, rlj rlj, rlr rlr, rli rli, rmb rmb, rnf rnf, boolean z) {
        this.a = context;
        this.b = rll;
        this.e = rlj;
        this.f = rli;
        this.g = rmb;
        this.h = rnf;
        this.i = z;
        this.c = rlr;
    }

    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler($$Lambda$rme$MnYsEoEZ7hHcqqJOEhSOWVrxtxM.INSTANCE);
        Optional a2 = this.c.a(this.a.getFilesDir());
        if (a2.b()) {
            this.b.a(((rlm) a2.c()).b);
            rlr.b(((rlm) a2.c()).a);
        }
        a aVar = new a(this.a);
        aVar.a = false;
        if (this.f.b) {
            aVar.a(new agj(), new ajq());
        } else {
            aVar.a(new agj());
        }
        vuu.a(aVar.a());
        Thread.setDefaultUncaughtExceptionHandler(new $$Lambda$rme$7G5SdVH1i9TXbckL0oDTm5BBqg(this, new rmf(this, Thread.getDefaultUncaughtExceptionHandler(), this.b, this.e)));
        if (this.i) {
            a(agj.d().a, new File(this.a.getExternalFilesDir(null), "crashlytics.json"));
        }
        a(agj.d().a);
        this.b.a((Runnable) new $$Lambda$rme$wBQAECch0CItizyPFjDo7NuTxM4(this));
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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        this.d = new CountDownLatch(1);
        this.g.a(false);
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    private void a(aia aia) {
        fdh R_ = this.e.a().c.entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            if (rlf.a.contains(entry.getKey())) {
                aia.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void a(aia aia, File file) {
        if (file.exists()) {
            Logger.c("Initializing crashlytics extras from '%s'", file.getAbsolutePath());
            for (Entry entry : a(file).entrySet()) {
                Logger.c("Extra crashlytics key: '%s' -> '%s'", entry.getKey(), entry.getValue());
                aia.a((String) entry.getKey(), (String) entry.getValue());
            }
            return;
        }
        Logger.c("Crashlytics extras file '%s' does not exist", file.getAbsolutePath());
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

    public final void a(long j) {
        try {
            Logger.b("No upload timeout: %b", Boolean.valueOf(this.d.await(5000, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
        }
    }
}
