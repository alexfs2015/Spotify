package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;
import java.lang.ref.WeakReference;

/* renamed from: tlj reason: default package */
public final class tlj extends juu {
    public final WeakReference<Resources> a;

    public tlj(Resources resources) {
        super(resources);
        this.a = new WeakReference<>(fbp.a(resources));
    }

    public final String a(String str) {
        return a(R.string.share_by_artist, str);
    }
}
