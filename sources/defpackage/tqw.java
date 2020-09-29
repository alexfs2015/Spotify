package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: tqw reason: default package */
public abstract class tqw {

    /* renamed from: tqw$a */
    static final class a {
        static tqw a(Resources resources) {
            return tqw.a(resources, R.dimen.discovery_card_size_percentage_large, R.dimen.discovery_card_max_width_large);
        }

        static tqw b(Resources resources) {
            return tqw.a(resources, R.dimen.discovery_card_size_percentage_medium, R.dimen.discovery_card_max_width_medium);
        }
    }

    public abstract int a();

    public static tqw a(Resources resources, int i) {
        if (i != 2) {
            return a.b(resources);
        }
        return a.a(resources);
    }

    static /* synthetic */ tqv a(Resources resources, int i, int i2) {
        return new tqv(tqo.a(resources, i, i2));
    }
}
