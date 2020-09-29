package com.spotify.music.features.queue.playcontrols;

import android.content.Context;
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

public class QueuePlayerControlsView extends FrameLayout implements pvo {
    public ConnectView a;
    public jut<ProgressBar> b;
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

    public final void a(long j) {
        this.f.setMax((int) j);
        this.f.refreshDrawableState();
    }

    public final void a(long j, long j2, float f2) {
        this.b.b(j, j2, f2);
    }

    public final void a(pvm pvm) {
        this.c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                pvm.this.a();
            }
        });
        this.d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                pvm.this.b();
            }
        });
        this.e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                pvm.this.c();
            }
        });
    }

    public final void a(boolean z) {
        vgr vgr;
        int i;
        if (z) {
            vgr = vdd.a((Context) fbp.a(getContext()), 60, 1, 0.6f);
            i = R.string.player_content_description_play;
        } else {
            vgr = vdd.b((Context) fbp.a(getContext()), 60, 1, 0.6f);
            i = R.string.player_content_description_pause;
        }
        this.d.setImageDrawable(vgr);
        this.d.setContentDescription(getContext().getString(i));
    }

    public final void b(boolean z) {
        this.d.setEnabled(z);
    }

    public final void c(boolean z) {
        this.c.setImageDrawable(z ? vdd.d(getContext()) : vdd.e(getContext()));
        this.c.setEnabled(z);
        this.c.setVisibility(0);
    }

    public final void d(boolean z) {
        this.e.setImageDrawable(z ? vdd.f(getContext()) : vdd.g(getContext()));
        this.e.setEnabled(z);
        this.e.setVisibility(0);
    }

    public final void e(boolean z) {
        this.f.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ImageButton) findViewById(R.id.btn_prev);
        this.d = (ImageButton) findViewById(R.id.btn_play);
        this.e = (ImageButton) findViewById(R.id.btn_next);
        this.f = (ProgressBar) findViewById(R.id.seek_bar);
        this.a = (ConnectView) findViewById(R.id.connect_view_root);
        this.b = new jut<>(this.f, Optional.e());
    }
}
