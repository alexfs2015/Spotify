package defpackage;

import android.graphics.Color;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.ItemConfiguration.HeartAndBan;
import com.spotify.music.playlist.ui.Rows;
import com.spotify.music.playlist.ui.Rows.e;
import java.util.Collections;
import java.util.List;

/* renamed from: oak reason: default package */
public final class oak extends androidx.recyclerview.widget.RecyclerView.a<u> implements gkw, ovm<oak> {
    private final ovj a;
    private final twc<ovg> d;
    private final ovh e;
    private List<vle> f = Collections.emptyList();
    private ItemConfiguration g = ItemConfiguration.r().a();

    /* renamed from: oak$a */
    public interface a {
        oak a(tvw tvw, who<jor<ovg>> who);
    }

    public oak(ovj ovj, defpackage.twc.a<ovg> aVar, ovh ovh, tvw tvw, who<jor<ovg>> who) {
        this.d = aVar.a(tvw, who);
        this.e = ovh;
        this.a = ovj;
        a(true);
    }

    public final /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.a a() {
        return this;
    }

    public final u a(ViewGroup viewGroup, int i) {
        e a2 = Rows.a(viewGroup.getContext(), viewGroup);
        a2.getView().setBackgroundColor(Color.parseColor("#282828"));
        return fra.a(a2);
    }

    public final void a(u uVar, int i) {
        vle vle = (vle) this.f.get(i);
        uVar.o.getContext();
        u uVar2 = uVar;
        this.d.a(uVar2, this.g, vle, ovh.a(vle, i), this.a.a(vle), false, i);
    }

    public final void a(ItemConfiguration itemConfiguration) {
        if (this.g != itemConfiguration) {
            this.g = itemConfiguration.q().a(HeartAndBan.ONLY_HEART).a();
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
