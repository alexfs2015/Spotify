package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: nrt reason: default package */
public final class nrt {
    public final wzi<Context> a;
    public final wzi<nru> b;
    public final wzi<ToastieManager> c;

    public nrt(wzi<Context> wzi, wzi<nru> wzi2, wzi<ToastieManager> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
