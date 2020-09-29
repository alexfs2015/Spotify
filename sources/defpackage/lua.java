package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.music.R;
import com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter;
import com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter.a;
import com.squareup.picasso.Picasso;

/* renamed from: lua reason: default package */
public final class lua extends lub {
    public final AssistedCurationCardAdapter a;

    public lua(ViewGroup viewGroup, a aVar, ujc ujc, Picasso picasso) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.assisted_curation_card, viewGroup, false));
        RecyclerView recyclerView = (RecyclerView) this.o.findViewById(R.id.recycler_view);
        recyclerView.a((i) new LinearLayoutManager(viewGroup.getContext()));
        this.a = new AssistedCurationCardAdapter(aVar, ujc, picasso);
        recyclerView.a((RecyclerView.a) this.a);
    }
}
