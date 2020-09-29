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

/* renamed from: noi reason: default package */
public final class noi {
    final ViewGroup a;
    final nof b;
    private final noa c;

    public noi(nog nog, noa noa, LayoutInflater layoutInflater) {
        this.c = (noa) fay.a(noa);
        this.b = new nof((nod) nog.a(nog.a.get(), 1), (noa) nog.a(this.c, 2));
        this.a = (ViewGroup) layoutInflater.inflate(R.layout.home_mix_user_toggle_view, null);
        this.a.findViewById(R.id.action_button).setOnClickListener(new $$Lambda$noi$Op4Dbx7TTObdMxCXiMCog6PCb2A(this));
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
