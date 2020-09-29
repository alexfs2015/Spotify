package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import com.spotify.mobile.android.util.connectivity.ConnectionType;

/* renamed from: jvn reason: default package */
public abstract class jvn {
    public static jvn a(Context context) {
        return VERSION.SDK_INT >= 23 ? new jvp(context) : new jvo(context);
    }

    public abstract ConnectionType a();

    public abstract void a(jvs jvs);

    public abstract void b();

    public abstract void b(jvs jvs);

    public abstract void c();
}
