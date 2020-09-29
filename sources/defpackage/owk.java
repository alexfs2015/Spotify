package defpackage;

import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import java.util.List;

/* renamed from: owk reason: default package */
public final class owk {
    public final List<upp> a = Lists.a();
    public final List<SortOption> b = Lists.a();
    final List<owh> c = Lists.a();
    final SortOption d = new SortOption("consumptionOrder", (int) R.string.sort_order_date);
    final SortOption e;
    final SortOption f;
    final ows g;
    final String h;
    public upp i;
    public SortOption j;
    public upp k;
    public final a l;
    public final a m;
    private upp n;
    private upp o;

    owk(ows ows, boolean z, String str) {
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
            public final void a(upp upp) {
                for (upp upp2 : owk.this.a) {
                    upp2.a = false;
                }
                if (upp.c == owk.this.i.c) {
                    owk owk = owk.this;
                    owk.i = owk.k;
                } else {
                    owk.this.i = upp;
                }
                owk.this.i.a = true;
                owk.a(owk.this);
            }
        };
        this.m = new a() {
            public final void a(SortOption sortOption) {
                owk owk = owk.this;
                owk.j = sortOption;
                owk.g.a(owk.this.h, owk.this.j.a());
                owk.a(owk.this);
            }
        };
        this.g = ows;
        this.h = str;
        this.a.clear();
        upp upp = new upp(this.l, R.string.filter_show_all_episodes);
        upp.c = 0;
        this.k = upp;
        upp upp2 = new upp(this.l, R.string.filter_show_unheard_only);
        upp2.c = 2;
        this.n = upp2;
        upp upp3 = new upp(this.l, R.string.filter_show_only_offlined_content);
        upp3.c = 3;
        this.o = upp3;
        this.a.add(this.k);
        if (z) {
            this.a.add(this.o);
        }
        this.a.add(this.n);
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

    static /* synthetic */ void a(owk owk) {
        for (owh a2 : owk.c) {
            a2.a();
        }
    }
}
