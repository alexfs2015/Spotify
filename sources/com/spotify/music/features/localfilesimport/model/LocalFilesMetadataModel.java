package com.spotify.music.features.localfilesimport.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalFilesMetadataModel implements JacksonModel {
    @JsonProperty("metadata")
    private final LocalFilesMetadataChildModel mModel;

    public LocalFilesMetadataModel(@JsonProperty("metadata") LocalFilesMetadataChildModel localFilesMetadataChildModel) {
        this.mModel = localFilesMetadataChildModel;
    }

    public LocalFilesMetadataChildModel getModel() {
        return this.mModel;
    }
}
