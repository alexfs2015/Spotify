package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: ugj reason: default package */
public final class ugj implements ugi {
    public final int a(vkv vkv) {
        if (vkv.isHeader()) {
            return 2;
        }
        boolean z = true;
        if (vkv.w() == MediaType.AUDIO) {
            return 1;
        }
        if (vkv.w() != MediaType.VIDEO) {
            z = false;
        }
        return z ? 0 : -1;
    }

    public final String b(vkv vkv) {
        return "";
    }
}
