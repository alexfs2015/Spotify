package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class DraggableSeekBar extends SeekBar {
    public a a;
    private boolean b;
    private Drawable c;
    /* access modifiers changed from: private */
    public OnSeekBarChangeListener d;
    private final OnSeekBarChangeListener e = new OnSeekBarChangeListener() {
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                DraggableSeekBar.a(DraggableSeekBar.this);
            }
            if (DraggableSeekBar.this.d != null) {
                DraggableSeekBar.this.d.onProgressChanged(seekBar, i, z);
            }
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            if (DraggableSeekBar.this.d != null) {
                DraggableSeekBar.this.d.onStartTrackingTouch(seekBar);
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            if (DraggableSeekBar.this.d != null) {
                DraggableSeekBar.this.d.onStopTrackingTouch(seekBar);
            }
        }
    };

    public interface a {
        void a();

        void a(int i);

        void a(SeekBar seekBar);

        void b(int i);

        void b(SeekBar seekBar);
    }

    public DraggableSeekBar(Context context) {
        super(context);
        a();
    }

    public DraggableSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public DraggableSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        this.b = false;
        super.setOnSeekBarChangeListener(this.e);
    }

    static /* synthetic */ void a(DraggableSeekBar draggableSeekBar) {
        a aVar = draggableSeekBar.a;
        if (aVar != null) {
            draggableSeekBar.getProgress();
            aVar.b((SeekBar) draggableSeekBar);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect(((this.c.getBounds().left - 20) + getPaddingLeft()) - getThumbOffset(), (this.c.getBounds().top - 20) + getPaddingTop(), ((this.c.getBounds().right + 20) + getPaddingLeft()) - getThumbOffset(), this.c.getBounds().bottom + 20 + getPaddingTop());
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                super.onTouchEvent(motionEvent);
                this.b = true;
                a aVar = this.a;
                if (aVar != null) {
                    aVar.a();
                }
            } else {
                float x = motionEvent.getX();
                if (this.a != null) {
                    Math.round(((x - ((float) getPaddingLeft())) * ((float) getMax())) / ((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())));
                    if (x < rect.exactCenterX()) {
                        this.a.a(getProgress());
                    } else {
                        this.a.b(getProgress());
                    }
                }
                return false;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.b) {
                a aVar2 = this.a;
                if (aVar2 != null) {
                    aVar2.a((SeekBar) this);
                }
            }
            this.b = false;
            return false;
        } else {
            super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.d = onSeekBarChangeListener;
    }

    public void setThumb(Drawable drawable) {
        super.setThumb(drawable);
        this.c = drawable;
    }
}
