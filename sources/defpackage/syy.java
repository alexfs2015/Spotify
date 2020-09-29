package defpackage;

import com.spotify.mobile.android.connect.view.ConnectView;

/* renamed from: syy reason: default package */
public final class syy {
    public static syx a(ConnectView connectView) {
        return new syx((ConnectView) a(connectView, 1));
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
