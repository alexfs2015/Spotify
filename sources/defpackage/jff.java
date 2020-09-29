package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.sso.ErrorMessage;
import java.net.HttpCookie;

/* renamed from: jff reason: default package */
public interface jff {
    void a(ErrorMessage errorMessage, int i, String str);

    void a(ErrorMessage errorMessage, String str);

    void a(ErrorMessage errorMessage, String str, String str2);

    void a(String str);

    void a(HttpCookie httpCookie, Uri uri, String str);

    void k();
}
