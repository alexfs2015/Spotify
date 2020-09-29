package com.spotify.music.nowplaying.common.view.queue;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;

public class QueueButton extends AppCompatImageView implements tav {
    private a a;

    public QueueButton(Context context) {
        this(context, null);
    }

    public QueueButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QueueButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(ury.o(getContext()));
        setBackgroundColor(0);
        setScaleType(ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(R.string.context_menu_go_to_queue));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                QueueButton.this.a(view);
            }
        });
    }

    public final void a(boolean z) {
        Drawable drawable;
        Context context = getContext();
        if (z) {
            drawable = ury.o(context);
        } else {
            drawable = ury.b((Context) fay.a(context), SpotifyIcon.QUEUE_24, uts.b(24.0f, context.getResources()));
        }
        setImageDrawable(drawable);
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
