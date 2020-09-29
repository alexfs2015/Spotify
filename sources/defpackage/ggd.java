package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Pair;
import com.google.protobuf.ByteString;
import com.spotify.contexts.ApplicationAndroid;

/* renamed from: ggd reason: default package */
final class ggd implements ggi {
    private final gfu a;
    private int b = 0;
    private String c = "";

    ggd(Context context, gfu gfu) {
        this.a = gfu;
        PackageInfo a2 = a(context);
        if (a2 != null) {
            this.b = a2.versionCode;
            this.c = a2.versionName != null ? a2.versionName : this.c;
        }
    }

    private PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            this.a.a((Throwable) e, "Error in retrieving package information.");
            return null;
        }
    }

    public final String a() {
        return "context_application_android";
    }

    public final fli b() {
        return ApplicationAndroid.k().a((long) this.b).a(this.c).g();
    }

    public /* synthetic */ Pair<String, ByteString> c() {
        return CC.$default$c(this);
    }
}
