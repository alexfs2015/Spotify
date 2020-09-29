package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.mobile.android.sso.ErrorMessage;

/* renamed from: jfm reason: default package */
public class jfm extends jfi {
    public final Uri a(Uri uri, ErrorMessage errorMessage, String str) {
        return null;
    }

    public final Uri a(Uri uri, b bVar) {
        return null;
    }

    public final Intent a(ErrorMessage errorMessage, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("ERROR", errorMessage.mMessage);
        intent.putExtra("STATE", str2);
        if (!fax.a(str)) {
            intent.putExtra("ERROR_DESCRIPTION", str);
        }
        return intent;
    }

    public Intent a(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("REPLY", bundle);
        return intent;
    }

    public Bundle a(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("ACCESS_TOKEN", str);
        bundle.putString("RESPONSE_TYPE", "token");
        bundle.putInt("EXPIRES_IN", i);
        return bundle;
    }

    public Bundle a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("AUTHORIZATION_CODE", str);
        bundle.putString("RESPONSE_TYPE", "code");
        bundle.putString("STATE", str2);
        return bundle;
    }
}
