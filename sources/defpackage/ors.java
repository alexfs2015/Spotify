package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.Set;

/* renamed from: ors reason: default package */
public final class ors extends orz<orr> implements a {
    public ors(Set<orr> set) {
        super(set);
    }

    public final orr a(FormatListType formatListType, fpt fpt, LicenseLayout licenseLayout) {
        orr orr = (orr) b(formatListType, fpt, licenseLayout);
        Logger.b("Playlist Entity Plugin: Using configurations from %s for derived format list type %s", orr.b(), formatListType);
        return orr;
    }
}
