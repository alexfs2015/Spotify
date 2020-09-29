package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* renamed from: tve reason: default package */
public final class tve implements tvb {
    private final tvd a;
    private final Context b;
    private final tsw c;
    private final tsu d;
    private final tvf e;
    private final tth f;
    private boolean g;
    private boolean h;

    public final void a(uys uys, String str, int i) {
    }

    public final void a(uzf uzf, boolean z) {
    }

    public final void b(uys uys, String str, int i) {
    }

    public final void b(uys uys, uys[] uysArr, String str, int i) {
    }

    public final void b(boolean z) {
    }

    public final void c() {
    }

    public final void c(uys uys, String str, int i) {
    }

    public final void c(uys uys, uys[] uysArr, String str, int i) {
    }

    public final void d() {
    }

    public final void d(uys uys, String str, int i) {
    }

    public final void d(uys uys, uys[] uysArr, String str, int i) {
    }

    public final void e(String str) {
    }

    public tve(tvd tvd, Context context, tsw tsw, tsu tsu, tvf tvf, tth tth) {
        this.a = tvd;
        this.b = context;
        this.c = tsw;
        this.d = tsu;
        this.e = tvf;
        this.f = tth;
        ImageView imageView = this.a.a;
        if (imageView != null) {
            imageView.setImageDrawable(two.a(this.e.a));
        }
    }

    public final void d(String str) {
        tth.a(this.a, str);
    }

    public final void a(Integer num, int i) {
        tth.a(this.a, num, i);
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public final void c(boolean z) {
        boolean z2 = true;
        this.h = !z;
        tvd tvd = this.a;
        if (!this.g && !this.h) {
            z2 = false;
        }
        tvd.c(z2);
    }

    public final void a(String str) {
        this.a.d().setText(str);
    }

    public final void b(String str) {
        this.a.a((CharSequence) str);
    }

    public final void d(boolean z) {
        this.g = z;
        this.a.c(this.g || this.h);
    }

    public final void c(String str) {
        this.f.b(this.a, str);
    }

    public final void a(uys uys, uys[] uysArr, String str, int i) {
        View view = this.a.getView();
        $$Lambda$tve$mLpJH8zi5iLw4KIxatO9J5ZmS38 r1 = new $$Lambda$tve$mLpJH8zi5iLw4KIxatO9J5ZmS38(this, uys, uysArr, str, i);
        view.setOnClickListener(r1);
        ImageView imageView = this.a.a;
        if (imageView != null) {
            imageView.setOnClickListener(new $$Lambda$tve$bd1wTtnq3dzF6jhFnHyxsbfzu78(this, uys, str, i));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, uys[] uysArr, String str, int i, View view) {
        this.c.a(uys, uysArr, str, i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uys uys, String str, int i, View view) {
        this.d.a(uys.getUri(), str, i);
        this.d.a();
    }

    public final void a() {
        jxb.a(this.b, this.a.d(), true);
    }

    public final void b() {
        jxb.a(this.b, this.a.d(), false);
    }
}
