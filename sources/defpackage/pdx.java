package defpackage;

import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import java.util.List;

/* renamed from: pdx reason: default package */
public final class pdx {
    public final List<vau> a = Lists.a();
    public final List<SortOption> b = Lists.a();
    final List<pdu> c = Lists.a();
    final SortOption d = new SortOption("consumptionOrder", (int) R.string.sort_order_date);
    final SortOption e;
    final SortOption f;
    final pef g;
    final String h;
    public vau i;
    public SortOption j;
    public vau k;
    public final a l;
    public final a m;
    private vau n;
    private vau o;

    pdx(pef pef, boolean z, String str) {
        String str2 = "number";
        SortOption sortOption = new SortOption(str2, R.string.sort_order_date, true);
        String str3 = "publishDate";
        SortOption sortOption2 = new SortOption(str3, true);
        String str4 = "name";
        sortOption2.mSecondarySortOption = new SortOption(str4);
        sortOption.mSecondarySortOption = sortOption2;
        this.e = sortOption;
        SortOption a2 = new SortOption(str2, R.string.sort_order_date, true).a(true);
        SortOption a3 = new SortOption(str3, true).a(true);
        a3.mSecondarySortOption = new SortOption(str4);
        a2.mSecondarySortOption = a3;
        this.f = a2;
        this.l = new a() {
            public final void a(vau vau) {
                for (vau vau2 : pdx.this.a) {
                    vau2.a = false;
                }
                if (vau.c == pdx.this.i.c) {
                    pdx pdx = pdx.this;
                    pdx.i = pdx.k;
                } else {
                    pdx.this.i = vau;
                }
                pdx.this.i.a = true;
                pdx.a(pdx.this);
            }
        };
        this.m = new a() {
            public final void a(SortOption sortOption) {
                pdx pdx = pdx.this;
                pdx.j = sortOption;
                pdx.g.a(pdx.this.h, pdx.this.j.a());
                pdx.a(pdx.this);
            }
        };
        this.g = pef;
        this.h = str;
        this.a.clear();
        vau vau = new vau(this.l, R.string.filter_show_all_episodes);
        vau.c = 0;
        this.k = vau;
        vau vau2 = new vau(this.l, R.string.filter_show_unheard_only);
        vau2.c = 2;
        this.n = vau2;
        vau vau3 = new vau(this.l, R.string.filter_show_only_offlined_content);
        vau3.c = 3;
        this.o = vau3;
        this.a.add(this.k);
        if (z) {
            this.a.add(this.o);
        }
        this.a.add(this.n);
    }

    static /* synthetic */ void a(pdx pdx) {
        for (pdu a2 : pdx.c) {
            a2.a();
        }
    }

    public final boolean a() {
        return this.o.a;
    }

    public final boolean b() {
        return this.n.a;
    }

    public final boolean c() {
        return this.n.a || this.o.a;
    }
}
