package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import java.util.Map.Entry;

/* renamed from: qsp reason: default package */
public final class qsp {
    public static MusicPageId a(String str, MusicPageId musicPageId) {
        fdh R_ = qyd.a().entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            if (((qyc) entry.getValue()).a().contains(jst.a(str).b)) {
                return (MusicPageId) entry.getKey();
            }
        }
        return musicPageId;
    }
}
