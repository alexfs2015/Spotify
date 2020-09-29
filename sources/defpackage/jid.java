package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;

/* renamed from: jid reason: default package */
public final class jid implements jif {
    private final jif a;
    private final Intent b;

    jid(jif jif, Intent intent) {
        this.a = jif;
        this.b = intent;
    }

    public final String a() {
        return this.a.a();
    }

    public final String[] b() {
        String[] stringArrayExtra = this.b.getStringArrayExtra("SCOPE");
        return stringArrayExtra != null ? stringArrayExtra : new String[0];
    }

    public final String c() {
        return this.a.c();
    }

    public final ClientIdentity d() {
        return this.a.d();
    }

    public final ResponseType e() {
        return ResponseType.CODE;
    }

    public final String f() {
        return this.a.f();
    }

    public final boolean g() {
        return this.a.g();
    }
}
