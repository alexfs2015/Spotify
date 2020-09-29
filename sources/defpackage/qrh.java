package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: qrh reason: default package */
public final class qrh implements wig<qrg> {
    private final wzi<jlr> a;
    private final wzi<InteractionLogger> b;
    private final wzi<ImpressionLogger> c;
    private final wzi<qul> d;

    private qrh(wzi<jlr> wzi, wzi<InteractionLogger> wzi2, wzi<ImpressionLogger> wzi3, wzi<qul> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qrh a(wzi<jlr> wzi, wzi<InteractionLogger> wzi2, wzi<ImpressionLogger> wzi3, wzi<qul> wzi4) {
        return new qrh(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new qrg((jlr) this.a.get(), (InteractionLogger) this.b.get(), (ImpressionLogger) this.c.get(), (qul) this.d.get());
    }
}
