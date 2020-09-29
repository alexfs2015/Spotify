package defpackage;

import android.graphics.drawable.Drawable;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.libs.connect.access.view.ConnectAccessButton;

/* renamed from: rom reason: default package */
public final class rom {
    private dw<Runnable> a = new dw<>();
    private final ConnectAccessButton b;
    private final roq c;
    private String d;

    public rom(ConnectAccessButton connectAccessButton, roq roq) {
        this.b = connectAccessButton;
        this.c = roq;
        this.a.c(0, new $$Lambda$rom$42b0qY7wtiRyO809N6JOOYiqG0g(this));
        this.a.c(1, new $$Lambda$rom$eH2RAc636HbJlBkXKix2BG1z5HA(this));
        this.a.c(2, new $$Lambda$rom$esXysIbRf5FGaRhcBGcKDsFXU(this));
        this.a.c(3, new $$Lambda$rom$UeOROJjNklgAz6QhNYzLRozHzgE(this));
        this.a.c(4, new $$Lambda$rom$tmMUbNlhRES8ZKQrdQbAwfm7Wbc(this));
        this.a.c(5, new $$Lambda$rom$mK4CzhMDl4VOoh5JbP5WBwkxc(this));
    }

    private String a(String str) {
        return this.b.getResources().getString(R.string.connect_access_button_connecting_accessibility, new Object[]{str});
    }

    private String b(String str) {
        return this.b.getResources().getString(R.string.connect_access_button_connected_accessibility, new Object[]{str});
    }

    private String a() {
        return this.b.getResources().getString(R.string.connect_access_button_normal_accessibility);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.b.a((CharSequence) null);
        this.b.a((Drawable) null);
        this.b.setContentDescription(a());
        this.b.setVisibility(8);
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
    public /* synthetic */ void c() {
        this.b.a((CharSequence) this.d);
        this.b.a(this.c.a);
        this.b.a(true);
        this.b.setContentDescription(b(this.d));
        this.b.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.b.a((CharSequence) this.d);
        this.b.a((Drawable) this.c.c);
        this.b.a(true);
        this.b.setContentDescription(b(this.d));
        this.b.b();
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
