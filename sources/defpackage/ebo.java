package defpackage;

import android.content.Context;

@cey
/* renamed from: ebo reason: default package */
public final class ebo {
    private static final cnh<dzv> a = new ebp();
    private static final cnh<dzv> b = new ebq();
    private final eah c;

    public ebo(Context context, coy coy, String str) {
        eah eah = new eah(context, coy, str, a, b);
        this.c = eah;
    }

    public final <I, O> ebg<I, O> a(String str, ebj<I> ebj, ebi<O> ebi) {
        return new ebr(this.c, str, ebj, ebi);
    }
}
