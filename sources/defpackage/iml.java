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

/* renamed from: iml reason: default package */
public final class iml extends androidx.recyclerview.widget.RecyclerView.a<u> implements gjl {
    public List<uyq> a = Lists.a();
    public String d;
    private final xac<Integer> e;
    private final a f;
    private final String g;
    private final jmf<uyq> h;
    private final sih i;
    private final jwv j;

    /* renamed from: iml$a */
    public interface a {
        void a(int i, uyq uyq);
    }

    public iml(Context context, jmf<uyq> jmf, a aVar, xac<Integer> xac, sih sih) {
        this.f = aVar;
        this.h = (jmf) fay.a(jmf);
        this.g = context.getResources().getString(R.string.placeholders_loading);
        this.i = sih;
        ggw.a(jww.class);
        this.j = jww.a(context);
        this.e = xac;
    }

    public final u a(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            return fqg.a(fqb.e().c(viewGroup.getContext(), viewGroup));
        }
        fqb.b();
        fri b = frq.b(viewGroup.getContext(), viewGroup, false);
        if (this.h == null) {
            b.a(joe.a(viewGroup.getContext()));
        }
        return fqg.a(b);
    }

    public final void a(u uVar, int i2) {
        String str;
        int i3;
        this.e.onNext(Integer.valueOf(i2));
        uyq uyq = (uyq) this.a.get(i2);
        if (a(i2) == 0) {
            ((frs) fqb.a(uVar.o, frs.class)).a((CharSequence) uyq.getHeader());
            return;
        }
        fri fri = (fri) fqb.a(uVar.o, fri.class);
        String collectionUri = uyq.getCollectionUri();
        fri.a(uyq.getUri().equals(this.d) || (!TextUtils.isEmpty(collectionUri) && collectionUri.equals(this.d)));
        fri.getView().setActivated(false);
        fri.getView().setEnabled(true);
        uVar.o.setTag(uyq);
        fri.getView().setOnClickListener(new $$Lambda$iml$zlGlnt_g5WyLf27G2U58keej9VY(this, i2, uyq));
        fri.getView().setOnLongClickListener(new jmd(uVar.o.getContext(), this.i));
        if (VERSION.SDK_INT >= 23) {
            fri.getView().setOnContextClickListener(new jmc(uVar.o.getContext(), this.i));
        }
        uuu.a(fri.getView(), (int) R.attr.selectableItemBackground);
        fri.a(uyq.getName());
        this.j.b(fri.c(), !TextUtils.isEmpty(uyq.getImageUri(Size.NORMAL)) ? Uri.parse(uyq.getImageUri(Size.NORMAL)) : Uri.EMPTY);
        uyr artist = uyq.getArtist();
        if (artist != null) {
            str = artist.getName();
        } else {
            str = null;
        }
        if (fax.a(str)) {
            str = this.g;
        }
        fri.b(str);
        uzf offlineState = uyq.getOfflineState();
        jrv.a(uVar.o.getContext(), fri.d(), uyq.getOfflineState());
        boolean z = offlineState instanceof b;
        if (z || (offlineState instanceof h)) {
            if (z) {
                i3 = ((b) offlineState).a;
            } else {
                i3 = ((h) offlineState).b;
            }
            fri.c(uVar.o.getContext().getString(R.string.header_downloading_progress, new Object[]{Integer.valueOf(i3)}));
        }
        fri.a(joe.a(uVar.o.getContext(), this.h, uyq, this.i));
        fri.getView().setTag(R.id.context_menu_tag, new jny(this.h, uyq));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, uyq uyq, View view) {
        this.f.a(i2, uyq);
    }

    public final int b() {
        return this.a.size();
    }

    public final int a(int i2) {
        return ((uyq) this.a.get(i2)).isHeader() ? 0 : 1;
    }
}
