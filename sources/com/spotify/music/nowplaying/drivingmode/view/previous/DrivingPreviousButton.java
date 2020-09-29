package com.spotify.music.nowplaying.drivingmode.view.previous;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;

public final class DrivingPreviousButton extends AppCompatImageButton implements usp {
    private a a;

    public DrivingPreviousButton(Context context) {
        super(context);
        e();
    }

    public DrivingPreviousButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public DrivingPreviousButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    private void e() {
        setContentDescription(getResources().getString(R.string.player_content_description_prev));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                DrivingPreviousButton.this.a(view);
            }
        });
    }

    public final void a(boolean z) {
        setEnabled(z);
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
