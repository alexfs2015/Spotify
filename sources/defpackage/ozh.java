package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.Set;

/* renamed from: ozh reason: default package */
public final class ozh extends ozf<ozg> implements e {
    public ozh(Set<ozg> set) {
        super(set);
    }

    public final ozg a(FormatListType formatListType, fqn fqn, LicenseLayout licenseLayout) {
        ozg ozg = (ozg) b(formatListType, fqn, licenseLayout);
        Logger.b("Playlist Entity Plugin: Using toolbar from %s for derived format list type %s", ozg.b(), formatListType);
        return ozg;
    }
}
