package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;

/* renamed from: jms reason: default package */
public final class jms {
    public static final jms a = new jms(new jmw(joc.a, jnc.a, jmy.a));
    public static final uuq<Integer> b = uuq.a(Integer.valueOf(0));
    public final jmw<?> c;

    private jms(jmw<?> jmw) {
        this.c = (jmw) fay.a(jmw);
    }

    public static <T> jms a(joc<T> joc, jnc<T> jnc, jmy<T> jmy) {
        return new jms(new jmw(joc, jnc, jmy));
    }

    public static jms a(jmy<Void> jmy) {
        return new jms(new jmw(joc.a, jnc.a, jmy));
    }

    public static jms a(ContextMenuViewModel contextMenuViewModel) {
        return a((jmy<Void>) new a<Void>(contextMenuViewModel));
    }
}
