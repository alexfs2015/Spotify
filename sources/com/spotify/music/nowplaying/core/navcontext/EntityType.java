package com.spotify.music.nowplaying.core.navcontext;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public enum EntityType {
    UNKNOWN(0, 0),
    ADVERTISEMENT(R.string.player_radio_advertisement_by),
    ALBUM(R.string.context_type_description_album),
    ARTIST(R.string.context_type_description_artist),
    ACTIVITY(R.string.context_type_description_activity, R.string.activity_feed_nav_title),
    ALBUM_RADIO(R.string.context_type_description_album_radio),
    ARTIST_RADIO(R.string.context_type_description_artist_radio),
    BROWSE(R.string.context_type_description_browse),
    CHARTS(R.string.context_type_description_chart),
    CLUSTER(R.string.context_type_description_daily_mix),
    DAILY_MIX(R.string.context_type_description_daily_mix),
    GENRE_RADIO(R.string.context_type_description_genre_radio),
    INTERRUPTION(R.string.sas_interruption_title),
    LOCAL_FILES(R.string.context_type_description_collection, R.string.local_files_title),
    NEW_MUSIC_TUESDAY(R.string.context_type_description_album),
    PLAY_QUEUE(R.string.context_type_description_play_queue),
    PLAYLIST(R.string.context_type_description_playlist),
    PLAYLIST_FOLDER(R.string.context_type_description_folder),
    PLAYLIST_RADIO(R.string.context_type_description_playlist_radio),
    PROFILE(R.string.context_type_description_profile),
    RADIO(R.string.context_type_description_radio),
    SEARCH(R.string.context_type_description_search),
    SHOW(R.string.context_type_description_show),
    SHOW_VIDEO(R.string.context_type_description_show_video),
    START_PAGE(R.string.context_type_description_start_page),
    SUGGESTED_TRACK(R.string.context_type_description_suggested_track),
    TRACK(R.string.context_type_description_track),
    TRACK_RADIO(R.string.context_type_description_track_radio),
    YOUR_LIBRARY(R.string.context_type_description_collection_your_library, R.string.collection_start_songs_title),
    YOUR_LIBRARY_ALBUM(R.string.context_type_description_collection_your_library),
    YOUR_LIBRARY_ARTIST(R.string.context_type_description_collection_your_library),
    YOUR_LIBRARY_TRACKS(R.string.context_type_description_collection_your_library, R.string.collection_start_songs_title),
    YOUR_LIBRARY_PODCAST_DOWNLOADS(R.string.context_type_description_collection_your_library, R.string.collection_podcasts_tab_downloads),
    YOUR_LIBRARY_PODCAST_EPISODES(R.string.context_type_description_collection_your_library, R.string.collection_podcasts_tab_episodes),
    YOUR_LIBRARY_PODCAST_FOLLOWING(R.string.context_type_description_collection_your_library, R.string.collection_podcasts_tab_shows),
    YOUR_MUSIC(R.string.context_type_description_collection, R.string.collection_start_songs_title),
    YOUR_MUSIC_ALBUM(R.string.context_type_description_collection),
    YOUR_MUSIC_ARTIST(R.string.context_type_description_collection),
    YOUR_MUSIC_TRACKS(R.string.context_type_description_collection, R.string.collection_start_songs_title),
    YOUR_MUSIC_OFFLINED_EPISODES(R.string.context_type_description_collection, R.string.collection_episodes_offlined_title),
    YOUR_MUSIC_UNPLAYED_EPISODES(R.string.context_type_description_collection, R.string.collection_episodes_unheard_title);
    
    private static final Map<String, EntityType> P = null;
    public final tck mSubtitleHolder;
    public final tck mTitleHolder;

    static {
        HashMap hashMap = new HashMap();
        P = hashMap;
        hashMap.put("album", ALBUM);
        P.put("com.spotify.feature.album", ALBUM);
        P.put(udt.e.a(), ARTIST);
        P.put("com.spotify.feature.artist", ARTIST);
        P.put("chart", CHARTS);
        P.put("discover-weekly", PLAYLIST);
        P.put("library-collection", YOUR_MUSIC);
        P.put("library-collection-album", YOUR_MUSIC_ALBUM);
        P.put("library-collection-artist", YOUR_MUSIC_ARTIST);
        P.put("library-collection-missing-album", ALBUM);
        P.put("localfiles", LOCAL_FILES);
        P.put(udt.az.a(), PLAYLIST);
        P.put("playlistfolder", PLAYLIST_FOLDER);
        P.put("playlists", PLAYLIST_FOLDER);
        P.put("playqueue", PLAY_QUEUE);
        P.put("profile", PROFILE);
        P.put("search", SEARCH);
        P.put("com.spotify.feature.search", SEARCH);
        P.put("com.spotify.feature.profile", PROFILE);
        P.put("social-feed", ACTIVITY);
        P.put("com.spotify.feature.browse", BROWSE);
        P.put("com.spotify.feature.newmusictuesday", NEW_MUSIC_TUESDAY);
        P.put("com.spotify.feature.chart", CHARTS);
        P.put("com.spotify.feature.startpage", START_PAGE);
        P.put(udt.aW.a(), START_PAGE);
        P.put(udt.aS.a(), PLAYLIST);
    }

    private EntityType(int i) {
        this(r2, r3, i, 0);
    }

    private EntityType(int i, int i2) {
        this.mTitleHolder = new tcl(i);
        this.mSubtitleHolder = new tcl(i2);
    }

    private static EntityType a(String str) {
        EntityType entityType = UNKNOWN;
        if (ViewUris.aJ.b(str)) {
            return ALBUM;
        }
        if (ViewUris.ay.b(str)) {
            return GENRE_RADIO;
        }
        if (ViewUris.av.b(str)) {
            return ARTIST_RADIO;
        }
        if (ViewUris.aw.b(str)) {
            return ALBUM_RADIO;
        }
        if (ViewUris.ax.b(str)) {
            return TRACK_RADIO;
        }
        if (ViewUris.az.b(str)) {
            return PLAYLIST_RADIO;
        }
        if (ViewUris.d.b(str)) {
            return RADIO;
        }
        if (ViewUris.at.b(str)) {
            return GENRE_RADIO;
        }
        if (ViewUris.aq.b(str)) {
            return ARTIST_RADIO;
        }
        if (ViewUris.ar.b(str)) {
            return ALBUM_RADIO;
        }
        if (ViewUris.as.b(str)) {
            return TRACK_RADIO;
        }
        if (ViewUris.au.b(str)) {
            return PLAYLIST_RADIO;
        }
        if (ViewUris.al.b(str)) {
            return CLUSTER;
        }
        if (ViewUris.an.b(str)) {
            return DAILY_MIX;
        }
        if (ViewUris.aj.b(str)) {
            return RADIO;
        }
        if (ViewUris.aK.b(str)) {
            return ARTIST;
        }
        if (ViewUris.aB.b(str) || ViewUris.aH.b(str) || ViewUris.aG.b(str)) {
            return PLAYLIST;
        }
        if (ViewUris.aI.b(str)) {
            return PLAYLIST_FOLDER;
        }
        if (ViewUris.ag.b(str)) {
            return SEARCH;
        }
        if (ViewUris.bh.b(str)) {
            return YOUR_MUSIC_ALBUM;
        }
        if (ViewUris.bb.b(str) || ViewUris.bc.b(str)) {
            return YOUR_MUSIC;
        }
        if (ViewUris.bi.b(str)) {
            return YOUR_MUSIC_ARTIST;
        }
        if (ViewUris.bj.b(str)) {
            return YOUR_MUSIC_TRACKS;
        }
        if (ViewUris.bn.b(str)) {
            return YOUR_LIBRARY_PODCAST_DOWNLOADS;
        }
        if (ViewUris.bm.b(str)) {
            return YOUR_LIBRARY_PODCAST_EPISODES;
        }
        if (ViewUris.bl.b(str)) {
            return YOUR_LIBRARY_PODCAST_FOLLOWING;
        }
        if (ViewUris.e.b(str) || ViewUris.t.b(str)) {
            return START_PAGE;
        }
        return entityType;
    }

    private static EntityType a(String str, Map<String, String> map) {
        jst a = jst.a(str);
        switch (a.b) {
            case COLLECTION_PODCASTS_EPISODES:
                return YOUR_LIBRARY_PODCAST_EPISODES;
            case COLLECTION_PODCASTS_DOWNLOADS:
                return YOUR_LIBRARY_PODCAST_DOWNLOADS;
            case COLLECTION_PODCASTS_FOLLOWING:
                return YOUR_LIBRARY_PODCAST_FOLLOWING;
            case SHOW_SHOW:
            case SHOW_EPISODE:
                if ("video".equals(map.get("media.type"))) {
                    return SHOW_VIDEO;
                }
                return SHOW;
            case RADIO_ALBUM:
                return ALBUM_RADIO;
            case RADIO_ARTIST:
                return ARTIST_RADIO;
            case RADIO_PLAYLIST:
            case STATION_PLAYLIST_V2:
                return PLAYLIST_RADIO;
            case RADIO_TRACK:
                return TRACK_RADIO;
            case RADIO_GENRE:
                return GENRE_RADIO;
            case STATION_CLUSTER:
                return CLUSTER;
            case DAILYMIX:
                return DAILY_MIX;
            case STATION:
                return RADIO;
            default:
                return UNKNOWN;
        }
    }

    public static EntityType a(PlayerState playerState) {
        EntityType entityType;
        EntityType a;
        PlayerState playerState2 = (PlayerState) fay.a(playerState);
        PlayerTrack track = playerState2.track();
        String str = "";
        if (track != null) {
            str = (String) jtc.a(track.provider(), str);
        }
        EntityType entityType2 = UNKNOWN;
        if ("queue".equals(str)) {
            entityType2 = PLAY_QUEUE;
        } else if (str.startsWith("mft/") && !"mft/context_switch".equals(str)) {
            entityType2 = SUGGESTED_TRACK;
        }
        if (entityType == UNKNOWN) {
            PlayerTrack track2 = playerState2.track();
            EntityType entityType3 = UNKNOWN;
            if (PlayerTrackUtil.isAd(track2)) {
                entityType = ADVERTISEMENT;
            } else if (PlayerTrackUtil.isInterruptionFromAds(track2)) {
                entityType = INTERRUPTION;
            } else if (PlayerTrackUtil.isSuggestedTrack(track2)) {
                entityType = SUGGESTED_TRACK;
            } else {
                entityType = entityType3;
            }
            if (entityType == UNKNOWN) {
                entityType = (EntityType) jtc.a((EntityType) P.get(playerState2.playOrigin().featureIdentifier().toLowerCase(Locale.US)), UNKNOWN);
                if (entityType == UNKNOWN) {
                    String viewUri = playerState2.playOrigin().viewUri();
                    if (viewUri != null) {
                        entityType = a(viewUri);
                    }
                    if (entityType == UNKNOWN) {
                        entityType = a(playerState2.entityUri(), playerState2.contextMetadata());
                        if (entityType == UNKNOWN) {
                            String contextUri = playerState2.contextUri();
                            Map contextMetadata = playerState2.contextMetadata();
                            if (LinkType.TRACK == jst.a(contextUri).b) {
                                a = TRACK;
                            } else {
                                a = a(contextUri, contextMetadata);
                                if (a == UNKNOWN) {
                                    a = a(contextUri);
                                }
                            }
                            entityType = a;
                            EntityType entityType4 = UNKNOWN;
                        }
                    }
                }
            }
        }
        switch (entityType) {
            case YOUR_MUSIC:
                return YOUR_LIBRARY;
            case YOUR_MUSIC_ALBUM:
                return YOUR_LIBRARY_ALBUM;
            case YOUR_MUSIC_ARTIST:
                return YOUR_LIBRARY_ARTIST;
            case YOUR_MUSIC_TRACKS:
                return YOUR_LIBRARY_TRACKS;
            case YOUR_MUSIC_OFFLINED_EPISODES:
                return YOUR_LIBRARY_PODCAST_DOWNLOADS;
            case YOUR_MUSIC_UNPLAYED_EPISODES:
                return YOUR_LIBRARY_PODCAST_EPISODES;
            default:
                return entityType;
        }
    }
}
