package com.spotify.music.libs.search.online.autocomplete;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.io.Serializable;
import java.util.List;

@JsonDeserialize(using = QueryAutocompleteResult_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryAutocompleteResult implements JacksonModel, Serializable {
    private static final long serialVersionUID = 8146168771073578153L;
    public final List<String> options;
    public final String requestid;

    @JsonCreator
    public QueryAutocompleteResult(@JsonProperty("requestid") String str, @JsonProperty("options") List<String> list) {
        this.requestid = (String) fay.a(str);
        this.options = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryAutocompleteResult)) {
            return false;
        }
        QueryAutocompleteResult queryAutocompleteResult = (QueryAutocompleteResult) obj;
        return this.requestid.equals(queryAutocompleteResult.requestid) && this.options.equals(queryAutocompleteResult.options);
    }

    public int hashCode() {
        return (this.requestid.hashCode() * 31) + this.options.hashCode();
    }
}
