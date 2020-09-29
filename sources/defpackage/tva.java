package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: tva reason: default package */
public final class tva implements tuz {
    private final fri a;
    private final tsw b;
    private final tsu c;
    private final tsv d;
    private final sih e;
    private final Picasso f;
    private final ImageView g;
    private final TextView h;
    private final Context i;
    private final jmf<ttu> j;

    public final void b(boolean z) {
    }

    public tva(fri fri, tsw tsw, tsu tsu, tsv tsv, sih sih, Picasso picasso, Context context, jmf<ttu> jmf) {
        this.a = fri;
        this.b = tsw;
        this.c = tsu;
        this.d = tsv;
        this.e = sih;
        this.f = picasso;
        this.g = fri.c();
        this.h = fri.d();
        this.i = context;
        this.j = jmf;
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public final void c(boolean z) {
        this.a.getView().setEnabled(z);
    }

    public final void a(String str) {
        this.a.c(str);
    }

    public final void d(boolean z) {
        this.a.c(z);
    }

    public final void c(String str) {
        int dimensionPixelOffset = this.i.getResources().getDimensionPixelOffset(R.dimen.episode_image_size);
        Drawable c2 = fzg.c(this.i);
        LayoutParams layoutParams = this.g.getLayoutParams();
        layoutParams.width = dimensionPixelOffset;
        layoutParams.height = dimensionPixelOffset;
        this.g.setLayoutParams(layoutParams);
        this.g.setScaleType(ScaleType.FIT_CENTER);
        this.f.d(this.g);
        this.f.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(c2).b(dimensionPixelOffset, dimensionPixelOffset).d().a(this.g);
    }

    public final void a(uys uys, uys[] uysArr, String str, int i2) {
        View view = this.a.getView();
        $$Lambda$tva$nMMVNeGkXfoxs6ALwYI8_zYg5Q r1 = new $$Lambda$tva$nMMVNeGkXfoxs6ALwYI8_zYg5Q(this, uys, uysArr, str, i2);
        view.setOnClickListener(r1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, uys[] uysArr, String str, int i2, View view) {
        this.b.a(uys, uysArr, str, i2);
    }

    public final void a() {
        jxb.a(this.i, this.h, true);
    }

    public final void b() {
        jxb.a(this.i, this.h, false);
    }

    public final void a(uys uys, String str, int i2) {
        this.a.a(a(uys, uuu.d(this.i, R.attr.pasteColorAccessory), str, i2));
    }

    public final void b(uys uys, String str, int i2) {
        this.a.a(a(uys, uuu.d(this.i, R.attr.pasteColorAccessoryGreen), str, i2));
    }

    public final void c(uys uys, String str, int i2) {
        this.a.a(joe.a(this.i, this.j, ttu.a(uys, str, i2), this.e));
    }

    private View a(uys uys, ColorStateList colorStateList, String str, int i2) {
        ImageButton a2 = jwz.a(this.i, SpotifyIconV2.DOWNLOAD, colorStateList);
        a2.setOnClickListener(new $$Lambda$tva$jfTfRgbFuHs2AqSUlXxVpmxQmw(this, uys, str, i2));
        return a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, String str, int i2, View view) {
        this.d.onDownloadClick(uys, str, i2);
    }

    public final void b(String str) {
        this.a.b().setSingleLine(false);
        this.a.b().setMaxLines(2);
        this.a.b().setEllipsize(TruncateAt.END);
        this.a.a(str);
    }
}
