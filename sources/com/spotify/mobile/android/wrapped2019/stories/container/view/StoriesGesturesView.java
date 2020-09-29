package com.spotify.mobile.android.wrapped2019.stories.container.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

public class StoriesGesturesView extends View {
    public gbr<StoryGesture> a;
    private final GestureDetector b;
    private boolean c;

    public enum StoryGesture {
        SCREEN_PRESS,
        SCREEN_PRESS_RELEASE,
        LEFT_CLICK,
        RIGHT_CLICK,
        SWIPE_TOP_DOWN
    }

    class a extends SimpleOnGestureListener {
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        private a() {
        }

        /* synthetic */ a(StoriesGesturesView storiesGesturesView, byte b) {
            this();
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float y = motionEvent2.getY() - motionEvent.getY();
            if (motionEvent.getY() >= 200.0f || y <= 200.0f) {
                return false;
            }
            StoriesGesturesView.this.a(StoryGesture.SWIPE_TOP_DOWN);
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            a(motionEvent);
            return true;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            a(motionEvent);
            return true;
        }

        private void a(MotionEvent motionEvent) {
            StoriesGesturesView.this.a(motionEvent.getX() > ((float) (StoriesGesturesView.this.getWidth() / 2)) ? StoryGesture.RIGHT_CLICK : StoryGesture.LEFT_CLICK);
        }
    }

    public StoriesGesturesView(Context context) {
        this(context, null, 0);
    }

    public StoriesGesturesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StoriesGesturesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new GestureDetector(context, new a(this, 0));
    }

    public StoriesGesturesView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new GestureDetector(context, new a(this, 0));
    }

    /* access modifiers changed from: private */
    public void a(StoryGesture storyGesture) {
        gbr<StoryGesture> gbr = this.a;
        if (gbr != null) {
            gbr.accept(storyGesture);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.c && motionEvent.getAction() == 0) {
            a(StoryGesture.SCREEN_PRESS);
            this.c = true;
        }
        if (this.c && 1 == motionEvent.getAction()) {
            a(StoryGesture.SCREEN_PRESS_RELEASE);
            this.c = false;
        }
        if (this.b.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
