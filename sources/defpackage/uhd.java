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

/* renamed from: uhd reason: default package */
public final class uhd implements uhc {
    private final fsc a;
    private final uez b;
    private final uex c;
    private final uey d;
    private final sso e;
    private final Picasso f;
    private final ImageView g;
    private final TextView h;
    private final Context i;
    private final jor<ufx> j;

    public uhd(fsc fsc, uez uez, uex uex, uey uey, sso sso, Picasso picasso, Context context, jor<ufx> jor) {
        this.a = fsc;
        this.b = uez;
        this.c = uex;
        this.d = uey;
        this.e = sso;
        this.f = picasso;
        this.g = fsc.c();
        this.h = fsc.d();
        this.i = context;
        this.j = jor;
    }

    private View a(vkv vkv, ColorStateList colorStateList, String str, int i2) {
        ImageButton a2 = jyz.a(this.i, SpotifyIconV2.DOWNLOAD, colorStateList);
        a2.setOnClickListener(new $$Lambda$uhd$YPsXrggj8jonKSgQbDGQjAyklA(this, vkv, str, i2));
        return a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i2, View view) {
        this.d.onDownloadClick(vkv, str, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, vkv[] vkvArr, String str, int i2, View view) {
        this.b.a(vkv, vkvArr, str, i2);
    }

    public final void a() {
        jzb.a(this.i, this.h, true);
    }

    public final void a(String str) {
        this.a.c(str);
    }

    public final void a(vkv vkv, String str, int i2) {
        this.a.a(a(vkv, vgl.d(this.i, R.attr.pasteColorAccessory), str, i2));
    }

    public final void a(vkv vkv, vkv[] vkvArr, String str, int i2) {
        View view = this.a.getView();
        $$Lambda$uhd$h0aDUMgrrd5FgorgMvyf122ZGQA r1 = new $$Lambda$uhd$h0aDUMgrrd5FgorgMvyf122ZGQA(this, vkv, vkvArr, str, i2);
        view.setOnClickListener(r1);
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public final void b() {
        jzb.a(this.i, this.h, false);
    }

    public final void b(String str) {
        this.a.b().setSingleLine(false);
        this.a.b().setMaxLines(2);
        this.a.b().setEllipsize(TruncateAt.END);
        this.a.a(str);
    }

    public final void b(vkv vkv, String str, int i2) {
        this.a.a(a(vkv, vgl.d(this.i, R.attr.pasteColorAccessoryGreen), str, i2));
    }

    public final void b(boolean z) {
    }

    public final void c(String str) {
        int dimensionPixelOffset = this.i.getResources().getDimensionPixelOffset(R.dimen.episode_image_size);
        Drawable c2 = gaa.c(this.i);
        LayoutParams layoutParams = this.g.getLayoutParams();
        layoutParams.width = dimensionPixelOffset;
        layoutParams.height = dimensionPixelOffset;
        this.g.setLayoutParams(layoutParams);
        this.g.setScaleType(ScaleType.FIT_CENTER);
        this.f.d(this.g);
        this.f.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(c2).b(dimensionPixelOffset, dimensionPixelOffset).d().a(this.g);
    }

    public final void c(vkv vkv, String str, int i2) {
        this.a.a(jqq.a(this.i, this.j, ufx.a(vkv, str, i2), this.e));
    }

    public final void c(boolean z) {
        this.a.getView().setEnabled(z);
    }

    public final void d(boolean z) {
        this.a.c(z);
    }
}
