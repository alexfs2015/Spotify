package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.ErrorMessage;

/* renamed from: jfj reason: default package */
public final class jfj extends jfi {
    public final Uri a(Uri uri, ErrorMessage errorMessage, String str) {
        return null;
    }

    public final Uri a(Uri uri, b bVar) {
        return null;
    }

    public final Intent a(ErrorMessage errorMessage, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("ERROR_TYPE", errorMessage.mErrorType.mType);
        intent.putExtra("ERROR_CODE", errorMessage.ordinal());
        intent.putExtra("ERROR_DESCRIPTION", str);
        return intent;
    }

    public final Intent a(Bundle bundle) {
        Intent intent = new Intent();
        String str = "AUTHORIZATION_CODE";
        intent.putExtra(str, bundle.getString(str));
        return intent;
    }

    public final Bundle a(String str, int i) {
        Logger.e("Google V1 doesn't support token response type", new Object[0]);
        return null;
    }

    public final Bundle a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("AUTHORIZATION_CODE", str);
        return bundle;
    }
}
