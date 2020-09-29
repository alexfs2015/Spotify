package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.c;

/* renamed from: gzh reason: default package */
public final class gzh extends guh {
    private final RecyclerView a;
    private final RecyclerView b;
    private final ViewGroup c;

    /* renamed from: gzh$a */
    public static final class a implements c {
        private static final a b = new a();

        a() {
        }

        public final gur a(gum gum, Context context) {
            return a(gum, context, a);
        }

        public final gur a(gum gum, Context context, m mVar) {
            return new gzh(context, gum, mVar, 0);
        }

        public static a a() {
            return b;
        }
    }

    /* synthetic */ gzh(Context context, gum gum, m mVar, byte b2) {
        this(context, gum, mVar);
    }

    private gzh(Context context, gum gum, m mVar) {
        this.c = new FrameLayout(context);
        this.a = a(context);
        this.a.a((i) gvt.b(context, gum));
        this.a.a((m) fay.a(mVar));
        this.b = b(context);
        this.c.addView(this.a, -1, -1);
        this.c.addView(this.b, -1, -1);
        this.c.setLayoutParams(new LayoutParams(-1, -1));
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof gzg) {
            gzg gzg = (gzg) parcelable;
            ((i) fay.a(this.a.d())).a(gzg.a);
            ((i) fay.a(this.b.d())).a(gzg.b);
        }
    }

    public final Parcelable b() {
        return new gzg(((i) fay.a(this.a.d())).d(), ((i) fay.a(this.b.d())).d(), null, gzk.a(this.a));
    }

    public final RecyclerView c() {
        return this.a;
    }

    public final RecyclerView d() {
        return this.b;
    }

    public final View e() {
        return this.c;
    }
}
