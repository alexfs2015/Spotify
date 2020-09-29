package defpackage;

import com.crashlytics.android.ndk.JniNativeApi;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.io.IOException;

/* renamed from: ajq reason: default package */
public final class ajq extends vuz<Void> implements aif {
    private ajt a;
    private aie b;

    public final String a() {
        return "2.0.5.27";
    }

    public final String b() {
        return "com.crashlytics.sdk.android.crashlytics-ndk";
    }

    public final boolean g_() {
        aia aia = (aia) vuu.a(aia.class);
        if (aia != null) {
            ajo ajo = new ajo(this.h, new JniNativeApi(), new ajs(new vxg(this)));
            new aic();
            this.a = ajo;
            boolean a2 = ajo.a();
            if (a2) {
                aia.e = this;
                vuu.a().a("CrashlyticsNdk", "Crashlytics NDK initialization successful");
            }
            return a2;
        }
        throw new UnmetDependencyException("CrashlyticsNdk requires Crashlytics");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Void e() {
        try {
            this.b = this.a.b();
        } catch (IOException e) {
            vuu.a().c("CrashlyticsNdk", "Could not process ndk data; ", e);
        }
        return null;
    }

    public final aie d() {
        return this.b;
    }
}
