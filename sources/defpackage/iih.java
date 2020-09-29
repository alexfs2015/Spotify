package defpackage;

import android.view.View;
import com.squareup.picasso.Picasso;

/* renamed from: iih reason: default package */
public final class iih implements iii {
    final int a;
    iik b;
    private final String c;
    private final Picasso d;
    private final vhh<View> e = new vhh<>(new b() {
        public final void a() {
            iih.this.b.a(iih.this.a);
        }

        public final void a(int i) {
            iih.this.b.a(i);
        }
    });

    public iih(String str, Picasso picasso, int i) {
        this.c = str;
        this.d = picasso;
        this.a = i;
    }

    public final void a(iik iik) {
        this.b = iik;
        this.d.a(this.c).a((wgz) vhb.a).a((wgx) this.e);
    }
}
