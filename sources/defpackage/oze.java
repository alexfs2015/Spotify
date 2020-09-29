package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.Set;

/* renamed from: oze reason: default package */
public final class oze extends ozf<oyw> implements d {
    public oze(Set<oyw> set) {
        super(set);
    }

    public final oyw a(FormatListType formatListType, fqn fqn, LicenseLayout licenseLayout) {
        oyw oyw = (oyw) b(formatListType, fqn, licenseLayout);
        Logger.b("Playlist Entity Plugin: Using playlist component from %s for derived format list type %s", oyw.b(), formatListType);
        return oyw;
    }
}
