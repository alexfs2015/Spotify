package defpackage;

import android.net.Uri;
import com.facebook.login.LoginClient.c;
import java.util.Collection;

/* renamed from: anr reason: default package */
public class anr extends any {
    private static volatile anr e;
    public Uri a;

    public static anr a() {
        if (e == null) {
            synchronized (anr.class) {
                if (e == null) {
                    e = new anr();
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
