package com.spotify.mobile.android.video;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.music.R;

public class SubtitlesView extends AppCompatTextView {
    public SubtitlesView(Context context) {
        super(context);
    }

    public SubtitlesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTypeface(vfn.c(context, R.attr.glueFontRegular));
    }

    public SubtitlesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface a = vfn.a(context, attributeSet, i);
        if (a != null) {
            setTypeface(a);
        }
    }

    public final void c() {
        String str = "";
        setText("");
        setVisibility(4);
    }
}
