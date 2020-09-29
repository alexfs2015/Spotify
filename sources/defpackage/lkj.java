package defpackage;

import android.util.Pair;
import com.google.common.io.BaseEncoding;
import com.google.protobuf.ByteString;
import com.spotify.contexts.ClientId;

/* renamed from: lkj reason: default package */
public final class lkj implements gex {
    private final String a;

    public final String a() {
        return "context_client_id";
    }

    public /* synthetic */ Pair<String, ByteString> c() {
        return CC.$default$c(this);
    }

    public lkj(String str) {
        this.a = str;
    }

    public final fko b() {
        return ClientId.k().a(ByteString.a(BaseEncoding.e().b().a((CharSequence) this.a))).g();
    }
}
