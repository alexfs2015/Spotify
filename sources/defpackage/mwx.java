package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: mwx reason: default package */
public abstract class mwx {
    @JsonCreator
    public static mwx create(@JsonProperty("mutations") mxa mxa) {
        return new mwr(mxa);
    }

    public abstract mxa a();
}
