package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;
import java.lang.ref.WeakReference;

/* renamed from: tbc reason: default package */
public final class tbc extends jsn {
    public final WeakReference<Resources> a;

    public tbc(Resources resources) {
        super(resources);
        this.a = new WeakReference<>(fay.a(resources));
    }

    public final String a(String str) {
        return a(R.string.share_by_artist, str);
    }
}
