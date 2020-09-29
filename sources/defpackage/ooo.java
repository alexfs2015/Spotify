package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.Rows;
import java.util.Collections;
import java.util.List;

/* renamed from: ooo reason: default package */
public final class ooo extends androidx.recyclerview.widget.RecyclerView.a<u> implements gjk, oog<ooo> {
    private static int a;
    private static int d;
    private static int e;
    private final ofl f;
    /* access modifiers changed from: private */
    public final ood g;
    private final tkk<ooa> h;
    private final oob i;
    private final tui j;
    private List<uzb> k = Collections.emptyList();
    private ItemConfiguration l = ItemConfiguration.r().a();
    private boolean m;

    /* renamed from: ooo$a */
    public interface a {
        ooo a(tke tke, vti<jmf<ooa>> vti);
    }

    public final /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.a a() {
        return this;
    }

    static {
        Class<ooo> cls = ooo.class;
        a = cls.hashCode();
        d = cls.hashCode() + 1;
        e = cls.hashCode() + 2;
    }

    public ooo(ofl ofl, ood ood, defpackage.tkk.a<ooa> aVar, oob oob, tui tui, tke tke, vti<jmf<ooa>> vti) {
        this.f = ofl;
        this.h = aVar.a(tke, vti);
        this.i = oob;
        this.j = tui;
        this.g = ood;
        a(true);
    }

    public final void a(List<uzb> list) {
        this.k = (List) fay.a(list);
        e();
    }

    public final int b() {
        return this.k.size();
    }

    public final void a(ItemConfiguration itemConfiguration) {
        if (this.l != itemConfiguration) {
            this.l = itemConfiguration;
            e();
        }
    }

    public final void a(String str, boolean z) {
        if (this.g.a(str) || this.m != z) {
            e();
        }
        this.m = z;
    }

    public final String c(int i2) {
        int a2 = a(i2);
        if (a2 == a) {
            return "item";
        }
        if (a2 == e) {
            return "podcast_row";
        }
        if (a2 == d) {
            return "preview_item";
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    public final long b(int i2) {
        uzb uzb = (uzb) this.k.get(i2);
        long hashCode = (long) (hashCode() ^ uzb.getUri().hashCode());
        String d2 = uzb.d();
        return d2 != null ? hashCode ^ ((long) d2.hashCode()) : hashCode;
    }

    public final int a(int i2) {
        uzb uzb = (uzb) this.k.get(i2);
        if (uzb.a() != null) {
            return e;
        }
        if (uzb.b() == null || !this.l.m()) {
            return a;
        }
        return d;
    }

    public final u a(ViewGroup viewGroup, int i2) {
        if (i2 == a) {
            return fqg.a(Rows.a(viewGroup.getContext(), viewGroup));
        }
        if (i2 == d) {
            return fqg.a(Rows.b(viewGroup.getContext(), viewGroup));
        }
        if (i2 == e) {
            return fqg.a(this.j.a(viewGroup));
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    public final void a(u uVar, int i2) {
        this.f.a(i2);
        final uzb uzb = (uzb) this.k.get(i2);
        uVar.o.getContext();
        u uVar2 = uVar;
        this.h.a(uVar2, this.l, uzb, oob.a(uzb, i2), (b) new b() {
            public final boolean a() {
                return ooo.this.g.a(uzb);
            }

            public final boolean b() {
                return ooo.this.g.b(uzb);
            }
        }, this.m, i2);
    }
}
