package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: mce reason: default package */
public class mce implements mcp {
    private final List<mcp> a;

    mce(List<mcp> list) {
        this.a = list;
    }

    public final boolean a(Uri uri) {
        for (mcp a2 : this.a) {
            if (a2.a(uri)) {
                return true;
            }
        }
        return false;
    }
}
