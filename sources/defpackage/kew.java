package defpackage;

import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.WazeBannerModel.Type;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: kew reason: default package */
public final class kew {
    private final BehaviorSubject<WazeBannerModel> a = BehaviorSubject.a();
    private final seo b;

    public kew(seo seo) {
        this.b = seo;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ WazeBannerModel a(WazeBannerModel wazeBannerModel, Boolean bool) {
        if (bool.booleanValue()) {
            if (wazeBannerModel.a() == Type.CONNECT_BANNER) {
                return WazeBannerModel.a(Type.NO_BANNER).a();
            }
            if (wazeBannerModel.a() == Type.GOTO_BANNER) {
                String i = wazeBannerModel.i();
                if ("com.spotify.music.internal.service.waze.WAKE_BY_INTERAPP".equals(i) || "com.spotify.music.internal.service.waze.LAUNCH".equals(i)) {
                    return WazeBannerModel.a(Type.GOTO_BANNER_UNIFIED).f(wazeBannerModel.i()).a();
                }
            }
            if (wazeBannerModel.a() == Type.GOTO_BANNER) {
                wazeBannerModel = WazeBannerModel.a(Type.NO_BANNER).a();
            }
        }
        return wazeBannerModel;
    }

    public final Observable<WazeBannerModel> a() {
        return Observable.a((ObservableSource<? extends T1>) this.a, (ObservableSource<? extends T2>) this.b.a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$kew$S14_CtwFRBO4LAESu0LuOGXfH5I.INSTANCE);
    }

    public final void a(WazeBannerModel wazeBannerModel) {
        this.a.onNext(wazeBannerModel);
    }
}
