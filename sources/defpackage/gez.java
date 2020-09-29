package defpackage;

import android.util.Pair;
import com.google.protobuf.ByteString;
import com.spotify.contexts.InstallationId;

/* renamed from: gez reason: default package */
final class gez implements gex {
    private final gfa a;

    public final String a() {
        return "context_installation_id";
    }

    public /* synthetic */ Pair<String, ByteString> c() {
        return CC.$default$c(this);
    }

    gez(gfa gfa) {
        this.a = gfa;
    }

    public final fko b() {
        return InstallationId.k().a(ByteString.a(this.a.a().getBytes())).g();
    }
}
