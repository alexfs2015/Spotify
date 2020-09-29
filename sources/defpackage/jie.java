package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;

/* renamed from: jie reason: default package */
public final class jie implements jif {
    private final jif a;
    private final Intent b;

    jie(jic jic, Intent intent) {
        this.a = jic;
        this.b = intent;
    }

    public final String a() {
        return this.a.a();
    }

    public final String[] b() {
        String stringExtra = this.b.getStringExtra("SCOPES");
        return stringExtra != null ? gck.b(stringExtra, fbi.c).split(" +") : new String[0];
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
