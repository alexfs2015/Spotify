package defpackage;

import com.spotify.libs.pse.model.PreSignupExperimentFlags;
import io.reactivex.Single;

/* renamed from: gmm reason: default package */
public interface gmm {
    @wtn(a = {"No-Webgate-Authentication: true"})
    @wti(a = "v1/pses/featureflags/{installationId}/android/{version}/{locale}")
    Single<PreSignupExperimentFlags> a(@wtv(a = "installationId") String str, @wtv(a = "version") String str2, @wtv(a = "locale") String str3);
}
