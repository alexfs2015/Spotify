package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;

/* renamed from: rbr reason: default package */
public final class rbr {
    public static sso a(MusicPageId musicPageId, String str) {
        rgr rgr = (rgr) rgs.a().get(musicPageId);
        Optional b = rgr.b();
        Optional c = rgr.c();
        if (!b.b() && !c.b()) {
            throw new IllegalArgumentException("You need to provide either ViewUri or ViewUriVerifier in the MusicPagesSetup");
        } else if (b.b()) {
            return (sso) b.c();
        } else {
            if (str != null) {
                return ((b) c.c()).a(str);
            }
            throw new IllegalArgumentException("If you provide a ViewUriVerifier You need to provide a uri");
        }
    }
}
