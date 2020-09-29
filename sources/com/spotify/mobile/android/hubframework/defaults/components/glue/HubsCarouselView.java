package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.R;

public class HubsCarouselView extends RecyclerView {
    private final gwj M;

    public HubsCarouselView(Context context) {
        this(context, null);
    }

    public HubsCarouselView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HubsCarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.M = new gwj(getResources());
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = MeasureSpec.getSize(i);
        a c = c();
        if (size > 0 && c != null && c.b() > 0) {
            gwj gwj = this.M;
            int a = c.a(0);
            float f = 1.0f;
            if (a == R.id.hub_glue_card_title || a == R.id.hub_glue_card_title_metadata || a == R.id.hub_glue_card_title_subtitle || a == R.id.hub_glue2_regular_card_title || a == R.id.hub_glue2_regular_card_title_metadata || a == R.id.hub_glue2_regular_card_title_subtitle) {
                i3 = gwj.a;
                i4 = gwj.b;
            } else {
                if (a == R.id.hub_glue_card_category || a == R.id.hub_glue2_card_category) {
                    i4 = gwj.e;
                    f = gwj.f;
                } else {
                    if (a == R.id.hub_glue_card_no_text) {
                        i4 = gwj.c;
                    } else {
                        i2 = MeasureSpec.makeMeasureSpec(0, 0);
                    }
                }
                i3 = 0;
            }
            i2 = MeasureSpec.makeMeasureSpec(uuk.a(size, (size / ((int) (((float) i4) * f))) + 1, i4 + i3, i3, gwj.d, f), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
