package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;

/* renamed from: nvo reason: default package */
public final class nvo {
    public final nvy a;
    public final nvg b;
    public final kda c;
    public final nvw d;
    public final Scheduler e;

    nvo(nvy nvy, nvg nvg, kda kda, nvw nvw, Scheduler scheduler) {
        this.a = nvy;
        this.b = nvg;
        this.c = kda;
        this.d = nvw;
        this.e = scheduler;
    }

    public static ObservableTransformer<d, nvl> a(nvw nvw) {
        return new $$Lambda$nvo$sjCJins_vt5UVLE0w6Y9EKy8Xs(nvw);
    }

    public static Consumer<c> a(nvy nvy) {
        return new $$Lambda$nvo$aDaTnDK3Zqxtv4fZP3ARL3kVYA(nvy);
    }

    public static Consumer<e> a(kda kda) {
        return new $$Lambda$nvo$9UaUGkjbLlA4PM0Jrjy5qfP4NM(kda);
    }

    public static ObservableTransformer<b, nvl> a(nvg nvg) {
        return new $$Lambda$nvo$dJuo3jkgfjy1v0g2baFeF1qCy4(nvg);
    }

    public static Consumer<a> b(nvy nvy) {
        return new $$Lambda$nvo$X7zFvzjEq_4Ew_qVK5BFVjOb18E(nvy);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(nvy nvy, c cVar) {
        if (cVar.a == PartnerType.WAZE) {
            nvy.b();
        } else if (cVar.a == PartnerType.GOOGLE_MAPS) {
            nvy.a();
        } else {
            Logger.e("Unrecognized partner app: %s", cVar.a.toString());
        }
    }
}
