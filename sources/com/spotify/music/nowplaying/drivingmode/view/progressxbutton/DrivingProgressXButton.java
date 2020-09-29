package com.spotify.music.nowplaying.drivingmode.view.progressxbutton;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import com.spotify.music.R;

public class DrivingProgressXButton extends ProgressBar implements tqb {
    private a a;
    private LayerDrawable b;

    public DrivingProgressXButton(Context context) {
        super(context);
        b();
    }

    public DrivingProgressXButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public DrivingProgressXButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    private void b() {
        this.b = (LayerDrawable) fr.a(getContext(), (int) R.drawable.driving_progress_x_button);
        setProgressDrawable(null);
        c();
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                DrivingProgressXButton.this.a(view);
            }
        });
    }

    private void c() {
        setBackground(tou.g(getContext()));
    }

    public final void a() {
        setProgressDrawable(null);
    }

    public final void a(int i) {
        if (i == 1) {
            setProgressDrawable(this.b);
        }
        setProgress(i);
    }

    public final void a(a aVar) {
        this.a = aVar;
    }
}
