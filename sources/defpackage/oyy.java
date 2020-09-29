package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.Set;

/* renamed from: oyy reason: default package */
public final class oyy extends ozf<oyx> implements a {
    public oyy(Set<oyx> set) {
        super(set);
    }

    public final oyx a(FormatListType formatListType, fqn fqn, LicenseLayout licenseLayout) {
        oyx oyx = (oyx) b(formatListType, fqn, licenseLayout);
        Logger.b("Playlist Entity Plugin: Using configurations from %s for derived format list type %s", oyx.b(), formatListType);
        return oyx;
    }
}
