package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: mrz reason: default package */
public abstract class mrz {
    public abstract msa a();

    @JsonCreator
    public static mrz create(@JsonProperty("mutations") msa msa) {
        return new mru(msa);
    }
}
