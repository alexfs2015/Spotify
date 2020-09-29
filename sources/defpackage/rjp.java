package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.comscore.android.id.IdHelperAndroid;

/* renamed from: rjp reason: default package */
public final class rjp {
    private final rjs a;

    public rjp(rjs rjs) {
        this.a = rjs;
    }

    public final void a(View view, gzq gzq) {
        String str;
        fay.a(view);
        String str2 = IdHelperAndroid.NO_ID_AVAILABLE;
        if (gzq == null) {
            str = str2;
        } else {
            str = gzq.string("style", str2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1984141450:
                if (str.equals("vertical")) {
                    c = 0;
                    break;
                }
                break;
            case -238453707:
                if (str.equals("diagonal")) {
                    c = 1;
                    break;
                }
                break;
            case 3387192:
                if (str.equals(str2)) {
                    c = 3;
                    break;
                }
                break;
            case 1544803905:
                if (str.equals("default")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.a.a(view, gzq, 0);
        } else if (c == 1) {
            this.a.a(view, gzq, 1);
        } else if (c != 2) {
            ip.a(view, (Drawable) null);
        } else {
            this.a.a(view);
        }
    }
}
