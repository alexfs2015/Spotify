package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: uem reason: default package */
public final class uem {
    private final Resources a;

    public uem(Resources resources) {
        this.a = (Resources) fay.a(resources);
    }

    public final uos a(int i, int i2) {
        return b(i, 3000).a();
    }

    private a b(int i, int i2) {
        return uos.a(this.a.getString(i), i2).c(R.color.white).b(R.color.black);
    }
}
