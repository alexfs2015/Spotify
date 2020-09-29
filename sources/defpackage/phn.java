package defpackage;

/* renamed from: phn reason: default package */
final class phn {
    private final wzi<pjn> a;

    phn(wzi<pjn> wzi) {
        if (wzi != null) {
            this.a = wzi;
            return;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
