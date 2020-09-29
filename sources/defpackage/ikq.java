package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.IapException;
import com.spotify.mobile.android.spotlets.appprotocol.NotAuthorizedException;
import com.spotify.mobile.android.spotlets.appprotocol.UserIsNotLoggedInException;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ImageIdentifier;
import io.reactivex.Completable;
import io.reactivex.functions.Action;

/* renamed from: ikq reason: default package */
public final class ikq {
    private final iks a;
    private volatile SessionState b;

    public ikq(iks iks) {
        this.a = iks;
    }

    private static Completable a(ImageIdentifier imageIdentifier, String str) {
        return Completable.a((Action) new $$Lambda$ikq$7_zbtXTUc4kCq8XGT1WXm4SaPUI(imageIdentifier, str));
    }

    private static Completable a(Object obj, String str) {
        return Completable.a((Action) new $$Lambda$ikq$6iqd3suZGbi9Q7_OrMOD_l1_AvM(obj, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        SessionState sessionState = this.b;
        if (sessionState == null || !sessionState.loggedIn()) {
            throw new UserIsNotLoggedInException();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(ImageIdentifier imageIdentifier, String str) {
        if (imageIdentifier == null || imageIdentifier.id == null) {
            throw IapException.a(str, "wamp.error.invalid_argument");
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(Object obj, String str) {
        if (obj == null) {
            throw IapException.a(str, "wamp.error.invalid_argument");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(int i) {
        iks iks = this.a;
        if (!((iks.a & i) == i)) {
            throw new NotAuthorizedException(i, iks.a);
        }
    }

    public final Completable a() {
        return Completable.a((Action) new $$Lambda$ikq$8O8q7YBDeAJqBJZRkhZTzrzXfuk(this));
    }

    public final Completable a(int i) {
        return Completable.a(a(), b(i));
    }

    public final Completable a(int i, ImageIdentifier imageIdentifier) {
        return Completable.a(a(i), a((Object) imageIdentifier, "Identifier is null."), a(imageIdentifier, "ImageUri is null or empty."));
    }

    public final void a(SessionState sessionState) {
        this.b = sessionState;
    }

    public final Completable b(int i) {
        return Completable.a((Action) new $$Lambda$ikq$HoP_okMGjdIUhVCn_EOXbR3N5XI(this, i));
    }
}
