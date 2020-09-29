package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;

/* renamed from: jic reason: default package */
public final class jic implements jif {
    private final Intent a;

    jic(Intent intent) {
        this.a = intent;
    }

    public final String a() {
        String stringExtra = this.a.getStringExtra("STATE");
        return stringExtra != null ? stringExtra : "";
    }

    public final String[] b() {
        String[] stringArrayExtra = this.a.getStringArrayExtra("SCOPES");
        return stringArrayExtra != null ? stringArrayExtra : new String[0];
    }

    public final String c() {
        String stringExtra = this.a.getStringExtra("CLIENT_ID");
        return stringExtra != null ? stringExtra : "";
    }

    public final ClientIdentity d() {
        return (ClientIdentity) this.a.getParcelableExtra("CLIENT_IDENTITY");
    }

    public final ResponseType e() {
        String stringExtra = this.a.getStringExtra("RESPONSE_TYPE");
        if (stringExtra != null) {
            if (stringExtra.equals("token")) {
                return ResponseType.TOKEN;
            }
            if (stringExtra.equals("code")) {
                return ResponseType.CODE;
            }
        }
        return ResponseType.NONE;
    }

    public final String f() {
        String stringExtra = this.a.getStringExtra("REDIRECT_URI");
        return stringExtra != null ? stringExtra : "";
    }

    public final boolean g() {
        return false;
    }
}
