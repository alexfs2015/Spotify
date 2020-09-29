package com.spotify.nowplaying.ui.components.controls.seekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.CancellableSeekBar;
import com.spotify.mobile.android.ui.view.CancellableSeekBar.a;
import com.spotify.mobile.android.ui.view.SuppressLayoutTextView;
import com.spotify.music.R;

public class PersistentSeekbarView extends FrameLayout implements vdz {
    private CancellableSeekBar a;
    private SuppressLayoutTextView b;
    private TextView c;
    private veb d;
    /* access modifiers changed from: private */
    public a e;

    public PersistentSeekbarView(Context context) {
        this(context, null);
    }

    public PersistentSeekbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PersistentSeekbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.player_v2_seekbar, this);
        findViewById(R.id.timestamps).setVisibility(0);
        this.a = (CancellableSeekBar) findViewById(R.id.seek_bar);
        this.b = (SuppressLayoutTextView) findViewById(R.id.position);
        this.c = (TextView) findViewById(R.id.duration);
        this.a.a(new a() {
            public final void a(SeekBar seekBar) {
                if (PersistentSeekbarView.this.e != null) {
                    PersistentSeekbarView.this.e.a();
                }
            }

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z && PersistentSeekbarView.this.e != null) {
                    PersistentSeekbarView.this.e.a(i, true);
                }
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
                if (PersistentSeekbarView.this.e != null) {
                    PersistentSeekbarView.this.e.a(seekBar.getProgress(), false);
                }
            }
        });
        this.d = new veb(this.b, this.c);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public final void a() {
        CancellableSeekBar cancellableSeekBar = this.a;
        if (cancellableSeekBar.b) {
            cancellableSeekBar.onTouchEvent(MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0));
            cancellableSeekBar.a = true;
            cancellableSeekBar.b = false;
            synchronized (cancellableSeekBar.e) {
                cancellableSeekBar.setProgress(cancellableSeekBar.c);
            }
            if (cancellableSeekBar.d != null) {
                cancellableSeekBar.d.a(cancellableSeekBar);
            }
        }
    }

    public final void a(int i) {
        this.a.setProgress(i);
    }

    public final void a(a aVar) {
        this.e = (a) fbp.a(aVar);
    }

    public final void a(boolean z) {
        if (z) {
            this.a.setOnTouchListener(null);
            this.a.getThumb().mutate().setAlpha(255);
            return;
        }
        this.a.setOnTouchListener($$Lambda$PersistentSeekbarView$CuqZxXs1pLrtXM3ZNizfh8oJkBM.INSTANCE);
        this.a.getThumb().mutate().setAlpha(0);
    }

    public final void b(int i) {
        this.d.b(i / 1000);
        this.a.setMax(i);
    }

    public final void b(boolean z) {
        int i = 0;
        this.b.setVisibility(z ? 0 : 8);
        TextView textView = this.c;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void c(int i) {
        this.d.a(i);
    }
}
