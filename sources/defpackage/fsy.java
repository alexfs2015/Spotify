package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: fsy reason: default package */
public final class fsy {
    public static fsr a(Context context, CharSequence charSequence, CharSequence charSequence2) {
        fta fta = new fta();
        fta.a((CharSequence) fay.a(charSequence));
        fta.b((CharSequence) fay.a(charSequence2));
        return new fsr(context, fta);
    }

    public static fsr a(Context context, String str) {
        fsz fsz = new fsz();
        fsz.a((String) fay.a(str));
        return new fsr(context, fsz);
    }

    public static fsr a(Context context, String str, String str2, SpotifyIconV2 spotifyIconV2) {
        fsu fsu = new fsu();
        String str3 = (String) fay.a(str);
        fsu.c = str3;
        if (fsu.a != null) {
            fsu.a.setText(str3);
        }
        String str4 = (String) fay.a(str2);
        fsu.d = str4;
        if (fsu.b != null) {
            fsu.b.setText(str4);
        }
        fsu.e = (SpotifyIconV2) fay.a(spotifyIconV2);
        fsu.b();
        return new fsr(context, fsu);
    }
}
