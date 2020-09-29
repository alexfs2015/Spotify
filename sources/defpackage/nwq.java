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

/* renamed from: nwq reason: default package */
public final class nwq implements kjd<rsh, rsc> {
    public final View a;
    /* access modifiers changed from: private */
    public final nwo b = new nwo(this.d);
    /* access modifiers changed from: private */
    public final RecyclerView c = ((RecyclerView) this.a.findViewById(R.id.new_release_feed_rv));
    private final Picasso d;

    public nwq(LayoutInflater layoutInflater, ViewGroup viewGroup, Picasso picasso) {
        this.d = picasso;
        this.a = layoutInflater.inflate(R.layout.fragment_new_release_feed, viewGroup, false);
        this.c.a((i) new LinearLayoutManager(this.a.getContext()));
    }

    public final kje<rsh> connect(kkn<rsc> kkn) {
        return new kje<rsh>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                rsh rsh = (rsh) obj;
                nwo a2 = nwq.this.b;
                ImmutableList b = rsh.b().b();
                a2.a.clear();
                a2.a.addAll(b);
                a2.e();
                nwq.this.c.a((a) nwq.this.b);
            }
        };
    }
}
