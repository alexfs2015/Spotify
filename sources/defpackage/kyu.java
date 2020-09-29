package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: kyu reason: default package */
public final class kyu {
    public static fuj a(Context context, String str) {
        fqb.f();
        fuj a = fum.a(context, null);
        a(context, a, str);
        return a;
    }

    public static void a(Context context, fuj fuj, String str) {
        fuj.a().a(fzg.l(context));
        fuj.a((CharSequence) context.getString(R.string.error_no_connection_title));
        fuj.b((CharSequence) str);
    }
}
