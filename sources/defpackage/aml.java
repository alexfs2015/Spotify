package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: aml reason: default package */
public final class aml {
    public Uri a;

    public aml(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String a2 = ani.a();
        StringBuilder sb = new StringBuilder();
        sb.append(akq.h());
        sb.append("/dialog/");
        sb.append(str);
        this.a = ank.a(a2, sb.toString(), bundle);
    }
}
