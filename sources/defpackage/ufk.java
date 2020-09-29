package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.spotify.music.R;

/* renamed from: ufk reason: default package */
public final class ufk {
    public final Context a;
    private final tyx b;
    private final ugg c;

    public ufk(Context context, tyx tyx, ugg ugg) {
        this.a = context;
        this.b = tyx;
        this.c = ugg;
    }

    public static void a(uhf uhf, Integer num, int i) {
        if (num == null || num.intValue() == i) {
            uhf.f();
            return;
        }
        uhf.a(i);
        uhf.b(i - num.intValue());
        uhf.e();
    }

    public static void a(uhf uhf, String str) {
        if (TextUtils.isEmpty(str)) {
            uhf.h();
            return;
        }
        uhf.a(uiq.a(str));
        uhf.g();
    }

    public final void b(uhf uhf, String str) {
        ugg ugg = this.c;
        ImageView c2 = uhf.c();
        int dimensionPixelOffset = ugg.a.getResources().getDimensionPixelOffset(R.dimen.quickactions_episode_entity_row_image_size);
        float dimension = ugg.a.getResources().getDimension(R.dimen.quickactions_episode_entity_row_improved_icon_radius);
        Drawable c3 = gaa.c(ugg.a);
        c2.setScaleType(ScaleType.FIT_CENTER);
        ugg.b.d(c2);
        ugg.b.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(c3).b(c3).b(dimensionPixelOffset, dimensionPixelOffset).a((Object) ugg.c).a(vhj.a(c2, vgt.a(dimension)));
    }
}
