package defpackage;

import com.crashlytics.android.ndk.JniNativeApi;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.io.IOException;

/* renamed from: ake reason: default package */
public final class ake extends wjf<Void> implements ait {
    private akh a;
    private ais b;

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Void e() {
        try {
            this.b = this.a.b();
        } catch (IOException e) {
            wja.a().c("CrashlyticsNdk", "Could not process ndk data; ", e);
        }
        return null;
    }

    public final String a() {
        return "2.0.5.27";
    }

    public final String b() {
        return "com.crashlytics.sdk.android.crashlytics-ndk";
    }

    public final ais d() {
        return this.b;
    }

    public final boolean g_() {
        aio aio = (aio) wja.a(aio.class);
        if (aio != null) {
            akc akc = new akc(this.h, new JniNativeApi(), new akg(new wlm(this)));
            new aiq();
            this.a = akc;
            boolean a2 = akc.a();
            if (a2) {
                aio.e = this;
                wja.a().a("CrashlyticsNdk", "Crashlytics NDK initialization successful");
            }
            return a2;
        }
        throw new UnmetDependencyException("CrashlyticsNdk requires Crashlytics");
    }
}
