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

/* renamed from: vxz reason: default package */
public final class vxz {
    private final AtomicReference<vyb> a;
    private final CountDownLatch b;
    private vya c;
    private boolean d;

    /* renamed from: vxz$a */
    public static class a {
        /* access modifiers changed from: private */
        public static final vxz a = new vxz(0);
    }

    /* synthetic */ vxz(byte b2) {
        this();
    }

    private vxz() {
        this.a = new AtomicReference<>();
        this.b = new CountDownLatch(1);
        this.d = false;
    }

    public final synchronized vxz a(vuz vuz, IdManager idManager, vxb vxb, String str, String str2, String str3) {
        vuz vuz2 = vuz;
        synchronized (this) {
            if (this.d) {
                return this;
            }
            if (this.c == null) {
                Context context = vuz2.h;
                String str4 = idManager.b;
                String a2 = new vvo().a(context);
                String d2 = idManager.d();
                vwa vwa = new vwa();
                vxt vxt = new vxt();
                vxr vxr = new vxr(vuz2);
                String i = CommonUtils.i(context);
                String str5 = str3;
                vxu vxu = new vxu(vuz2, str5, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{str4}), vxb);
                String b2 = idManager.b();
                String a3 = IdManager.a(VERSION.INCREMENTAL);
                String a4 = IdManager.a(VERSION.RELEASE);
                String str6 = a4;
                vxu vxu2 = vxu;
                String a5 = idManager.a();
                vye vye = new vye(a2, b2, a3, str6, a5, CommonUtils.a(CommonUtils.k(context)), str2, str, DeliveryMechanism.a(d2).id, i);
                vxs vxs = new vxs(vuz, vye, vwa, vxt, vxr, vxu2);
                this.c = vxs;
            }
            this.d = true;
            return this;
        }
    }

    public final vyb a() {
        try {
            this.b.await();
            return (vyb) this.a.get();
        } catch (InterruptedException unused) {
            vuu.a().e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    public final synchronized boolean b() {
        boolean z;
        vyb a2 = this.c.a();
        a(a2);
        if (a2 != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized boolean c() {
        boolean z;
        vyb a2 = this.c.a(SettingsCacheBehavior.SKIP_CACHE_LOOKUP);
        a(a2);
        if (a2 == null) {
            vuu.a().c("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        }
        if (a2 != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private void a(vyb vyb) {
        this.a.set(vyb);
        this.b.countDown();
    }
}
