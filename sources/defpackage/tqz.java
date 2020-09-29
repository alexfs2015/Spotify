package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: tqz reason: default package */
public abstract class tqz {

    /* renamed from: tqz$a */
    static final class a {
        static tqz a(Resources resources) {
            return a(resources, R.dimen.episode_card_size_percentage_large, R.dimen.episode_card_max_width_large, R.dimen.episode_card_placeholder_size_large, 2132017675, R.color.white, 0, R.dimen.episode_card_text_offset_large, R.dimen.episode_card_title_top_margin_large);
        }

        static tqz b(Resources resources) {
            return a(resources, R.dimen.episode_card_size_percentage_medium, R.dimen.episode_card_max_width_medium, R.dimen.episode_card_placeholder_size_medium, 2132017666, R.color.white, 0, R.dimen.episode_card_text_offset_large, R.dimen.episode_card_title_top_margin_medium);
        }

        static tqz c(Resources resources) {
            return a(resources, R.dimen.episode_card_size_percentage_small, R.dimen.episode_card_max_width_small, R.dimen.episode_card_placeholder_size_small, 2132017674, R.color.gray_70, 8, R.dimen.episode_card_text_offset_small, R.dimen.episode_card_title_top_margin_small);
        }

        private static tqy a(Resources resources, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Resources resources2 = resources;
            int a = tqo.a(resources, i, i2);
            tqy tqy = new tqy(a, b(resources, a), a(resources, a), i3, i4, i5, i6, resources.getDimensionPixelSize(i7), resources.getDimensionPixelSize(i8));
            return tqy;
        }

        private static int a(Resources resources, int i) {
            return (int) (((float) i) * tqo.a(resources, R.dimen.episode_card_podcast_art_percentage));
        }

        private static int b(Resources resources, int i) {
            return (int) (((float) i) * tqo.a(resources, R.dimen.episode_card_description_percentage));
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public static tqz a(Resources resources, int i) {
        if (i == 1) {
            return a.b(resources);
        }
        if (i != 2) {
            return a.c(resources);
        }
        return a.a(resources);
    }
}
