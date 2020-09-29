package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: rjs reason: default package */
final class rjs {
    final int a;
    private final Picasso b;
    private final int c;
    private final int d;

    public rjs(Picasso picasso, Context context) {
        this.b = picasso;
        this.d = uts.b(180.0f, context.getResources());
        this.c = fr.c(context, R.color.gray_7);
        this.a = fr.c(context, R.color.black);
    }

    /* access modifiers changed from: 0000 */
    public final void a(View view, gzq gzq, int i) {
        String string = gzq.string("startColor");
        String string2 = gzq.string("startColorFromImage");
        float floatValue = gzq.floatValue("overlayDarkness", 0.7f);
        if (!TextUtils.isEmpty(string)) {
            b(view, string, i, floatValue);
        } else if (!TextUtils.isEmpty(string2)) {
            a(view, string2, i, floatValue);
        } else {
            a(view, this.a, floatValue, i);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(View view) {
        a(view, this.a, 0.7f, 1);
    }

    private void a(final View view, String str, final int i, final float f) {
        uvq uvq = new uvq(new b() {
            public final void a(int i) {
                rjs.this.a(view, i, f, i);
            }

            public final void a() {
                rjs rjs = rjs.this;
                rjs.a(view, rjs.a, f, i);
            }
        });
        view.setTag(uvq);
        this.b.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a((vst) uvk.a).a((vsr) uvq);
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

    /* access modifiers changed from: private */
    public void a(View view, int i, float f, int i2) {
        rjr rjr = new rjr(this.d, i, this.c, f, i2);
        ip.a(view, (Drawable) rjr);
    }
}
