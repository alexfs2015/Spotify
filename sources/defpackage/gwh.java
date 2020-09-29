package defpackage;

import android.content.Context;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.mobile.android.spotlets.common.recyclerview.FrameLayoutManager;

/* renamed from: gwh reason: default package */
public abstract class gwh implements gwr {
    public static RecyclerView a(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.a((i) new LinearLayoutManager(context));
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

    public static RecyclerView b(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.a((i) new FrameLayoutManager());
        recyclerView.q = true;
        return recyclerView;
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            ((i) fbp.a(c().d())).a(aVar.a);
            ((i) fbp.a(d().d())).a(aVar.b);
        }
    }

    public final void a(a<?> aVar) {
        c().a((a) aVar);
    }

    public void a(gxb gxb) {
    }

    public void a(hcs hcs) {
        a(d(), hcs.overlays().size() > 0);
    }

    public void a(int... iArr) {
        hdj.a(c(), iArr);
    }

    public final boolean a() {
        return c().c() != null;
    }

    public Parcelable b() {
        return new a(((i) fbp.a(c().d())).d(), ((i) fbp.a(d().d())).d());
    }

    public final void b(a<?> aVar) {
        d().a((a) aVar);
    }

    public final void b(int... iArr) {
        if (d().getVisibility() == 0) {
            hdj.a(d(), iArr);
        }
    }

    /* access modifiers changed from: protected */
    public abstract RecyclerView c();

    /* access modifiers changed from: protected */
    public abstract RecyclerView d();
}
