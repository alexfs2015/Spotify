package defpackage;

import android.net.Uri;

/* renamed from: mga reason: default package */
final class mga {
    private final String a;

    mga(String str) {
        this.a = str;
    }

    /* access modifiers changed from: 0000 */
    public final Uri a(Uri uri) {
        return uri.buildUpon().appendQueryParameter("app_version", this.a).build();
    }
}
