package com.spotify.music.nowplaying.drivingmode.view.xbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;

public class DrivingXButton extends AppCompatImageView {
    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
    }

    public DrivingXButton(Context context) {
        super(context);
        e();
    }

    public DrivingXButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public DrivingXButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    private void e() {
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                DrivingXButton.this.a(view);
            }
        });
    }
}
