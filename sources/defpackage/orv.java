package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.Set;

/* renamed from: orv reason: default package */
public final class orv extends orz<oru> implements b {
    public orv(Set<oru> set) {
        super(set);
    }

    public final oru a(FormatListType formatListType, fpt fpt, LicenseLayout licenseLayout) {
        oru oru = (oru) b(formatListType, fpt, licenseLayout);
        Logger.b("Playlist Entity Plugin: Using header from %s for derived format list type %s", oru.b(), formatListType);
        return oru;
    }
}
