package defpackage;

import com.spotify.accountrecovery.api.models.MagicLinkRequestBody;
import com.spotify.accountrecovery.api.models.SetPasswordRequestBody;
import io.reactivex.Single;

/* renamed from: fot reason: default package */
public interface fot {
    @wtn(a = {"No-Webgate-Authentication: true"})
    @wtr(a = "accountrecovery/v2/magiclink/")
    Single<wsj<String>> a(@wtd MagicLinkRequestBody magicLinkRequestBody);

    @wts(a = "accountrecovery/v2/password/")
    Single<wsj<String>> a(@wtd SetPasswordRequestBody setPasswordRequestBody);
}
