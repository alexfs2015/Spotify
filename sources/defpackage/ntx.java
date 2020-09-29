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

/* renamed from: ntx reason: default package */
public final class ntx extends androidx.recyclerview.widget.RecyclerView.a<u> implements gjl, oog<ntx> {
    private final ood a;
    private final tkk<ooa> d;
    private final oob e;
    private List<uzb> f = Collections.emptyList();
    private ItemConfiguration g = ItemConfiguration.r().a();

    /* renamed from: ntx$a */
    public interface a {
        ntx a(tke tke, vti<jmf<ooa>> vti);
    }

    public final /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.a a() {
        return this;
    }

    public ntx(ood ood, defpackage.tkk.a<ooa> aVar, oob oob, tke tke, vti<jmf<ooa>> vti) {
        this.d = aVar.a(tke, vti);
        this.e = oob;
        this.a = ood;
        a(true);
    }

    public final u a(ViewGroup viewGroup, int i) {
        e a2 = Rows.a(viewGroup.getContext(), viewGroup);
        a2.getView().setBackgroundColor(Color.parseColor("#282828"));
        return fqg.a(a2);
    }

    public final void a(u uVar, int i) {
        uzb uzb = (uzb) this.f.get(i);
        uVar.o.getContext();
        u uVar2 = uVar;
        this.d.a(uVar2, this.g, uzb, oob.a(uzb, i), this.a.a(uzb), false, i);
    }

    public final int b() {
        return this.f.size();
    }

    public final void a(List<uzb> list) {
        this.f = (List) fay.a(list);
        e();
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

    public final long b(int i) {
        uzb uzb = (uzb) this.f.get(i);
        long hashCode = (long) (hashCode() ^ uzb.getUri().hashCode());
        String d2 = uzb.d();
        return d2 != null ? hashCode ^ ((long) d2.hashCode()) : hashCode;
    }
}
