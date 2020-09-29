package defpackage;

import android.content.Context;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.mobile.android.spotlets.common.recyclerview.FrameLayoutManager;

/* renamed from: guh reason: default package */
public abstract class guh implements gur {
    public void a(gvb gvb) {
    }

    /* access modifiers changed from: protected */
    public abstract RecyclerView c();

    /* access modifiers changed from: protected */
    public abstract RecyclerView d();

    public final void a(a<?> aVar) {
        c().a((a) aVar);
    }

    public final void b(a<?> aVar) {
        d().a((a) aVar);
    }

    public void a(gzz gzz) {
        a(d(), gzz.overlays().size() > 0);
    }

    public final boolean a() {
        return c().c() != null;
    }

    public void a(int... iArr) {
        haq.a(c(), iArr);
    }

    public final void b(int... iArr) {
        if (d().getVisibility() == 0) {
            haq.a(d(), iArr);
        }
    }

    public Parcelable b() {
        return new a(((i) fay.a(c().d())).d(), ((i) fay.a(d().d())).d());
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            ((i) fay.a(c().d())).a(aVar.a);
            ((i) fay.a(d().d())).a(aVar.b);
        }
    }

    public static RecyclerView a(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.a((i) new LinearLayoutManager(context));
        recyclerView.q = true;
        return recyclerView;
    }

    public static RecyclerView b(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.a((i) new FrameLayoutManager());
        recyclerView.q = true;
        return recyclerView;
    }

    public static void a(RecyclerView recyclerView, boolean z) {
        if (!z) {
            f fVar = recyclerView.x;
            if (fVar != null) {
                fVar.d();
            }
            i d = recyclerView.d();
            recyclerView.a((i) null);
            recyclerView.a(d);
        }
        recyclerView.setVisibility(z ? 0 : 8);
    }
}
