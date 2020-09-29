package com.spotify.music.nowplaying.drivingmode.view.shuffle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;
import com.spotify.nowplaying.core.shuffle.ShuffleState;

public final class DrivingShuffleButton extends AppCompatImageButton implements ver {
    private a a;
    private Paint b;
    private float c;
    private float d;

    public DrivingShuffleButton(Context context) {
        super(context);
        e();
    }

    public DrivingShuffleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public DrivingShuffleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void e() {
        this.d = getContext().getResources().getDimension(R.dimen.driving_dot_indicator_bottom_padding);
        this.c = getContext().getResources().getDimension(R.dimen.driving_dot_indicator_radius);
        this.b = new Paint();
        this.b.setColor(fr.c(getContext(), R.color.pasteTransparent));
        this.b.setAntiAlias(true);
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                DrivingShuffleButton.this.a(view);
            }
        });
    }

    public final void a(ShuffleState shuffleState) {
        boolean z = shuffleState != ShuffleState.NORMAL;
        setActivated(z);
        setContentDescription(getResources().getString(z ? R.string.player_content_description_shuffle_off : R.string.player_content_description_shuffle_on));
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    public final void a(boolean z) {
        setEnabled(z);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isActivated()) {
            float width = (((float) getWidth()) / 2.0f) - this.c;
            float height = (float) getHeight();
            float f = this.c;
            canvas.drawCircle(width, (height - f) - this.d, f, this.b);
        }
    }
}
