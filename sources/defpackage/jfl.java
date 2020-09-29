package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.sso.ErrorMessage;

/* renamed from: jfl reason: default package */
public final class jfl extends jfi {
    public final Intent a(Bundle bundle) {
        return null;
    }

    public final Intent a(ErrorMessage errorMessage, String str, String str2) {
        return null;
    }

    public final Bundle a(String str, int i) {
        return null;
    }

    public final Bundle a(String str, String str2) {
        return null;
    }

    public final Uri a(Uri uri, ErrorMessage errorMessage, String str) {
        StringBuilder sb = new StringBuilder(50);
        sb.append(errorMessage.mMessage);
        if (!TextUtils.isEmpty(str)) {
            sb.append(": ");
            sb.append(str);
        }
        Builder buildUpon = uri.buildUpon();
        return buildUpon.appendQueryParameter(LogMessage.SEVERITY_ERROR, buildUpon.toString()).build();
    }

    public final Uri a(Uri uri, b bVar) {
        Builder buildUpon = uri.buildUpon();
        if (bVar.c != null) {
            buildUpon.appendQueryParameter("state", bVar.c);
        }
        buildUpon.appendQueryParameter("code", bVar.a);
        return buildUpon.build();
    }
}
