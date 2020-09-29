package com.spotify.mobile.android.spotlets.creatorartist.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.music.R;

public class PageIndicator extends AppCompatTextView implements e {
    public PageIndicator(Context context) {
        super(context);
        c();
    }

    public PageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    private void c() {
        setTextColor(fr.c(getContext(), R.color.cat_grayscale_70));
        Typeface a = vfn.a(getContext(), null, 16842884);
        if (a != null) {
            setTypeface(a);
        }
    }

    private void d() {
        int b = ((sf) fbp.a(null.b)).b();
        if (b > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(null.c + 1);
            sb.append(" / ");
            sb.append(b);
            setText(sb.toString());
            return;
        }
        String str = "";
        setText("");
    }

    public final void a(int i) {
        d();
    }

    public final void a(int i, float f, int i2) {
    }

    public final void b(int i) {
        d();
    }
}
