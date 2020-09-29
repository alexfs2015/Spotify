package defpackage;

import android.net.Uri;

/* renamed from: qht reason: default package */
public final class qht {
    private static final Uri a = Uri.parse("hm://nftonboarding/v1/complete/artist");

    public static String a() {
        return a.buildUpon().toString();
    }
}
