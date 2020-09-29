package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: lmq reason: default package */
public final class lmq extends spm {
    public fpt a;

    lmq() {
    }

    public final jol a(String str, String str2, SessionState sessionState) {
        if (jst.a(str).b == LinkType.COLLECTION_PLAYLIST_FOLDER) {
            return lmp.a(str, this.a);
        }
        return lmp.a((String) null, this.a);
    }
}
