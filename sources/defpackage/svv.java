package defpackage;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: svv reason: default package */
public final class svv extends sxz<iqu<PlayerTrack>> implements gjk {
    private final syj a;
    private final syg d;

    public final /* synthetic */ void a(u uVar, int i) {
        ((iqu) uVar).a(f(i), i);
    }

    public svv(syj syj, syg syg) {
        this.a = syj;
        this.d = syg;
        a(true);
    }

    public final int a(int i) {
        return PlayerTrackUtil.isVideo(f(i)) ? 1 : 0;
    }

    public final String c(int i) {
        return a(i) == 1 ? "video" : "audio";
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.a.a(viewGroup);
        }
        if (i == 1) {
            syg syg = this.d;
            syf syf = new syf((LayoutInflater) syg.a(syg.a.get(), 1), ((Integer) syg.a(syg.b.get(), 2)).intValue(), (jzd) syg.a(syg.c.get(), 3), (DisplayMetrics) syg.a(syg.d.get(), 4), (ViewGroup) syg.a(viewGroup, 5));
            return syf;
        }
        StringBuilder sb = new StringBuilder("Unsupported view type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
