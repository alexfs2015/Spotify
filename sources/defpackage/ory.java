package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.Set;

/* renamed from: ory reason: default package */
public final class ory extends orz<orq> implements d {
    public ory(Set<orq> set) {
        super(set);
    }

    public final orq a(FormatListType formatListType, fpt fpt, LicenseLayout licenseLayout) {
        orq orq = (orq) b(formatListType, fpt, licenseLayout);
        Logger.b("Playlist Entity Plugin: Using playlist component from %s for derived format list type %s", orq.b(), formatListType);
        return orq;
    }
}
