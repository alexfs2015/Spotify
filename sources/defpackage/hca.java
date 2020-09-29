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

/* renamed from: hca reason: default package */
public final class hca extends gwh {
    private final RecyclerView a;
    private final RecyclerView b;
    private final ViewGroup c;

    /* renamed from: hca$a */
    public static final class a implements c {
        private static final a b = new a();

        a() {
        }

        public static a a() {
            return b;
        }

        public final gwr a(gwm gwm, Context context) {
            return a(gwm, context, a);
        }

        public final gwr a(gwm gwm, Context context, m mVar) {
            return new hca(context, gwm, mVar, 0);
        }
    }

    private hca(Context context, gwm gwm, m mVar) {
        this.c = new FrameLayout(context);
        this.a = a(context);
        this.a.a((i) gxu.b(context, gwm));
        this.a.a((m) fbp.a(mVar));
        this.b = b(context);
        this.c.addView(this.a, -1, -1);
        this.c.addView(this.b, -1, -1);
        this.c.setLayoutParams(new LayoutParams(-1, -1));
    }

    /* synthetic */ hca(Context context, gwm gwm, m mVar, byte b2) {
        this(context, gwm, mVar);
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof hbz) {
            hbz hbz = (hbz) parcelable;
            ((i) fbp.a(this.a.d())).a(hbz.a);
            ((i) fbp.a(this.b.d())).a(hbz.b);
        }
    }

    public final Parcelable b() {
        return new hbz(((i) fbp.a(this.a.d())).d(), ((i) fbp.a(this.b.d())).d(), null, hcd.a(this.a));
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
