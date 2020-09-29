package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;

/* renamed from: qtc reason: default package */
public final class qtc {
    public static sih a(MusicPageId musicPageId, String str) {
        qyc qyc = (qyc) qyd.a().get(musicPageId);
        Optional b = qyc.b();
        Optional c = qyc.c();
        if (!b.b() && !c.b()) {
            throw new IllegalArgumentException("You need to provide either ViewUri or ViewUriVerifier in the MusicPagesSetup");
        } else if (b.b()) {
            return (sih) b.c();
        } else {
            if (str != null) {
                return ((b) c.c()).a(str);
            }
            throw new IllegalArgumentException("If you provide a ViewUriVerifier You need to provide a uri");
        }
    }
}
