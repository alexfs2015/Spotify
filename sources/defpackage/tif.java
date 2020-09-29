package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.canvas.model.CanvasContentType;
import com.squareup.picasso.Picasso;

/* renamed from: tif reason: default package */
public final class tif extends tig<ith<PlayerTrack>> implements gkv {
    private final tiq a;
    private final tis d;
    private final tii e;
    private final tik f;
    private final kxp g;
    private final kxz h;

    public tif(tiq tiq, tis tis, tii tii, tik tik, kxp kxp, kxz kxz) {
        this.a = tiq;
        this.d = tis;
        this.e = tii;
        this.f = tik;
        this.g = kxp;
        this.h = kxz;
        a(true);
    }

    public final int a(int i) {
        PlayerTrack f2 = f(i);
        boolean z = true;
        if (!this.g.a(f2)) {
            return PlayerTrackUtil.isVideo(f2) ? 1 : 0;
        }
        String str = (String) f2.metadata().get("canvas.type");
        CanvasContentType valueOf = str == null ? null : CanvasContentType.valueOf(str);
        if (!(valueOf == CanvasContentType.VIDEO || valueOf == CanvasContentType.VIDEO_LOOPING || valueOf == CanvasContentType.VIDEO_LOOPING_RANDOM)) {
            z = false;
        }
        return z ? 2 : 3;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (i2 == 0) {
            return this.a.a(viewGroup2);
        }
        if (i2 == 1) {
            tis tis = this.d;
            tir tir = new tir((LayoutInflater) tis.a(tis.a.get(), 1), ((Integer) tis.a(tis.b.get(), 2)).intValue(), (vgw) tis.a(tis.c.get(), 3), (kbd) tis.a(tis.d.get(), 4), (ViewGroup) tis.a(viewGroup2, 5));
            return tir;
        } else if (i2 == 2) {
            tik tik = this.f;
            tij tij = new tij((LayoutInflater) tik.a(tik.a.get(), 1), ((Integer) tik.a(tik.b.get(), 2)).intValue(), (a) tik.a(tik.c.get(), 3), (jzn) tik.a(tik.d.get(), 4), (kad) tik.a(tik.e.get(), 5), (kxz) tik.a(tik.f.get(), 6), (kao) tik.a(tik.g.get(), 7), (kye) tik.a(tik.h.get(), 8), (kyg) tik.a(tik.i.get(), 9), (Picasso) tik.a(tik.j.get(), 10), (ViewGroup) tik.a(viewGroup2, 11), (kyb) tik.a(tik.k.get(), 12));
            return tij;
        } else if (i2 == 3) {
            tii tii = this.e;
            tih tih = new tih((LayoutInflater) tii.a(tii.a.get(), 1), ((Integer) tii.a(tii.b.get(), 2)).intValue(), (kxz) tii.a(tii.c.get(), 3), (Picasso) tii.a(tii.d.get(), 4), (kye) tii.a(tii.e.get(), 5), (kyg) tii.a(tii.f.get(), 6), (ViewGroup) tii.a(viewGroup2, 7));
            return tih;
        } else {
            StringBuilder sb = new StringBuilder("Unsupported view type: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((ith) uVar).a(f(i), i);
    }

    public final String c(int i) {
        int a2 = a(i);
        if (a2 == 0) {
            return "audio";
        }
        if (a2 == 1) {
            return "video";
        }
        if (a2 == 2) {
            return "canvas-video";
        }
        if (a2 == 3) {
            return "canvas-image";
        }
        StringBuilder sb = new StringBuilder("Unknown view type: ");
        sb.append(a(i));
        throw new IllegalArgumentException(sb.toString());
    }
}
