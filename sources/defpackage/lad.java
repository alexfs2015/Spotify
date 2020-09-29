package defpackage;

import android.content.Context;
import com.spotify.music.internal.util.process.ProcessType;

/* renamed from: lad reason: default package */
public final class lad implements vua<ProcessType> {
    private final wlc<Context> a;

    private lad(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static lad a(wlc<Context> wlc) {
        return new lad(wlc);
    }

    public final /* synthetic */ Object get() {
        ProcessType processType;
        Context context = (Context) this.a.get();
        if (a.a) {
            processType = ProcessType.UNKNOWN;
        } else {
            processType = ProcessType.a(new gad(context).a("com.spotify.music"));
        }
        return (ProcessType) vuf.a(processType, "Cannot return null from a non-@Nullable @Provides method");
    }
}
