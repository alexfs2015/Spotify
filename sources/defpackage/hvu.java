package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: hvu reason: default package */
public final class hvu {
    public static Intent a(String str, String str2) {
        String p = jst.a(str).p();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(p));
        intent.putExtra("com.spotify.music.intent.extra.EXTRA_SPOTIFY_INTERNAL_REFERRER_NAME", str2);
        return intent;
    }
}
