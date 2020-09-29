package defpackage;

import android.app.Application;
import com.adjust.sdk.LogLevel;

/* renamed from: ujf reason: default package */
public final class ujf {
    public static vf a(Application application) {
        vf vfVar = new vf(application, ujk.a, "production", true);
        vfVar.a(LogLevel.INFO, vfVar.e);
        return vfVar;
    }
}
