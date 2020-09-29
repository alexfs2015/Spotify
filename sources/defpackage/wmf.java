package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.settings.SettingsCacheBehavior;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wmf reason: default package */
public final class wmf {
    private final AtomicReference<wmh> a;
    private final CountDownLatch b;
    private wmg c;
    private boolean d;

    /* renamed from: wmf$a */
    public static class a {
        /* access modifiers changed from: private */
        public static final wmf a = new wmf(0);
    }

    private wmf() {
        this.a = new AtomicReference<>();
        this.b = new CountDownLatch(1);
        this.d = false;
    }

    /* synthetic */ wmf(byte b2) {
        this();
    }

    private void a(wmh wmh) {
        this.a.set(wmh);
        this.b.countDown();
    }

    public final synchronized wmf a(wjf wjf, IdManager idManager, wlh wlh, String str, String str2, String str3) {
        wjf wjf2 = wjf;
        synchronized (this) {
            if (this.d) {
                return this;
            }
            if (this.c == null) {
                Context context = wjf2.h;
                String str4 = idManager.b;
                String a2 = new wju().a(context);
                String d2 = idManager.d();
                wkg wkg = new wkg();
                wlz wlz = new wlz();
                wlx wlx = new wlx(wjf2);
                String i = CommonUtils.i(context);
                String str5 = str3;
                wma wma = new wma(wjf2, str5, String.format(Locale.US, "http://=", new Object[]{str4}), wlh);
                String b2 = idManager.b();
                String a3 = IdManager.a(VERSION.INCREMENTAL);
                String a4 = IdManager.a(VERSION.RELEASE);
                String str6 = a4;
                wma wma2 = wma;
                String a5 = idManager.a();
                wmk wmk = new wmk(a2, b2, a3, str6, a5, CommonUtils.a(CommonUtils.k(context)), str2, str, DeliveryMechanism.a(d2).id, i);
                wly wly = new wly(wjf, wmk, wkg, wlz, wlx, wma2);
                this.c = wly;
            }
            this.d = true;
            return this;
        }
    }

    public final wmh a() {
        try {
            this.b.await();
            return (wmh) this.a.get();
        } catch (InterruptedException unused) {
            wja.a().e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    public final synchronized boolean b() {
        wmh a2;
        a2 = this.c.a();
        a(a2);
        return a2 != null;
    }

    public final synchronized boolean c() {
        wmh a2;
        a2 = this.c.a(SettingsCacheBehavior.SKIP_CACHE_LOOKUP);
        a(a2);
        if (a2 == null) {
            wja.a().c("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        }
        return a2 != null;
    }
}
