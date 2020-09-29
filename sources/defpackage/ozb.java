package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.Set;

/* renamed from: ozb reason: default package */
public final class ozb extends ozf<oza> implements b {
    public ozb(Set<oza> set) {
        super(set);
    }

    public final oza a(FormatListType formatListType, fqn fqn, LicenseLayout licenseLayout) {
        oza oza = (oza) b(formatListType, fqn, licenseLayout);
        Logger.b("Playlist Entity Plugin: Using header from %s for derived format list type %s", oza.b(), formatListType);
        return oza;
    }
}
