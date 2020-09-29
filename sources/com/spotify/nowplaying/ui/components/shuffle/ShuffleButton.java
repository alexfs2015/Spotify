package com.spotify.nowplaying.ui.components.shuffle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;
import com.spotify.nowplaying.core.shuffle.ShuffleState;

public final class ShuffleButton extends AppCompatImageButton implements utm {
    private a a;

    public ShuffleButton(Context context) {
        this(context, null);
    }

    public ShuffleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShuffleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(utn.a(ShuffleState.NORMAL, getContext()));
        setScaleType(ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(R.string.player_content_description_shuffle));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ShuffleButton.this.a(view);
            }
        });
    }

    public final void a(ShuffleState shuffleState) {
        setImageDrawable(utn.a(shuffleState, getContext()));
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
