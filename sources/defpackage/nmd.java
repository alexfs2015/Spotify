package defpackage;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.features.homemix.header.mixtuning.HeaderSecondaryButtonBehavior;
import com.spotify.music.features.homemix.header.mixtuning.HomeMixTuningButton;

/* renamed from: nmd reason: default package */
public class nmd extends HomeMixTuningButton {
    public final int a() {
        return R.id.button_chill;
    }

    public nmd(Context context) {
        super(context);
    }

    public final SpotifyIconV2 b() {
        return SpotifyIconV2.SLEEPTIMER;
    }

    public final String c() {
        return getContext().getString(R.string.home_mix_chill_label);
    }

    public final /* synthetic */ LayoutParams d() {
        d dVar = new d(-2, -2);
        dVar.a((int) R.id.button_play);
        dVar.d = 8388627;
        dVar.c = 8388627;
        dVar.a((Behavior) new HeaderSecondaryButtonBehavior());
        return dVar;
    }
}
