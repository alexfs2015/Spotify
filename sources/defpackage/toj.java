package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: toj reason: default package */
public final class toj implements tuf {
    public final String b(uys uys) {
        int a = a(uys);
        if (a != 1) {
            return a != 3 ? "" : "unfinished";
        }
        return "unplayed";
    }

    private static boolean c(uys uys) {
        return uys.w() == MediaType.AUDIO;
    }

    public final int a(uys uys) {
        if (uys.isHeader()) {
            return 2;
        }
        if (c(uys) && uys.n() != null && uys.m() - uys.n().intValue() >= 30) {
            return 3;
        }
        if (c(uys)) {
            return 1;
        }
        return -1;
    }
}
