package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.music.R;

/* renamed from: nuj reason: default package */
public final class nuj {
    final ViewGroup a;
    final nug b;
    private final nub c;

    public nuj(nuh nuh, nub nub, LayoutInflater layoutInflater) {
        this.c = (nub) fbp.a(nub);
        this.b = new nug((nue) nuh.a(nuh.a.get(), 1), (nub) nuh.a(this.c, 2));
        this.a = (ViewGroup) layoutInflater.inflate(R.layout.home_mix_user_toggle_view, null);
        this.a.findViewById(R.id.action_button).setOnClickListener(new $$Lambda$nuj$qCwHHerpKPb8PUexmTRLP6IG1Y(this));
        RecyclerView recyclerView = (RecyclerView) this.a.findViewById(R.id.recycler_view);
        recyclerView.a((i) new LinearLayoutManager(this.a.getContext()));
        recyclerView.a((a) this.b);
        recyclerView.a((f) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.c.a();
    }
}
