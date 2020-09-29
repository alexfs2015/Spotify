package defpackage;

import com.crashlytics.android.answers.SamplingEventFilter$1;
import com.crashlytics.android.answers.SessionEvent;
import com.crashlytics.android.answers.SessionEvent.Type;
import java.util.Set;

/* renamed from: ahh reason: default package */
public final class ahh implements agy {
    private static Set<Type> b = new SamplingEventFilter$1();
    private int a;

    public ahh(int i) {
        this.a = i;
    }

    public final boolean a(SessionEvent sessionEvent) {
        return (b.contains(sessionEvent.c) && sessionEvent.a.e == null) && (Math.abs(sessionEvent.a.c.hashCode() % this.a) != 0);
    }
}
