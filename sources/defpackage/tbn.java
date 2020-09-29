package defpackage;

import com.spotify.music.nowplaying.core.modes.NowPlayingMode;

/* renamed from: tbn reason: default package */
public interface tbn {

    /* renamed from: tbn$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String a() {
            StringBuilder sb = new StringBuilder();
            sb.append(NowPlayingMode.PODCAST.mName);
            sb.append('_');
            return sb.toString();
        }
    }
}
