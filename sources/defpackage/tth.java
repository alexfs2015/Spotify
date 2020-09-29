package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.spotify.music.R;

/* renamed from: tth reason: default package */
public final class tth {
    public final Context a;
    private final tmy b;
    private final tud c;

    public tth(Context context, tmy tmy, tud tud) {
        this.a = context;
        this.b = tmy;
        this.c = tud;
    }

    public static void a(tvc tvc, Integer num, int i) {
        if (num == null || num.intValue() == i) {
            tvc.f();
            return;
        }
        tvc.a(i);
        tvc.b(i - num.intValue());
        tvc.e();
    }

    public static void a(tvc tvc, String str) {
        if (TextUtils.isEmpty(str)) {
            tvc.h();
            return;
        }
        tvc.a(twn.a(str));
        tvc.g();
    }

    public final void b(tvc tvc, String str) {
        tud tud = this.c;
        ImageView c2 = tvc.c();
        int dimensionPixelOffset = tud.a.getResources().getDimensionPixelOffset(R.dimen.quickactions_episode_entity_row_image_size);
        float dimension = tud.a.getResources().getDimension(R.dimen.quickactions_episode_entity_row_improved_icon_radius);
        Drawable c3 = fzg.c(tud.a);
        c2.setScaleType(ScaleType.FIT_CENTER);
        tud.b.d(c2);
        tud.b.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(c3).b(c3).b(dimensionPixelOffset, dimensionPixelOffset).a((Object) tud.c).a(uvt.a(c2, uvc.a(dimension)));
    }
}
