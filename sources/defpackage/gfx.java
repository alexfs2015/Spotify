package defpackage;

import com.spotify.eventsender.gabo.PublishEventsRequest;
import com.spotify.eventsender.gabo.PublishEventsResponse;

/* renamed from: gfx reason: default package */
public interface gfx {
    @wtr(a = "gabo-receiver-service/v3/events")
    wru<PublishEventsResponse> a(@wtd PublishEventsRequest publishEventsRequest);

    @wtr(a = "gabo-receiver-service/public/v3/events")
    wru<PublishEventsResponse> b(@wtd PublishEventsRequest publishEventsRequest);
}
