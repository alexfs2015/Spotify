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

/* renamed from: nhx reason: default package */
public final class nhx extends androidx.recyclerview.widget.RecyclerView.a<u> implements gkw {
    private final nhs a;
    private final a d;
    private final jor<nil> e;
    private final rph f;
    private final sso g;
    private final Drawable h;
    private final Picasso i;
    private final ujc j;
    private List<vlf> k;

    /* renamed from: nhx$a */
    public interface a {
        void a(vlf vlf, int i);

        void b(vlf vlf, int i);
    }

    public nhx(a aVar, Context context, Picasso picasso, jor<nil> jor, rph rph, sso sso, ujc ujc, nhs nhs) {
        this.d = aVar;
        this.i = picasso;
        this.j = ujc;
        this.e = jor;
        this.f = rph;
        this.g = sso;
        this.h = gaa.i(context);
        this.a = nhs;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vlf vlf, int i2, View view) {
        this.d.a(vlf, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(vlf vlf, int i2, View view) {
        this.d.b(vlf, i2);
    }

    public final u a(ViewGroup viewGroup, int i2) {
        fqv.b();
        return fra.a(fsk.b(viewGroup.getContext(), viewGroup, false));
    }

    public final void a(u uVar, int i2) {
        vlf vlf = (vlf) this.k.get(i2);
        View view = uVar.o;
        fsc fsc = (fsc) fqv.a(view, fsc.class);
        fsc.a(vlf.getName());
        fsc.b(jve.b(vlf));
        Uri parse = !TextUtils.isEmpty(vlf.getImageUri()) ? Uri.parse(vlf.getImageUri()) : Uri.EMPTY;
        ImageView c = fsc.c();
        boolean isAvailableInMetadataCatalogue = vlf.isAvailableInMetadataCatalogue();
        this.i.a(parse).a(this.h).a((wgx) ujd.a(c, this.j, isAvailableInMetadataCatalogue ? vlf.previewId() : "", nhv.a(vlf)));
        c.setOnClickListener(new $$Lambda$nhx$mtxK2cRozi5Z2lol8fl0lJGrNQ0(this, vlf, i2));
        if (isAvailableInMetadataCatalogue) {
            c.setContentDescription(c.getContext().getString(R.string.preview_play_pause_content_description));
        } else {
            c.setContentDescription(c.getContext().getString(R.string.generic_content_description_cover_art));
        }
        fsc.c(jvh.a(isAvailableInMetadataCatalogue, ((Boolean) this.a.a.a(Boolean.FALSE)).booleanValue(), vlf.isExplicit()));
        fsc.getView().setOnClickListener(new $$Lambda$nhx$PyC5x7uGMawrZ6bE51ULy5Cyw(this, vlf, i2));
        Context context = view.getContext();
        rph rph = this.f;
        Context context2 = view.getContext();
        fsc.a(jqq.a(context, vlf != null ? rph.a(context2, vlf.inCollection(), vlf.isBanned()) : rph.a(context2, false, false), this.e, new defpackage.nij.a().a(vlf).a(i2).a(), this.g));
        jzb.a(view.getContext(), fsc.d(), vlf.isExplicit());
    }

    public final void a(List<vlf> list) {
        this.k = list;
        e();
    }

    public final int b() {
        List<vlf> list = this.k;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long b(int i2) {
        return (long) ((vlf) this.k.get(i2)).getUri().hashCode();
    }
}
