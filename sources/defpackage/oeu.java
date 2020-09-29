package defpackage;

import android.content.res.Resources;
import com.google.common.collect.ImmutableList;

/* renamed from: oeu reason: default package */
public final class oeu extends a {
    private final Resources a;
    private final ImmutableList<ofh> b;
    private final ImmutableList<ofh> c;

    public oeu(Resources resources, ImmutableList<ofh> immutableList, ImmutableList<ofh> immutableList2) {
        this.a = resources;
        this.b = immutableList;
        this.c = immutableList2;
    }

    public final int a() {
        return this.b.size();
    }

    public final boolean a(int i, int i2) {
        return ((ofh) this.c.get(i2)).a().a().equals(((ofh) this.b.get(i)).a().a());
    }

    public final int b() {
        return this.c.size();
    }

    public final boolean b(int i, int i2) {
        ofh ofh = (ofh) this.c.get(i2);
        ofh ofh2 = (ofh) this.b.get(i);
        return ofh.b().equals(ofh2.b()) && ofh.a().b(this.a).equals(ofh2.a().b(this.a)) && ofh.a().a(this.a).equals(ofh2.a().a(this.a));
    }
}
