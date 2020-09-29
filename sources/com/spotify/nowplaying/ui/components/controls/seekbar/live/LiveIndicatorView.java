package com.spotify.nowplaying.ui.components.controls.seekbar.live;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.music.R;

public class LiveIndicatorView extends AppCompatTextView implements usz {
    public LiveIndicatorView(Context context) {
        this(context, null);
    }

    public LiveIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pasteTextAppearanceSecondary);
    }

    public LiveIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fzv.a(this, context, attributeSet, i);
    }

    public final void a(boolean z) {
        setVisibility(z ? 0 : 8);
    }
}
