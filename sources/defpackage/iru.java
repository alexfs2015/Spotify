package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.spotlets.creatorartist.model.Image;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.List;

/* renamed from: iru reason: default package */
public final class iru extends iqr<irv> {
    public List<Image> a = Collections.emptyList();
    private final Picasso d;

    public final /* synthetic */ void a(u uVar, int i) {
        ((irv) uVar).a((Image) this.a.get(i));
    }

    public iru(Picasso picasso) {
        this.d = picasso;
    }

    public final int b() {
        return this.a.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new irv(viewGroup, viewGroup.getContext(), this.d);
    }
}
