package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import java.util.Collections;

/* renamed from: oej reason: default package */
final class oej {
    private static final sso a = ViewUris.V;

    /* renamed from: oej$a */
    interface a {
        wbw a(String str);

        wbw b(String str);
    }

    /* renamed from: oej$b */
    interface b {
        wbw a(String str);

        wbw b(String str);
    }

    static wbw a() {
        defpackage.wbw.a e = e();
        e.e = "hit";
        e.f = "ui_reveal";
        return e.a();
    }

    static wbw a(String str) {
        defpackage.wbw.a e = e();
        e.e = "hit";
        e.f = "skip_to_previous";
        return e.a("item_to_be_skipped", str).a();
    }

    static wbw b(String str) {
        defpackage.wbw.a e = e();
        e.e = "hit";
        e.f = "skip_to_next";
        return e.a("item_to_be_skipped", str).a();
    }

    /* access modifiers changed from: private */
    public static defpackage.wbw.a e() {
        defpackage.wbw.a a2 = wbw.a();
        a2.a = "now-playing-bar";
        a2.b = "d8457ef3e3838d2f580988d18c9209c4334e9781";
        a2.c = "283209cbebd0f0862c64555a9db1f6dfcf6e87f8";
        a2.g = "music";
        a2.d = a.toString();
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public final b b() {
        return new b() {
            public final wbw a(String str) {
                defpackage.wbw.a d = oej.e();
                defpackage.wbu.a a2 = wbu.a();
                a2.a = "play_button";
                defpackage.wbw.a a3 = d.a(Collections.singletonList(a2.a()));
                a3.e = "hit";
                a3.f = "pause";
                return a3.a("item_to_be_paused", str).a();
            }

            public final wbw b(String str) {
                defpackage.wbw.a d = oej.e();
                defpackage.wbu.a a2 = wbu.a();
                a2.a = "play_button";
                defpackage.wbw.a a3 = d.a(Collections.singletonList(a2.a()));
                a3.e = "hit";
                a3.f = "resume";
                return a3.a("item_to_be_resumed", str).a();
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public final a c() {
        return new a() {
            public final wbw a(String str) {
                defpackage.wbw.a d = oej.e();
                defpackage.wbu.a a2 = wbu.a();
                a2.a = "heart_button";
                defpackage.wbw.a a3 = d.a(Collections.singletonList(a2.a()));
                a3.e = "hit";
                a3.f = "like";
                return a3.a("item_to_be_liked", str).a();
            }

            public final wbw b(String str) {
                defpackage.wbw.a d = oej.e();
                defpackage.wbu.a a2 = wbu.a();
                a2.a = "heart_button";
                defpackage.wbw.a a3 = d.a(Collections.singletonList(a2.a()));
                a3.e = "hit";
                a3.f = "unlike";
                return a3.a("item_to_be_unliked", str).a();
            }
        };
    }
}
