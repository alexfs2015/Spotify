package defpackage;

import com.spotify.music.libs.viewuri.ViewUris.SubView;

/* renamed from: mfy reason: default package */
public final class mfy {
    public final String a;
    private final jlr b;

    public mfy(jlr jlr, SubView subView) {
        this.b = jlr;
        this.a = subView.toString();
    }

    public final void a() {
        a(new q(this.a, "dismiss"));
    }

    public void a(hdp hdp) {
        this.b.a(hdp);
    }

    public final void b() {
        a(new q(this.a, "back"));
    }
}
