package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.text.SpannableString;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;
import com.spotify.music.R;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.List;
import java.util.Map;

/* renamed from: jxr reason: default package */
public final class jxr implements jxn {
    private final jxc a;
    private final tvn b;

    jxr(jxc jxc, tvn tvn) {
        this.a = (jxc) fbp.a(jxc);
        this.b = tvn;
    }

    public final PendingIntent a(Context context) {
        return this.a.a(context);
    }

    public final SpannableString a(hwq hwq, Context context) {
        return this.a.a(hwq, context);
    }

    public final List<jxi> a(hwq hwq, Context context, fqn fqn) {
        return this.a.a(hwq, context, fqn);
    }

    public final boolean a(hwq hwq) {
        Map c = hwq.c();
        return c != null && FormatListType.P2S == this.b.a((String) c.get(Metadata.FORMAT_LIST_TYPE)) && this.a.a(hwq);
    }

    public final SpannableString b(hwq hwq, Context context) {
        return hwq.j() ? new SpannableString(context.getString(R.string.player_watch_on_spotify)) : this.a.b(hwq, context);
    }
}
