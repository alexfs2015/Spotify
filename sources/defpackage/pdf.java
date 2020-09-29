package defpackage;

import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;

/* renamed from: pdf reason: default package */
public final class pdf {
    public final hau a = new hau(new $$Lambda$pdf$eKg9YP1nBCZMuu0IZ1GM_2x9GM4(this));
    private final boolean b;
    private final pdh c;

    public pdf(boolean z, pdh pdh) {
        this.b = z;
        this.c = pdh;
    }

    /* access modifiers changed from: private */
    public gzt a(gzt gzt) {
        if (!HubsGlue2Row.IMAGE_ROW.id().equals(gzt.componentId().id())) {
            return null;
        }
        Optional a2 = pde.a(gzt);
        if (!a2.b()) {
            return null;
        }
        String str = (String) a2.c();
        jst a3 = jst.a(str);
        a builder = gzt.toBuilder();
        gzv text = gzt.text();
        a builder2 = text.toBuilder();
        pdh pdh = this.c;
        String subtitle = text.subtitle();
        int i = AnonymousClass1.a[a3.b.ordinal()];
        if (i == 1) {
            subtitle = pdh.a(pdh.a.getString(R.string.featured_content_entity_subtitle_track), subtitle);
        } else if (i == 2) {
            subtitle = pdh.a(pdh.a.getString(R.string.featured_content_entity_subtitle_album), subtitle);
        } else if (i == 3) {
            subtitle = pdh.a.getString(R.string.featured_content_entity_subtitle_artist);
        } else if (i == 4 || i == 5) {
            subtitle = pdh.a.getString(R.string.featured_content_entity_subtitle_playlist);
        }
        a a4 = builder.a(builder2.b(subtitle).a());
        String str2 = "accessoryRightIcon";
        if (!(a3.b == LinkType.TRACK && this.b)) {
            return a4.c(str2, SpotifyIconV2.CHEVRON_RIGHT.name()).a();
        }
        return a4.c(str2, SpotifyIconV2.MORE_ANDROID.name()).a("click", gyq.a(str, HubsImmutableComponentBundle.builder().a("player", HubsImmutableComponentBundle.builder().a("context", gyy.a(PlayerContext.create(str, new PlayerTrack[]{PlayerTrack.create(str)}))).a()).a())).a("rightAccessoryClick", gvx.a(str, null)).a();
    }
}
