package defpackage;

import android.view.View;
import com.squareup.picasso.Picasso;

/* renamed from: ifu reason: default package */
public final class ifu implements ifv {
    final int a;
    ifx b;
    private final String c;
    private final Picasso d;
    private final uvq<View> e = new uvq<>(new b() {
        public final void a(int i) {
            ifu.this.b.a(i);
        }

        public final void a() {
            ifu.this.b.a(ifu.this.a);
        }
    });

    public ifu(String str, Picasso picasso, int i) {
        this.c = str;
        this.d = picasso;
        this.a = i;
    }

    public final void a(ifx ifx) {
        this.b = ifx;
        this.d.a(this.c).a((vst) uvk.a).a((vsr) this.e);
    }
}
