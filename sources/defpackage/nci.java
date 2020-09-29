package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: nci reason: default package */
public final class nci extends androidx.recyclerview.widget.RecyclerView.a<u> implements gjl {
    private final ncd a;
    private final a d;
    private final jmf<ncw> e;
    private final rgf f;
    private final sih g;
    private final Drawable h;
    private final Picasso i;
    private final twz j;
    private List<uzc> k;

    /* renamed from: nci$a */
    public interface a {
        void a(uzc uzc, int i);

        void b(uzc uzc, int i);
    }

    public nci(a aVar, Context context, Picasso picasso, jmf<ncw> jmf, rgf rgf, sih sih, twz twz, ncd ncd) {
        this.d = aVar;
        this.i = picasso;
        this.j = twz;
        this.e = jmf;
        this.f = rgf;
        this.g = sih;
        this.h = fzg.i(context);
        this.a = ncd;
    }

    public final void a(List<uzc> list) {
        this.k = list;
        e();
    }

    public final long b(int i2) {
        return (long) ((uzc) this.k.get(i2)).getUri().hashCode();
    }

    public final u a(ViewGroup viewGroup, int i2) {
        fqb.b();
        return fqg.a(frq.b(viewGroup.getContext(), viewGroup, false));
    }

    public final void a(u uVar, int i2) {
        Drawable drawable;
        uzc uzc = (uzc) this.k.get(i2);
        View view = uVar.o;
        fri fri = (fri) fqb.a(view, fri.class);
        fri.a(uzc.getName());
        fri.b(jsx.b(uzc));
        Uri parse = !TextUtils.isEmpty(uzc.getImageUri()) ? Uri.parse(uzc.getImageUri()) : Uri.EMPTY;
        ImageView c = fri.c();
        boolean isAvailableInMetadataCatalogue = uzc.isAvailableInMetadataCatalogue();
        this.i.a(parse).a(this.h).a((vsr) txa.a(c, this.j, isAvailableInMetadataCatalogue ? uzc.previewId() : "", ncg.a(uzc)));
        c.setOnClickListener(new $$Lambda$nci$ZZ0R9SohVipG71ZfOPGn6oVMiPQ(this, uzc, i2));
        if (isAvailableInMetadataCatalogue) {
            c.setContentDescription(c.getContext().getString(R.string.preview_play_pause_content_description));
        } else {
            c.setContentDescription(c.getContext().getString(R.string.generic_content_description_cover_art));
        }
        fri.c(jtb.a(isAvailableInMetadataCatalogue, ((Boolean) this.a.a.a(Boolean.FALSE)).booleanValue(), uzc.isExplicit()));
        fri.getView().setOnClickListener(new $$Lambda$nci$l0D0Nk7QWBWYTbOmfHe6QoeThw4(this, uzc, i2));
        Context context = view.getContext();
        rgf rgf = this.f;
        Context context2 = view.getContext();
        if (uzc != null) {
            drawable = rgf.a(context2, uzc.inCollection(), uzc.isBanned());
        } else {
            drawable = rgf.a(context2, false, false);
        }
        fri.a(joe.a(context, drawable, this.e, new defpackage.ncu.a().a(uzc).a(i2).a(), this.g));
        jxb.a(view.getContext(), fri.d(), uzc.isExplicit());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(uzc uzc, int i2, View view) {
        this.d.b(uzc, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uzc uzc, int i2, View view) {
        this.d.a(uzc, i2);
    }

    public final int b() {
        List<uzc> list = this.k;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
