package defpackage;

import android.util.Pair;
import com.google.protobuf.ByteString;
import com.spotify.contexts.InstallationId;

/* renamed from: ggk reason: default package */
final class ggk implements ggi {
    private final ggl a;

    ggk(ggl ggl) {
        this.a = ggl;
    }

    public final String a() {
        return "context_installation_id";
    }

    public final fli b() {
        return InstallationId.k().a(ByteString.a(this.a.a().getBytes())).g();
    }

    public /* synthetic */ Pair<String, ByteString> c() {
        return CC.$default$c(this);
    }
}
