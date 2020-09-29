package defpackage;

import android.content.Context;
import com.crashlytics.android.answers.SessionEvent;
import java.util.UUID;

/* renamed from: ahi reason: default package */
final class ahi extends vwr<SessionEvent> {
    vxk a;

    ahi(Context context, ahn ahn, vvr vvr, vws vws) {
        super(context, ahn, vvr, vws, 100);
    }

    public final String a() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder("sa");
        String str = "_";
        sb.append(str);
        sb.append(randomUUID.toString());
        sb.append(str);
        sb.append(this.b.a());
        sb.append(".tap");
        return sb.toString();
    }

    public final int b() {
        vxk vxk = this.a;
        return vxk == null ? super.b() : vxk.d;
    }

    public final int c() {
        vxk vxk = this.a;
        return vxk == null ? super.c() : vxk.c;
    }
}
