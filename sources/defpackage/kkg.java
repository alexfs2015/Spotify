package defpackage;

/* renamed from: kkg reason: default package */
public final class kkg {
    public static <I, J, O> kjd<J, O> a(final kko<J, I> kko, final kjd<I, O> kjd) {
        return new kjd<J, O>() {
            public final kje<J> connect(kkn<O> kkn) {
                final kje connect = kjd.connect(kkn);
                return new kje<J>() {
                    public final void accept(J j) {
                        connect.accept(kko.apply(j));
                    }

                    public final void dispose() {
                        connect.dispose();
                    }
                };
            }
        };
    }
}
