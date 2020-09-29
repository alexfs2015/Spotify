package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import androidx.appcompat.widget.AppCompatSeekBar;

public class CancellableSeekBar extends AppCompatSeekBar {
    public boolean a;
    public boolean b;
    public int c;
    public b d;
    public final Object e;
    private boolean f;
    private float g;

    public interface a extends OnSeekBarChangeListener {
        void a(SeekBar seekBar);
    }

    public static class b implements a {
        boolean a;
        private final OnSeekBarChangeListener b;

        public b(OnSeekBarChangeListener onSeekBarChangeListener) {
            this.b = onSeekBarChangeListener;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.b.onProgressChanged(seekBar, i, z);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            this.b.onStartTrackingTouch(seekBar);
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            if (this.a) {
                this.a = false;
            } else {
                this.b.onStopTrackingTouch(seekBar);
            }
        }

        public final void a(SeekBar seekBar) {
            OnSeekBarChangeListener onSeekBarChangeListener = this.b;
            if (onSeekBarChangeListener instanceof a) {
                ((a) onSeekBarChangeListener).a(seekBar);
            }
        }
    }

    public CancellableSeekBar(Context context) {
        this(context, null);
    }

    public CancellableSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842875);
    }

    public CancellableSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.jqu.a.k);
        this.g = obtainStyledAttributes.getDimension(defpackage.jqu.a.l, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a(a aVar) {
        if (aVar == null) {
            this.d = null;
        } else {
            this.d = new b(aVar);
        }
        super.setOnSeekBarChangeListener(this.d);
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        if (onSeekBarChangeListener == null) {
            this.d = null;
        } else {
            this.d = new b(onSeekBarChangeListener);
        }
        super.setOnSeekBarChangeListener(this.d);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            this.f = true;
            int action = motionEvent.getAction();
            if (this.a) {
                if (action == 1 || action == 3) {
                    this.a = false;
                    this.b = false;
                }
                this.f = false;
                return true;
            }
            if (action == 0) {
                this.b = true;
                synchronized (this.e) {
                    this.c = getProgress();
                }
            }
            if (motionEvent.getY() >= (-this.g)) {
                if (motionEvent.getY() <= ((float) getHeight()) + this.g) {
                    if (action == 1) {
                        this.b = false;
                    }
                    boolean onTouchEvent = super.onTouchEvent(motionEvent);
                    this.f = false;
                    return onTouchEvent;
                }
            }
            this.a = true;
            motionEvent.setAction(3);
            if (this.d != null) {
                this.d.a = true;
            }
            boolean onTouchEvent2 = super.onTouchEvent(motionEvent);
            synchronized (this.e) {
                setProgress(this.c);
            }
            if (this.d != null) {
                this.d.a(this);
            }
            this.f = false;
            return onTouchEvent2;
        } catch (Throwable th) {
            this.f = false;
            throw th;
        }
    }

    public synchronized void setProgress(int i) {
        if (!this.f && this.b && !this.a) {
            this.c = i;
        } else {
            super.setProgress(i);
        }
    }
}
