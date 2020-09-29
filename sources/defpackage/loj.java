package defpackage;

import android.util.Pair;
import com.google.common.io.BaseEncoding;
import com.google.protobuf.ByteString;
import com.spotify.contexts.ClientId;

/* renamed from: loj reason: default package */
public final class loj implements ggi {
    private final String a;

    public loj(String str) {
        this.a = str;
    }

    public final String a() {
        return "context_client_id";
    }

    public final fli b() {
        return ClientId.k().a(ByteString.a(BaseEncoding.e().b().a((CharSequence) this.a))).g();
    }

    public /* synthetic */ Pair<String, ByteString> c() {
        return CC.$default$c(this);
    }
}
