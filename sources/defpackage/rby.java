package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import java.util.List;

/* renamed from: rby reason: default package */
public final class rby extends androidx.recyclerview.widget.RecyclerView.a<c> implements gjl {
    final b a;
    public List<defpackage.rbq.b> d = Lists.a();

    /* renamed from: rby$a */
    class a extends c {
        public a(ViewGroup viewGroup) {
            super(rcb.a(viewGroup.getContext(), viewGroup).getView());
        }

        public final void a(defpackage.rbq.b bVar, int i) {
            rcc rcc = (rcc) fqf.a(this.o, rcc.class);
            rcc.a(bVar.c());
            if (bVar.f()) {
                rcc.a(SpotifyIconV2.CHECK);
            } else {
                rcc.a();
            }
            this.o.setOnClickListener(new $$Lambda$rby$a$c5K7Fd3qWY5KwjZGM0hO6_NXbaM(this, bVar, i));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(defpackage.rbq.b bVar, int i, View view) {
            rby.this.a.onOptionClicked(bVar, i);
        }
    }

    /* renamed from: rby$b */
    public interface b {
        void onOptionClicked(defpackage.rbq.b bVar, int i);
    }

    /* renamed from: rby$c */
    public static class c extends u {
        public c(View view) {
            super(view);
        }
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((a) ((c) uVar)).a((defpackage.rbq.b) this.d.get(i), i);
    }

    public rby(b bVar) {
        this.a = bVar;
        a(true);
    }

    public final int b() {
        return this.d.size();
    }

    public final long b(int i) {
        return (long) ((defpackage.rbq.b) this.d.get(i)).a().hashCode();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }
}
