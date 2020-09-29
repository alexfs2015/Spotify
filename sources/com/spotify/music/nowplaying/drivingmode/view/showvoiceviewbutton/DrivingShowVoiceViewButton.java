package com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder.Type;
import com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder.a;

public class DrivingShowVoiceViewButton extends AppCompatImageButton implements DrivingShowVoiceViewButtonViewBinder {
    private a a;
    private Type b = Type.UNKNOWN;

    public DrivingShowVoiceViewButton(Context context) {
        super(context);
        a(context, null, 0);
    }

    public DrivingShowVoiceViewButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public DrivingShowVoiceViewButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a, i, 0);
            int i2 = obtainStyledAttributes.getInt(a.b, 0);
            if (i2 == 1) {
                this.b = Type.NOW_PLAYING;
            } else if (i2 != 2) {
                this.b = Type.UNKNOWN;
            } else {
                this.b = Type.HOME_FEED;
            }
            obtainStyledAttributes.recycle();
        }
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                DrivingShowVoiceViewButton.this.a(view);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        Type type = this.b;
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(type);
        }
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    public final void e() {
        setVisibility(0);
    }

    public final void f() {
        setVisibility(8);
    }
}
