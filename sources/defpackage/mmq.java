package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.Lists;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import java.util.List;

/* renamed from: mmq reason: default package */
public class mmq extends androidx.recyclerview.widget.RecyclerView.a<d> implements gjk, mms {
    private static int g;
    private static int h;
    public List<uzb> a = Lists.a();
    public nz d;
    public boolean e;
    public boolean f;
    /* access modifiers changed from: private */
    public final a i;
    /* access modifiers changed from: private */
    public final tkg j;

    /* renamed from: mmq$a */
    public interface a {
        void b(String str, String str2);

        void b(uzb uzb, int i);
    }

    /* renamed from: mmq$b */
    class b extends d implements mmt {
        private final ImageButton a;
        private final frh b;
        private final Drawable c = this.o.getBackground();

        public b(ViewGroup viewGroup) {
            super(new LinearLayout(viewGroup.getContext()));
            LinearLayout linearLayout = (LinearLayout) this.o;
            linearLayout.setOrientation(0);
            linearLayout.setPadding(uts.b(8.0f, this.o.getResources()), 0, 0, 0);
            linearLayout.setLayoutParams(new LayoutParams(-1, -2));
            this.a = jwz.a(viewGroup.getContext(), jwz.c(viewGroup.getContext(), SpotifyIconV2.BLOCK));
            linearLayout.addView(this.a);
            fqb.b();
            this.b = frq.a(viewGroup.getContext(), viewGroup, false);
            linearLayout.addView(this.b.getView());
        }

        public final void a(uzb uzb) {
            Context context = this.o.getContext();
            frh frh = this.b;
            frh.a(uzb.getTitle());
            frh.b(mmq.this.j.a(uzb, mmq.this.f, mmq.this.e));
            this.a.setOnClickListener(new $$Lambda$mmq$b$vE62y_TtkNru3imEM_fXphU1cko(this, uzb));
            ImageButton a2 = jwz.a(context, jwz.c(context, SpotifyIconV2.DRAG_AND_DROP));
            if (mmq.this.d != null) {
                a2.setOnTouchListener(new $$Lambda$mmq$b$l9tyESkJYZMkqvTcxYl7FvsGDg(this));
            }
            frh.a(a2);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(uzb uzb, View view) {
            int e = e();
            if (e != -1) {
                mmq.this.a.remove(e - 1);
                mmq.this.e(e);
                mmq.this.i.b(uzb, e);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                mmq.this.d.b((u) this);
            }
            return false;
        }

        public final void v() {
            this.o.setBackgroundColor(fr.c(this.o.getContext(), R.color.gray_layer));
        }

        public final void w() {
            ip.a(this.o, this.c);
        }
    }

    /* renamed from: mmq$c */
    static class c extends d implements mmt {
        public final void v() {
        }

        public final void w() {
        }

        public c(ViewGroup viewGroup) {
            super(new LinearLayout(viewGroup.getContext()));
        }
    }

    /* renamed from: mmq$d */
    public static class d extends u {
        public d(View view) {
            super(view);
        }
    }

    public final /* synthetic */ void a(u uVar, int i2) {
        d dVar = (d) uVar;
        if (a(i2) == h) {
            ((b) dVar).a((uzb) this.a.get(i2 - 1));
        }
    }

    static {
        Class<mmq> cls = mmq.class;
        g = cls.hashCode();
        h = cls.hashCode() + 1;
    }

    public mmq(a aVar, tkg tkg) {
        this.i = aVar;
        this.j = tkg;
        a(true);
    }

    public final boolean a() {
        return this.a.isEmpty();
    }

    public final String c(int i2) {
        return a(i2) == g ? "item_padding" : "item";
    }

    public final int a(int i2) {
        if (i2 <= 0) {
            return g;
        }
        return h;
    }

    public final int b() {
        return this.a.size() + 1;
    }

    public final long b(int i2) {
        if (i2 <= 0) {
            return (long) Integer.valueOf(i2).hashCode();
        }
        uzb uzb = (uzb) this.a.get(i2 - 1);
        long hashCode = (long) (hashCode() ^ uzb.getUri().hashCode());
        String d2 = uzb.d();
        if (d2 != null) {
            hashCode ^= (long) d2.hashCode();
        }
        return hashCode;
    }

    public final boolean e(int i2, int i3) {
        uzb uzb = (uzb) this.a.remove(i2 - 1);
        int i4 = i3 - 1;
        String str = null;
        uzb uzb2 = i4 < this.a.size() ? (uzb) this.a.get(i4) : null;
        this.a.add(i4, uzb);
        b(i2, i3);
        a aVar = this.i;
        String d2 = uzb.d();
        if (uzb2 != null) {
            str = uzb2.d();
        }
        aVar.b(d2, str);
        return true;
    }

    public final boolean d(u uVar) {
        return uVar.t == h;
    }

    public final boolean e(u uVar) {
        return uVar.t == h;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        if (i2 == g) {
            return new c(viewGroup);
        }
        return new b(viewGroup);
    }
}
