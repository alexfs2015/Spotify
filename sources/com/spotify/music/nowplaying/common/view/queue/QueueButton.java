package com.spotify.music.nowplaying.common.view.queue;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;

public class QueueButton extends AppCompatImageView implements tlc {
    private a a;

    public QueueButton(Context context) {
        this(context, null);
    }

    public QueueButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QueueButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(vdd.o(getContext()));
        setBackgroundColor(0);
        setScaleType(ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(R.string.context_menu_go_to_queue));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                QueueButton.this.a(view);
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
        Context context = getContext();
        setImageDrawable(z ? vdd.o(context) : vdd.b((Context) fbp.a(context), SpotifyIcon.QUEUE_24, vfj.b(24.0f, context.getResources())));
        setEnabled(z);
    }
}
