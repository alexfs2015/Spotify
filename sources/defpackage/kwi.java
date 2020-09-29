package defpackage;

import com.spotify.music.cappedondemand.core.model.CappedOndemandStatus;
import io.reactivex.Single;

/* renamed from: kwi reason: default package */
public interface kwi {
    @wti(a = "cap-notifier/config/dialog/on-demand")
    Single<kwn> a();

    @wti(a = "cap-notifier/config/dialog/reached-cap")
    Single<kwn> b();

    @wti(a = "cap-notifier/config/dialog/on-demand-countdown")
    Single<kwn> c();

    @wti(a = "cap-notifier/config/dialog/reached-cap-countdown")
    Single<kwn> d();

    @wti(a = "cap-notifier/cap/status")
    Single<CappedOndemandStatus> e();
}
