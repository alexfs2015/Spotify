package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: imd reason: default package */
public final class imd {
    private static final Pattern a = Pattern.compile("spotify:image:", 16);

    imd() {
    }

    public final Optional<StreamingCardData> a(Optional<PlayerState> optional, Queue<ContentItem> queue) {
        Builder builder = StreamingCardData.builder();
        ArrayDeque arrayDeque = new ArrayDeque(queue);
        PlayerTrack playerTrack = null;
        PlayerState playerState = optional.b() ? (PlayerState) optional.c() : null;
        if (playerState != null) {
            playerTrack = playerState.track();
        }
        if (queue.size() < 3) {
            return Optional.e();
        }
        if (playerState == null || playerTrack == null) {
            builder.mainContentItem((ContentItem) fay.a(arrayDeque.poll()));
            builder.listItem1((ContentItem) fay.a(arrayDeque.poll()));
            builder.listItem2((ContentItem) fay.a(arrayDeque.poll()));
        } else {
            Map metadata = playerTrack.metadata();
            String a2 = a(metadata, "title");
            String a3 = a(metadata, "artist_name");
            String replaceAll = a.matcher(a(metadata, "image_large_url")).replaceAll(Matcher.quoteReplacement(""));
            StringBuilder sb = new StringBuilder("https://i.scdn.co/image/");
            sb.append(gbm.a(replaceAll, far.c));
            builder.mainContentItem(ContentItem.builder().contentUri(playerState.contextUri()).title(a2).metadata1(a3).metadata2((String) playerState.contextMetadata().get("context_description")).imageUrl(sb.toString()).intentDataUriString(playerState.contextUri()).build());
            String contextUri = ((PlayerState) optional.c()).contextUri();
            if (((ContentItem) fay.a(arrayDeque.peek())).contentUri().equals(contextUri)) {
                arrayDeque.remove();
            }
            builder.listItem1((ContentItem) fay.a(arrayDeque.poll()));
            if (((ContentItem) fay.a(arrayDeque.peek())).contentUri().equals(contextUri)) {
                arrayDeque.remove();
            }
            builder.listItem2((ContentItem) fay.a(arrayDeque.poll()));
            builder.isPaused(playerState.isPaused());
            builder.isPlaying(playerState.isPlaying());
            builder.isPrevButtonDisabled(!playerState.restrictions().disallowSkippingPrevReasons().isEmpty());
            builder.isNextButtonDisabled(!playerState.restrictions().disallowSkippingNextReasons().isEmpty());
            builder.trackUri(playerTrack.uri());
        }
        return Optional.b(builder.build());
    }

    private static String a(Map<String, String> map, String str) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return str2;
        }
        Logger.d("Metadata doesn't contain key: %s", str);
        return "";
    }
}
