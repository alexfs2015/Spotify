package defpackage;

import com.spotify.eventsender.gabo.PublishEventsRequest;
import com.spotify.eventsender.gabo.PublishEventsResponse;

/* renamed from: ghi reason: default package */
public interface ghi {
    @xhw(a = "gabo-receiver-service/v3/events")
    xfz<PublishEventsResponse> a(@xhi PublishEventsRequest publishEventsRequest);

    @xhw(a = "gabo-receiver-service/public/v3/events")
    xfz<PublishEventsResponse> b(@xhi PublishEventsRequest publishEventsRequest);
}
