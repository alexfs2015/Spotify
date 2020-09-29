package defpackage;

import android.content.Context;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;

/* renamed from: inr reason: default package */
public final class inr {
    private static final Uri b;
    private static final Uri c;
    private final Context a;

    static {
        Uri parse = Uri.parse("content://com.samsung.android.app.spage.provider");
        b = parse;
        c = Uri.withAppendedPath(parse, "card");
    }

    public inr(Context context) {
        this.a = context;
    }

    public final void a(foy foy) {
        try {
            this.a.getContentResolver().update(c, foy.a, null, null);
        } catch (IllegalArgumentException | SecurityException e) {
            Logger.e(e, e.getLocalizedMessage(), new Object[0]);
        }
    }
}
