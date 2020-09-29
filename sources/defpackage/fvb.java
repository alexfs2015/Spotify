package defpackage;

import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;

/* renamed from: fvb reason: default package */
public final class fvb {
    public final CharSequence a;
    public final ImmutableList<Drawable> b;
    public int c;
    public boolean d = true;
    public boolean e = true;
    public a f;
    private final int g;

    /* renamed from: fvb$a */
    public interface a {
        void onTopBarItemClicked(fvb fvb);
    }

    public fvb(int i, CharSequence charSequence, ImmutableList<Drawable> immutableList, int i2) {
        this.g = i;
        this.a = charSequence;
        this.b = immutableList;
        this.c = 0;
    }

    public final Drawable a() {
        return (Drawable) this.b.get(this.c);
    }
}
