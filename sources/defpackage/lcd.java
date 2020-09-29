package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: lcd reason: default package */
public final class lcd {
    public static fvd a(Context context, String str) {
        fqv.f();
        fvd a = fvg.a(context, null);
        a(context, a, str);
        return a;
    }

    public static void a(Context context, fvd fvd, String str) {
        fvd.a().a(gaa.l(context));
        fvd.a((CharSequence) context.getString(R.string.error_no_connection_title));
        fvd.b((CharSequence) str);
    }
}
