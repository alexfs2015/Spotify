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

/* renamed from: mrj reason: default package */
public class mrj extends androidx.recyclerview.widget.RecyclerView.a<d> implements mrl {
    private static int g;
    private static int h;
    public List<vle> a = Lists.a();
    public oe d;
    public boolean e;
    public boolean f;
    /* access modifiers changed from: private */
    public final a i;
    /* access modifiers changed from: private */
    public final tvy j;

    /* renamed from: mrj$a */
    public interface a {
        void b(String str, String str2);

        void b(vle vle, int i);
    }

    /* renamed from: mrj$b */
    class b extends d implements mrm {
        private final ImageButton a;
        private final fsb b;
        private final Drawable c = this.o.getBackground();

        public b(ViewGroup viewGroup) {
            super(new LinearLayout(viewGroup.getContext()));
            LinearLayout linearLayout = (LinearLayout) this.o;
            linearLayout.setOrientation(0);
            linearLayout.setPadding(vfj.b(8.0f, this.o.getResources()), 0, 0, 0);
            linearLayout.setLayoutParams(new LayoutParams(-1, -2));
            this.a = jyz.a(viewGroup.getContext(), jyz.c(viewGroup.getContext(), SpotifyIconV2.BLOCK));
            linearLayout.addView(this.a);
            fqv.b();
            this.b = fsk.a(viewGroup.getContext(), viewGroup, false);
            linearLayout.addView(this.b.getView());
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(vle vle, View view) {
            int e = e();
            if (e != -1) {
                mrj.this.a.remove(e - 1);
                mrj.this.e(e);
                mrj.this.i.b(vle, e);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                mrj.this.d.b((u) this);
            }
            return false;
        }

        public final void a(vle vle) {
            Context context = this.o.getContext();
            fsb fsb = this.b;
            fsb.a(vle.getTitle());
            fsb.b(mrj.this.j.a(vle, mrj.this.f, mrj.this.e));
            this.a.setOnClickListener(new $$Lambda$mrj$b$zkgUaLXHchMLKN3Zt3stfTwgbTs(this, vle));
            ImageButton a2 = jyz.a(context, jyz.c(context, SpotifyIconV2.DRAG_AND_DROP));
            if (mrj.this.d != null) {
                a2.setOnTouchListener(new $$Lambda$mrj$b$iSybwKlDDncptkNtNRarOp_XOdM(this));
            }
            fsb.a(a2);
        }

        public final void w() {
            this.o.setBackgroundColor(fr.c(this.o.getContext(), R.color.gray_layer));
        }

        public final void x() {
            ip.a(this.o, this.c);
        }
    }

    /* renamed from: mrj$c */
    static class c extends d implements mrm {
        public c(ViewGroup viewGroup) {
            super(new LinearLayout(viewGroup.getContext()));
        }

        public final void w() {
        }

        public final void x() {
        }
    }

    /* renamed from: mrj$d */
    public static class d extends u {
        public d(View view) {
            super(view);
        }
    }

    static {
        Class<mrj> cls = mrj.class;
        g = cls.hashCode();
        h = cls.hashCode() + 1;
    }

    public mrj(a aVar, tvy tvy) {
        this.i = aVar;
        this.j = tvy;
        a(true);
    }

    public final int a(int i2) {
        return i2 <= 0 ? g : h;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        return i2 == g ? new c(viewGroup) : new b(viewGroup);
    }

    public final /* synthetic */ void a(u uVar, int i2) {
        d dVar = (d) uVar;
        if (a(i2) == h) {
            ((b) dVar).a((vle) this.a.get(i2 - 1));
        }
    }

    public final boolean a() {
        return this.a.isEmpty();
    }

    public final int b() {
        return this.a.size() + 1;
    }

    public final long b(int i2) {
        if (i2 <= 0) {
            return (long) Integer.valueOf(i2).hashCode();
        }
        vle vle = (vle) this.a.get(i2 - 1);
        long hashCode = (long) (hashCode() ^ vle.getUri().hashCode());
        String d2 = vle.d();
        if (d2 != null) {
            hashCode ^= (long) d2.hashCode();
        }
        return hashCode;
    }

    public final boolean d(u uVar) {
        return uVar.t == h;
    }

    public final boolean e(int i2, int i3) {
        vle vle = (vle) this.a.remove(i2 - 1);
        int i4 = i3 - 1;
        String str = null;
        vle vle2 = i4 < this.a.size() ? (vle) this.a.get(i4) : null;
        this.a.add(i4, vle);
        b(i2, i3);
        a aVar = this.i;
        String d2 = vle.d();
        if (vle2 != null) {
            str = vle2.d();
        }
        aVar.b(d2, str);
        return true;
    }

    public final boolean e(u uVar) {
        return uVar.t == h;
    }
}
