package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.music.feedback.FeedbackValue;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.Rows;
import com.spotify.music.playlist.ui.Rows.h;
import java.util.Collections;
import java.util.List;

/* renamed from: tvd reason: default package */
public final class tvd extends androidx.recyclerview.widget.RecyclerView.a<u> implements gkw, ovm<tvd> {
    private final ovj a;
    private final twc<ovg> d;
    private final ovh e;
    private List<vle> f = Collections.emptyList();
    private ItemConfiguration g = ItemConfiguration.r().a();
    private final tus h;

    /* renamed from: tvd$a */
    public interface a {
        tvd a(tvw tvw, who<jor<ovg>> who);
    }

    public tvd(ovj ovj, defpackage.twc.a<ovg> aVar, ovh ovh, tut tut, tvw tvw, who<jor<ovg>> who) {
        this.d = aVar.a(tvw, who);
        this.e = ovh;
        this.a = ovj;
        if (tvw != null) {
            this.h = new tus(tvw);
            a(true);
            return;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.a a() {
        return this;
    }

    public final u a(ViewGroup viewGroup, int i) {
        return fra.a(Rows.a(viewGroup.getContext(), viewGroup));
    }

    public final void a(u uVar, int i) {
        vle vle = (vle) this.f.get(i);
        uVar.o.getContext();
        ovg a2 = ovh.a(vle, i);
        ((fsc) fbp.a(fqv.a(uVar.o, fsc.class))).c().setVisibility(8);
        String str = (String) vle.c().get(Metadata.DISLIKE_FEEDBACK_SELECTED);
        this.d.a(uVar, this.g, vle, a2, this.a.a(vle), false, i);
        if (FeedbackValue.ON == FeedbackValue.a(str)) {
            this.d.a(uVar, this.g, vle, null, this.a.a(vle), false, i);
            h hVar = (h) fbp.a(fqv.a(uVar.o, h.class));
            hVar.a(this.h.a(uVar.o.getContext(), vle, i));
            hVar.c(true);
        }
    }

    public final void a(ItemConfiguration itemConfiguration) {
        if (this.g != itemConfiguration) {
            this.g = itemConfiguration;
            e();
        }
    }

    public final void a(String str, boolean z) {
        if (this.a.a(str)) {
            e();
        }
    }

    public final void a(List<vle> list) {
        this.f = (List) fbp.a(list);
        e();
    }

    public final int b() {
        return this.f.size();
    }

    public final long b(int i) {
        vle vle = (vle) this.f.get(i);
        long hashCode = (long) (hashCode() ^ vle.getUri().hashCode());
        String d2 = vle.d();
        return d2 != null ? hashCode ^ ((long) d2.hashCode()) : hashCode;
    }
}
