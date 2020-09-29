package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import io.reactivex.Completable;
import java.util.List;

/* renamed from: osn reason: default package */
final class osn implements osl, osm {
    private static final ImmutableMap<way, Boolean> e = ImmutableMap.a(vkb.g, Boolean.TRUE, vkb.h, Boolean.FALSE, vkb.e, Boolean.TRUE, vkb.d, Boolean.TRUE, vkb.f, Boolean.FALSE);
    /* access modifiers changed from: private */
    public final osj a;
    private final rlb b;
    private final oml c;
    private final omn d;
    private ViewGroup f;

    public osn(osj osj, rlb rlb, oml oml, omn omn) {
        this.a = osj;
        this.b = rlb;
        this.c = oml;
        this.d = omn;
    }

    private static SortOption a(int i, way way) {
        Optional c2 = fcp.a((Iterable<E>) e.keySet()).c(new $$Lambda$osn$YEstEBGa1MonafXk2YwTzJo15hU(way));
        juz juz = new juz(new SortOption(way.a(), i, c2.b() ? ((Boolean) e.get(c2.c())).booleanValue() : false).a(way.b()));
        for (way c3 = way.c(); c3 != null; c3 = c3.c()) {
            juz.a(a(c3));
        }
        return juz.a;
    }

    private static SortOption a(way way) {
        return new SortOption(way.a(), way.b()).a(way.b());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(way way, way way2) {
        return way2 != null && way2.a().equals(way.a());
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            this.f.setVisibility(0);
            this.b.d();
            this.d.a(false);
            return;
        }
        this.f.setVisibility(8);
        this.d.a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean g() {
        if (!(this.f.getVisibility() == 0)) {
            return false;
        }
        b(false);
        this.b.b("");
        return true;
    }

    public final Completable a() {
        return Completable.a();
    }

    public final List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        rkm a2 = rkm.i().a((List<SortOption>) ImmutableList.a(a((int) R.string.sort_order_title, vkb.g), a((int) R.string.sort_order_recently_added, vkb.h), a((int) R.string.sort_order_artist, vkb.e), a((int) R.string.sort_order_album, vkb.d), a((int) R.string.sort_order_custom, oqb.a))).c(viewGroup.getContext().getString(R.string.playlist_entity_filter_hint)).a();
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        this.b.a(layoutInflater, frameLayout, a2, new a() {
            public final void a() {
                osn.this.a(true);
            }

            public final void a(SortOption sortOption) {
                osn.this.a.b.a(Optional.b(juy.a(sortOption)));
            }

            public final void a(String str) {
                osn.this.a.b.b(!TextUtils.isEmpty(str) ? Optional.b(str) : Optional.e());
            }

            public final void b() {
                osn.this.b(false);
            }
        });
        this.f = new FrameLayout(viewGroup.getContext());
        this.f.addView(this.b.c());
        this.f.setVisibility(8);
        int c2 = gau.c(viewGroup.getContext());
        ViewGroup viewGroup2 = this.f;
        viewGroup2.setPadding(viewGroup2.getPaddingLeft(), c2, this.f.getPaddingRight(), this.f.getPaddingBottom());
        return Lists.a((E[]) new View[]{this.f, frameLayout});
    }

    public final void a(Bundle bundle) {
    }

    public final void a(String str, way way) {
        this.b.b(str);
        this.b.b(a(0, way));
    }

    public final void a(a aVar) {
        this.a.a(aVar);
    }

    public final void a(boolean z) {
        b(true);
        if (z) {
            this.c.a(-1, 0);
        }
    }

    public final void ay_() {
        this.a.a((osm) this);
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
        this.a.a((osm) null);
    }

    public final void d() {
        this.a.a.c();
    }

    public final lbp e() {
        return new $$Lambda$osn$Q3PXqSD6SZo2rjgljGhuejtW3zY(this);
    }

    public final void f() {
        this.b.e();
    }
}
