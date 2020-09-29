package defpackage;

/* renamed from: knp reason: default package */
public final class knp {
    public static <I, J, O> kmm<J, O> a(final knx<J, I> knx, final kmm<I, O> kmm) {
        return new kmm<J, O>() {
            public final kmn<J> connect(knw<O> knw) {
                final kmn connect = kmm.connect(knw);
                return new kmn<J>() {
                    public final void accept(J j) {
                        connect.accept(knx.apply(j));
                    }

                    public final void dispose() {
                        connect.dispose();
                    }
                };
            }
        };
    }
}
