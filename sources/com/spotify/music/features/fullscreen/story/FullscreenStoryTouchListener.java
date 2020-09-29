package com.spotify.music.features.fullscreen.story;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public final class FullscreenStoryTouchListener extends SimpleOnGestureListener implements OnTouchListener {
    private final gcp<TouchEvent> a;
    private final hw b;
    private final float c;
    private boolean d;

    public enum TouchEvent {
        LEFT_HALF_SCREEN_CLICK,
        RIGHT_HALF_SCREEN_CLICK,
        LONG_PRESS,
        LONG_PRESS_RELEASED
    }

    public FullscreenStoryTouchListener(Context context, DisplayMetrics displayMetrics, gcp<TouchEvent> gcp) {
        this.a = (gcp) fbp.a(gcp);
        this.c = ((float) ((DisplayMetrics) fbp.a(displayMetrics)).widthPixels) * 0.3f;
        this.b = new hw((Context) fbp.a(context), this);
    }

    private TouchEvent a(float f) {
        return f < this.c ? TouchEvent.LEFT_HALF_SCREEN_CLICK : TouchEvent.RIGHT_HALF_SCREEN_CLICK;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        TouchEvent a2 = a(motionEvent.getRawX());
        this.a.accept(a2);
        this.a.accept(a2);
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.d = true;
        this.a.accept(TouchEvent.LONG_PRESS);
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.accept(a(motionEvent.getRawX()));
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && this.d) {
            this.d = false;
            this.a.accept(TouchEvent.LONG_PRESS_RELEASED);
        }
        return this.b.a(motionEvent);
    }
}
