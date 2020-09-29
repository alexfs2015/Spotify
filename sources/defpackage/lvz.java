package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import com.spotify.music.R;

/* renamed from: lvz reason: default package */
public final class lvz implements lvy {
    private final Button a;

    public lvz(Context context) {
        fay.a(context);
        fzz.a();
        this.a = (Button) fzz.a(context, Button.class, null, R.attr.solarButtonPrimaryWhiteSmall);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.actionbar_play_button_container_padding);
        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.a.setLayoutParams(layoutParams);
    }

    public final void a(String str) {
        if (str == null) {
            str = "";
        }
        this.a.setText(str);
    }

    public final Button a() {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ View getView() {
        return this.a;
    }
}
