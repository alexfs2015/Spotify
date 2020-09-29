package com.spotify.music.nowplaying.videoads.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;

public final class PlayPauseButton extends AppCompatImageButton implements usm {
    private uva a;
    private uva b;
    private a c;

    public PlayPauseButton(Context context) {
        this(context, null);
    }

    public PlayPauseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayPauseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = ury.a(getContext(), 24, 0, 0.35f);
        this.b = ury.b(getContext(), 24, 0, 0.35f);
        setBackgroundDrawable(null);
        setImageDrawable(this.a);
        setScaleType(ScaleType.FIT_CENTER);
        setContentDescription(getResources().getString(R.string.player_content_description_play));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                PlayPauseButton.this.a(view);
            }
        });
    }

    public final void e() {
        setImageDrawable(this.a);
        setContentDescription(getResources().getString(R.string.player_content_description_play));
    }

    public final void f() {
        setImageDrawable(this.b);
        setContentDescription(getResources().getString(R.string.player_content_description_pause));
    }

    public final void a(a aVar) {
        this.c = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
    }
}
