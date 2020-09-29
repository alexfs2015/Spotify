package defpackage;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.spotify.music.features.quicksilver.triggers.models.ClientEventTrigger;
import com.spotify.music.features.quicksilver.triggers.models.PlaybackStartedTrigger;
import com.spotify.music.features.quicksilver.triggers.models.UriTrigger;

@JsonTypeInfo(include = As.EXISTING_PROPERTY, property = "type", use = Id.NAME)
@JsonSubTypes({@Type(name = "URI", value = UriTrigger.class), @Type(name = "CLIENT_EVENT", value = ClientEventTrigger.class), @Type(name = "PLAYBACK_STARTED", value = PlaybackStartedTrigger.class)})
/* renamed from: prk reason: default package */
public interface prk extends Parcelable {
    String getFormat();

    String getTriggerString();

    String getType();

    boolean matches(String str);
}
