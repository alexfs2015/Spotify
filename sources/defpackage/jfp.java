package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;

/* renamed from: jfp reason: default package */
public final class jfp implements jfq {
    private final jfq a;
    private final Intent b;

    jfp(jfn jfn, Intent intent) {
        this.a = jfn;
        this.b = intent;
    }

    public final String a() {
        return this.a.a();
    }

    public final String[] b() {
        String stringExtra = this.b.getStringExtra("SCOPES");
        return stringExtra != null ? gbm.b(stringExtra, far.c).split(" +") : new String[0];
    }

    public final String c() {
        return this.a.c();
    }

    public final ClientIdentity d() {
        return this.a.d();
    }

    public final ResponseType e() {
        return this.a.e();
    }

    public final String f() {
        return this.a.f();
    }

    public final boolean g() {
        return this.a.g();
    }
}
