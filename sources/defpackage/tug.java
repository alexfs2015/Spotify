package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: tug reason: default package */
public final class tug implements tuf {
    public final String b(uys uys) {
        return "";
    }

    public final int a(uys uys) {
        if (uys.isHeader()) {
            return 2;
        }
        boolean z = true;
        if (uys.w() == MediaType.AUDIO) {
            return 1;
        }
        if (uys.w() != MediaType.VIDEO) {
            z = false;
        }
        if (z) {
            return 0;
        }
        return -1;
    }
}
