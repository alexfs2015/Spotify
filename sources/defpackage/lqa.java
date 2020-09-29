package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: lqa reason: default package */
public final class lqa extends lqc {
    private final twz a;
    private final Picasso b;
    private final a c;

    /* renamed from: lqa$a */
    public interface a {
        void a(lqy lqy, lqv lqv, int i);

        void b(lqy lqy, lqv lqv, int i);

        void c(lqy lqy, lqv lqv, int i);

        static {
            new a() {
                public final void a(lqy lqy, lqv lqv, int i) {
                }

                public final void b(lqy lqy, lqv lqv, int i) {
                }

                public final void c(lqy lqy, lqv lqv, int i) {
                }
            };
        }
    }

    public lqa(ViewGroup viewGroup, a aVar, twz twz, Picasso picasso) {
        fqb.b();
        super(frq.b(viewGroup.getContext(), viewGroup, false).getView());
        this.a = twz;
        this.b = picasso;
        fri fri = (fri) fqf.a(this.o, fri.class);
        fri.a(jwz.a(viewGroup.getContext()));
        ImageButton imageButton = (ImageButton) fri.a();
        imageButton.setImageDrawable(jwz.b(viewGroup.getContext(), SpotifyIconV2.PLUS_ALT, fr.b(viewGroup.getContext(), (int) R.color.white)));
        imageButton.setContentDescription(viewGroup.getContext().getString(R.string.assisted_curation_add_to_playlist_content_description));
        fri.c().setContentDescription(viewGroup.getContext().getString(R.string.preview_play_pause_content_description));
        this.c = aVar;
    }

    public final void a(lqy lqy, lqv lqv, int i, boolean z) {
        fri fri = (fri) fqf.a(this.o, fri.class);
        fri.a(lqv.b());
        fri.b(jsx.a(lqv.g()));
        Uri parse = !TextUtils.isEmpty(lqv.h()) ? Uri.parse(lqv.h()) : Uri.EMPTY;
        ImageView c2 = fri.c();
        Drawable i2 = fzg.i(this.o.getContext());
        this.b.a(parse).a(i2).b(i2).a((vsr) txa.a(c2, this.a, lqv.c(), lpu.a(lqv, lqy)));
        fri.c().setOnClickListener(new $$Lambda$lqa$iYp569J0YsgFTp7aCEG3gqxCZg(this, lqy, lqv, i));
        this.o.setOnClickListener(new $$Lambda$lqa$KOSr3HQ3QgARi__gBnNsJiVuQeo(this, lqy, lqv, i));
        ((ImageButton) fri.a()).setOnClickListener(new $$Lambda$lqa$PdfTHGbgZGgAiVhurrC2WjPb3I(this, lqy, lqv, i));
        jxb.a(this.o.getContext(), fri.d(), lqv.d());
        fri.c(jtb.a(true, z, lqv.d()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(lqy lqy, lqv lqv, int i, View view) {
        this.c.c(lqy, lqv, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(lqy lqy, lqv lqv, int i, View view) {
        this.c.a(lqy, lqv, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(lqy lqy, lqv lqv, int i, View view) {
        this.c.b(lqy, lqv, i);
    }
}
