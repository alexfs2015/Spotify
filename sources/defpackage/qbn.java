package defpackage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.b;
import com.google.android.material.tabs.TabLayout.e;
import com.google.common.base.Optional;
import com.spotify.music.R;
import com.spotify.music.search.podcasts.tabs.SearchTab;
import java.util.List;

/* renamed from: qbn reason: default package */
public final class qbn implements qbm {
    private static final txr e = $$Lambda$qbn$TsAWsU45SfWlOknVdjdgAsN7yFs.INSTANCE;
    private final int a;
    private uux b;
    private Optional<TabLayout> c = Optional.e();
    /* access modifiers changed from: private */
    public txr d = e;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(SearchTab searchTab) {
    }

    public qbn(Activity activity) {
        this.a = uuu.b(activity, 16842836);
        this.b = uuy.a(this.a);
    }

    public final void a(txr txr) {
        if (txr == null) {
            txr = e;
        }
        this.d = txr;
    }

    public final void a(ViewGroup viewGroup) {
        TabLayout tabLayout = (TabLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_tabs, viewGroup, false);
        tabLayout.setVisibility(8);
        tabLayout.setBackground(new ColorDrawable(0));
        this.c = Optional.b(tabLayout);
        tabLayout.a((b) new fai() {
            public final void a(e eVar) {
                SearchTab searchTab = (SearchTab) eVar.a;
                if (searchTab != null) {
                    qbn.this.d.onTabClicked(searchTab);
                }
            }
        });
    }

    public final Optional<TabLayout> a() {
        return this.c;
    }

    public final void a(List<SearchTab> list) {
        if (this.c.b()) {
            TabLayout tabLayout = (TabLayout) this.c.c();
            tabLayout.c();
            tabLayout.setVisibility(list.isEmpty() ? 8 : 0);
            for (SearchTab searchTab : list) {
                e a2 = tabLayout.a().a(LayoutInflater.from(tabLayout.getContext()).inflate(R.layout.search_custom_tab_view, tabLayout, false));
                int i = searchTab.mTabNameResId;
                if (a2.g != null) {
                    e a3 = a2.a(a2.g.getResources().getText(i));
                    a3.a = searchTab;
                    tabLayout.a(a3);
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
        }
    }

    public final void a(float f) {
        a(this.b.interpolate(f));
    }

    public final void a(int i) {
        if (this.c.b()) {
            TabLayout tabLayout = (TabLayout) this.c.c();
            ColorDrawable colorDrawable = (ColorDrawable) tabLayout.getBackground();
            colorDrawable.setColor(i);
            tabLayout.setBackground(colorDrawable);
        }
    }

    public final void b(int i) {
        this.b = uuy.a(i, this.a);
    }
}
