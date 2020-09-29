package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: mtg reason: default package */
final class mtg extends androidx.recyclerview.widget.RecyclerView.a<a> implements gkw {
    private final List<mto> a;
    private final LayoutInflater d;
    private final Picasso e;
    private final Drawable f;

    /* renamed from: mtg$a */
    static class a extends u {
        private final ImageView a;
        private final TextView b;
        private final TextView c;

        private a(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.artist_image);
            this.b = (TextView) view.findViewById(R.id.artist_followers);
            this.c = (TextView) view.findViewById(R.id.artist_title);
        }

        /* synthetic */ a(View view, byte b2) {
            this(view);
        }

        static /* synthetic */ void a(a aVar, mto mto, Picasso picasso, Drawable drawable) {
            aVar.b.setText(mto.b());
            aVar.c.setText(mto.a());
            picasso.a(mto.c()).a(drawable).a(vhj.a(aVar.a));
        }
    }

    mtg(List<mto> list, Picasso picasso, LayoutInflater layoutInflater) {
        this.a = list;
        this.d = layoutInflater;
        this.e = picasso;
        this.f = gaa.g(layoutInflater.getContext());
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(this.d.inflate(R.layout.feed_artist_list_item, viewGroup, false), 0);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        a.a((a) uVar, (mto) this.a.get(i), this.e, this.f);
    }

    public final int b() {
        return this.a.size();
    }
}
