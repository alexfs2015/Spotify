package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: lrv reason: default package */
public final class lrv {
    private final Context a;

    public lrv(Context context) {
        this.a = context;
    }

    public final String a() {
        return this.a.getString(R.string.assisted_curation_title_add_songs);
    }
}
