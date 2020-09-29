package defpackage;

import android.net.Uri;
import com.facebook.login.LoginClient.c;
import java.util.Collection;

/* renamed from: and reason: default package */
public class and extends ank {
    private static volatile and e;
    public Uri a;

    public static and a() {
        if (e == null) {
            synchronized (and.class) {
                if (e == null) {
                    e = new and();
                }
            }
        }
        return e;
    }

    /* access modifiers changed from: protected */
    public final c a(Collection<String> collection) {
        c a2 = super.a(collection);
        Uri uri = this.a;
        if (uri != null) {
            a2.g = uri.toString();
        }
        return a2;
    }
}
