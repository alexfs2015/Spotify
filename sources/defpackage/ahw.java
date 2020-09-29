package defpackage;

import android.content.Context;
import com.crashlytics.android.answers.SessionEvent;
import java.util.UUID;

/* renamed from: ahw reason: default package */
final class ahw extends wkx<SessionEvent> {
    wlq a;

    ahw(Context context, aib aib, wjx wjx, wky wky) {
        super(context, aib, wjx, wky, 100);
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
        wlq wlq = this.a;
        return wlq == null ? super.b() : wlq.d;
    }

    public final int c() {
        wlq wlq = this.a;
        return wlq == null ? super.c() : wlq.c;
    }
}
