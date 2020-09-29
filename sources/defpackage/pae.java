package defpackage;

/* renamed from: pae reason: default package */
final class pae {
    private final wlc<pce> a;

    pae(wlc<pce> wlc) {
        if (wlc != null) {
            this.a = wlc;
            return;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
