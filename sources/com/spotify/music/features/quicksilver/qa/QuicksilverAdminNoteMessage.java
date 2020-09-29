package com.spotify.music.features.quicksilver.qa;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class QuicksilverAdminNoteMessage implements Parcelable, JacksonModel {
    @JsonProperty("active")
    public abstract boolean active();

    @JsonProperty("content")
    public abstract NoteMessage content();

    @JsonProperty("group_id")
    public abstract int groupId();

    @JsonProperty("id")
    public abstract String id();

    @JsonProperty("locale")
    public abstract String locales();

    @JsonProperty("template_id")
    public abstract int templateId();

    @JsonCreator
    public static QuicksilverAdminNoteMessage create(@JsonProperty("id") String str, @JsonProperty("active") boolean z, @JsonProperty("content") NoteMessage noteMessage, @JsonProperty("group_id") int i, @JsonProperty("locale") String str2, @JsonProperty("template_id") int i2) {
        AutoValue_QuicksilverAdminNoteMessage autoValue_QuicksilverAdminNoteMessage = new AutoValue_QuicksilverAdminNoteMessage(str, z, noteMessage, i, str2, i2);
        return autoValue_QuicksilverAdminNoteMessage;
    }
}
