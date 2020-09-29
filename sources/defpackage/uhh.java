package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* renamed from: uhh reason: default package */
public final class uhh implements uhe {
    private final uhg a;
    private final Context b;
    private final uez c;
    private final uex d;
    private final uhi e;
    private final ufk f;
    private boolean g;
    private boolean h;

    public uhh(uhg uhg, Context context, uez uez, uex uex, uhi uhi, ufk ufk) {
        this.a = uhg;
        this.b = context;
        this.c = uez;
        this.d = uex;
        this.e = uhi;
        this.f = ufk;
        ImageView imageView = this.a.a;
        if (imageView != null) {
            imageView.setImageDrawable(uir.a(this.e.a));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, String str, int i, View view) {
        this.d.a(vkv.getUri(), str, i);
        this.d.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vkv vkv, vkv[] vkvArr, String str, int i, View view) {
        this.c.a(vkv, vkvArr, str, i);
    }

    public final void a() {
        jzb.a(this.b, this.a.d(), true);
    }

    public final void a(Integer num, int i) {
        ufk.a(this.a, num, i);
    }

    public final void a(String str) {
        this.a.d().setText(str);
    }

    public final void a(vkv vkv, String str, int i) {
    }

    public final void a(vkv vkv, vkv[] vkvArr, String str, int i) {
        View view = this.a.getView();
        $$Lambda$uhh$kk4VhaCxBzWaBw1C0z7XvVlHj2o r1 = new $$Lambda$uhh$kk4VhaCxBzWaBw1C0z7XvVlHj2o(this, vkv, vkvArr, str, i);
        view.setOnClickListener(r1);
        ImageView imageView = this.a.a;
        if (imageView != null) {
            imageView.setOnClickListener(new $$Lambda$uhh$0TkweyvPQAKw3L3dcbK0vykCG0(this, vkv, str, i));
        }
    }

    public final void a(vli vli, boolean z) {
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public final void b() {
        jzb.a(this.b, this.a.d(), false);
    }

    public final void b(String str) {
        this.a.a((CharSequence) str);
    }

    public final void b(vkv vkv, String str, int i) {
    }

    public final void b(vkv vkv, vkv[] vkvArr, String str, int i) {
    }

    public final void b(boolean z) {
    }

    public final void c() {
    }

    public final void c(String str) {
        this.f.b(this.a, str);
    }

    public final void c(vkv vkv, String str, int i) {
    }

    public final void c(vkv vkv, vkv[] vkvArr, String str, int i) {
    }

    public final void c(boolean z) {
        boolean z2 = true;
        this.h = !z;
        uhg uhg = this.a;
        if (!this.g && !this.h) {
            z2 = false;
        }
        uhg.c(z2);
    }

    public final void d() {
    }

    public final void d(String str) {
        ufk.a(this.a, str);
    }

    public final void d(vkv vkv, String str, int i) {
    }

    public final void d(vkv vkv, vkv[] vkvArr, String str, int i) {
    }

    public final void d(boolean z) {
        this.g = z;
        this.a.c(this.g || this.h);
    }

    public final void e(String str) {
    }
}
