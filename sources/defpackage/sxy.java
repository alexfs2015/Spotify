package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.canvas.model.CanvasContentType;
import com.squareup.picasso.Picasso;

/* renamed from: sxy reason: default package */
public final class sxy extends sxz<iqu<PlayerTrack>> implements gjk {
    private final syj a;
    private final syl d;
    private final syb e;
    private final syd f;
    private final kug g;
    private final kuq h;

    public final /* synthetic */ void a(u uVar, int i) {
        ((iqu) uVar).a(f(i), i);
    }

    public sxy(syj syj, syl syl, syb syb, syd syd, kug kug, kuq kuq) {
        this.a = syj;
        this.d = syl;
        this.e = syb;
        this.f = syd;
        this.g = kug;
        this.h = kuq;
        a(true);
    }

    public final int a(int i) {
        CanvasContentType canvasContentType;
        PlayerTrack f2 = f(i);
        boolean z = true;
        if (!this.g.a(f2)) {
            return PlayerTrackUtil.isVideo(f2) ? 1 : 0;
        }
        String str = (String) f2.metadata().get("canvas.type");
        if (str == null) {
            canvasContentType = null;
        } else {
            canvasContentType = CanvasContentType.valueOf(str);
        }
        if (!(canvasContentType == CanvasContentType.VIDEO || canvasContentType == CanvasContentType.VIDEO_LOOPING || canvasContentType == CanvasContentType.VIDEO_LOOPING_RANDOM)) {
            z = false;
        }
        return z ? 2 : 3;
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

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (i2 == 0) {
            return this.a.a(viewGroup2);
        }
        if (i2 == 1) {
            syl syl = this.d;
            syk syk = new syk((LayoutInflater) syl.a(syl.a.get(), 1), ((Integer) syl.a(syl.b.get(), 2)).intValue(), (uvf) syl.a(syl.c.get(), 3), (jzd) syl.a(syl.d.get(), 4), (ViewGroup) syl.a(viewGroup2, 5));
            return syk;
        } else if (i2 == 2) {
            syd syd = this.f;
            syc syc = new syc((LayoutInflater) syd.a(syd.a.get(), 1), ((Integer) syd.a(syd.b.get(), 2)).intValue(), (a) syd.a(syd.c.get(), 3), (jxn) syd.a(syd.d.get(), 4), (jyd) syd.a(syd.e.get(), 5), (kuq) syd.a(syd.f.get(), 6), (jyo) syd.a(syd.g.get(), 7), (kuv) syd.a(syd.h.get(), 8), (kux) syd.a(syd.i.get(), 9), (Picasso) syd.a(syd.j.get(), 10), (ViewGroup) syd.a(viewGroup2, 11), (kus) syd.a(syd.k.get(), 12));
            return syc;
        } else if (i2 == 3) {
            syb syb = this.e;
            sya sya = new sya((LayoutInflater) syb.a(syb.a.get(), 1), ((Integer) syb.a(syb.b.get(), 2)).intValue(), (kuq) syb.a(syb.c.get(), 3), (Picasso) syb.a(syb.d.get(), 4), (kuv) syb.a(syb.e.get(), 5), (kux) syb.a(syb.f.get(), 6), (ViewGroup) syb.a(viewGroup2, 7));
            return sya;
        } else {
            StringBuilder sb = new StringBuilder("Unsupported view type: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
