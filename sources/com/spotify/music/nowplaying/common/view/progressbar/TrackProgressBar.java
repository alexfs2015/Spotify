package com.spotify.music.nowplaying.common.view.progressbar;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class TrackProgressBar extends ProgressBar implements tla, vdc {
    public TrackProgressBar(Context context) {
        this(context, null);
    }

    public TrackProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842872);
    }

    public TrackProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPadding(0, 0, 0, 0);
    }

    public final void a(int i) {
        getProgressDrawable().setColorFilter(i, Mode.SRC_IN);
    }

    public final void b(int i) {
        setProgress(i);
    }

    public final void c(int i) {
        setMax(i);
    }
}
