package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.localfilesimport.model.LocalSourceJacksonModel;
import java.util.List;

/* renamed from: nrj reason: default package */
public abstract class nrj {
    @JsonProperty("sources")
    public abstract List<LocalSourceJacksonModel> a();
}
