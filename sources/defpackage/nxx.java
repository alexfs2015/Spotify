package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import java.util.Collections;

/* renamed from: nxx reason: default package */
public final class nxx {
    private static final sih a = ViewUris.W;

    /* renamed from: nxx$a */
    interface a {
        voo a(String str);

        voo b(String str);
    }

    /* renamed from: nxx$b */
    interface b {
        voo a(String str);

        voo b(String str);
    }

    static voo a(String str) {
        defpackage.voo.a e = e();
        e.e = "hit";
        e.f = "skip_to_previous";
        return e.a("item_to_be_skipped", str).a();
    }

    static voo b(String str) {
        defpackage.voo.a e = e();
        e.e = "hit";
        e.f = "skip_to_next";
        return e.a("item_to_be_skipped", str).a();
    }

    static voo a() {
        defpackage.voo.a e = e();
        e.e = "hit";
        e.f = "ui_reveal";
        return e.a();
    }

    /* access modifiers changed from: 0000 */
    public final b b() {
        return new b() {
            public final voo a(String str) {
                defpackage.voo.a d = nxx.e();
                defpackage.vom.a a2 = vom.a();
                a2.a = "play_button";
                defpackage.voo.a a3 = d.a(Collections.singletonList(a2.a()));
                a3.e = "hit";
                a3.f = "pause";
                return a3.a("item_to_be_paused", str).a();
            }

            public final voo b(String str) {
                defpackage.voo.a d = nxx.e();
                defpackage.vom.a a2 = vom.a();
                a2.a = "play_button";
                defpackage.voo.a a3 = d.a(Collections.singletonList(a2.a()));
                a3.e = "hit";
                a3.f = "resume";
                return a3.a("item_to_be_resumed", str).a();
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public final a c() {
        return new a() {
            public final voo a(String str) {
                defpackage.voo.a d = nxx.e();
                defpackage.vom.a a2 = vom.a();
                a2.a = "heart_button";
                defpackage.voo.a a3 = d.a(Collections.singletonList(a2.a()));
                a3.e = "hit";
                a3.f = "like";
                return a3.a("item_to_be_liked", str).a();
            }

            public final voo b(String str) {
                defpackage.voo.a d = nxx.e();
                defpackage.vom.a a2 = vom.a();
                a2.a = "heart_button";
                defpackage.voo.a a3 = d.a(Collections.singletonList(a2.a()));
                a3.e = "hit";
                a3.f = "unlike";
                return a3.a("item_to_be_unliked", str).a();
            }
        };
    }

    /* access modifiers changed from: private */
    public static defpackage.voo.a e() {
        defpackage.voo.a a2 = voo.a();
        a2.a = "now-playing-bar";
        a2.b = "d8457ef3e3838d2f580988d18c9209c4334e9781";
        a2.c = "283209cbebd0f0862c64555a9db1f6dfcf6e87f8";
        a2.g = "music";
        a2.d = a.toString();
        return a2;
    }
}
