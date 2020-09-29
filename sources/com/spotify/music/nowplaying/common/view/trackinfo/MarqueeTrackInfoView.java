package com.spotify.music.nowplaying.common.view.trackinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;

public class MarqueeTrackInfoView extends LinearLayout implements tli, vdc {
    private TextView a;
    private TextView b;
    /* access modifiers changed from: private */
    public a c;
    private final GestureDetector d;
    private final GestureDetector e;

    public MarqueeTrackInfoView(Context context) {
        this(context, null);
    }

    public MarqueeTrackInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarqueeTrackInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new GestureDetector(getContext(), new SimpleOnGestureListener() {
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (MarqueeTrackInfoView.this.c != null) {
                    MarqueeTrackInfoView.this.c.a();
                }
                return true;
            }
        });
        this.e = new GestureDetector(getContext(), new SimpleOnGestureListener() {
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (MarqueeTrackInfoView.this.c != null) {
                    MarqueeTrackInfoView.this.c.b();
                }
                return true;
            }
        });
        inflate(context, R.layout.marquee_track_info_view, this);
        setOrientation(1);
        this.a = (TextView) findViewById(R.id.marquee_track_info_view_title);
        this.b = (TextView) findViewById(R.id.marquee_track_info_view_subtitle);
        this.a.setSelected(true);
        this.b.setSelected(true);
        this.a.setOnTouchListener(new OnTouchListener(this.d) {
            private final /* synthetic */ GestureDetector f$0;

            {
                this.f$0 = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MarqueeTrackInfoView.a(this.f$0, view, motionEvent);
            }
        });
        this.b.setOnTouchListener(new OnTouchListener(this.e) {
            private final /* synthetic */ GestureDetector f$0;

            {
                this.f$0 = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MarqueeTrackInfoView.a(this.f$0, view, motionEvent);
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        if (gestureDetector.onTouchEvent(motionEvent)) {
            view.performClick();
        }
        return true;
    }

    public final void a(int i) {
        this.b.setTextColor(i);
    }

    public final void a(String str) {
        if (!str.contentEquals(this.a.getText())) {
            this.a.setText(str);
        }
    }

    public final void a(a aVar) {
        this.c = aVar;
    }

    public final void b(String str) {
        if (!str.contentEquals(this.b.getText())) {
            this.b.setText(str);
        }
    }
}
