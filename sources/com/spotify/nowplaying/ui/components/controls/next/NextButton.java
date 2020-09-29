package com.spotify.nowplaying.ui.components.controls.next;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;

public class NextButton extends AppCompatImageButton implements usi {
    private a a;

    public NextButton(Context context) {
        this(context, null);
    }

    public NextButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NextButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundDrawable(null);
        setImageDrawable(ury.f(getContext()));
        setScaleType(ScaleType.CENTER_CROP);
        setContentDescription(getResources().getString(R.string.player_content_description_next));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                NextButton.this.a(view);
            }
        });
    }

    public final void b(boolean z) {
        setImageDrawable(z ? ury.f(getContext()) : ury.g(getContext()));
    }

    public final void a(a aVar) {
        this.a = (a) fay.a(aVar);
    }

    public void a(boolean z) {
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
