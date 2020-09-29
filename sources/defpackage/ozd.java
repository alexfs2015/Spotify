package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.Set;

/* renamed from: ozd reason: default package */
public final class ozd extends ozf<ozc> implements c {
    public ozd(Set<ozc> set) {
        super(set);
    }

    public final ozc a(FormatListType formatListType, fqn fqn, LicenseLayout licenseLayout) {
        ozc ozc = (ozc) b(formatListType, fqn, licenseLayout);
        Logger.b("Playlist Entity Plugin: Using item list from %s for derived format list type %s", ozc.b(), formatListType);
        return ozc;
    }
}
