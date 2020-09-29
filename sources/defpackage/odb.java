package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.music.json.CustomFeature;

/* renamed from: odb reason: default package */
public interface odb {

    /* renamed from: odb$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static ObjectMapper a(rnf rnf) {
            return rnf.a().a(CustomFeature.FIELD_VISIBILITY_ANY).a();
        }
    }
}
