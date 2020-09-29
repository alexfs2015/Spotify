package defpackage;

import com.spotify.messages.UbiExpr1Impression;
import com.spotify.messages.UbiExpr1Impression.a;
import com.spotify.messages.UbiExpr3Interaction;
import com.spotify.messages.UbiExprInteractionNonAuth;
import java.util.Map.Entry;

/* renamed from: wbs reason: default package */
final class wbs implements wbt {
    private final gfk<fli> a;

    wbs(gfk<fli> gfk) {
        this.a = gfk;
    }

    private static String a(Object obj) {
        return obj != null ? String.valueOf(obj) : "";
    }

    public final void a(wbv wbv) {
        a j = UbiExpr1Impression.k().i(wbv.g).b(wbv.a).h(wbv.b).g(wbv.c).a(wbv.d).j(wbv.f);
        for (wbu wbu : wbv.e) {
            j.c(wbu.a);
            j.e(a((Object) wbu.b));
            j.f(a((Object) wbu.c));
            j.d(a((Object) wbu.d));
        }
        this.a.a(j.g());
    }

    public final void a(wbw wbw) {
        UbiExpr3Interaction.a n = UbiExpr3Interaction.k().l(wbw.j).m(wbw.a).k(wbw.b).b(wbw.c).a(wbw.d).c(wbw.e).d(wbw.f).n(wbw.i);
        for (wbu wbu : wbw.g) {
            n.e(wbu.a);
            n.g(a((Object) wbu.b));
            n.h(a((Object) wbu.c));
            n.f(a((Object) wbu.d));
        }
        for (Entry entry : wbw.h.entrySet()) {
            n.i(a(entry.getKey())).j(a(entry.getValue()));
        }
        this.a.a(n.g());
    }

    public final void b(wbw wbw) {
        UbiExprInteractionNonAuth.a n = UbiExprInteractionNonAuth.k().l(wbw.j).m(wbw.a).k(wbw.b).b(wbw.c).a(wbw.d).c(wbw.e).d(wbw.f).n(wbw.i);
        for (wbu wbu : wbw.g) {
            n.e(wbu.a);
            n.g(a((Object) wbu.b));
            n.h(a((Object) wbu.c));
            n.f(a((Object) wbu.d));
        }
        for (Entry entry : wbw.h.entrySet()) {
            n.i(a(entry.getKey())).j(a(entry.getValue()));
        }
        this.a.b(n.g());
    }
}
