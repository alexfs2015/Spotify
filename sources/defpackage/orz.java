package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.music.features.playlistentity.plugin.Plugin;
import com.spotify.music.features.playlistentity.plugin.Plugin.Type;
import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.Set;

/* renamed from: orz reason: default package */
class orz<T extends Plugin> {
    private final Set<T> a;

    public orz(Set<T> set) {
        this.a = set;
    }

    /* access modifiers changed from: protected */
    public final T b(FormatListType formatListType, fpt fpt, LicenseLayout licenseLayout) {
        T t = null;
        for (T t2 : this.a) {
            boolean a2 = t2.a(formatListType, fpt);
            if (t2.a() == Type.CUSTOM && a2) {
                return t2;
            }
            if (t2.a() == Type.VANILLA) {
                t = t2;
            }
        }
        return (Plugin) fay.a(t);
    }
}
