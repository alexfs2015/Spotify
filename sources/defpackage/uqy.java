package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: uqy reason: default package */
public final class uqy {
    private final Resources a;

    public uqy(Resources resources) {
        this.a = (Resources) fbp.a(resources);
    }

    private a b(int i, int i2) {
        return uzy.a(this.a.getString(i), i2).c(R.color.white).b(R.color.black);
    }

    public final uzy a(int i, int i2) {
        return b(i, 3000).a();
    }
}
