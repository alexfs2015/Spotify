package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.spotify.libs.glue.custom.playbutton.RoundPlayButtonView;
import com.spotify.libs.glue.custom.playbutton.RoundPlayButtonView.IconState;

/* renamed from: gmy reason: default package */
final class gmy implements gmu {
    private final RoundPlayButtonView a;

    gmy(Context context) {
        this(new RoundPlayButtonView(context));
    }

    private gmy(RoundPlayButtonView roundPlayButtonView) {
        this.a = roundPlayButtonView;
    }

    public final View a() {
        return this.a;
    }

    public final void a(OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void a(boolean z) {
        this.a.a(IconState.PLAY);
        this.a.a(z);
    }

    public final void b(boolean z) {
        this.a.a(IconState.PAUSE);
        this.a.a(z);
    }
}
