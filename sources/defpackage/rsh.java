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
import java.util.LinkedList;

/* renamed from: rsh reason: default package */
public final class rsh implements rsi {
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
    public final rsl n;
    /* access modifiers changed from: private */
    public final rsk o;
    private final ues p = new ues(uer.a);
    private final a q = new a() {
        private void c(Drawable drawable) {
            if (drawable != null) {
                rsh.this.f.setImageDrawable(drawable);
            }
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom, nq nqVar) {
            rsh rsh = rsh.this;
            LinkedList linkedList = new LinkedList();
            boolean z = false;
            if (nqVar != null) {
                rsp.a(linkedList, nqVar.a(0));
                rsp.a(linkedList, nqVar.d(0));
                rsp.a(linkedList, nqVar.g(0));
                rsp.a(linkedList, nqVar.b(0));
                rsp.a(linkedList, nqVar.e(0));
                rsp.a(linkedList, nqVar.c(0));
                rsp.a(linkedList, nqVar.f(0));
            }
            int i = -1;
            if (!linkedList.isEmpty()) {
                i = ((Integer) linkedList.get(0)).intValue();
            }
            rsh.k = i;
            fbp.a(!bitmap.isRecycled());
            if (loadedFrom != LoadedFrom.MEMORY) {
                z = true;
            }
            rsl a2 = rsh.this.n;
            a2.a.a(bitmap, a2.getBounds());
            a2.b.a(a2.getBounds());
            a2.c.a(z);
            fbp.a(!bitmap.isRecycled());
            c(rsh.this.n);
            rsh.this.b.setTextColor(rsh.this.k);
            rsh rsh2 = rsh.this;
            rsh2.a(rsh2.k);
            rsh.this.i.a(rsh.this.j);
        }

        public final void a(Drawable drawable) {
            c(drawable);
        }

        public final void b(Drawable drawable) {
            c(drawable);
        }
    };
    private final wgx r = new wgx() {
        private void c(Drawable drawable) {
            if (drawable != null) {
                rsh.this.g.setImageDrawable(drawable);
                rsh.this.g.setVisibility(0);
                return;
            }
            rsh.this.g.setVisibility(8);
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fbp.a(!bitmap.isRecycled());
            boolean z = loadedFrom != LoadedFrom.MEMORY;
            rsk g = rsh.this.o;
            g.a.a(bitmap, g.getBounds());
            g.b.a(z);
            c(rsh.this.o);
            fbp.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            c(drawable);
        }

        public final void b(Drawable drawable) {
            c(drawable);
        }
    };

    public rsh(Picasso picasso, ViewGroup viewGroup) {
        this.l = (Picasso) fbp.a(picasso);
        this.m = ((ViewGroup) fbp.a(viewGroup)).getContext();
        this.a = LayoutInflater.from(this.m).inflate(R.layout.home_promotion_layout, viewGroup, false);
        this.b = (TextView) this.a.findViewById(R.id.promotion_title);
        this.c = (TextView) this.a.findViewById(R.id.promotion_subtitle);
        this.d = (TextView) this.a.findViewById(R.id.promotion_metadata);
        this.e = (TextView) this.a.findViewById(R.id.promotion_label);
        this.f = (ImageView) this.a.findViewById(R.id.promotion_background_image);
        this.g = (ImageView) this.a.findViewById(R.id.promotion_main_image);
        this.h = (ImageView) this.a.findViewById(R.id.promotion_logo);
        this.i = (PlayButton) this.a.findViewById(R.id.promotion_play_button);
        this.n = new rsl(this.m, R.dimen.home_promotion_background_corner_radius);
        this.o = new rsk(this.m.getResources().getDimensionPixelSize(R.dimen.home_promotion_main_image_corner_radius));
        this.f.setBackground(new rsm(this.m.getResources(), R.dimen.home_promotion_background_corner_radius));
        this.f.setImageDrawable(this.n);
        this.g.setBackground(new rsm(this.m.getResources(), R.dimen.home_promotion_background_corner_radius));
        this.g.setImageDrawable(this.o);
        vfz.a(this.a.findViewById(R.id.promotion_root_view)).b(this.b, this.c, this.d, this.e, this.f, this.g).a(this.a).a();
        this.p.a(this.q);
        this.k = fr.c(this.m, R.color.white);
        a(this.k);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Drawable a(SpotifyIconV2 spotifyIconV2) {
        return gaa.a(this.m, spotifyIconV2, (float) vfj.b(64.0f, this.m.getResources()));
    }

    private static Uri a(String str) {
        return TextUtils.isEmpty(str) ? Uri.EMPTY : Uri.parse(str);
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        ip.a((View) this.i, (Drawable) new rsj(this.m, i2));
    }

    private void a(String str, String str2, wgx wgx) {
        Optional a2 = a.a.a(str2).a((Function<? super T, V>) new $$Lambda$rsh$yFmMS3D3ihRMELZQKQh6gedVxmU<Object,V>(this));
        wgr a3 = this.l.a(a(str));
        if (a2.b()) {
            a3 = a3.a((Drawable) a2.c()).b((Drawable) a2.c());
        }
        a3.a(wgx);
    }

    static /* synthetic */ void a(rsh rsh, String str) {
        rsh.h.setContentDescription(str);
        rsh.h.setVisibility(0);
        rsh.g.setVisibility(8);
        rsh.b.setVisibility(8);
    }

    public final void a() {
        this.j = false;
        this.i.setVisibility(0);
        this.i.a(false);
    }

    public final void a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.b.setText(charSequence);
            this.b.setVisibility(0);
            this.h.setVisibility(8);
        }
    }

    public final void a(String str, String str2) {
        a(str, str2, this.p.a());
    }

    public final void b() {
        this.j = true;
        this.i.setVisibility(0);
        this.i.a(true);
    }

    public final void b(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.c.setText(charSequence);
            this.c.setVisibility(0);
        }
    }

    public final void b(String str, String str2) {
        a(str, str2, this.r);
    }

    public final View c() {
        return this.i;
    }

    public final void c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.d.setText(charSequence);
            this.d.setVisibility(0);
        }
    }

    public final void c(String str, final String str2) {
        this.l.a(a(str)).a(this.h, (wfz) new wfz() {
            public final void a() {
                rsh.a(rsh.this, str2);
            }

            public final void b() {
                rsh.this.a((CharSequence) str2);
            }
        });
    }

    public final void d(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.e.setText(charSequence);
            this.e.setVisibility(0);
        }
    }

    public final View getView() {
        return this.a;
    }
}
