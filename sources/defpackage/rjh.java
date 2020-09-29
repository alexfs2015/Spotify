package defpackage;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: rjh reason: default package */
public final class rjh extends StateListDrawable {
    private static final int[] a = {R.attr.state_player_playing};
    private static final int[] b = {R.attr.state_player_pausing};

    public rjh(Context context, int i) {
        float b2 = (float) uts.b((float) 20, context.getResources());
        float b3 = (float) uts.b((float) 40, context.getResources());
        Context context2 = context;
        float f = b2;
        float f2 = b3;
        int i2 = i;
        int c = fr.c(context, R.color.black);
        uvv uvv = new uvv(context2, SpotifyIconV2.PLAY, f, f2, i2, c);
        addState(a, uvv);
        uvv uvv2 = new uvv(context2, SpotifyIconV2.PAUSE, f, f2, i2, c);
        addState(b, uvv2);
    }
}
