package defpackage;

import android.net.Uri;

/* renamed from: mbx reason: default package */
final class mbx {
    private final String a;

    mbx(String str) {
        this.a = str;
    }

    /* access modifiers changed from: 0000 */
    public final Uri a(Uri uri) {
        return uri.buildUpon().appendQueryParameter("app_version", this.a).build();
    }
}
