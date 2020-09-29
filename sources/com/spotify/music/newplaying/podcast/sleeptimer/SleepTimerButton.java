package com.spotify.music.newplaying.podcast.sleeptimer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;

public class SleepTimerButton extends AppCompatImageButton implements tbx {
    private a a;

    public SleepTimerButton(Context context) {
        this(context, null);
    }

    public SleepTimerButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SleepTimerButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(vdd.p(getContext()));
        setScaleType(ScaleType.CENTER_CROP);
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                SleepTimerButton.this.a(view);
            }
        });
        setContentDescription(getResources().getString(R.string.player_content_description_sleep_timer));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    public final void a(boolean z) {
        if (z) {
            Context context = getContext();
            setImageDrawable(vdd.a(context, vdd.a((Context) fbp.a(context), SpotifyIcon.SLEEPTIMER_32, vdd.s(context), (int) R.color.cat_medium_green, (int) R.color.cat_light_green)));
            return;
        }
        setImageDrawable(vdd.p(getContext()));
    }
}
