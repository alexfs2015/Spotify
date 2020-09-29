package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$1EPZUnfQUWJRLeicK6xhTbdyhac reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$1EPZUnfQUWJRLeicK6xhTbdyhac implements Function {
    public static final /* synthetic */ $$Lambda$1EPZUnfQUWJRLeicK6xhTbdyhac INSTANCE = new $$Lambda$1EPZUnfQUWJRLeicK6xhTbdyhac();

    private /* synthetic */ $$Lambda$1EPZUnfQUWJRLeicK6xhTbdyhac() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SessionState) obj).loggedIn());
    }
}
