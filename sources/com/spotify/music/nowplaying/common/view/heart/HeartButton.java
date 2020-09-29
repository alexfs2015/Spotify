package com.spotify.music.nowplaying.common.view.heart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;

public class HeartButton extends AppCompatImageButton implements szy {
    private a a;

    public HeartButton(Context context) {
        this(context, null);
    }

    public HeartButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeartButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(ury.q(getContext()));
        setScaleType(ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(R.string.player_content_description_like));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                HeartButton.this.a(view);
            }
        });
    }

    public final void a(boolean z) {
        setActivated(z);
        setContentDescription(getResources().getString(z ? R.string.player_content_description_unlike : R.string.player_content_description_like));
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
