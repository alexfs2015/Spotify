package defpackage;

import com.spotify.messages.UbiExpr1Impression;
import com.spotify.messages.UbiExpr3Interaction;
import com.spotify.messages.UbiExpr3Interaction.a;
import com.spotify.messages.UbiExprInteractionNonAuth;
import java.util.Map.Entry;

/* renamed from: vok reason: default package */
final class vok implements vol {
    private final gdz<fko> a;

    vok(gdz<fko> gdz) {
        this.a = gdz;
    }

    public final void a(voo voo) {
        a n = UbiExpr3Interaction.k().l(voo.j).m(voo.a).k(voo.b).b(voo.c).a(voo.d).c(voo.e).d(voo.f).n(voo.i);
        for (vom vom : voo.g) {
            n.e(vom.a);
            n.g(a((Object) vom.b));
            n.h(a((Object) vom.c));
            n.f(a((Object) vom.d));
        }
        for (Entry entry : voo.h.entrySet()) {
            n.i(a(entry.getKey())).j(a(entry.getValue()));
        }
        this.a.a(n.g());
    }

    public final void b(voo voo) {
        UbiExprInteractionNonAuth.a n = UbiExprInteractionNonAuth.k().l(voo.j).m(voo.a).k(voo.b).b(voo.c).a(voo.d).c(voo.e).d(voo.f).n(voo.i);
        for (vom vom : voo.g) {
            n.e(vom.a);
            n.g(a((Object) vom.b));
            n.h(a((Object) vom.c));
            n.f(a((Object) vom.d));
        }
        for (Entry entry : voo.h.entrySet()) {
            n.i(a(entry.getKey())).j(a(entry.getValue()));
        }
        this.a.b(n.g());
    }

    public final void a(von von) {
        UbiExpr1Impression.a j = UbiExpr1Impression.k().i(von.g).b(von.a).h(von.b).g(von.c).a(von.d).j(von.f);
        for (vom vom : von.e) {
            j.c(vom.a);
            j.e(a((Object) vom.b));
            j.f(a((Object) vom.c));
            j.d(a((Object) vom.d));
        }
        this.a.a(j.g());
    }

    private static String a(Object obj) {
        return obj != null ? String.valueOf(obj) : "";
    }
}
