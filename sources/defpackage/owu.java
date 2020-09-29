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

/* renamed from: owu reason: default package */
final class owu implements ows, owt {
    private static final int a = owu.class.hashCode();
    private final gwt b;
    private final owo c;
    private final uqm d;
    private final Context e;
    private final gwm f;
    private List<hcm> g;
    private vhx h;
    private hcm i;

    public owu(gwt gwt, owo owo, uqm uqm, Context context, gwm gwm) {
        this.b = gwt;
        this.c = owo;
        this.d = uqm;
        this.e = context;
        this.f = gwm;
    }

    public final Completable a() {
        return this.c.b;
    }

    public final void a(Bundle bundle) {
        owo owo = this.c;
        if (bundle == null) {
            owo.b.onComplete();
            return;
        }
        hdb hdb = (hdb) bundle.getParcelable(owo.class.getName());
        if (hdb != null) {
            owo.c.onNext(a.f().b(false).a(false).a(hdb).a());
        }
    }

    public final void a(RecyclerView recyclerView, vhx vhx) {
        this.h = vhx;
        String str = "ui:source";
        this.i = hcx.builder().a("mlt-header").a((hck) HubsGlueSectionHeader.SECTION_HEADER).a(hcy.builder().a(this.e.getString(R.string.more_like_this_section_header_title))).b(str, this.d.a()).a();
        this.g = Lists.a();
        hcm a2 = hcx.builder().a("mlt-loading-spinner").a((hck) HubsCommonComponent.LOADING_SPINNER).b(str, this.d.a()).a();
        this.g.add(this.i);
        this.g.add(a2);
        vhx.a((a<H>) this.b, a);
        vhx.a(false, a);
        Context context = this.e;
        recyclerView.a((i) new TraitsLayoutManager(context, gxu.a(context, this.f), this.e.getResources().getInteger(R.integer.grid_columns)));
    }

    public final void a(ImmutableList<hcx> immutableList) {
        this.b.a((List<? extends hcm>) ImmutableList.g().c(this.i).b((Iterable<? extends E>) immutableList).a());
        this.b.e();
        this.h.a(true, a);
    }

    public final void a(a aVar) {
        this.c.a(aVar);
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

    public final void ay_() {
        this.c.a((owt) this);
    }

    public final void b(Bundle bundle) {
        bundle.putParcelable(owo.class.getName(), ((a) this.c.c.j()).a());
    }

    public final void c() {
        this.c.a((owt) null);
    }

    public final void d() {
        this.c.a.c();
    }
}
