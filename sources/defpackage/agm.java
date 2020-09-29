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

/* renamed from: agm reason: default package */
public class agm extends vuz<Boolean> {
    private boolean a = false;
    private ahk b;

    public final String a() {
        return "1.4.6.30";
    }

    public final String b() {
        return "com.crashlytics.sdk.android:answers";
    }

    public final void a(a aVar) {
        ahk ahk = this.b;
        if (ahk != null) {
            String str = aVar.a;
            String str2 = aVar.b;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                vuu.a().a("Answers", "Logged crash");
                agp agp = ahk.b;
                Map<String, String> singletonMap = Collections.singletonMap("sessionId", str);
                a aVar2 = new a(Type.CRASH);
                aVar2.c = singletonMap;
                aVar2.d = Collections.singletonMap("exceptionName", str2);
                agp.a(aVar2, true, false);
                return;
            }
            throw new IllegalStateException("onCrash called from main thread!!!");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Boolean e() {
        String str = "Answers";
        new vvw();
        if (!vvw.b(this.h)) {
            vuu.a().a("Fabric", "Analytics collection disabled, because data collection is disabled by Firebase.");
            this.b.b();
            return Boolean.FALSE;
        }
        try {
            vyb a2 = a.a.a();
            if (a2 == null) {
                vuu.a().e(str, "Failed to retrieve settings");
                return Boolean.FALSE;
            } else if (a2.d.c) {
                vuu.a().a(str, "Analytics collection enabled");
                ahk ahk = this.b;
                vxk vxk = a2.e;
                String c = CommonUtils.c(this.h, "com.crashlytics.ApiEndpoint");
                ahk.d.c = vxk.i;
                agp agp = ahk.b;
                agp.a(new Runnable(vxk, c) {
                    private /* synthetic */ vxk a;
                    private /* synthetic */ String b;

                    {
                        this.a = r2;
                        this.b = r3;
                    }

                    public final void run() {
                        try {
                            agp.this.h.a(this.a, this.b);
                        } catch (Exception e) {
                            vuu.a().c("Answers", "Failed to set analytics settings data", e);
                        }
                    }
                });
                return Boolean.TRUE;
            } else {
                vuu.a().a(str, "Analytics collection disabled");
                this.b.b();
                return Boolean.FALSE;
            }
        } catch (Exception e) {
            vuu.a().c(str, "Error dealing with settings", e);
            return Boolean.FALSE;
        }
    }

    public final boolean g_() {
        long lastModified;
        String str = "analytics_launched";
        String str2 = "Answers";
        try {
            Context context = this.h;
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = Integer.toString(packageInfo.versionCode);
            String str3 = packageInfo.versionName == null ? "0.0" : packageInfo.versionName;
            if (VERSION.SDK_INT >= 9) {
                lastModified = packageInfo.firstInstallTime;
            } else {
                lastModified = new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            }
            long j = lastModified;
            aho aho = new aho(context, this.j, num, str3);
            agq agq = new agq(context, new vxg(this));
            vxa vxa = new vxa(vuu.a());
            vus vus = new vus(context);
            String str4 = "Answers Events Handler";
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(vvt.a(str4));
            vvt.a(str4, newSingleThreadScheduledExecutor);
            agv agv = new agv(newSingleThreadScheduledExecutor);
            agp agp = new agp(this, context, agq, aho, vxa, newSingleThreadScheduledExecutor, new aha(context));
            ahk ahk = new ahk(agp, vus, agv, new ags(new vxi(context, "settings")), j);
            this.b = ahk;
            ahk ahk2 = this.b;
            agp agp2 = ahk2.b;
            agp2.a(new Runnable() {
                public final void run() {
                    try {
                        aho aho = agp.this.d;
                        Map c = aho.b.c();
                        String str = aho.b.b;
                        String a2 = aho.b.a();
                        Boolean e = aho.b.e();
                        String str2 = (String) c.get(DeviceIdentifierType.FONT_TOKEN);
                        String k = CommonUtils.k(aho.a);
                        IdManager idManager = aho.b;
                        StringBuilder sb = new StringBuilder();
                        sb.append(IdManager.a(VERSION.RELEASE));
                        sb.append("/");
                        sb.append(IdManager.a(VERSION.INCREMENTAL));
                        ahm ahm = new ahm(str, UUID.randomUUID().toString(), a2, e, str2, k, sb.toString(), aho.b.b(), aho.c, aho.d);
                        agq agq = agp.this.c;
                        if (Looper.myLooper() != Looper.getMainLooper()) {
                            ahi ahi = new ahi(agq.a, new ahn(), new vwa(), new vww(agq.a, agq.b.a(), "session_analytics.tap", "session_analytics_to_send"));
                            ahi.a((vwt) agp.this);
                            agp agp = agp.this;
                            agx agx = new agx(agp.this.a, agp.this.b, agp.this.g, ahi, agp.this.e, ahm, agp.this.f);
                            agp.h = agx;
                            return;
                        }
                        throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
                    } catch (Exception e2) {
                        vuu.a().c("Answers", "Failed to enable events", e2);
                    }
                }
            });
            ahk2.c.a(new agr(ahk2, ahk2.d));
            ahk2.d.b.add(ahk2);
            if (!ahk2.e.a.a().getBoolean(str, false)) {
                long j2 = ahk2.a;
                vuu.a().a(str2, "Logged install");
                agp agp3 = ahk2.b;
                a aVar = new a(Type.INSTALL);
                aVar.c = Collections.singletonMap("installedAt", String.valueOf(j2));
                agp3.a(aVar, false, true);
                ags ags = ahk2.e;
                ags.a.a(ags.a.b().putBoolean(str, true));
            }
            this.a = new vvw().a(context);
            return true;
        } catch (Exception e) {
            vuu.a().c(str2, "Error retrieving app properties", e);
            return false;
        }
    }
}
