package defpackage;

import android.net.Uri;

/* renamed from: mgu reason: default package */
public final class mgu implements mgr {
    public final boolean a(Uri uri) {
        String path = uri.getPath();
        return path.contains("account/csi/end/") || path.contains("retailer/sony/response/success") || path.contains("/mobile/close/");
    }
}