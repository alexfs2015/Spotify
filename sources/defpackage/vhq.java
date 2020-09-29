package defpackage;

import com.spotify.rcs.model.GranularConfiguration;
import io.reactivex.Single;

/* renamed from: vhq reason: default package */
public interface vhq {

    /* renamed from: vhq$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static vhq a(a aVar) {
            return (vhq) aVar.a((a) wsx.a()).a((a) new wst(null, false)).a().a(vhq.class);
        }
    }

    @wti(a = "remote-config-resolver/v2/configs/platforms/{platform}/clients/{client-id}/property-sets/{property-set-key}")
    Single<wsj<GranularConfiguration>> a(@wtv(a = "platform") String str, @wtv(a = "client-id") String str2, @wtv(a = "property-set-key") String str3, @wtw(a = "installation-id") String str4, @wtw(a = "version") String str5, @wtw(a = "fetch-type") String str6);
}
