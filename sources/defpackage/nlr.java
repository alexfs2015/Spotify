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

/* renamed from: nlr reason: default package */
public final class nlr {
    final Picasso a;
    final ViewGroup b;
    final ImageView c = ((ImageView) this.b.findViewById(R.id.image));
    final TextView d = ((TextView) this.b.findViewById(R.id.title));
    final TextView e = ((TextView) this.b.findViewById(R.id.subtitle));
    final nlp f;
    private final nlk g;

    public nlr(nlp nlp, Picasso picasso, nlk nlk, LayoutInflater layoutInflater) {
        this.a = picasso;
        this.f = nlp;
        this.g = nlk;
        this.b = (ViewGroup) layoutInflater.inflate(R.layout.home_mix_face_pile_detail_view, null);
        this.b.findViewById(R.id.action_button).setOnClickListener(new $$Lambda$nlr$_NA23OMdWEd6po6mRluvMo2FDE(this));
        RecyclerView recyclerView = (RecyclerView) this.b.findViewById(R.id.recycler_view);
        recyclerView.a((i) new LinearLayoutManager(this.b.getContext()));
        recyclerView.a((a) this.f);
        recyclerView.a((f) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.g.b.c();
    }
}
