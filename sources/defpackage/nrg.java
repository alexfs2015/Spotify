package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: nrg reason: default package */
public final class nrg {
    public final Picasso a;
    public final ViewGroup b;
    public final ImageView c = ((ImageView) this.b.findViewById(R.id.image));
    public final TextView d = ((TextView) this.b.findViewById(R.id.title));
    public final TextView e = ((TextView) this.b.findViewById(R.id.subtitle));
    public final nre f;
    private final nqz g;

    public nrg(nre nre, Picasso picasso, nqz nqz, LayoutInflater layoutInflater) {
        this.a = picasso;
        this.f = nre;
        this.g = nqz;
        this.b = (ViewGroup) layoutInflater.inflate(R.layout.home_mix_face_pile_detail_view, null);
        this.b.findViewById(R.id.action_button).setOnClickListener(new $$Lambda$nrg$w4MK0E9xMT409TKn9nFqDvXazMM(this));
        RecyclerView recyclerView = (RecyclerView) this.b.findViewById(R.id.recycler_view);
        recyclerView.a((i) new LinearLayoutManager(this.b.getContext()));
        recyclerView.a((a) this.f);
        recyclerView.a((f) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.g.a.k();
    }
}
