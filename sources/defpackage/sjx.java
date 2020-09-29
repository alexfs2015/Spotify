package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;
import java.util.Set;

/* renamed from: sjx reason: default package */
public final class sjx {
    public boolean a;
    public boolean b;
    private final skb c;
    private final sjo d;
    private final sjr e;
    private final Set<skc> f;
    private final Entity g;
    private final int h;
    private final String i;
    private final String j;

    public sjx(skb skb, sjo sjo, sjr sjr, Set<skc> set, Entity entity, int i2, String str, String str2) {
        this.c = skb;
        this.d = sjo;
        this.e = sjr;
        this.f = set;
        this.g = entity;
        this.h = i2;
        this.i = str;
        this.j = str2;
    }

    private static a a(a aVar) {
        return aVar.c("secondary_icon", "chevron_right");
    }

    public final hcm a() {
        a a2 = hcz.builder().a(this.g.g).a((Enum<?>) this.d.a(this.g));
        a a3 = hcy.builder().a(this.g.f);
        a builder = hcx.builder();
        StringBuilder sb = new StringBuilder();
        sb.append(this.j);
        sb.append('-');
        sb.append(this.h);
        String str = "ui:index_in_block";
        String str2 = "ui:source";
        a c2 = builder.a(sb.toString()).a(this.e.a(EntityCase.a(this.g.d))).a(hcw.builder().a(a2)).a((hcr) hcq.a(this.g.e)).c(HubsImmutableComponentBundle.builder().a("ui:group", this.j).a(str, this.h).a(str2, this.i).a());
        if (this.b) {
            a3 = a3.b(this.c.a(this.g));
        }
        a a4 = c2.a(a3);
        if (this.a) {
            a4 = a(a4);
        }
        for (skc a5 : this.f) {
            a4 = a5.a(a4, this.g);
        }
        return a4.a();
    }
}
