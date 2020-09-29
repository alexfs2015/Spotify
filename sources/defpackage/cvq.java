package defpackage;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;

@cfp
/* renamed from: cvq reason: default package */
final class cvq {
    private static final String[] a = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] b = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    cvq() {
    }

    static void a(int i, String str) {
        String str2;
        if (i < 0) {
            int i2 = (-i) - 1;
            if (i2 < 15) {
                str2 = a[i2];
                a("http_err", str2, str);
            }
        }
        str2 = String.valueOf(i);
        a("http_err", str2, str);
    }

    static void a(SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            a("ssl_err", (primaryError < 0 || primaryError >= 6) ? String.valueOf(primaryError) : b[primaryError], sslError.getUrl());
        }
    }

    private static void a(String str, String str2, String str3) {
        String str4;
        if (((Boolean) dqe.f().a(dtg.bq)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                }
            }
            str4 = "";
            bundle.putString("host", str4);
        }
    }
}
