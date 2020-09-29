package com.spotify.mobile.android.video;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.music.R;

public class SubtitlesView extends AppCompatTextView {
    public SubtitlesView(Context context) {
        super(context);
    }

    public SubtitlesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTypeface(utw.c(context, R.attr.glueFontRegular));
    }

    public SubtitlesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setTypeface(utw.a(context, attributeSet, i));
    }

    public final void c() {
        setText("");
        setVisibility(4);
    }
}
