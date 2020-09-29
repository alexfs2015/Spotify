package defpackage;

import android.graphics.drawable.Drawable;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.libs.connect.access.view.ConnectAccessButton;

/* renamed from: rxs reason: default package */
public final class rxs {
    private dw<Runnable> a = new dw<>();
    private final ConnectAccessButton b;
    private final rxw c;
    private String d;

    public rxs(ConnectAccessButton connectAccessButton, rxw rxw) {
        this.b = connectAccessButton;
        this.c = rxw;
        this.a.c(0, new $$Lambda$rxs$q_ChWZy4dEr_prbjqQ2w8YN7qk(this));
        this.a.c(1, new $$Lambda$rxs$7ymvWXUhkK7aPteKZOmPm3KH0_A(this));
        this.a.c(2, new $$Lambda$rxs$N9Ht8i5eHAk6SOO7SiHqbObU8(this));
        this.a.c(3, new $$Lambda$rxs$Xj48LYHlPxRI486mFJ1VJd84QOk(this));
        this.a.c(4, new $$Lambda$rxs$h5Xny9N29xWlOmOWi4oklopP_3Y(this));
        this.a.c(5, new $$Lambda$rxs$zjpnToD6L178m1aYaLPnU1WwQWY(this));
    }

    private String a() {
        return this.b.getResources().getString(R.string.connect_access_button_normal_accessibility);
    }

    private String a(String str) {
        return this.b.getResources().getString(R.string.connect_access_button_connecting_accessibility, new Object[]{str});
    }

    private String b(String str) {
        return this.b.getResources().getString(R.string.connect_access_button_connected_accessibility, new Object[]{str});
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.b.a((CharSequence) this.d);
        this.b.a((Drawable) this.c.c);
        this.b.a(true);
        this.b.setContentDescription(b(this.d));
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.b.a((CharSequence) this.d);
        this.b.a(this.c.a);
        this.b.a(true);
        this.b.setContentDescription(b(this.d));
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        a aVar = this.c.d;
        this.b.a((CharSequence) null);
        this.b.a(aVar.a);
        this.b.a(false);
        this.b.setContentDescription(a(this.d));
        this.b.b();
        aVar.b.start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        a aVar = this.c.e;
        this.b.a((CharSequence) null);
        this.b.a(aVar.a);
        this.b.a(false);
        this.b.setContentDescription(a(this.d));
        this.b.b();
        aVar.b.start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.b.b.setText(R.string.connect_access_button_available);
        this.b.a((Drawable) this.c.b);
        this.b.a(false);
        this.b.setContentDescription(a());
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.b.a((CharSequence) null);
        this.b.a((Drawable) null);
        this.b.setContentDescription(a());
        this.b.setVisibility(8);
    }

    public final void a(int i, String str) {
        Runnable runnable = (Runnable) this.a.a(i, null);
        if (runnable == null) {
            Assertion.b(String.format("Unknown state %s", new Object[]{Integer.valueOf(i)}));
            return;
        }
        this.d = str;
        this.b.post(runnable);
        Logger.b("State updated to %d", Integer.valueOf(i));
    }
}
