package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;

/* renamed from: jpe reason: default package */
public final class jpe {
    public static final jpe a = new jpe(new jpi(jqo.a, jpo.a, jpk.a));
    public static final vgh<Integer> b = vgh.a(Integer.valueOf(0));
    public final jpi<?> c;

    private jpe(jpi<?> jpi) {
        this.c = (jpi) fbp.a(jpi);
    }

    public static jpe a(ContextMenuViewModel contextMenuViewModel) {
        return a((jpk<Void>) new a<Void>(contextMenuViewModel));
    }

    public static jpe a(jpk<Void> jpk) {
        return new jpe(new jpi(jqo.a, jpo.a, jpk));
    }

    public static <T> jpe a(jqo<T> jqo, jpo<T> jpo, jpk<T> jpk) {
        return new jpe(new jpi(jqo, jpo, jpk));
    }
}
