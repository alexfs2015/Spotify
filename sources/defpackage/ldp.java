package defpackage;

import android.content.Context;
import com.spotify.music.internal.util.process.ProcessType;

/* renamed from: ldp reason: default package */
public final class ldp implements wig<ProcessType> {
    private final wzi<Context> a;

    private ldp(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static ldp a(wzi<Context> wzi) {
        return new ldp(wzi);
    }

    public final /* synthetic */ Object get() {
        return (ProcessType) wil.a(a.a ? ProcessType.UNKNOWN : ProcessType.a(new gax((Context) this.a.get()).a("com.spotify.music")), "Cannot return null from a non-@Nullable @Provides method");
    }
}
