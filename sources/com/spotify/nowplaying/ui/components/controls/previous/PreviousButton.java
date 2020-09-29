package com.spotify.nowplaying.ui.components.controls.previous;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;

public final class PreviousButton extends AppCompatImageButton implements vdu {
    private a a;

    public PreviousButton(Context context) {
        this(context, null);
    }

    public PreviousButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviousButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundDrawable(null);
        setImageDrawable(vdd.d(getContext()));
        setScaleType(ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(R.string.player_content_description_prev));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                PreviousButton.this.a(view);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void a(a aVar) {
        this.a = (a) fbp.a(aVar);
    }

    public final void a(boolean z) {
        setImageDrawable(z ? vdd.d(getContext()) : vdd.e(getContext()));
        setEnabled(z);
    }
}
