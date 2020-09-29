package defpackage;

import android.os.Build;
import android.os.Build.VERSION;
import android.util.Pair;
import com.google.protobuf.ByteString;
import com.spotify.contexts.DeviceAndroid;

/* renamed from: ggh reason: default package */
final class ggh implements ggi {
    private final gex a;

    ggh(gex gex) {
        this.a = gex;
    }

    public final String a() {
        return "context_device_android";
    }

    public final fli b() {
        return DeviceAndroid.k().a(Build.MANUFACTURER).c(VERSION.RELEASE).a(VERSION.SDK_INT).b(Build.MODEL).d(this.a.a()).g();
    }

    public /* synthetic */ Pair<String, ByteString> c() {
        return CC.$default$c(this);
    }
}
