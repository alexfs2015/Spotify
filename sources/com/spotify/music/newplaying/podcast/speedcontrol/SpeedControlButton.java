package com.spotify.music.newplaying.podcast.speedcontrol;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.spotify.music.R;

public final class SpeedControlButton extends AppCompatButton implements srs {
    private a a;

    public SpeedControlButton(Context context) {
        this(context, null);
    }

    public SpeedControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpeedControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackground(null);
        jm.a((TextView) this, 2132017665);
        setTextColor(fr.b(getContext(), (int) R.color.bg_nowplaying_speed));
        setContentDescription(getResources().getString(R.string.player_content_description_speed_control));
        setFilterTouchesWhenObscured(false);
        setGravity(17);
        if (VERSION.SDK_INT >= 17) {
            setTextDirection(5);
        }
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                SpeedControlButton.this.a(view);
            }
        });
    }

    public final void a(String str) {
        setText(str);
    }

    public final void a(boolean z) {
        setActivated(z);
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
