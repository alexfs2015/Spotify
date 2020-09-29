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

/* renamed from: mox reason: default package */
final class mox extends androidx.recyclerview.widget.RecyclerView.a<a> implements gjl {
    private final List<mpf> a;
    private final LayoutInflater d;
    private final Picasso e;
    private final Drawable f;

    /* renamed from: mox$a */
    static class a extends u {
        private final ImageView a;
        private final TextView b;
        private final TextView c;

        /* synthetic */ a(View view, byte b2) {
            this(view);
        }

        private a(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.artist_image);
            this.b = (TextView) view.findViewById(R.id.artist_followers);
            this.c = (TextView) view.findViewById(R.id.artist_title);
        }

        static /* synthetic */ void a(a aVar, mpf mpf, Picasso picasso, Drawable drawable) {
            aVar.b.setText(mpf.b());
            aVar.c.setText(mpf.a());
            picasso.a(mpf.c()).a(drawable).a(uvt.a(aVar.a));
        }
    }

    public final /* synthetic */ void a(u uVar, int i) {
        a.a((a) uVar, (mpf) this.a.get(i), this.e, this.f);
    }

    mox(List<mpf> list, Picasso picasso, LayoutInflater layoutInflater) {
        this.a = list;
        this.d = layoutInflater;
        this.e = picasso;
        this.f = fzg.g(layoutInflater.getContext());
    }

    public final int b() {
        return this.a.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(this.d.inflate(R.layout.feed_artist_list_item, viewGroup, false), 0);
    }
}
