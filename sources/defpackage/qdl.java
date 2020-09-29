package defpackage;

import com.spotify.music.features.settings.adapter.Item;
import com.spotify.music.features.settings.adapter.Item.ShowWhen;

/* renamed from: qdl reason: default package */
public final class qdl implements faz<Item> {
    private final boolean a = false;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;

    public final /* synthetic */ boolean apply(Object obj) {
        Item item = (Item) obj;
        boolean z = false;
        if (item == null) {
            return false;
        }
        ShowWhen b2 = item.b();
        boolean z2 = (b2 == ShowWhen.a) | (this.a && b2 == ShowWhen.b) | (this.b && b2 == ShowWhen.c) | (this.d && this.c && b2 == ShowWhen.d) | (this.d && b2 == ShowWhen.e) | (this.e && b2 == ShowWhen.h) | (this.f && b2 == ShowWhen.i) | (this.g && b2 == ShowWhen.f) | (this.n && b2 == ShowWhen.g) | (this.h && b2 == ShowWhen.j) | (this.i && b2 == ShowWhen.k) | (this.j && b2 == ShowWhen.l) | (!this.k && b2 == ShowWhen.m) | (this.l && b2 == ShowWhen.n);
        if (this.m && b2 == ShowWhen.o) {
            z = true;
        }
        return z2 | z;
    }

    public qdl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = z13;
        this.n = z14;
    }
}
