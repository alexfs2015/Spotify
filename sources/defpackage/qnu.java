package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: qnu reason: default package */
public final class qnu {
    public static fvd a(Context context, boolean z) {
        int i = z ? R.string.placeholder_collection_empty_show_body_video : R.string.placeholder_collection_empty_show_body;
        fvd a = jsu.a(context, 0, i);
        a.a(false);
        a.b().setVisibility(8);
        a.b((CharSequence) context.getString(i));
        return a;
    }
}
