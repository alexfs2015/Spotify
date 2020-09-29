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

/* renamed from: olj reason: default package */
final class olj implements olh, oli {
    private static final ImmutableMap<vns, Boolean> e = ImmutableMap.a(uxz.g, Boolean.TRUE, uxz.h, Boolean.FALSE, uxz.e, Boolean.TRUE, uxz.d, Boolean.TRUE, oix.a, Boolean.TRUE);
    /* access modifiers changed from: private */
    public final olf a;
    private final rcd b;
    private final ofh c;
    private final ofj d;
    private ViewGroup f;

    public final void a(Bundle bundle) {
    }

    public final void b(Bundle bundle) {
    }

    public olj(olf olf, rcd rcd, ofh ofh, ofj ofj) {
        this.a = olf;
        this.b = rcd;
        this.c = ofh;
        this.d = ofj;
    }

    public final void a(a aVar) {
        this.a.a(aVar);
    }

    public final void az_() {
        this.a.a((oli) this);
    }

    public final void c() {
        this.a.a((oli) null);
    }

    public final void d() {
        this.a.a.c();
    }

    public final List<View> a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        rbq a2 = rbq.i().a((List<SortOption>) ImmutableList.a(a((int) R.string.sort_order_title, uxz.g), a((int) R.string.sort_order_recently_added, uxz.h), a((int) R.string.sort_order_artist, uxz.e), a((int) R.string.sort_order_album, uxz.d), a((int) R.string.sort_order_custom, oix.a))).c(viewGroup.getContext().getString(R.string.playlist_entity_filter_hint)).a();
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        this.b.a(layoutInflater, frameLayout, a2, new a() {
            public final void a(SortOption sortOption) {
                olj.this.a.b.a(Optional.b(jsr.a(sortOption)));
            }

            public final void a(String str) {
                olj.this.a.b.b(!TextUtils.isEmpty(str) ? Optional.b(str) : Optional.e());
            }

            public final void a() {
                olj.this.a(true);
            }

            public final void b() {
                olj.this.b(false);
            }
        });
        this.f = new FrameLayout(viewGroup.getContext());
        this.f.addView(this.b.c());
        this.f.setVisibility(8);
        int c2 = gaa.c(viewGroup.getContext());
        ViewGroup viewGroup2 = this.f;
        viewGroup2.setPadding(viewGroup2.getPaddingLeft(), c2, this.f.getPaddingRight(), this.f.getPaddingBottom());
        return Lists.a((E[]) new View[]{this.f, frameLayout});
    }

    public final kyf e() {
        return new $$Lambda$olj$gxwmRqoAoGMh9hCVPaj3oONK3CA(this);
    }

    public final void a(boolean z) {
        b(true);
        if (z) {
            this.c.a(-1, 0);
        }
    }

    public final void f() {
        this.b.e();
    }

    public final void a(String str, vns vns) {
        this.b.b(str);
        this.b.b(a(0, vns));
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

    private static SortOption a(vns vns) {
        return new SortOption(vns.a(), vns.b()).a(vns.b());
    }

    private static SortOption a(int i, vns vns) {
        Optional c2 = fbx.a((Iterable<E>) e.keySet()).c(new $$Lambda$olj$d55pMONzmZzuQ60ceoodq1alX7M(vns));
        jss jss = new jss(new SortOption(vns.a(), i, c2.b() ? ((Boolean) e.get(c2.c())).booleanValue() : false).a(vns.b()));
        for (vns c3 = vns.c(); c3 != null; c3 = c3.c()) {
            jss.a(a(c3));
        }
        return jss.a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(vns vns, vns vns2) {
        return vns2 != null && vns2.a().equals(vns.a());
    }

    public final Completable a() {
        return Completable.a();
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
}
