package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Single;

/* renamed from: spq reason: default package */
public interface spq {
    Single<spw> resolve(Intent intent, fpt fpt, SessionState sessionState);
}
