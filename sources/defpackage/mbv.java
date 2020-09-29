package defpackage;

import com.spotify.music.libs.viewuri.ViewUris.SubView;

/* renamed from: mbv reason: default package */
public final class mbv {
    public final String a;
    private final jjf b;

    public mbv(jjf jjf, SubView subView) {
        this.b = jjf;
        this.a = subView.toString();
    }

    public final void a() {
        a(new q(this.a, "dismiss"));
    }

    public final void b() {
        a(new q(this.a, "back"));
    }

    public void a(haw haw) {
        this.b.a(haw);
    }
}
