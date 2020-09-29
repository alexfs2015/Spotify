package defpackage;

import android.util.Pair;
import com.google.protobuf.ByteString;
import com.spotify.contexts.Time;

/* renamed from: ggt reason: default package */
final class ggt implements ggi {
    ggt() {
    }

    public final String a() {
        return "context_time";
    }

    public final fli b() {
        return Time.k().a(System.currentTimeMillis()).g();
    }

    public /* synthetic */ Pair<String, ByteString> c() {
        return CC.$default$c(this);
    }
}
