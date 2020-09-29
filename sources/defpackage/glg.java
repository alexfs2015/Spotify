package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.spotify.libs.glue.custom.playbutton.CirclePlayButtonView;
import com.spotify.libs.glue.custom.playbutton.CirclePlayButtonView.IconState;
import com.spotify.music.R;

/* renamed from: glg reason: default package */
public final class glg implements glf {
    private final View a;
    private final boolean b = false;

    public glg(CirclePlayButtonView circlePlayButtonView) {
        this.a = circlePlayButtonView;
    }

    public glg(Button button) {
        this.a = button;
    }

    public final View a() {
        return this.a;
    }

    public final void a(OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void a(boolean z) {
        if (this.b) {
            CirclePlayButtonView circlePlayButtonView = (CirclePlayButtonView) this.a;
            circlePlayButtonView.a(IconState.PLAY);
            circlePlayButtonView.a(z);
            return;
        }
        Button button = (Button) this.a;
        button.setText(z ? R.string.play_button_shuffle : R.string.play_button_play);
        button.requestLayout();
    }

    public final void b(boolean z) {
        if (this.b) {
            CirclePlayButtonView circlePlayButtonView = (CirclePlayButtonView) this.a;
            circlePlayButtonView.a(IconState.PAUSE);
            circlePlayButtonView.a(z);
            return;
        }
        Button button = (Button) this.a;
        button.setText(R.string.play_button_pause);
        button.requestLayout();
    }
}
