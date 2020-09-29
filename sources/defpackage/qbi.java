package defpackage;

import android.util.Base64;
import java.nio.charset.Charset;

/* renamed from: qbi reason: default package */
public final class qbi {
    public static String a(String str) {
        return Base64.encodeToString(str.getBytes(Charset.forName("UTF-8")), 0);
    }
}
