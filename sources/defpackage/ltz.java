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

/* renamed from: ltz reason: default package */
public final class ltz extends lub {
    private final ujc a;
    private final Picasso b;
    private final a c;

    /* renamed from: ltz$a */
    public interface a {
        static {
            new a() {
                public final void a(lux lux, luu luu, int i) {
                }

                public final void b(lux lux, luu luu, int i) {
                }

                public final void c(lux lux, luu luu, int i) {
                }
            };
        }

        void a(lux lux, luu luu, int i);

        void b(lux lux, luu luu, int i);

        void c(lux lux, luu luu, int i);
    }

    public ltz(ViewGroup viewGroup, a aVar, ujc ujc, Picasso picasso) {
        fqv.b();
        super(fsk.b(viewGroup.getContext(), viewGroup, false).getView());
        this.a = ujc;
        this.b = picasso;
        fsc fsc = (fsc) fqz.a(this.o, fsc.class);
        fsc.a(jyz.a(viewGroup.getContext()));
        ImageButton imageButton = (ImageButton) fsc.a();
        imageButton.setImageDrawable(jyz.b(viewGroup.getContext(), SpotifyIconV2.PLUS_ALT, fr.b(viewGroup.getContext(), (int) R.color.white)));
        imageButton.setContentDescription(viewGroup.getContext().getString(R.string.assisted_curation_add_to_playlist_content_description));
        fsc.c().setContentDescription(viewGroup.getContext().getString(R.string.preview_play_pause_content_description));
        this.c = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(lux lux, luu luu, int i, View view) {
        this.c.b(lux, luu, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(lux lux, luu luu, int i, View view) {
        this.c.a(lux, luu, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(lux lux, luu luu, int i, View view) {
        this.c.c(lux, luu, i);
    }

    public final void a(lux lux, luu luu, int i, boolean z) {
        fsc fsc = (fsc) fqz.a(this.o, fsc.class);
        fsc.a(luu.b());
        fsc.b(jve.a(luu.g()));
        Uri parse = !TextUtils.isEmpty(luu.h()) ? Uri.parse(luu.h()) : Uri.EMPTY;
        ImageView c2 = fsc.c();
        Drawable i2 = gaa.i(this.o.getContext());
        this.b.a(parse).a(i2).b(i2).a((wgx) ujd.a(c2, this.a, luu.c(), ltt.a(luu, lux)));
        fsc.c().setOnClickListener(new $$Lambda$ltz$JLFHimCWuWCoo5vWnp6H20vAdVI(this, lux, luu, i));
        this.o.setOnClickListener(new $$Lambda$ltz$PnivUln0HpIXJ1M6Wel577lHkQY(this, lux, luu, i));
        ((ImageButton) fsc.a()).setOnClickListener(new $$Lambda$ltz$jPGRzV4G30vpHpxl6CnDqBdbGQA(this, lux, luu, i));
        jzb.a(this.o.getContext(), fsc.d(), luu.d());
        fsc.c(jvh.a(true, z, luu.d()));
    }
}
