package defpackage;

import android.net.Uri;

/* renamed from: elt reason: default package */
public final class elt {
    public static Uri a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        String str2 = "content://com.google.android.gms.phenotype/";
        return Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
