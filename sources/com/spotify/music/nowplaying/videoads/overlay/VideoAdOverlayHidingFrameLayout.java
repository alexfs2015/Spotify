package com.spotify.music.nowplaying.videoads.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.spotify.music.R;
import com.spotify.music.nowplaying.common.view.overlay.OverlayHidingFrameLayout;
import java.util.LinkedHashSet;
import java.util.Set;

public class VideoAdOverlayHidingFrameLayout extends OverlayHidingFrameLayout implements thr {
    private final Set<defpackage.tal.a> c;
    private final GestureDetector d;
    private final Runnable e;
    private ViewGroup f;

    class a extends SimpleOnGestureListener {
        private a() {
        }

        /* synthetic */ a(VideoAdOverlayHidingFrameLayout videoAdOverlayHidingFrameLayout, byte b) {
            this();
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            VideoAdOverlayHidingFrameLayout videoAdOverlayHidingFrameLayout = VideoAdOverlayHidingFrameLayout.this;
            VideoAdOverlayHidingFrameLayout.a(videoAdOverlayHidingFrameLayout, !videoAdOverlayHidingFrameLayout.a());
            return false;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                return true;
            }
            return super.onDown(motionEvent);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        a(4);
    }

    public VideoAdOverlayHidingFrameLayout(Context context) {
        this(context, null);
    }

    public VideoAdOverlayHidingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoAdOverlayHidingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new LinkedHashSet();
        this.d = new GestureDetector(getContext(), new a(this, 0));
        this.e = new Runnable() {
            public final void run() {
                VideoAdOverlayHidingFrameLayout.this.f();
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f = (ViewGroup) findViewById(R.id.play_pause_button_container);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        removeCallbacks(this.e);
        super.dispatchTouchEvent(motionEvent);
        return this.d.onTouchEvent(motionEvent);
    }

    public final void a(defpackage.tal.a aVar) {
        this.c.add(fay.a(aVar));
    }

    public final boolean d() {
        ViewGroup viewGroup = this.f;
        return viewGroup != null && viewGroup.getVisibility() == 0;
    }

    public final void e(boolean z) {
        a(0);
        super.a(false, true);
        if (z) {
            postDelayed(this.e, 2000);
        }
    }

    public final void e() {
        a(4);
    }

    private void a(int i) {
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        }
    }

    static /* synthetic */ void a(VideoAdOverlayHidingFrameLayout videoAdOverlayHidingFrameLayout, boolean z) {
        for (defpackage.tal.a d2 : videoAdOverlayHidingFrameLayout.c) {
            d2.d();
        }
    }
}
