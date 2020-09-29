package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: odd reason: default package */
public final class odd implements kmm<sbo, sbj> {
    public final View a;
    /* access modifiers changed from: private */
    public final odb b = new odb(this.d);
    /* access modifiers changed from: private */
    public final RecyclerView c = ((RecyclerView) this.a.findViewById(R.id.new_release_feed_rv));
    private final Picasso d;

    public odd(LayoutInflater layoutInflater, ViewGroup viewGroup, Picasso picasso) {
        this.d = picasso;
        this.a = layoutInflater.inflate(R.layout.fragment_new_release_feed, viewGroup, false);
        this.c.a((i) new LinearLayoutManager(this.a.getContext()));
    }

    public final kmn<sbo> connect(knw<sbj> knw) {
        return new kmn<sbo>() {
            public final /* synthetic */ void accept(Object obj) {
                sbo sbo = (sbo) obj;
                odb a2 = odd.this.b;
                ImmutableList b = sbo.b().b();
                a2.a.clear();
                a2.a.addAll(b);
                a2.e();
                odd.this.c.a((a) odd.this.b);
            }

            public final void dispose() {
            }
        };
    }
}
