package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;

/* renamed from: og reason: default package */
final class og implements of {
    static final of a = new og();

    og() {
    }

    public final void a(View view) {
        if (VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                ip.e(view, ((Float) tag).floatValue());
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public final void a(RecyclerView recyclerView, View view, float f, float f2, boolean z) {
        if (VERSION.SDK_INT >= 21 && z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(ip.o(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    float o = ip.o(childAt);
                    if (o > f3) {
                        f3 = o;
                    }
                }
            }
            ip.e(view, 1.0f + f3);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
