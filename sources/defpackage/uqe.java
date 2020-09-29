package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: uqe reason: default package */
public final class uqe {

    /* renamed from: uqe$a */
    public interface a {
        void a();

        void a(b bVar);

        void b();
    }

    public static void a(fyt fyt, String str, a aVar) {
        Context a2 = fyt.a();
        fyy a3 = fyt.a((int) R.id.context_menu_sort, (CharSequence) str, a(a2, fr.c(a2, R.color.cat_grayscale_55)));
        aVar.getClass();
        a3.a(new $$Lambda$j7jurMpNH0adorMZhvPPfJ8zmkA(aVar));
    }

    public static void b(fyt fyt, String str, a aVar) {
        Context a2 = fyt.a();
        fyy a3 = fyt.a((int) R.id.context_menu_filter, (CharSequence) str, fzf.a(a2, SpotifyIconV2.SEARCH, fr.c(a2, R.color.cat_grayscale_55)));
        aVar.getClass();
        a3.a(new $$Lambda$MhKHkIoIVyeElkiS_DKgt4BWo(aVar));
    }

    public static void a(fyt fyt, b bVar, a aVar) {
        Context a2 = fyt.a();
        fyt.a((int) R.id.context_menu_filter, (CharSequence) bVar.c(), fzf.a(a2, bVar.d(), fr.c(a2, bVar.b() ? R.color.green : R.color.cat_grayscale_55))).a(new $$Lambda$uqe$MFHB2CtFKQDICDyAxYElrYx1o(aVar, bVar));
    }

    private static Drawable a(Context context, int i) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.context_menu_icon_size);
        float f = ((float) dimensionPixelSize) / 2.0f;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.ARROW_DOWN, f);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, SpotifyIconV2.ARROW_UP, f);
        spotifyIconDrawable.a(i);
        spotifyIconDrawable2.a(i);
        int i2 = dimensionPixelSize / 6;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{spotifyIconDrawable, spotifyIconDrawable2});
        int i3 = i2 << 1;
        LayerDrawable layerDrawable2 = layerDrawable;
        layerDrawable2.setLayerInset(0, i2, i3, i2 * 2, 0);
        layerDrawable2.setLayerInset(1, i3, 0, i2, i3);
        return layerDrawable;
    }
}
