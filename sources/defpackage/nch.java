package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: nch reason: default package */
public final class nch extends androidx.recyclerview.widget.RecyclerView.a<u> implements gjl {
    final a a;
    private final jmf<ncv> d;
    private final rgf e;
    private final sih f;
    private final Picasso g;
    private final Drawable h;
    private List<uyr> i;

    /* renamed from: nch$a */
    public interface a {
        void a(String str, int i);
    }

    public nch(a aVar, jmf<ncv> jmf, rgf rgf, Context context, Picasso picasso, sih sih) {
        this.a = aVar;
        this.d = jmf;
        this.e = rgf;
        this.g = picasso;
        this.f = sih;
        this.h = fzg.g(context);
    }

    public final void a(List<uyr> list) {
        this.i = list;
        e();
    }

    public final long b(int i2) {
        return (long) ((uyr) this.i.get(i2)).getUri().hashCode();
    }

    public final u a(ViewGroup viewGroup, int i2) {
        fqb.b();
        return fqg.a(frq.b(viewGroup.getContext(), viewGroup));
    }

    public final void a(u uVar, final int i2) {
        Drawable drawable;
        final uyr uyr = (uyr) this.i.get(i2);
        View view = uVar.o;
        fre fre = (fre) fqb.a(view, fre.class);
        fre.a(uyr.getName());
        this.g.a(!TextUtils.isEmpty(uyr.getImageUri()) ? Uri.parse(uyr.getImageUri()) : Uri.EMPTY).a(this.h).a(uvt.a(fre.c(), uuz.a()));
        fre.getView().setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                nch.this.a.a(uyr.getUri(), i2);
            }
        });
        Context context = view.getContext();
        rgf rgf = this.e;
        Context context2 = view.getContext();
        if (uyr != null) {
            drawable = rgf.a(context2, uyr.isFollowed(), uyr.isDismissed());
        } else {
            drawable = rgf.a(context2, false, false);
        }
        fre.a(joe.a(context, drawable, this.d, new defpackage.nct.a().a(uyr).a(i2).a(), this.f));
    }

    public final int b() {
        List<uyr> list = this.i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
