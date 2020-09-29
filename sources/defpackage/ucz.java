package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: ucz reason: default package */
public abstract class ucz {

    /* renamed from: ucz$a */
    static final class a {
        static ucz a(Resources resources) {
            return ucz.a(resources, R.dimen.discovery_card_size_percentage_large, R.dimen.discovery_card_max_width_large);
        }

        static ucz b(Resources resources) {
            return ucz.a(resources, R.dimen.discovery_card_size_percentage_medium, R.dimen.discovery_card_max_width_medium);
        }
    }

    static /* synthetic */ ucy a(Resources resources, int i, int i2) {
        return new ucy(ucr.a(resources, i, i2));
    }

    public static ucz a(Resources resources, int i) {
        return i != 2 ? a.b(resources) : a.a(resources);
    }

    public abstract int a();
}
