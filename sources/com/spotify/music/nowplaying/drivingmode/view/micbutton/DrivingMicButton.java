package com.spotify.music.nowplaying.drivingmode.view.micbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;

public class DrivingMicButton extends AppCompatImageButton implements tpl {
    private a a;

    public DrivingMicButton(Context context) {
        super(context);
        e();
    }

    public DrivingMicButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public DrivingMicButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.d();
        }
    }

    private void e() {
        setImageDrawable(tou.f(getContext()));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                DrivingMicButton.this.a(view);
            }
        });
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    public final void a(boolean z) {
        setClickable(z);
        setActivated(z);
    }
}
