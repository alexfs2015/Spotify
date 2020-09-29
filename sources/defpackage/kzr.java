package defpackage;

import com.spotify.music.cappedondemand.core.model.CappedOndemandStatus;
import io.reactivex.Single;

/* renamed from: kzr reason: default package */
public interface kzr {
    @xhn(a = "cap-notifier/config/dialog/on-demand")
    Single<kzw> a();

    @xhn(a = "cap-notifier/config/dialog/reached-cap")
    Single<kzw> b();

    @xhn(a = "cap-notifier/config/dialog/on-demand-countdown")
    Single<kzw> c();

    @xhn(a = "cap-notifier/config/dialog/reached-cap-countdown")
    Single<kzw> d();

    @xhn(a = "cap-notifier/cap/status")
    Single<CappedOndemandStatus> e();
}
