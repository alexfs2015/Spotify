package defpackage;

import com.spotify.mobile.android.util.Assertion;

/* renamed from: lof reason: default package */
public final class lof implements wig<gfu> {
    private static final lof a = new lof();

    public static lof a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (gfu) wil.a(new gfu() {
            private gey a = new gey();

            public /* synthetic */ void a(String str, Object... objArr) {
                CC.$default$a(this, str, objArr);
            }

            public final void a(Throwable th, String str) {
                this.a.a(th, str);
                Assertion.b("Error in EventSender", th);
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }
}
