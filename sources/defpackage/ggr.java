package defpackage;

import android.util.Pair;
import com.google.protobuf.ByteString;
import com.spotify.contexts.Sdk;

/* renamed from: ggr reason: default package */
final class ggr implements ggi {
    ggr() {
    }

    public final String a() {
        return "context_sdk";
    }

    public final fli b() {
        return Sdk.k().a("0.5.2").g();
    }

    public /* synthetic */ Pair<String, ByteString> c() {
        return CC.$default$c(this);
    }
}
