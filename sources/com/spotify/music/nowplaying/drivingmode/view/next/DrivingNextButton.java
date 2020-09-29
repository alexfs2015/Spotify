package com.spotify.music.nowplaying.drivingmode.view.next;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;

public class DrivingNextButton extends AppCompatImageButton implements usi {
    private a a;

    public DrivingNextButton(Context context) {
        super(context);
        e();
    }

    public DrivingNextButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public DrivingNextButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    private void e() {
        setContentDescription(getResources().getString(R.string.player_content_description_next));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                DrivingNextButton.this.a(view);
            }
        });
    }

    public final void b(boolean z) {
        setEnabled(z);
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    public final void a(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
