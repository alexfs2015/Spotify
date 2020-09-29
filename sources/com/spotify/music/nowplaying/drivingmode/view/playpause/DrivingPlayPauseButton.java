package com.spotify.music.nowplaying.drivingmode.view.playpause;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;

public final class DrivingPlayPauseButton extends AppCompatImageButton implements vdc, vdr {
    private a a;

    public DrivingPlayPauseButton(Context context) {
        super(context);
        g();
    }

    public DrivingPlayPauseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public DrivingPlayPauseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void g() {
        setContentDescription(getResources().getString(R.string.player_content_description_play));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                DrivingPlayPauseButton.this.a(view);
            }
        });
        setLayerType(1, null);
    }

    public final void a(int i) {
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    public final void e() {
        setActivated(false);
        setContentDescription(getResources().getString(R.string.player_content_description_play));
    }

    public final void f() {
        setActivated(true);
        setContentDescription(getResources().getString(R.string.player_content_description_pause));
    }
}
