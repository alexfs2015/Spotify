package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Looper;
import com.crashlytics.android.answers.SessionEvent.Type;
import com.crashlytics.android.answers.SessionEvent.a;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aha reason: default package */
public class aha extends wjf<Boolean> {
    private boolean a = false;
    private ahy b;

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Boolean e() {
        String str = "Answers";
        new wkc();
        if (!wkc.b(this.h)) {
            wja.a().a("Fabric", "Analytics collection disabled, because data collection is disabled by Firebase.");
            this.b.b();
            return Boolean.FALSE;
        }
        try {
            wmh a2 = a.a.a();
            if (a2 == null) {
                wja.a().e(str, "Failed to retrieve settings");
                return Boolean.FALSE;
            } else if (a2.d.c) {
                wja.a().a(str, "Analytics collection enabled");
                ahy ahy = this.b;
                wlq wlq = a2.e;
                String c = CommonUtils.c(this.h, "com.crashlytics.ApiEndpoint");
                ahy.d.c = wlq.i;
                ahd ahd = ahy.b;
                ahd.a(new Runnable(wlq, c) {
                    private /* synthetic */ wlq a;
                    private /* synthetic */ String b;

                    {
                        this.a = r2;
                        this.b = r3;
                    }

                    public final void run() {
                        try {
                            ahd.this.h.a(this.a, this.b);
                        } catch (Exception e) {
                            wja.a().c("Answers", "Failed to set analytics settings data", e);
                        }
                    }
                });
                return Boolean.TRUE;
            } else {
                wja.a().a(str, "Analytics collection disabled");
                this.b.b();
                return Boolean.FALSE;
            }
        } catch (Exception e) {
            wja.a().c(str, "Error dealing with settings", e);
            return Boolean.FALSE;
        }
    }

    public final String a() {
        return "1.4.6.30";
    }

    public final void a(a aVar) {
        ahy ahy = this.b;
        if (ahy != null) {
            String str = aVar.a;
            String str2 = aVar.b;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                wja.a().a("Answers", "Logged crash");
                ahd ahd = ahy.b;
                Map<String, String> singletonMap = Collections.singletonMap("sessionId", str);
                a aVar2 = new a(Type.CRASH);
                aVar2.c = singletonMap;
                aVar2.d = Collections.singletonMap("exceptionName", str2);
                ahd.a(aVar2, true, false);
                return;
            }
            throw new IllegalStateException("onCrash called from main thread!!!");
        }
    }

    public final String b() {
        return "com.crashlytics.sdk.android:answers";
    }

    public final boolean g_() {
        String str = "analytics_launched";
        String str2 = "Answers";
        try {
            Context context = this.h;
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = Integer.toString(packageInfo.versionCode);
            String str3 = packageInfo.versionName == null ? "0.0" : packageInfo.versionName;
            long lastModified = VERSION.SDK_INT >= 9 ? packageInfo.firstInstallTime : new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            aic aic = new aic(context, this.j, num, str3);
            ahe ahe = new ahe(context, new wlm(this));
            wlg wlg = new wlg(wja.a());
            wiy wiy = new wiy(context);
            String str4 = "Answers Events Handler";
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(wjz.a(str4));
            wjz.a(str4, newSingleThreadScheduledExecutor);
            ahj ahj = new ahj(newSingleThreadScheduledExecutor);
            ahd ahd = new ahd(this, context, ahe, aic, wlg, newSingleThreadScheduledExecutor, new aho(context));
            ahy ahy = new ahy(ahd, wiy, ahj, new ahg(new wlo(context, "settings")), lastModified);
            this.b = ahy;
            ahy ahy2 = this.b;
            ahd ahd2 = ahy2.b;
            ahd2.a(new Runnable() {
                public final void run() {
                    try {
                        aic aic = ahd.this.d;
                        Map c = aic.b.c();
                        String str = aic.b.b;
                        String a2 = aic.b.a();
                        Boolean e = aic.b.e();
                        String str2 = (String) c.get(DeviceIdentifierType.FONT_TOKEN);
                        String k = CommonUtils.k(aic.a);
                        IdManager idManager = aic.b;
                        StringBuilder sb = new StringBuilder();
                        sb.append(IdManager.a(VERSION.RELEASE));
                        sb.append("/");
                        sb.append(IdManager.a(VERSION.INCREMENTAL));
                        aia aia = new aia(str, UUID.randomUUID().toString(), a2, e, str2, k, sb.toString(), aic.b.b(), aic.c, aic.d);
                        ahe ahe = ahd.this.c;
                        if (Looper.myLooper() != Looper.getMainLooper()) {
                            ahw ahw = new ahw(ahe.a, new aib(), new wkg(), new wlc(ahe.a, ahe.b.a(), "session_analytics.tap", "session_analytics_to_send"));
                            ahw.a((wkz) ahd.this);
                            ahd ahd = ahd.this;
                            ahl ahl = new ahl(ahd.this.a, ahd.this.b, ahd.this.g, ahw, ahd.this.e, aia, ahd.this.f);
                            ahd.h = ahl;
                            return;
                        }
                        throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
                    } catch (Exception e2) {
                        wja.a().c("Answers", "Failed to enable events", e2);
                    }
                }
            });
            ahy2.c.a(new ahf(ahy2, ahy2.d));
            ahy2.d.b.add(ahy2);
            if (!ahy2.e.a.a().getBoolean(str, false)) {
                long j = ahy2.a;
                wja.a().a(str2, "Logged install");
                ahd ahd3 = ahy2.b;
                a aVar = new a(Type.INSTALL);
                aVar.c = Collections.singletonMap("installedAt", String.valueOf(j));
                ahd3.a(aVar, false, true);
                ahg ahg = ahy2.e;
                ahg.a.a(ahg.a.b().putBoolean(str, true));
            }
            this.a = new wkc().a(context);
            return true;
        } catch (Exception e) {
            wja.a().c(str2, "Error retrieving app properties", e);
            return false;
        }
    }
}
