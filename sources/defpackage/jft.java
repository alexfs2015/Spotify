package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType;
import com.spotify.mobile.android.sso.ClientIdentity;

/* renamed from: jft reason: default package */
public final class jft implements jfq {
    private final Uri a;

    public /* synthetic */ ClientIdentity d() {
        return CC.$default$d(this);
    }

    jft(String str) {
        this.a = Uri.parse(str);
    }

    public final String a() {
        String queryParameter = this.a.getQueryParameter("state");
        return queryParameter != null ? queryParameter : "";
    }

    public final String[] b() {
        String queryParameter = this.a.getQueryParameter("scope");
        if (queryParameter == null) {
            return new String[0];
        }
        return queryParameter.split(" ");
    }

    public final String c() {
        String queryParameter = this.a.getQueryParameter("client_id");
        return queryParameter != null ? queryParameter : "";
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
