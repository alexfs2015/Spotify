package defpackage;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

/* renamed from: tgc reason: default package */
public final class tgc extends tig<ith<PlayerTrack>> implements gkv {
    private final tiq a;
    private final tin d;

    public tgc(tiq tiq, tin tin) {
        this.a = tiq;
        this.d = tin;
        a(true);
    }

    public final int a(int i) {
        return PlayerTrackUtil.isVideo(f(i)) ? 1 : 0;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.a.a(viewGroup);
        }
        if (i == 1) {
            tin tin = this.d;
            tim tim = new tim((LayoutInflater) tin.a(tin.a.get(), 1), ((Integer) tin.a(tin.b.get(), 2)).intValue(), (kbd) tin.a(tin.c.get(), 3), (DisplayMetrics) tin.a(tin.d.get(), 4), (ViewGroup) tin.a(viewGroup, 5));
            return tim;
        }
        StringBuilder sb = new StringBuilder("Unsupported view type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((ith) uVar).a(f(i), i);
    }

    public final String c(int i) {
        return a(i) == 1 ? "video" : "audio";
    }
}
