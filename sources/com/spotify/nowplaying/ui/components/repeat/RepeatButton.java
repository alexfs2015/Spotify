package com.spotify.nowplaying.ui.components.repeat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;
import com.spotify.nowplaying.core.repeat.RepeatState;

public class RepeatButton extends AppCompatImageButton implements uth {
    private a a;

    public RepeatButton(Context context) {
        this(context, null);
    }

    public RepeatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RepeatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(uti.a(RepeatState.NONE, getContext()));
        setScaleType(ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(R.string.player_content_description_repeat));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                RepeatButton.this.a(view);
            }
        });
    }

    public final void a(RepeatState repeatState) {
        setImageDrawable(uti.a(repeatState, getContext()));
    }

    public final void a(boolean z) {
        setEnabled(z);
    }

    public final void a(a aVar) {
        this.a = (a) fay.a(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
