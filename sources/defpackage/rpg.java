package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: rpg reason: default package */
public final class rpg<T> {
    public final Context a;
    public final sso b;
    public final who<jor<T>> c;
    public final fqn d;
    public final lap e;

    public rpg(Context context, sso sso, who<jor<T>> who, fqn fqn, lap lap) {
        this.a = context;
        this.b = sso;
        this.c = who;
        this.d = fqn;
        this.e = lap;
    }

    public static View a(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2, OnClickListener onClickListener) {
        ImageButton a2 = jyz.a(context, i != 0 ? jyz.b(context, spotifyIconV2, vgl.d(context, i)) : jyz.c(context, spotifyIconV2));
        a2.setContentDescription(a2.getResources().getString(i2));
        a2.setOnClickListener(onClickListener);
        return a2;
    }
}
