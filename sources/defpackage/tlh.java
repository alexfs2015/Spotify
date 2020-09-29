package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;
import java.util.Map;

/* renamed from: tlh reason: default package */
public final class tlh implements a, a<PlayerTrack> {
    private final szp a;
    private final tmz b;
    private final veu c;
    private final vcs d;
    private String e;
    private String f;
    private tli g;

    public tlh(vcs vcs, szp szp, tmz tmz, veu veu) {
        this.a = szp;
        this.b = tmz;
        this.d = vcs;
        this.c = veu;
    }

    public final void a() {
        if (!fbo.a(this.e)) {
            this.c.b(this.e);
            this.a.a((String) fbp.a(this.e));
        }
    }

    public final void a(tli tli) {
        this.g = (tli) fbp.a(tli);
        this.g.a((a) this);
        this.d.a((a<T>) this);
    }

    public final void b() {
        if (!fbo.a(this.f)) {
            this.c.c(this.f);
            this.a.a((String) fbp.a(this.f));
        }
    }

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
            } else if (jva.a(playerTrack.uri()).b == LinkType.SHOW_EPISODE) {
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
}
