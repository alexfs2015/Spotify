package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.text.SpannableString;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;
import com.spotify.music.R;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.List;
import java.util.Map;

/* renamed from: jvj reason: default package */
public final class jvj implements jvf {
    private final juu a;
    private final tjv b;

    jvj(juu juu, tjv tjv) {
        this.a = (juu) fay.a(juu);
        this.b = tjv;
    }

    public final boolean a(hue hue) {
        Map c = hue.c();
        return c != null && FormatListType.P2S == this.b.a((String) c.get(Metadata.FORMAT_LIST_TYPE)) && this.a.a(hue);
    }

    public final PendingIntent a(Context context) {
        return this.a.a(context);
    }

    public final List<jva> a(hue hue, Context context, fpt fpt) {
        return this.a.a(hue, context, fpt);
    }

    public final SpannableString a(hue hue, Context context) {
        return this.a.a(hue, context);
    }

    public final SpannableString b(hue hue, Context context) {
        if (hue.j()) {
            return new SpannableString(context.getString(R.string.player_watch_on_spotify));
        }
        return this.a.b(hue, context);
    }
}
