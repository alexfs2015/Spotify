package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.Set;

/* renamed from: orx reason: default package */
public final class orx extends orz<orw> implements c {
    public orx(Set<orw> set) {
        super(set);
    }

    public final orw a(FormatListType formatListType, fpt fpt, LicenseLayout licenseLayout) {
        orw orw = (orw) b(formatListType, fpt, licenseLayout);
        Logger.b("Playlist Entity Plugin: Using item list from %s for derived format list type %s", orw.b(), formatListType);
        return orw;
    }
}
