package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import com.spotify.music.R;

/* renamed from: maa reason: default package */
public final class maa implements lzz {
    private final Button a;

    public maa(Context context) {
        fbp.a(context);
        gat.a();
        this.a = (Button) gat.a(context, Button.class, null, R.attr.solarButtonPrimaryWhiteSmall);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.actionbar_play_button_container_padding);
        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.a.setLayoutParams(layoutParams);
    }

    public final Button a() {
        return this.a;
    }

    public final void a(String str) {
        if (str == null) {
            str = "";
        }
        this.a.setText(str);
    }

    public final /* bridge */ /* synthetic */ View getView() {
        return this.a;
    }
}
