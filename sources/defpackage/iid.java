package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.IapException;
import com.spotify.mobile.android.spotlets.appprotocol.NotAuthorizedException;
import com.spotify.mobile.android.spotlets.appprotocol.UserIsNotLoggedInException;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ImageIdentifier;
import io.reactivex.Completable;
import io.reactivex.functions.Action;

/* renamed from: iid reason: default package */
public final class iid {
    private final iif a;
    private volatile SessionState b;

    public iid(iif iif) {
        this.a = iif;
    }

    public final void a(SessionState sessionState) {
        this.b = sessionState;
    }

    public final Completable a(int i) {
        return Completable.a(a(), b(i));
    }

    public final Completable a() {
        return Completable.a((Action) new $$Lambda$iid$XPTO7HN4PzScwLQNorGjWI6cA(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        SessionState sessionState = this.b;
        if (sessionState == null || !sessionState.loggedIn()) {
            throw new UserIsNotLoggedInException();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i) {
        iif iif = this.a;
        if (!((iif.a & i) == i)) {
            throw new NotAuthorizedException(i, iif.a);
        }
    }

    public final Completable b(int i) {
        return Completable.a((Action) new $$Lambda$iid$hZvyE4asafRnZIsxY4Xv3v1pClU(this, i));
    }

    public final Completable a(int i, ImageIdentifier imageIdentifier) {
        return Completable.a(a(i), a((Object) imageIdentifier, "Identifier is null."), a(imageIdentifier, "ImageUri is null or empty."));
    }

    private static Completable a(Object obj, String str) {
        return Completable.a((Action) new $$Lambda$iid$LY4N8u5OtC3Vb95lKg3Uy2n81I4(obj, str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(Object obj, String str) {
        if (obj == null) {
            throw IapException.a(str, "wamp.error.invalid_argument");
        }
    }

    private static Completable a(ImageIdentifier imageIdentifier, String str) {
        return Completable.a((Action) new $$Lambda$iid$9KBrkIIQESWr61HDkxx7Y64S3JU(imageIdentifier, str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(ImageIdentifier imageIdentifier, String str) {
        if (imageIdentifier == null || imageIdentifier.id == null) {
            throw IapException.a(str, "wamp.error.invalid_argument");
        }
    }
}
