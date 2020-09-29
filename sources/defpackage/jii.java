package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;

/* renamed from: jii reason: default package */
public final class jii implements jif {
    private final Uri a;

    jii(String str) {
        this.a = Uri.parse(str);
    }

    public final String a() {
        String queryParameter = this.a.getQueryParameter("state");
        return queryParameter != null ? queryParameter : "";
    }

    public final String[] b() {
        String queryParameter = this.a.getQueryParameter("scope");
        return queryParameter == null ? new String[0] : queryParameter.split(" ");
    }

    public final String c() {
        String queryParameter = this.a.getQueryParameter("client_id");
        return queryParameter != null ? queryParameter : "";
    }

    public /* synthetic */ ClientIdentity d() {
        return CC.$default$d(this);
    }

    public final ResponseType e() {
        return ResponseType.CODE;
    }

    public final String f() {
        String queryParameter = this.a.getQueryParameter("redirect_uri");
        return queryParameter != null ? queryParameter : "";
    }

    public final boolean g() {
        return this.a.getBooleanQueryParameter("show_dialog", false);
    }
}
