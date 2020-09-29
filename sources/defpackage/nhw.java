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

/* renamed from: nhw reason: default package */
public final class nhw extends androidx.recyclerview.widget.RecyclerView.a<u> implements gkw {
    final a a;
    private final jor<nik> d;
    private final rph e;
    private final sso f;
    private final Picasso g;
    private final Drawable h;
    private List<vku> i;

    /* renamed from: nhw$a */
    public interface a {
        void a(String str, int i);
    }

    public nhw(a aVar, jor<nik> jor, rph rph, Context context, Picasso picasso, sso sso) {
        this.a = aVar;
        this.d = jor;
        this.e = rph;
        this.g = picasso;
        this.f = sso;
        this.h = gaa.g(context);
    }

    public final u a(ViewGroup viewGroup, int i2) {
        fqv.b();
        return fra.a(fsk.b(viewGroup.getContext(), viewGroup));
    }

    public final void a(u uVar, final int i2) {
        final vku vku = (vku) this.i.get(i2);
        View view = uVar.o;
        fry fry = (fry) fqv.a(view, fry.class);
        fry.a(vku.getName());
        this.g.a(!TextUtils.isEmpty(vku.getImageUri()) ? Uri.parse(vku.getImageUri()) : Uri.EMPTY).a(this.h).a(vhj.a(fry.c(), vgq.a()));
        fry.getView().setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                nhw.this.a.a(vku.getUri(), i2);
            }
        });
        Context context = view.getContext();
        rph rph = this.e;
        Context context2 = view.getContext();
        fry.a(jqq.a(context, vku != null ? rph.a(context2, vku.isFollowed(), vku.isDismissed()) : rph.a(context2, false, false), this.d, new defpackage.nii.a().a(vku).a(i2).a(), this.f));
    }

    public final void a(List<vku> list) {
        this.i = list;
        e();
    }

    public final int b() {
        List<vku> list = this.i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long b(int i2) {
        return (long) ((vku) this.i.get(i2)).getUri().hashCode();
    }
}
