package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.music.R;

/* renamed from: mup reason: default package */
public final class mup extends gwh {
    public final ViewGroup a;
    private final RecyclerView b = ((RecyclerView) ip.d((View) this.a, (int) R.id.feed_body_recycler));
    private final RecyclerView c;

    public mup(Context context, ViewGroup viewGroup) {
        this.a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.follow_feed_view, viewGroup, false);
        this.b.a((i) new LinearLayoutManager(context));
        this.b.q = true;
        this.c = b(context);
        this.a.addView(this.c);
    }

    public final RecyclerView c() {
        return this.b;
    }

    public final RecyclerView d() {
        return this.c;
    }

    public final View e() {
        return this.a;
    }
}
