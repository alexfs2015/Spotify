package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import com.spotify.music.R;

/* renamed from: ai reason: default package */
public final class ai {
    public Context a;

    private ai(Context context) {
        this.a = context;
    }

    public static ai a(Context context) {
        return new ai(context);
    }

    public final int a() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    public final boolean b() {
        return this.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public final boolean c() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }
}
