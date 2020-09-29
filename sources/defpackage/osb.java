package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.Set;

/* renamed from: osb reason: default package */
public final class osb extends orz<osa> implements e {
    public osb(Set<osa> set) {
        super(set);
    }

    public final osa a(FormatListType formatListType, fpt fpt, LicenseLayout licenseLayout) {
        osa osa = (osa) b(formatListType, fpt, licenseLayout);
        Logger.b("Playlist Entity Plugin: Using toolbar from %s for derived format list type %s", osa.b(), formatListType);
        return osa;
    }
}
