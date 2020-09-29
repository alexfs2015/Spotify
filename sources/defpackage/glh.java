package defpackage;

import android.widget.Button;
import com.spotify.libs.glue.custom.playbutton.CirclePlayButtonView;

/* renamed from: glh reason: default package */
public final class glh implements a {
    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ glf a(CirclePlayButtonView circlePlayButtonView) {
        return new glg((CirclePlayButtonView) a(circlePlayButtonView, 1));
    }

    public final /* synthetic */ glf a(Button button) {
        return new glg((Button) a(button, 1));
    }
}
