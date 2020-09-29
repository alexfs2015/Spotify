package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.spotify.music.R;

/* renamed from: vhr reason: default package */
public final class vhr implements vhs {
    private final int a;

    public vhr(Context context) {
        this.a = (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
    }

    private void a(View view, float f, boolean z) {
        float measuredWidth = 1.0f - ((((float) (this.a * 2)) / ((float) view.getMeasuredWidth())) * f);
        view.setScaleX(measuredWidth);
        view.setScaleY(measuredWidth);
        float max = z ? Math.max(0.0f, 1.0f - f) : Math.max(0.6f, 1.0f - (f * 0.4f));
        a aVar = (a) view.getTag(R.id.paste_carousel_animation_info);
        if (aVar == null) {
            view.setAlpha(max);
        } else {
            aVar.a = max;
        }
    }

    public final int a() {
        return this.a;
    }

    public final void a(View view, float f) {
        a(view, f, false);
    }

    public final int b() {
        return this.a;
    }

    public final void b(View view, float f) {
        a(view, f, false);
    }
}
