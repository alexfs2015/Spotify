package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: ufc reason: default package */
public final class ufc implements uez {
    private final szp a;
    private final ufi b;
    private final uhz c;

    public ufc(szp szp, ufi ufi, uhz uhz) {
        this.a = szp;
        this.b = ufi;
        this.c = uhz;
    }

    public final void a(vkv vkv, vkv[] vkvArr, String str, int i) {
        if (vkv.w() == MediaType.AUDIO) {
            this.a.a(vkv.getUri());
            this.c.a(vkv.getUri(), str, i);
            return;
        }
        this.b.a(vkv, vkvArr, str, i);
    }
}
