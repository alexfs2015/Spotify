package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers.Size;
import java.util.List;

/* renamed from: ioy reason: default package */
public final class ioy extends androidx.recyclerview.widget.RecyclerView.a<u> implements gkw {
    public List<vkt> a = Lists.a();
    public String d;
    private final xog<Integer> e;
    private final a f;
    private final String g;
    private final jor<vkt> h;
    private final sso i;
    private final jyx j;

    /* renamed from: ioy$a */
    public interface a {
        void a(int i, vkt vkt);
    }

    public ioy(Context context, jor<vkt> jor, a aVar, xog<Integer> xog, sso sso, jyx jyx) {
        this.f = aVar;
        this.h = (jor) fbp.a(jor);
        this.g = context.getResources().getString(R.string.placeholders_loading);
        this.i = sso;
        this.e = xog;
        this.j = jyx;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, vkt vkt, View view) {
        this.f.a(i2, vkt);
    }

    public final int a(int i2) {
        return ((vkt) this.a.get(i2)).isHeader() ? 0 : 1;
    }

    public final u a(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            return fra.a(fqv.e().c(viewGroup.getContext(), viewGroup));
        }
        fqv.b();
        fsc b = fsk.b(viewGroup.getContext(), viewGroup, false);
        if (this.h == null) {
            b.a(jqq.a(viewGroup.getContext()));
        }
        return fra.a(b);
    }

    public final void a(u uVar, int i2) {
        this.e.onNext(Integer.valueOf(i2));
        vkt vkt = (vkt) this.a.get(i2);
        if (a(i2) == 0) {
            ((fsm) fqv.a(uVar.o, fsm.class)).a((CharSequence) vkt.getHeader());
            return;
        }
        fsc fsc = (fsc) fqv.a(uVar.o, fsc.class);
        String collectionUri = vkt.getCollectionUri();
        fsc.a(vkt.getUri().equals(this.d) || (!TextUtils.isEmpty(collectionUri) && collectionUri.equals(this.d)));
        fsc.getView().setActivated(false);
        fsc.getView().setEnabled(true);
        uVar.o.setTag(vkt);
        fsc.getView().setOnClickListener(new $$Lambda$ioy$vNsL7TswmLbMCTir9cfHILDlC2U(this, i2, vkt));
        fsc.getView().setOnLongClickListener(new jop(uVar.o.getContext(), this.i));
        if (VERSION.SDK_INT >= 23) {
            fsc.getView().setOnContextClickListener(new joo(uVar.o.getContext(), this.i));
        }
        vgl.a(fsc.getView(), (int) R.attr.selectableItemBackground);
        fsc.a(vkt.getName());
        this.j.b(fsc.c(), !TextUtils.isEmpty(vkt.getImageUri(Size.NORMAL)) ? Uri.parse(vkt.getImageUri(Size.NORMAL)) : Uri.EMPTY);
        vku artist = vkt.getArtist();
        String name = artist != null ? artist.getName() : null;
        if (fbo.a(name)) {
            name = this.g;
        }
        fsc.b(name);
        vli offlineState = vkt.getOfflineState();
        juf.a(uVar.o.getContext(), fsc.d(), vkt.getOfflineState());
        boolean z = offlineState instanceof b;
        if (z || (offlineState instanceof h)) {
            fsc.c(uVar.o.getContext().getString(R.string.header_downloading_progress, new Object[]{Integer.valueOf(z ? ((b) offlineState).a : ((h) offlineState).b)}));
        }
        fsc.a(jqq.a(uVar.o.getContext(), this.h, vkt, this.i));
        fsc.getView().setTag(R.id.context_menu_tag, new jqk(this.h, vkt));
    }

    public final int b() {
        return this.a.size();
    }
}
