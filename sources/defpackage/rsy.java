package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: rsy reason: default package */
final class rsy {
    final int a;
    private final Picasso b;
    private final int c;
    private final int d;

    public rsy(Picasso picasso, Context context) {
        this.b = picasso;
        this.d = vfj.b(180.0f, context.getResources());
        this.c = fr.c(context, R.color.gray_7);
        this.a = fr.c(context, R.color.black);
    }

    /* access modifiers changed from: private */
    public void a(View view, int i, float f, int i2) {
        rsx rsx = new rsx(this.d, i, this.c, f, i2);
        ip.a(view, (Drawable) rsx);
    }

    private void a(final View view, String str, final int i, final float f) {
        vhh vhh = new vhh(new b() {
            public final void a() {
                rsy rsy = rsy.this;
                rsy.a(view, rsy.a, f, i);
            }

            public final void a(int i) {
                rsy.this.a(view, i, f, i);
            }
        });
        view.setTag(vhh);
        this.b.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a((wgz) vhb.a).a((wgx) vhh);
    }

    private void b(View view, String str, int i, float f) {
        int i2 = this.a;
        try {
            i2 = Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            a(view, this.a, f, i);
        }
        a(view, i2, f, i);
    }

    /* access modifiers changed from: 0000 */
    public final void a(View view) {
        a(view, this.a, 0.7f, 1);
    }

    /* access modifiers changed from: 0000 */
    public final void a(View view, hcj hcj, int i) {
        String string = hcj.string("startColor");
        String string2 = hcj.string("startColorFromImage");
        float floatValue = hcj.floatValue("overlayDarkness", 0.7f);
        if (!TextUtils.isEmpty(string)) {
            b(view, string, i, floatValue);
        } else if (!TextUtils.isEmpty(string2)) {
            a(view, string2, i, floatValue);
        } else {
            a(view, this.a, floatValue, i);
        }
    }
}
