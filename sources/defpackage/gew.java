package defpackage;

import android.os.Build;
import android.os.Build.VERSION;
import android.util.Pair;
import com.google.protobuf.ByteString;
import com.spotify.contexts.DeviceAndroid;

/* renamed from: gew reason: default package */
final class gew implements gex {
    private final gdm a;

    public final String a() {
        return "context_device_android";
    }

    public /* synthetic */ Pair<String, ByteString> c() {
        return CC.$default$c(this);
    }

    gew(gdm gdm) {
        this.a = gdm;
    }

    public final fko b() {
        return DeviceAndroid.k().a(Build.MANUFACTURER).c(VERSION.RELEASE).a(VERSION.SDK_INT).b(Build.MODEL).d(this.a.a()).g();
    }
}
