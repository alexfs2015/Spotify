package defpackage;

import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;

/* renamed from: pkr reason: default package */
public final class pkr {
    public final hdn a = new hdn(new $$Lambda$pkr$qMMtC1A58jZVbq_4DbXLi6Upe5I(this));
    private final boolean b;
    private final pkt c;

    public pkr(boolean z, pkt pkt) {
        this.b = z;
        this.c = pkt;
    }

    /* access modifiers changed from: private */
    public hcm a(hcm hcm) {
        if (!HubsGlue2Row.IMAGE_ROW.id().equals(hcm.componentId().id())) {
            return null;
        }
        Optional a2 = pkq.a(hcm);
        if (!a2.b()) {
            return null;
        }
        String str = (String) a2.c();
        jva a3 = jva.a(str);
        a builder = hcm.toBuilder();
        hco text = hcm.text();
        a builder2 = text.toBuilder();
        pkt pkt = this.c;
        String subtitle = text.subtitle();
        int i = AnonymousClass1.a[a3.b.ordinal()];
        if (i == 1) {
            subtitle = pkt.a(pkt.a.getString(R.string.featured_content_entity_subtitle_track), subtitle);
        } else if (i == 2) {
            subtitle = pkt.a(pkt.a.getString(R.string.featured_content_entity_subtitle_album), subtitle);
        } else if (i == 3) {
            subtitle = pkt.a.getString(R.string.featured_content_entity_subtitle_artist);
        } else if (i == 4 || i == 5) {
            subtitle = pkt.a.getString(R.string.featured_content_entity_subtitle_playlist);
        }
        a a4 = builder.a(builder2.b(subtitle).a());
        String str2 = "accessoryRightIcon";
        if (!(a3.b == LinkType.TRACK && this.b)) {
            return a4.c(str2, SpotifyIconV2.CHEVRON_RIGHT.name()).a();
        }
        return a4.c(str2, SpotifyIconV2.MORE_ANDROID.name()).a("click", hbj.a(str, HubsImmutableComponentBundle.builder().a("player", HubsImmutableComponentBundle.builder().a("context", hbr.a(PlayerContext.create(str, new PlayerTrack[]{PlayerTrack.create(str)}))).a()).a())).a("rightAccessoryClick", gxy.a(str, null)).a();
    }
}
