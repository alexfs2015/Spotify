package defpackage;

import android.content.Context;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;

/* renamed from: ile reason: default package */
public final class ile {
    private static final Uri b;
    private static final Uri c;
    private final Context a;

    public ile(Context context) {
        this.a = context;
    }

    static {
        Uri parse = Uri.parse("content://com.samsung.android.app.spage.provider");
        b = parse;
        c = Uri.withAppendedPath(parse, "card");
    }

    public final void a(foe foe) {
        try {
            this.a.getContentResolver().update(c, foe.a, null, null);
        } catch (IllegalArgumentException | SecurityException e) {
            Logger.e(e, e.getLocalizedMessage(), new Object[0]);
        }
    }
}
