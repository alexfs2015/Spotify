package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: npr reason: default package */
public final class npr implements taa {
    private final tvn a;

    public npr(tvn tvn) {
        this.a = tvn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jqx a(Intent intent, jva jva, String str, fqn fqn, SessionState sessionState) {
        tvn tvn = this.a;
        FormatListType formatListType = FormatListType.HOME_MIX;
        String str2 = (String) fbp.a(jva.q());
        fbp.a(str2);
        a aVar = (a) tvn.a.get(formatListType);
        if (aVar != null) {
            String c = aVar.c();
            if (!TextUtils.isEmpty(c)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                sb.append(':');
                str2 = str2.replace(sb.toString(), "");
            }
        }
        return npp.a(fqn, str2);
    }

    public final void a(szz szz) {
        szz.a(LinkType.FORMAT_LIST_HOME_MIX, "Home Mix Playlist Entity", (szh) new $$Lambda$npr$VEAygJg4owVlcNzzdP8_zV8vO9E(this));
    }
}
