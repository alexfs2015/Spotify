package defpackage;

import com.spotify.mobile.android.connect.view.ConnectView;

/* renamed from: tjf reason: default package */
public final class tjf {
    private final wzi<gto> a;
    private final wzi<fqn> b;

    public tjf(wzi<gto> wzi, wzi<fqn> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final tje a(ConnectView connectView) {
        return new tje((gto) a(this.a.get(), 1), (fqn) a(this.b.get(), 2), (ConnectView) a(connectView, 3));
    }
}
