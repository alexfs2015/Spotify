package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.localfilesimport.model.LocalSourceJacksonModel;
import java.util.List;

/* renamed from: nxm reason: default package */
public abstract class nxm {
    @JsonProperty("sources")
    public abstract List<LocalSourceJacksonModel> a();
}
