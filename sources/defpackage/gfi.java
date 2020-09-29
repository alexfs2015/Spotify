package defpackage;

import android.util.Pair;
import com.google.protobuf.ByteString;
import com.spotify.contexts.Time;

/* renamed from: gfi reason: default package */
final class gfi implements gex {
    public final String a() {
        return "context_time";
    }

    public /* synthetic */ Pair<String, ByteString> c() {
        return CC.$default$c(this);
    }

    gfi() {
    }

    public final fko b() {
        return Time.k().a(System.currentTimeMillis()).g();
    }
}
