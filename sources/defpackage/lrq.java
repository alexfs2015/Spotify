package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.music.libs.album.model.AlbumTrack;
import java.util.List;

/* renamed from: lrq reason: default package */
public final class lrq {
    private final lru a;
    private final String b;
    private final lrr c;

    public lrq(lru lru, String str, lrr lrr) {
        this.a = (lru) fbp.a(lru);
        this.b = str;
        this.c = lrr;
    }

    /* access modifiers changed from: 0000 */
    public final void a(PlayerContext playerContext, List<AlbumTrack> list) {
        String str = "autoplay";
        if (this.c.a.getBoolean(str, false)) {
            lru lru = this.a;
            String str2 = this.b;
            int i = -1;
            if (list != null && !fbo.a(str2)) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    } else if (fbn.a(((AlbumTrack) list.get(i2)).getUri(), str2)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            lru.a(playerContext, Math.max(i, 0));
            this.c.a.remove(str);
        }
    }
}
