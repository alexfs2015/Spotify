package defpackage;

import android.content.res.Resources;
import com.google.common.collect.ImmutableList;

/* renamed from: nyi reason: default package */
public final class nyi extends a {
    private final Resources a;
    private final ImmutableList<nyv> b;
    private final ImmutableList<nyv> c;

    public nyi(Resources resources, ImmutableList<nyv> immutableList, ImmutableList<nyv> immutableList2) {
        this.a = resources;
        this.b = immutableList;
        this.c = immutableList2;
    }

    public final int a() {
        return this.b.size();
    }

    public final int b() {
        return this.c.size();
    }

    public final boolean a(int i, int i2) {
        return ((nyv) this.c.get(i2)).a().a().equals(((nyv) this.b.get(i)).a().a());
    }

    public final boolean b(int i, int i2) {
        nyv nyv = (nyv) this.c.get(i2);
        nyv nyv2 = (nyv) this.b.get(i);
        return nyv.b().equals(nyv2.b()) && nyv.a().b(this.a).equals(nyv2.a().b(this.a)) && nyv.a().a(this.a).equals(nyv2.a().a(this.a));
    }
}
