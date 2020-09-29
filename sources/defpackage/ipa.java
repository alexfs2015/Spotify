package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnContextClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ipa reason: default package */
public final class ipa extends androidx.recyclerview.widget.RecyclerView.a<fra<fsb>> implements gkw {
    public List<vlf> a = Lists.a();
    private boolean d;
    private final xog<Integer> e;
    private final a f;
    private final jor<vlf> g;
    private String h;
    private fqn i;
    private final sso j;
    private final b k;

    /* renamed from: ipa$a */
    public interface a {
    }

    /* renamed from: ipa$b */
    public interface b {
        void a(int i, vlf vlf);
    }

    public ipa(a aVar, jor<vlf> jor, fqn fqn, b bVar, sso sso, xog<Integer> xog) {
        this.f = aVar;
        this.g = jor;
        this.i = fqn;
        this.k = bVar;
        this.j = sso;
        this.e = xog;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, vlf vlf, View view) {
        this.k.a(i2, vlf);
    }

    static /* synthetic */ boolean a(ipa ipa, View view) {
        Object tag = view.getTag(R.id.context_menu_tag);
        if (tag == null) {
            return false;
        }
        ((jqk) tag).a(view.getContext(), ipa.j);
        return true;
    }

    public final int a(int i2) {
        return fsb.class.hashCode();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        Context context = viewGroup.getContext();
        boolean z = !jus.c(this.i);
        fqv.b();
        fsb a2 = fsk.a(context, viewGroup, z);
        a2.a(jqq.a(context));
        return fra.a(a2);
    }

    public final /* synthetic */ void a(u uVar, int i2) {
        fra fra = (fra) uVar;
        this.e.onNext(Integer.valueOf(i2));
        fsb fsb = (fsb) fra.a;
        vlf vlf = (vlf) this.a.get(i2);
        View view = fsb.getView();
        view.setOnClickListener(new $$Lambda$ipa$doZEWriiJPre1976QoPVE18umIg(this, i2, vlf));
        vgl.a(view, (int) R.attr.selectableItemBackground);
        view.setOnLongClickListener(new OnLongClickListener() {
            public final boolean onLongClick(View view) {
                return ipa.a(ipa.this, view);
            }
        });
        if (VERSION.SDK_INT >= 23) {
            view.setOnContextClickListener(new OnContextClickListener() {
                public final boolean onContextClick(View view) {
                    return ipa.a(ipa.this, view);
                }
            });
        }
        Context context = fra.o.getContext();
        a aVar = this.f;
        fqn fqn = this.i;
        boolean z = this.d;
        fsb.a(jqq.a(context));
        fsb.getView().setTag(vlf);
        ArrayList arrayList = new ArrayList();
        List artists = vlf.getArtists();
        vkt album = vlf.getAlbum();
        String str = "";
        String name = (artists == null || artists.isEmpty() || ((vku) artists.get(0)).getName() == null) ? str : ((vku) artists.get(0)).getName();
        String name2 = (album == null || album.getName() == null) ? str : album.getName();
        arrayList.add(name);
        arrayList.add(" • ");
        arrayList.add(name2);
        if (vgi.a(context)) {
            Collections.reverse(arrayList);
        }
        fsb.a(vlf.getTitle());
        fsb.b(fbl.a(str).a((Iterable<?>) arrayList));
        fsb.getView().setEnabled(vlf.isCurrentlyPlayable());
        juf.a(context, fsb.d(), vlf.getOfflineState());
        jzb.a(context, fsb.d(), vlf.isExplicit());
        if (suu.a(fqn)) {
            jzb.a(context, fsb.d(), vlf.hasLyrics(), context.getString(R.string.lyrics_label));
        }
        fsb.c(jvh.a(vlf.isCurrentlyPlayable(), z, vlf.isExplicit()));
        fsb.a(vlf.getUri().equals(this.h));
        view.setEnabled(true);
        if (this.g != null) {
            fsb.a(jqq.a(fra.o.getContext(), this.g, vlf, this.j));
            view.setTag(R.id.context_menu_tag, new jqk(this.g, vlf));
        }
    }

    public final void a(String str) {
        this.h = str;
        e();
    }

    public final int b() {
        return this.a.size();
    }

    public final long b(int i2) {
        return (long) ((vlf) this.a.get(i2)).getUri().hashCode();
    }

    public final void b(boolean z) {
        this.d = z;
        if (b() > 0) {
            e();
        }
    }
}
