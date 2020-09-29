package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: tui reason: default package */
public final class tui {
    final Context a;
    private final Picasso b;

    public tui(Context context, Picasso picasso) {
        this.a = context;
        this.b = picasso;
    }

    public final fqe a(ViewGroup viewGroup) {
        return tqt.a(viewGroup.getContext(), viewGroup, this.b);
    }

    public final fqe b(ViewGroup viewGroup) {
        fqb.e();
        frs f = a.f(this.a, viewGroup);
        ((MarginLayoutParams) f.getView().getLayoutParams()).topMargin = this.a.getResources().getDimensionPixelSize(R.dimen.quickactions_episode_entity_row_margin);
        return f;
    }

    public final fqe c(ViewGroup viewGroup) {
        return tqr.a(viewGroup.getContext(), viewGroup, this.b);
    }
}
