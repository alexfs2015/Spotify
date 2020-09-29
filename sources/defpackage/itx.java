package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.spotlets.creatorartist.model.Image;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.List;

/* renamed from: itx reason: default package */
public final class itx extends ite<ity> {
    public List<Image> a = Collections.emptyList();
    private final Picasso d;

    public itx(Picasso picasso) {
        this.d = picasso;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new ity(viewGroup, viewGroup.getContext(), this.d);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((ity) uVar).a((Image) this.a.get(i));
    }

    public final int b() {
        return this.a.size();
    }
}
