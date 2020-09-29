package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: txl reason: default package */
public final class txl implements ugp {
    private final Picasso a;
    private final txn b;

    /* renamed from: txl$a */
    public static class a extends ugt {
        public vkv a;
        public vkv[] b;
        public Runnable c;
    }

    /* renamed from: txl$b */
    public static class b extends defpackage.ugp.a {
        final ucs a;

        public b(ViewGroup viewGroup, Picasso picasso) {
            super(viewGroup);
            Context context = viewGroup.getContext();
            this.a = ucu.a(context, viewGroup, picasso);
            viewGroup.addView(this.a.getView());
            this.a.d(true);
            this.a.e(true);
            this.a.e();
            this.a.a(jyz.c(context, SpotifyIconV2.MORE_ANDROID));
        }
    }

    public txl(Picasso picasso, txn txn) {
        this.a = picasso;
        this.b = txn;
    }

    public final defpackage.ugp.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new b((ViewGroup) layoutInflater.inflate(R.layout.podcast_adapter_delegate_compact_card, viewGroup, false), this.a);
    }

    public final void a(ugt ugt) {
        Runnable c = ((a) ugt).c;
        if (c != null) {
            c.run();
        }
    }

    public final void a(ugt ugt, u uVar) {
        a aVar = (a) ugt;
        this.b.a(((b) uVar).a, aVar.a, aVar.b);
    }
}
