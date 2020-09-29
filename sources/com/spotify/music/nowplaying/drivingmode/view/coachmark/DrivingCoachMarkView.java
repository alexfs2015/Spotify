package com.spotify.music.nowplaying.drivingmode.view.coachmark;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.spotify.music.R;

public class DrivingCoachMarkView extends FrameLayout implements teu {
    private a a;

    public DrivingCoachMarkView(Context context) {
        super(context);
        c();
    }

    public DrivingCoachMarkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public DrivingCoachMarkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    private void c() {
        inflate(getContext(), R.layout.driving_coach_mark_view, this);
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                DrivingCoachMarkView.this.a(view);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.a.a();
    }

    public final void a() {
        setVisibility(0);
    }

    public final void b() {
        setVisibility(8);
    }

    public final void a(a aVar) {
        this.a = aVar;
    }
}
