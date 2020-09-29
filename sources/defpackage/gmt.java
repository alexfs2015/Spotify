package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.spotify.music.R;

/* renamed from: gmt reason: default package */
final class gmt implements gmu {
    private final Button a;

    public gmt(Button button) {
        this.a = button;
    }

    public final View a() {
        return this.a;
    }

    public final void a(OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void a(boolean z) {
        this.a.setText(z ? R.string.play_button_shuffle : R.string.play_button_play);
        this.a.requestLayout();
    }

    public final void b(boolean z) {
        this.a.setText(R.string.play_button_pause);
        this.a.requestLayout();
    }
}
