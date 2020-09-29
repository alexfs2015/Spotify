package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.R;

public class HubsCarouselView extends RecyclerView {
    private final gyl L;

    public HubsCarouselView(Context context) {
        this(context, null);
    }

    public HubsCarouselView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HubsCarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.L = new gyl(getResources());
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = MeasureSpec.getSize(i);
        a c = c();
        if (size > 0 && c != null && c.b() > 0) {
            gyl gyl = this.L;
            int a = c.a(0);
            float f = 1.0f;
            if (a == R.id.hub_glue_card_title || a == R.id.hub_glue_card_title_metadata || a == R.id.hub_glue_card_title_subtitle || a == R.id.hub_glue2_regular_card_title || a == R.id.hub_glue2_regular_card_title_metadata || a == R.id.hub_glue2_regular_card_title_subtitle) {
                int i5 = gyl.a;
                int i6 = gyl.b;
                i3 = i5;
                int i7 = i6;
                i4 = i6;
            } else {
                if (a == R.id.hub_glue_card_category || a == R.id.hub_glue2_card_category) {
                    i4 = gyl.e;
                    float f2 = gyl.f;
                    float f3 = f2;
                    f = f2;
                } else {
                    if (a == R.id.hub_glue_card_no_text) {
                        i4 = gyl.c;
                    } else {
                        i2 = MeasureSpec.makeMeasureSpec(0, 0);
                    }
                }
                i3 = 0;
            }
            int i8 = (size / ((int) (((float) i4) * f))) + 1;
            int i9 = i4 + i3;
            int i10 = gyl.d;
            int i11 = i8;
            int i12 = i8;
            int i13 = i9;
            int i14 = i9;
            int i15 = i10;
            i2 = MeasureSpec.makeMeasureSpec(vgb.a(size, i12, i14, i3, i10, f), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
