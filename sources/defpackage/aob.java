package defpackage;

import android.content.Context;
import android.os.Bundle;

@Deprecated
/* renamed from: aob reason: default package */
final class aob extends ams {
    private String e;

    aob(Context context, String str, String str2) {
        super(context, 65542, 65543, 20141001, str);
        this.e = str2;
    }

    public final void a(Bundle bundle) {
        bundle.putString("com.facebook.platform.extra.OBJECT_ID", this.e);
    }
}
