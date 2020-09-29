package com.spotify.music.features.queue.playcontrols;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import com.google.common.base.Optional;
import com.spotify.mobile.android.connect.view.ConnectView;
import com.spotify.music.R;

public class QueuePlayerControlsView extends FrameLayout implements pms {
    public ConnectView a;
    public jsm<ProgressBar> b;
    private ImageButton c;
    private ImageButton d;
    private ImageButton e;
    private ProgressBar f;

    public QueuePlayerControlsView(Context context) {
        this(context, null, 0);
    }

    public QueuePlayerControlsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QueuePlayerControlsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.play_queue_controls, this, true);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ImageButton) findViewById(R.id.btn_prev);
        this.d = (ImageButton) findViewById(R.id.btn_play);
        this.e = (ImageButton) findViewById(R.id.btn_next);
        this.f = (ProgressBar) findViewById(R.id.seek_bar);
        this.a = (ConnectView) findViewById(R.id.connect_view_root);
        this.b = new jsm<>(this.f, Optional.e());
    }

    public final void a(boolean z) {
        uva uva;
        int i;
        if (z) {
            uva = ury.a((Context) fay.a(getContext()), 60, 1, 0.6f);
            i = R.string.player_content_description_play;
        } else {
            uva = ury.b((Context) fay.a(getContext()), 60, 1, 0.6f);
            i = R.string.player_content_description_pause;
        }
        this.d.setImageDrawable(uva);
        this.d.setContentDescription(getContext().getString(i));
    }

    public final void b(boolean z) {
        this.d.setEnabled(z);
    }

    public final void c(boolean z) {
        Drawable drawable;
        if (z) {
            drawable = ury.d(getContext());
        } else {
            drawable = ury.e(getContext());
        }
        this.c.setImageDrawable(drawable);
        this.c.setEnabled(z);
        this.c.setVisibility(0);
    }

    public final void d(boolean z) {
        Drawable drawable;
        if (z) {
            drawable = ury.f(getContext());
        } else {
            drawable = ury.g(getContext());
        }
        this.e.setImageDrawable(drawable);
        this.e.setEnabled(z);
        this.e.setVisibility(0);
    }

    public final void e(boolean z) {
        this.f.setEnabled(z);
    }

    public final void a(long j, long j2, float f2) {
        this.b.b(j, j2, f2);
    }

    public final void a(long j) {
        this.f.setMax((int) j);
        this.f.refreshDrawableState();
    }

    public final void a(pmq pmq) {
        this.c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                pmq.this.a();
            }
        });
        this.d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                pmq.this.b();
            }
        });
        this.e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                pmq.this.c();
            }
        });
    }
}
