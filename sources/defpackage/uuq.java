package defpackage;

import android.app.Application;
import com.adjust.sdk.LogLevel;

/* renamed from: uuq reason: default package */
public final class uuq {
    public static vt a(Application application) {
        vt vtVar = new vt(application, uuv.a, "production", true);
        vtVar.a(LogLevel.INFO, vtVar.e);
        return vtVar;
    }
}
