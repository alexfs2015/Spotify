package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.Collection;
import java.util.List;

/* renamed from: kld reason: default package */
public final class kld extends androidx.recyclerview.widget.RecyclerView.a<a> {
    final Picasso a;
    private final ImmutableList<kkz> d;

    /* renamed from: kld$a */
    class a extends u {
        final ImageView a;

        a(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.summary_image_view);
        }
    }

    kld(List<kkz> list, Picasso picasso) {
        this.d = ImmutableList.a((Collection<? extends E>) list);
        this.a = picasso;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.summary_card_pager_item, viewGroup, false));
    }

    public final /* synthetic */ void a(u uVar, int i) {
        a aVar = (a) uVar;
        kld.this.a.a(((kkz) this.d.get(i)).a()).a(aVar.a);
    }

    public final int b() {
        return this.d.size();
    }
}
