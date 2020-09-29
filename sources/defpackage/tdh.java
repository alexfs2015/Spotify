package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: tdh reason: default package */
public final class tdh {
    private final wzi<tkk> a;
    private final wzi<a> b;
    private final wzi<Flowable<String>> c;

    public tdh(wzi<tkk> wzi, wzi<a> wzi2, wzi<Flowable<String>> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final tdg a(Flowable<tds> flowable) {
        return new tdg((tkk) a(this.a.get(), 1), (a) a(this.b.get(), 2), (Flowable) a(this.c.get(), 3), (Flowable) a(flowable, 4));
    }
}
