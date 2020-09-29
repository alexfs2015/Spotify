package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: svp reason: default package */
public final class svp {
    public static Uri a(String str) {
        return Uri.parse("https://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", str).build();
    }

    public static void a(Context context, Uri uri) {
        a(context, new Intent("android.intent.action.VIEW").setData(uri).setFlags(268435456));
    }

    public static boolean a(Context context, Intent intent) {
        if (!b(context, intent)) {
            return false;
        }
        intent.setFlags(268435456);
        context.startActivity(intent);
        return true;
    }

    public static boolean b(Context context, Intent intent) {
        return (intent == null || intent.resolveActivity(context.getPackageManager()) == null) ? false : true;
    }
}
