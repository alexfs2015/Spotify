package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.sso.ErrorMessage;

/* renamed from: jeb reason: default package */
public final class jeb {
    public static jea a(Uri uri) {
        if (uri == null) {
            return new c(ErrorMessage.UNKNOWN_RESPONSE_TYPE_ERROR);
        }
        String queryParameter = uri.getQueryParameter("state");
        String queryParameter2 = uri.getQueryParameter(LogMessage.SEVERITY_ERROR);
        if (queryParameter2 == null) {
            String queryParameter3 = uri.getQueryParameter("code");
            if (queryParameter3 != null) {
                return new b(queryParameter3, uri.toString(), queryParameter);
            }
            String encodedFragment = uri.getEncodedFragment();
            if (encodedFragment != null && !encodedFragment.isEmpty()) {
                String str = null;
                String str2 = null;
                for (String split : encodedFragment.split("&")) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2) {
                        if (split2[0].startsWith("access_token")) {
                            str2 = Uri.decode(split2[1]);
                        }
                        if (split2[0].startsWith("expires_in")) {
                            str = Uri.decode(split2[1]);
                        }
                    }
                }
                if (!(str == null || str2 == null)) {
                    try {
                        return new a(str2, uri.toString(), Integer.parseInt(str), queryParameter);
                    } catch (NumberFormatException e) {
                        String str3 = "Could not parse expiresIn parameter";
                        Logger.e(e, str3, new Object[0]);
                        return jea.a(ErrorMessage.UNKNOWN_RESPONSE_TYPE_ERROR, str3, queryParameter);
                    }
                }
            }
            return new e(ErrorMessage.ACCOUNTS_UNKNOWN_ERROR, uri.toString(), queryParameter);
        } else if ("access_denied".equals(queryParameter2)) {
            return jea.a(ErrorMessage.ACCOUNTS_USER_DENIED, null, queryParameter);
        } else {
            return jea.a(ErrorMessage.ACCOUNTS_SERVICE_ERROR, queryParameter2, queryParameter);
        }
    }
}
