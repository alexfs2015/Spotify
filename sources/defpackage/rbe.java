package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import java.util.Map.Entry;

/* renamed from: rbe reason: default package */
public final class rbe {
    public static MusicPageId a(String str, MusicPageId musicPageId) {
        fdz R_ = rgs.a().entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            if (((rgr) entry.getValue()).a().contains(jva.a(str).b)) {
                return (MusicPageId) entry.getKey();
            }
        }
        return musicPageId;
    }
}
