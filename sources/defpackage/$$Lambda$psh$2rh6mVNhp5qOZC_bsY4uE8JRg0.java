package defpackage;

import android.net.Uri;
import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$psh$2rh6mVNhp5qOZC-_bsY4uE8JRg0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$psh$2rh6mVNhp5qOZC_bsY4uE8JRg0 implements Function {
    private final /* synthetic */ RxWebToken f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$psh$2rh6mVNhp5qOZC_bsY4uE8JRg0(RxWebToken rxWebToken, Scheduler scheduler) {
        this.f$0 = rxWebToken;
        this.f$1 = scheduler;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(Uri.parse(((f) obj).a)).a(this.f$1).c((Function<? super T, ? extends R>) $$Lambda$z63H8lak4T1UFPJdvPnkxn5vc.INSTANCE);
    }
}
