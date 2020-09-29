package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.music.libs.album.model.AlbumTrack;
import java.util.List;

/* renamed from: lnq reason: default package */
public final class lnq {
    private final lnu a;
    private final String b;
    private final lnr c;

    public lnq(lnu lnu, String str, lnr lnr) {
        this.a = (lnu) fay.a(lnu);
        this.b = str;
        this.c = lnr;
    }

    /* access modifiers changed from: 0000 */
    public final void a(PlayerContext playerContext, List<AlbumTrack> list) {
        String str = "autoplay";
        if (this.c.a.getBoolean(str, false)) {
            lnu lnu = this.a;
            String str2 = this.b;
            int i = -1;
            if (list != null && !fax.a(str2)) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    } else if (faw.a(((AlbumTrack) list.get(i2)).getUri(), str2)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            lnu.a(playerContext, Math.max(i, 0));
            this.c.a.remove(str);
        }
    }
}
