package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Pair;
import com.google.protobuf.ByteString;
import com.spotify.contexts.ApplicationAndroid;

/* renamed from: ges reason: default package */
final class ges implements gex {
    private final gej a;
    private int b = 0;
    private String c = "";

    public final String a() {
        return "context_application_android";
    }

    public /* synthetic */ Pair<String, ByteString> c() {
        return CC.$default$c(this);
    }

    ges(Context context, gej gej) {
        this.a = gej;
        PackageInfo a2 = a(context);
        if (a2 != null) {
            this.b = a2.versionCode;
            this.c = a2.versionName != null ? a2.versionName : this.c;
        }
    }

    public final fko b() {
        return ApplicationAndroid.k().a((long) this.b).a(this.c).g();
    }

    private PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            this.a.a((Throwable) e, "Error in retrieving package information.");
            return null;
        }
    }
}
