package defpackage;

import com.spotify.mobile.android.util.Assertion;

/* renamed from: lkf reason: default package */
public final class lkf implements vua<gej> {
    private static final lkf a = new lkf();

    public static lkf a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (gej) vuf.a(new gej() {
            private gdn a = new gdn();

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
