package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.mobile.android.ui.layout_traits.TraitsLayoutManager;
import com.spotify.music.R;
import io.reactivex.Completable;
import java.util.List;

/* renamed from: opo reason: default package */
final class opo implements opm, opn {
    private static final int a = opo.class.hashCode();
    private final gut b;
    private final opi c;
    private final udr d;
    private final Context e;
    private final gum f;
    private List<gzt> g;
    private uwh h;
    private gzt i;

    public opo(gut gut, opi opi, udr udr, Context context, gum gum) {
        this.b = gut;
        this.c = opi;
        this.d = udr;
        this.e = context;
        this.f = gum;
    }

    public final Completable a() {
        return this.c.b;
    }

    public final void a(Bundle bundle) {
        opi opi = this.c;
        if (bundle == null) {
            opi.b.onComplete();
            return;
        }
        hai hai = (hai) bundle.getParcelable(opi.class.getName());
        if (hai != null) {
            opi.c.onNext(a.f().b(false).a(false).a(hai).a());
        }
    }

    public final void a(a aVar) {
        this.c.a(aVar);
    }

    public final void az_() {
        this.c.a((opn) this);
    }

    public final void c() {
        this.c.a((opn) null);
    }

    public final void d() {
        this.c.a.c();
    }

    public final void b(Bundle bundle) {
        bundle.putParcelable(opi.class.getName(), ((a) this.c.c.j()).a());
    }

    public final void a(RecyclerView recyclerView, uwh uwh) {
        this.h = uwh;
        String str = "ui:source";
        this.i = hae.builder().a("mlt-header").a((gzr) HubsGlueSectionHeader.SECTION_HEADER).a(haf.builder().a(this.e.getString(R.string.more_like_this_section_header_title))).b(str, this.d.a()).a();
        this.g = Lists.a();
        gzt a2 = hae.builder().a("mlt-loading-spinner").a((gzr) HubsCommonComponent.LOADING_SPINNER).b(str, this.d.a()).a();
        this.g.add(this.i);
        this.g.add(a2);
        uwh.a((a<H>) this.b, a);
        uwh.a(false, a);
        Context context = this.e;
        recyclerView.a((i) new TraitsLayoutManager(context, gvt.a(context, this.f), this.e.getResources().getInteger(R.integer.grid_columns)));
    }

    public final void a(boolean z) {
        if (z) {
            this.b.a(this.g);
            this.b.e();
            this.h.a(true, a);
            return;
        }
        this.h.a(false, a);
    }

    public final void a(ImmutableList<hae> immutableList) {
        this.b.a((List<? extends gzt>) ImmutableList.g().c(this.i).b((Iterable<? extends E>) immutableList).a());
        this.b.e();
        this.h.a(true, a);
    }
}
