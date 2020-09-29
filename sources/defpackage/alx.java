package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: alx reason: default package */
public final class alx {
    public Uri a;

    public alx(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String a2 = amu.a();
        StringBuilder sb = new StringBuilder();
        sb.append(akc.h());
        sb.append("/dialog/");
        sb.append(str);
        this.a = amw.a(a2, sb.toString(), bundle);
    }
}
