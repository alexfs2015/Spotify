package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: fts reason: default package */
public final class fts {
    public static ftl a(Context context, CharSequence charSequence, CharSequence charSequence2) {
        ftu ftu = new ftu();
        ftu.a((CharSequence) fbp.a(charSequence));
        ftu.b((CharSequence) fbp.a(charSequence2));
        return new ftl(context, ftu);
    }

    public static ftl a(Context context, String str) {
        ftt ftt = new ftt();
        ftt.a((String) fbp.a(str));
        return new ftl(context, ftt);
    }

    public static ftl a(Context context, String str, String str2, SpotifyIconV2 spotifyIconV2) {
        fto fto = new fto();
        String str3 = (String) fbp.a(str);
        fto.c = str3;
        if (fto.a != null) {
            fto.a.setText(str3);
        }
        String str4 = (String) fbp.a(str2);
        fto.d = str4;
        if (fto.b != null) {
            fto.b.setText(str4);
        }
        fto.e = (SpotifyIconV2) fbp.a(spotifyIconV2);
        fto.b();
        return new ftl(context, fto);
    }
}
