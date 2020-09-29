package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.homecomponents.promotionv2.ui.PlayButton;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: rjf reason: default package */
public final class rjf implements rjg {
    private final View a;
    /* access modifiers changed from: private */
    public final TextView b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    /* access modifiers changed from: private */
    public final ImageView f;
    /* access modifiers changed from: private */
    public final ImageView g;
    private final ImageView h;
    /* access modifiers changed from: private */
    public final PlayButton i;
    /* access modifiers changed from: private */
    public boolean j;
    /* access modifiers changed from: private */
    public int k;
    private final Picasso l;
    private final Context m;
    /* access modifiers changed from: private */
    public final rjj n;
    /* access modifiers changed from: private */
    public final rji o;
    private final tsp p = new tsp(tso.a);
    private final a q = new a() {
        public final void b(Drawable drawable) {
            c(drawable);
        }

        public final void a(Drawable drawable) {
            c(drawable);
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom, nl nlVar) {
            rjf.this.k = tsr.a(nlVar, -11316397);
            fay.a(!bitmap.isRecycled());
            boolean z = loadedFrom != LoadedFrom.MEMORY;
            rjj a2 = rjf.this.n;
            a2.a.a(bitmap, a2.getBounds());
            a2.b.a(a2.getBounds());
            a2.c.a(z);
            fay.a(!bitmap.isRecycled());
            c(rjf.this.n);
            rjf.this.b.setTextColor(rjf.this.k);
            rjf rjf = rjf.this;
            rjf.a(rjf.k);
            rjf.this.i.a(rjf.this.j);
        }

        private void c(Drawable drawable) {
            if (drawable != null) {
                rjf.this.f.setImageDrawable(drawable);
            }
        }
    };
    private final vsr r = new vsr() {
        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fay.a(!bitmap.isRecycled());
            boolean z = loadedFrom != LoadedFrom.MEMORY;
            rji g = rjf.this.o;
            g.a.a(bitmap, g.getBounds());
            g.b.a(z);
            c(rjf.this.o);
            fay.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            c(drawable);
        }

        public final void b(Drawable drawable) {
            c(drawable);
        }

        private void c(Drawable drawable) {
            if (drawable != null) {
                rjf.this.g.setImageDrawable(drawable);
                rjf.this.g.setVisibility(0);
                return;
            }
            rjf.this.g.setVisibility(8);
        }
    };

    public rjf(Picasso picasso, ViewGroup viewGroup) {
        this.l = (Picasso) fay.a(picasso);
        this.m = ((ViewGroup) fay.a(viewGroup)).getContext();
        this.a = LayoutInflater.from(this.m).inflate(R.layout.home_promotion_layout, viewGroup, false);
        this.b = (TextView) this.a.findViewById(R.id.promotion_title);
        this.c = (TextView) this.a.findViewById(R.id.promotion_subtitle);
        this.d = (TextView) this.a.findViewById(R.id.promotion_metadata);
        this.e = (TextView) this.a.findViewById(R.id.promotion_label);
        this.f = (ImageView) this.a.findViewById(R.id.promotion_background_image);
        this.g = (ImageView) this.a.findViewById(R.id.promotion_main_image);
        this.h = (ImageView) this.a.findViewById(R.id.promotion_logo);
        this.i = (PlayButton) this.a.findViewById(R.id.promotion_play_button);
        this.n = new rjj(this.m, R.dimen.home_promotion_background_corner_radius);
        this.o = new rji(this.m.getResources().getDimensionPixelSize(R.dimen.home_promotion_main_image_corner_radius));
        this.f.setBackground(new rjk(this.m.getResources(), R.dimen.home_promotion_background_corner_radius));
        this.f.setImageDrawable(this.n);
        this.g.setBackground(new rjk(this.m.getResources(), R.dimen.home_promotion_background_corner_radius));
        this.g.setImageDrawable(this.o);
        uui.a(this.a.findViewById(R.id.promotion_root_view)).b(this.b, this.c, this.d, this.e, this.f, this.g).a(this.a).a();
        this.p.a(this.q);
        this.k = fr.c(this.m, R.color.white);
        a(this.k);
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        ip.a((View) this.i, (Drawable) new rjh(this.m, i2));
    }

    public final void a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.b.setText(charSequence);
            this.b.setVisibility(0);
            this.h.setVisibility(8);
        }
    }

    public final void b(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.c.setText(charSequence);
            this.c.setVisibility(0);
        }
    }

    public final void c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.d.setText(charSequence);
            this.d.setVisibility(0);
        }
    }

    public final void d(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.e.setText(charSequence);
            this.e.setVisibility(0);
        }
    }

    public final void a(String str, String str2) {
        a(str, str2, this.p.a());
    }

    public final void b(String str, String str2) {
        a(str, str2, this.r);
    }

    public final void c(String str, final String str2) {
        this.l.a(a(str)).a(this.h, (vrt) new vrt() {
            public final void a() {
                rjf.a(rjf.this, str2);
            }

            public final void b() {
                rjf.this.a((CharSequence) str2);
            }
        });
    }

    public final void a() {
        this.j = false;
        this.i.setVisibility(0);
        this.i.a(false);
    }

    public final void b() {
        this.j = true;
        this.i.setVisibility(0);
        this.i.a(true);
    }

    public final View getView() {
        return this.a;
    }

    public final View c() {
        return this.i;
    }

    private static Uri a(String str) {
        return TextUtils.isEmpty(str) ? Uri.EMPTY : Uri.parse(str);
    }

    private void a(String str, String str2, vsr vsr) {
        Optional a2 = a.a.a(str2).a((Function<? super T, V>) new $$Lambda$rjf$MUxJJAqNvLKll_XDdX28M_KRAlE<Object,V>(this));
        vsl a3 = this.l.a(a(str));
        if (a2.b()) {
            a3 = a3.a((Drawable) a2.c()).b((Drawable) a2.c());
        }
        a3.a(vsr);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Drawable a(SpotifyIconV2 spotifyIconV2) {
        return fzg.a(this.m, spotifyIconV2, (float) uts.b(64.0f, this.m.getResources()));
    }

    static /* synthetic */ void a(rjf rjf, String str) {
        rjf.h.setContentDescription(str);
        rjf.h.setVisibility(0);
        rjf.g.setVisibility(8);
        rjf.b.setVisibility(8);
    }
}
