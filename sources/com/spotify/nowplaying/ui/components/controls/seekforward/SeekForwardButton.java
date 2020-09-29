package com.spotify.nowplaying.ui.components.controls.seekforward;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

public final class SeekForwardButton extends AppCompatImageButton implements veh {
    private a a;

    public SeekForwardButton(Context context) {
        this(context, null);
    }

    public SeekForwardButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SeekForwardButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundDrawable(null);
        setImageDrawable(vdd.a((Context) fbp.a(getContext()), SpotifyIconV2.SKIPFORWARD15));
        setScaleType(ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(R.string.player_content_description_skip_forward_15));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                SeekForwardButton.this.a(view);
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
        setEnabled(z);
    }
}
