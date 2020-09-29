package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

/* renamed from: gcd reason: default package */
public final class gcd {
    public static Uri a(Context context, int i) {
        Resources resources = context.getResources();
        StringBuilder sb = new StringBuilder("android.resource://");
        sb.append(context.getPackageName());
        sb.append('/');
        sb.append(resources.getResourceTypeName(i));
        sb.append('/');
        sb.append(resources.getResourceEntryName(i));
        return Uri.parse(sb.toString());
    }
}
