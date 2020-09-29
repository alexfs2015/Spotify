package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: njx reason: default package */
public final class njx implements spt {
    private final tjv a;

    public njx(tjv tjv) {
        this.a = tjv;
    }

    public final void a(sps sps) {
        sps.a(LinkType.FORMAT_LIST_HOME_MIX, "Home Mix Playlist Entity", (spa) new $$Lambda$njx$jMtJT8d9K0VLAthh5IA_zLLnZJw(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jol a(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        tjv tjv = this.a;
        FormatListType formatListType = FormatListType.HOME_MIX;
        String str2 = (String) fay.a(jst.q());
        fay.a(str2);
        a aVar = (a) tjv.a.get(formatListType);
        if (aVar != null) {
            String c = aVar.c();
            if (!TextUtils.isEmpty(c)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                sb.append(':');
                str2 = str2.replace(sb.toString(), "");
            }
        }
        return njv.a(fpt, str2);
    }
}
