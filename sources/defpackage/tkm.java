package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: tkm reason: default package */
public final class tkm<T> implements a<T> {
    private final wlc<Picasso> a;
    private final wlc<tkg> b;
    private final wlc<tvx> c;
    private final wlc<twi> d;
    private final wlc<Boolean> e;
    private final wlc<tjz<T>> f;
    private final wlc<twz> g;

    public tkm(wlc<Picasso> wlc, wlc<tkg> wlc2, wlc<tvx> wlc3, wlc<twi> wlc4, wlc<Boolean> wlc5, wlc<tjz<T>> wlc6, wlc<twz> wlc7) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
        this.c = (wlc) a((T) wlc3, 3);
        this.d = (wlc) a((T) wlc4, 4);
        this.e = (wlc) a((T) wlc5, 5);
        this.f = (wlc) a((T) wlc6, 6);
        this.g = (wlc) a((T) wlc7, 7);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ tkk a(tke tke, vti vti) {
        tkl tkl = new tkl((Picasso) a((T) this.a.get(), 1), (tkg) a((T) this.b.get(), 2), (tvx) a((T) this.c.get(), 3), (twi) a((T) this.d.get(), 4), ((Boolean) a((T) this.e.get(), 5)).booleanValue(), (tjz) a((T) this.f.get(), 6), (twz) a((T) this.g.get(), 7), (tke) a((T) tke, 8), (vti) a((T) vti, 9));
        return tkl;
    }
}
