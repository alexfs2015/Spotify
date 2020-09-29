package defpackage;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: kpz reason: default package */
final class kpz implements Callable<ShortcutInfo> {
    private final kqc a;
    private final Context b;
    private final Picasso c;

    kpz(Context context, Picasso picasso, kqc kqc) {
        this.b = context;
        this.c = picasso;
        this.a = kqc;
    }

    private Bitmap a(Uri uri) {
        try {
            return this.c.a(uri).h();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Failed to load image for shortcut item, uri: ");
            sb.append(uri);
            Assertion.b(sb.toString(), (Throwable) e);
            return null;
        }
    }

    public final /* synthetic */ Object call() {
        IconCompat iconCompat;
        a a2 = new a(this.b, this.a.a()).a((CharSequence) this.a.b()).a(hvu.a(this.a.a(), "app_shortcut"));
        String c2 = this.a.c();
        Uri parse = !TextUtils.isEmpty(c2) ? Uri.parse(c2) : Uri.EMPTY;
        if (!parse.equals(Uri.EMPTY)) {
            Bitmap a3 = a(parse);
            if (a3 != null) {
                iconCompat = IconCompat.a(a3);
                return a2.a(iconCompat).a().a();
            }
            Logger.d("Failed to load image for app shortcut: %s", this.a);
        }
        iconCompat = IconCompat.a(this.b, (int) R.drawable.shortcut_icon_placeholder);
        return a2.a(iconCompat).a().a();
    }
}
