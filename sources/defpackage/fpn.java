package defpackage;

import com.spotify.accountrecovery.api.models.MagicLinkRequestBody;
import com.spotify.accountrecovery.api.models.SetPasswordRequestBody;
import io.reactivex.Single;

/* renamed from: fpn reason: default package */
public interface fpn {
    @xhs(a = {"No-Webgate-Authentication: true"})
    @xhw(a = "accountrecovery/v2/magiclink/")
    Single<xgo<String>> a(@xhi MagicLinkRequestBody magicLinkRequestBody);

    @xhx(a = "accountrecovery/v2/password/")
    Single<xgo<String>> a(@xhi SetPasswordRequestBody setPasswordRequestBody);
}
