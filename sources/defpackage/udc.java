package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: udc reason: default package */
public abstract class udc {

    /* renamed from: udc$a */
    static final class a {
        private static int a(Resources resources, int i) {
            return (int) (((float) i) * ucr.a(resources, R.dimen.episode_card_podcast_art_percentage));
        }

        private static udb a(Resources resources, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Resources resources2 = resources;
            int a = ucr.a(resources, i, i2);
            int i9 = i3;
            udb udb = new udb(a, b(resources, a), a(resources, a), resources.getDimensionPixelSize(i3), i4, i5, i6, resources.getDimensionPixelSize(i7), resources.getDimensionPixelSize(i8));
            return udb;
        }

        static udc a(Resources resources) {
            return a(resources, R.dimen.episode_card_size_percentage_large, R.dimen.episode_card_max_width_large, R.dimen.episode_card_placeholder_size_large, 2132017678, R.color.white, 0, R.dimen.episode_card_text_offset_large, R.dimen.episode_card_title_top_margin_large);
        }

        private static int b(Resources resources, int i) {
            return (int) (((float) i) * ucr.a(resources, R.dimen.episode_card_description_percentage));
        }

        static udc b(Resources resources) {
            return a(resources, R.dimen.episode_card_size_percentage_medium, R.dimen.episode_card_max_width_medium, R.dimen.episode_card_placeholder_size_medium, 2132017669, R.color.white, 0, R.dimen.episode_card_text_offset_large, R.dimen.episode_card_title_top_margin_medium);
        }

        static udc c(Resources resources) {
            return a(resources, R.dimen.episode_card_size_percentage_small, R.dimen.episode_card_max_width_small, R.dimen.episode_card_placeholder_size_small, 2132017677, R.color.gray_70, 8, R.dimen.episode_card_text_offset_small, R.dimen.episode_card_title_top_margin_small);
        }
    }

    public static udc a(Resources resources, int i) {
        return i != 1 ? i != 2 ? a.c(resources) : a.a(resources) : a.b(resources);
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
}
