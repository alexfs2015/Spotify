package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.music.R;

/* renamed from: pru reason: default package */
public final class pru implements kmm<prr, prp> {
    public final ViewGroup a;
    /* access modifiers changed from: private */
    public final RecyclerView b = ((RecyclerView) this.a.findViewById(R.id.recycler_view));
    /* access modifiers changed from: private */
    public final ppy c;

    public pru(LayoutInflater layoutInflater, ViewGroup viewGroup, ppy ppy) {
        this.c = ppy;
        this.a = (ViewGroup) layoutInflater.inflate(R.layout.fragment_profilelist, viewGroup, false);
        this.b.a((i) new LinearLayoutManager(layoutInflater.getContext()));
    }

    public final kmn<prr> connect(knw<prp> knw) {
        this.c.d = new $$Lambda$pru$0vocc4VL9DFQ1xAKqxjULze1U(knw);
        return new kmn<prr>() {
            public final /* synthetic */ void accept(Object obj) {
                pru.this.c.a(((prr) obj).c());
                if (pru.this.b.c() == null) {
                    pru.this.b.a((a) pru.this.c);
                }
            }

            public final void dispose() {
            }
        };
    }
}
