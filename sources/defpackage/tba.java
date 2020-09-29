package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;
import java.util.Map;

/* renamed from: tba reason: default package */
public final class tba implements a, a<PlayerTrack> {
    private final spi a;
    private final tcs b;
    private final utp c;
    private final urn d;
    private String e;
    private String f;
    private tbb g;

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerTrack playerTrack = (PlayerTrack) obj;
        String str = null;
        if (!InterruptionUtil.isInterruptionUri(playerTrack.uri())) {
            this.g.a(PlayerTrackUtil.getTitle(playerTrack));
            this.g.b(PlayerTrackUtil.getArtists(playerTrack));
            Map metadata = playerTrack.metadata();
            String str2 = (String) metadata.get("album_uri");
            if (str2 != null) {
                str = str2;
            } else if (jst.a(playerTrack.uri()).b == LinkType.SHOW_EPISODE) {
                if ("audio".equals(metadata.get("media.type"))) {
                    str = playerTrack.uri();
                }
            }
            this.e = str;
            this.f = (String) playerTrack.metadata().get("artist_uri");
            return;
        }
        String str3 = "";
        this.g.a(str3);
        this.g.b(str3);
        this.e = null;
        this.f = null;
    }

    public tba(urn urn, spi spi, tcs tcs, utp utp) {
        this.a = spi;
        this.b = tcs;
        this.d = urn;
        this.c = utp;
    }

    public final void a() {
        if (!fax.a(this.e)) {
            this.c.b(this.e);
            this.a.a((String) fay.a(this.e));
        }
    }

    public final void b() {
        if (!fax.a(this.f)) {
            this.c.c(this.f);
            this.a.a((String) fay.a(this.f));
        }
    }

    public final void a(tbb tbb) {
        this.g = (tbb) fay.a(tbb);
        this.g.a((a) this);
        this.d.a((a<T>) this);
    }
}
