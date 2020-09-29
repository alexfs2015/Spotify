package defpackage;

import android.view.View;
import com.spotify.music.R;

/* renamed from: ivk reason: default package */
public final class ivk implements uwc {
    public final int a() {
        return 0;
    }

    public final int b() {
        return 0;
    }

    private static void c(View view, float f) {
        float max = Math.max(0.0f, 1.0f - (f * 2.0f));
        a aVar = (a) view.getTag(R.id.paste_carousel_animation_info);
        if (aVar == null) {
            view.setAlpha(max);
        } else {
            aVar.a = max;
        }
    }

    public final void a(View view, float f) {
        c(view, f);
    }

    public final void b(View view, float f) {
        c(view, f);
    }
}
