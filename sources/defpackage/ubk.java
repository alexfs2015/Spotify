package defpackage;

import com.spotify.music.connection.OfflineState;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: ubk reason: default package */
public final class ubk {
    /* access modifiers changed from: private */
    public static /* synthetic */ ubf a(OfflineState offlineState) {
        return new e(!offlineState.offline());
    }

    public static Observable<ubf> a(uau uau) {
        return uau.a().c((Function<? super T, ? extends R>) $$Lambda$guA2WtC2GpLQNAPy5oFGrNuO3M.INSTANCE).a(Functions.a()).a((Predicate<? super T>) $$Lambda$mQ4M3Kr8cNdgjpV5VNMrmP932g.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$ubk$z_hB6luKMbdmK6fbVGRLDHbjxV8.INSTANCE);
    }

    public static Observable<ubf> b(uau uau) {
        return uau.a().c((Function<? super T, ? extends R>) $$Lambda$uoz9gFjOO5_WWBUJYe3iAngLS8.INSTANCE).a(Functions.a()).a((Predicate<? super T>) $$Lambda$mQ4M3Kr8cNdgjpV5VNMrmP932g.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$ubk$XuDI_N9ArM6D5oUrJguh4MhO9xM.INSTANCE);
    }

    public static Observable<ubf> c(uau uau) {
        return uau.a().c((Function<? super T, ? extends R>) $$Lambda$lgns_U_LSoiNHLNpsuQqIhiFxJY.INSTANCE);
    }

    public static Observable<ubf> a(ufm ufm) {
        return ufm.a.c((Function<? super T, ? extends R>) $$Lambda$ubk$zTPbtMYuqjaw0HDCLwjrzN6VM.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ubf a(Boolean bool) {
        return new c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ubf b(Boolean bool) {
        return new k();
    }
}
