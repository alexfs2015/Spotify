package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: uaj reason: default package */
public final class uaj implements ugi {
    private static boolean c(vkv vkv) {
        return vkv.w() == MediaType.AUDIO;
    }

    public final int a(vkv vkv) {
        if (vkv.isHeader()) {
            return 2;
        }
        if (c(vkv) && vkv.n() != null && vkv.m() - vkv.n().intValue() >= 30) {
            return 3;
        }
        return c(vkv) ? 1 : -1;
    }

    public final String b(vkv vkv) {
        int a = a(vkv);
        return a != 1 ? a != 3 ? "" : "unfinished" : "unplayed";
    }
}
