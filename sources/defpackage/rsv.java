package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.comscore.android.id.IdHelperAndroid;

/* renamed from: rsv reason: default package */
public final class rsv {
    private final rsy a;

    public rsv(rsy rsy) {
        this.a = rsy;
    }

    public final void a(View view, hcj hcj) {
        fbp.a(view);
        String str = IdHelperAndroid.NO_ID_AVAILABLE;
        String string = hcj == null ? str : hcj.string("style", str);
        char c = 65535;
        switch (string.hashCode()) {
            case -1984141450:
                if (string.equals("vertical")) {
                    c = 0;
                    break;
                }
                break;
            case -238453707:
                if (string.equals("diagonal")) {
                    c = 1;
                    break;
                }
                break;
            case 3387192:
                if (string.equals(str)) {
                    c = 3;
                    break;
                }
                break;
            case 1544803905:
                if (string.equals("default")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.a.a(view, hcj, 0);
        } else if (c == 1) {
            this.a.a(view, hcj, 1);
        } else if (c != 2) {
            ip.a(view, (Drawable) null);
        } else {
            this.a.a(view);
        }
    }
}
