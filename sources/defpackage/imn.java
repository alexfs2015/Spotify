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

/* renamed from: imn reason: default package */
public final class imn extends androidx.recyclerview.widget.RecyclerView.a<fqg<frh>> implements gjl {
    public List<uzc> a = Lists.a();
    private boolean d;
    private final xac<Integer> e;
    private final a f;
    private final jmf<uzc> g;
    private String h;
    private fpt i;
    private final sih j;
    private final b k;

    /* renamed from: imn$a */
    public interface a {
    }

    /* renamed from: imn$b */
    public interface b {
        void a(int i, uzc uzc);
    }

    public final /* synthetic */ void a(u uVar, int i2) {
        fqg fqg = (fqg) uVar;
        this.e.onNext(Integer.valueOf(i2));
        frh frh = (frh) fqg.a;
        uzc uzc = (uzc) this.a.get(i2);
        View view = frh.getView();
        view.setOnClickListener(new $$Lambda$imn$X89kVcjTIakHgqw4ZpQnJvRdltM(this, i2, uzc));
        uuu.a(view, (int) R.attr.selectableItemBackground);
        view.setOnLongClickListener(new OnLongClickListener() {
            public final boolean onLongClick(View view) {
                return imn.a(imn.this, view);
            }
        });
        if (VERSION.SDK_INT >= 23) {
            view.setOnContextClickListener(new OnContextClickListener() {
                public final boolean onContextClick(View view) {
                    return imn.a(imn.this, view);
                }
            });
        }
        Context context = fqg.o.getContext();
        a aVar = this.f;
        fpt fpt = this.i;
        boolean z = this.d;
        frh.a(joe.a(context));
        frh.getView().setTag(uzc);
        ArrayList arrayList = new ArrayList();
        List artists = uzc.getArtists();
        uyq album = uzc.getAlbum();
        String str = "";
        String name = (artists == null || artists.isEmpty() || ((uyr) artists.get(0)).getName() == null) ? str : ((uyr) artists.get(0)).getName();
        String name2 = (album == null || album.getName() == null) ? str : album.getName();
        arrayList.add(name);
        arrayList.add(" • ");
        arrayList.add(name2);
        if (uur.a(context)) {
            Collections.reverse(arrayList);
        }
        frh.a(uzc.getTitle());
        frh.b(fau.a(str).a((Iterable<?>) arrayList));
        frh.getView().setEnabled(uzc.isCurrentlyPlayable());
        jrv.a(context, frh.d(), uzc.getOfflineState());
        jxb.a(context, frh.d(), uzc.isExplicit());
        if (skn.a(fpt)) {
            jxb.a(context, frh.d(), uzc.hasLyrics(), context.getString(R.string.lyrics_label));
        }
        frh.c(jtb.a(uzc.isCurrentlyPlayable(), z, uzc.isExplicit()));
        frh.a(uzc.getUri().equals(this.h));
        view.setEnabled(true);
        if (this.g != null) {
            frh.a(joe.a(fqg.o.getContext(), this.g, uzc, this.j));
            view.setTag(R.id.context_menu_tag, new jny(this.g, uzc));
        }
    }

    public final void a(String str) {
        this.h = str;
        e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, uzc uzc, View view) {
        this.k.a(i2, uzc);
    }

    public final long b(int i2) {
        return (long) ((uzc) this.a.get(i2)).getUri().hashCode();
    }

    public final int b() {
        return this.a.size();
    }

    public final int a(int i2) {
        return frh.class.hashCode();
    }

    public final void b(boolean z) {
        this.d = z;
        if (b() > 0) {
            e();
        }
    }

    public imn(a aVar, jmf<uzc> jmf, fpt fpt, b bVar, sih sih, xac<Integer> xac) {
        this.f = aVar;
        this.g = jmf;
        this.i = fpt;
        this.k = bVar;
        this.j = sih;
        this.e = xac;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        Context context = viewGroup.getContext();
        boolean z = !jsl.c(this.i);
        fqb.b();
        frh a2 = frq.a(context, viewGroup, z);
        a2.a(joe.a(context));
        return fqg.a(a2);
    }

    static /* synthetic */ boolean a(imn imn, View view) {
        Object tag = view.getTag(R.id.context_menu_tag);
        if (tag == null) {
            return false;
        }
        ((jny) tag).a(view.getContext(), imn.j);
        return true;
    }
}
