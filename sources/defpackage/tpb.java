package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: tpb reason: default package */
public final class tpb extends tig<ith<PlayerTrack>> implements gkw {
    private final tpd a;

    public tpb(tpd tpd) {
        this.a = tpd;
        a(true);
    }

    public final int a(int i) {
        return 0;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        tpd tpd = this.a;
        return new tpc((LayoutInflater) tpd.a(tpd.a.get(), 1), ((Integer) tpd.a(tpd.b.get(), 2)).intValue(), (ViewGroup) tpd.a(viewGroup, 3));
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((ith) uVar).a(f(i), i);
    }
}
