package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import com.spotify.music.R;

/* renamed from: now reason: default package */
public interface now {

    /* renamed from: now$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int a(Context context, DisplayMetrics displayMetrics, int i) {
            return Math.round(((float) ((displayMetrics.widthPixels - (((i + 1) * context.getResources().getDimensionPixelSize(R.dimen.grid_item_spacing_half)) << 1)) / i)) / 2.0f);
        }
    }
}
