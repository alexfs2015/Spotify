package defpackage;

import com.spotify.libs.pse.model.PreSignupExperimentFlags;
import io.reactivex.Single;

/* renamed from: gob reason: default package */
public interface gob {
    @xhs(a = {"No-Webgate-Authentication: true"})
    @xhn(a = "v1/pses/featureflags/{installationId}/android/{version}/{locale}")
    Single<PreSignupExperimentFlags> a(@xia(a = "installationId") String str, @xia(a = "version") String str2, @xia(a = "locale") String str3);
}
