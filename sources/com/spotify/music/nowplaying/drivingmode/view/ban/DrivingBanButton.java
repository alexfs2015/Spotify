package com.spotify.music.nowplaying.drivingmode.view.ban;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;

public final class DrivingBanButton extends AppCompatImageButton implements sxl {
    private a a;

    public final void e() {
    }

    public final void f() {
    }

    public DrivingBanButton(Context context) {
        super(context);
        g();
    }

    public DrivingBanButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public DrivingBanButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g();
    }

    private void g() {
        setContentDescription(getResources().getString(R.string.player_content_description_ban));
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                DrivingBanButton.this.a(view);
            }
        });
    }

    public final void a(boolean z) {
        setActivated(z);
        setContentDescription(getResources().getString(z ? R.string.player_content_description_unban : R.string.player_content_description_ban));
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
