package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: tlz reason: default package */
public final class tlz implements tum {
    private final Picasso a;
    private final tmb b;

    /* renamed from: tlz$a */
    public static class a extends tuq {
        public uys a;
        public uys[] b;
        public Runnable c;
    }

    /* renamed from: tlz$b */
    public static class b extends defpackage.tum.a {
        final tqp a;

        public b(ViewGroup viewGroup, Picasso picasso) {
            super(viewGroup);
            Context context = viewGroup.getContext();
            this.a = tqr.a(context, viewGroup, picasso);
            viewGroup.addView(this.a.getView());
            this.a.d(true);
            this.a.e(true);
            this.a.e();
            this.a.a(jwz.c(context, SpotifyIconV2.MORE_ANDROID));
        }
    }

    public tlz(Picasso picasso, tmb tmb) {
        this.a = picasso;
        this.b = tmb;
    }

    public final defpackage.tum.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b((ViewGroup) layoutInflater.inflate(R.layout.podcast_adapter_delegate_compact_card, viewGroup, false), this.a);
    }

    public final void a(tuq tuq, u uVar) {
        a aVar = (a) tuq;
        this.b.a(((b) uVar).a, aVar.a, aVar.b);
    }

    public final void a(tuq tuq) {
        Runnable c = ((a) tuq).c;
        if (c != null) {
            c.run();
        }
    }
}
