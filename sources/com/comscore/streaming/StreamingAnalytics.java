package com.comscore.streaming;

import com.comscore.util.MapUtils;
import com.comscore.util.cpp.CppJavaBinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class StreamingAnalytics extends CppJavaBinder {
    private static WeakHashMap<Long, PlaybackSession> b = new WeakHashMap<>();
    private static PlaybackSession c = new PlaybackSession(0);
    private static Object d = new Object();
    private long a;

    public StreamingAnalytics() {
        this(null);
    }

    public StreamingAnalytics(StreamingConfiguration streamingConfiguration) {
        long j = 0;
        this.a = 0;
        if (streamingConfiguration != null) {
            j = streamingConfiguration.a();
        }
        try {
            this.a = newCppInstanceNative(j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    private native void addListenerNative(long j, StreamingListener streamingListener);

    private native boolean containsLabelNative(long j, String str);

    private native void createPlaybackSessionNative(long j, Map<String, String> map);

    private native void destroyCppInstanceNative(long j);

    private native int getCurrentStateNative(long j);

    private native List<Map<String, Long>> getHeartbeatIntervalsNative(long j);

    private native long getKeepAliveIntervalNative(long j);

    private native String getLabelNative(long j, String str);

    private native Map<String, String> getLabelsNative(long j);

    private native long getLoadTimeOffsetNative(long j);

    private native long getPauseOnBufferingIntervalNative(long j);

    private native long getPlaybackIntervalMergeToleranceNative(long j);

    private native long getPlaybackSessionRefNative(long j);

    private native long getThrottlingDelayNative(long j);

    private native boolean isPauseOnBufferingEnabledNative(long j);

    private native boolean isThrottlingEnabledNative(long j);

    private native long newCppInstanceNative(long j);

    private native boolean notifyBufferStartNative(long j, long j2, Map<String, String> map);

    private native boolean notifyBufferStopNative(long j, long j2, Map<String, String> map);

    private native boolean notifyCallToActionNative(long j, long j2, Map<String, String> map);

    private native boolean notifyChangeAudioTrackNative(long j, String str, long j2, Map<String, String> map);

    private native boolean notifyChangeBitrateNative(long j, int i, long j2, Map<String, String> map);

    private native boolean notifyChangeCDNNative(long j, String str, long j2, Map<String, String> map);

    private native boolean notifyChangePlaybackRateNative(long j, int i, long j2, Map<String, String> map);

    private native boolean notifyChangeSubtitleTrackNative(long j, String str, long j2, Map<String, String> map);

    private native boolean notifyChangeVideoTrackNative(long j, String str, long j2, Map<String, String> map);

    private native boolean notifyChangeVolumeNative(long j, int i, long j2, Map<String, String> map);

    private native boolean notifyChangeWindowStateNative(long j, String str, long j2, Map<String, String> map);

    private native boolean notifyCustomEventNative(long j, long j2, Map<String, String> map);

    private native boolean notifyDRMApproveNative(long j, long j2, Map<String, String> map);

    private native boolean notifyDRMDenyNative(long j, long j2, Map<String, String> map);

    private native boolean notifyDRMFailNative(long j, long j2, Map<String, String> map);

    private native boolean notifyEndNative(long j, long j2, Map<String, String> map);

    private native boolean notifyEngageNative(long j, long j2, Map<String, String> map);

    private native boolean notifyErrorNative(long j, long j2, Map<String, String> map);

    private native boolean notifyLoadNative(long j, long j2, Map<String, String> map);

    private native boolean notifyPauseNative(long j, long j2, Map<String, String> map);

    private native boolean notifyPlayNative(long j, long j2, Map<String, String> map);

    private native boolean notifySeekStartNative(long j, long j2, Map<String, String> map);

    private native boolean notifySkipAdNative(long j, long j2, Map<String, String> map);

    private native boolean notifyTransferPlaybackNative(long j, long j2, Map<String, String> map);

    private native void removeAllLabelsNative(long j);

    private native void removeLabelNative(long j, String str);

    private native void removeListenerNative(long j, StreamingListener streamingListener);

    private native void resetNative(long j);

    private native void setDVRWindowLengthNative(long j, long j2);

    private native void setDVRWindowOffsetNative(long j, long j2);

    private native void setHeartbeatIntervalsNative(long j, ArrayList<HashMap<String, Long>> arrayList);

    private native void setKeepAliveIntervalNative(long j, long j2);

    private native void setLabelNative(long j, String str, String str2);

    private native void setLabelsNative(long j, Map<String, String> map);

    private native void setLoadTimeOffsetNative(long j, long j2);

    private native void setPauseOnBufferingIntervalNative(long j, long j2);

    private native void setPauseOnBufferingNative(long j, boolean z);

    private native void setPlaybackIntervalMergeToleranceNative(long j, long j2);

    private native void setThrottlingDelayNative(long j, long j2);

    private native boolean setThrottlingNative(long j, boolean z);

    public void addListener(StreamingListener streamingListener) {
        try {
            addListenerNative(this.a, streamingListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public boolean containsLabel(String str) {
        try {
            return containsLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public void createPlaybackSession() {
        createPlaybackSession(null);
    }

    public void createPlaybackSession(Map<String, String> map) {
        try {
            createPlaybackSessionNative(this.a, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void destroyCppObject() {
        try {
            destroyCppInstanceNative(this.a);
            this.a = 0;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof StreamingAnalytics) && ((StreamingAnalytics) obj).a == this.a;
    }

    public int getCurrentState() {
        try {
            return getCurrentStateNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public List<Map<String, Long>> getHeartbeatIntervals() {
        try {
            return getHeartbeatIntervalsNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public long getKeepAliveInterval() {
        try {
            return getKeepAliveIntervalNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public String getLabel(String str) {
        try {
            return getLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public Map<String, String> getLabels() {
        try {
            return getLabelsNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public long getLoadTimeOffset() {
        try {
            return getLoadTimeOffsetNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public long getPauseOnBufferingInterval() {
        try {
            return getPauseOnBufferingIntervalNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public long getPlaybackIntervalMergeTolerance() {
        try {
            return getPlaybackIntervalMergeToleranceNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public PlaybackSession getPlaybackSession() {
        try {
            long playbackSessionRefNative = getPlaybackSessionRefNative(this.a);
            synchronized (d) {
                if (b.containsKey(Long.valueOf(playbackSessionRefNative))) {
                    PlaybackSession playbackSession = (PlaybackSession) b.get(Long.valueOf(playbackSessionRefNative));
                    return playbackSession;
                }
                PlaybackSession playbackSession2 = new PlaybackSession(playbackSessionRefNative);
                b.put(Long.valueOf(playbackSessionRefNative), playbackSession2);
                return playbackSession2;
            }
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return c;
        }
    }

    public long getThrottlingDelay() {
        try {
            return getThrottlingDelayNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
        }
    }

    public boolean isPauseOnBufferingEnabled() {
        try {
            return isPauseOnBufferingEnabledNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean isThrottlingEnabled() {
        try {
            return isThrottlingEnabledNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyBufferStart() {
        return notifyBufferStart(-1, null);
    }

    public boolean notifyBufferStart(long j) {
        return notifyBufferStart(j, null);
    }

    public boolean notifyBufferStart(long j, Map<String, String> map) {
        try {
            return notifyBufferStartNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyBufferStart(Map<String, String> map) {
        return notifyBufferStart(-1, map);
    }

    public boolean notifyBufferStop() {
        return notifyBufferStop(-1, null);
    }

    public boolean notifyBufferStop(long j) {
        return notifyBufferStop(j, null);
    }

    public boolean notifyBufferStop(long j, Map<String, String> map) {
        try {
            return notifyBufferStopNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyBufferStop(Map<String, String> map) {
        return notifyBufferStop(-1, map);
    }

    public boolean notifyCallToAction() {
        return notifyCallToAction(-1, null);
    }

    public boolean notifyCallToAction(long j) {
        return notifyCallToAction(j, null);
    }

    public boolean notifyCallToAction(long j, Map<String, String> map) {
        try {
            return notifyCallToActionNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyCallToAction(Map<String, String> map) {
        return notifyCallToAction(null);
    }

    public boolean notifyChangeAudioTrack(String str) {
        return notifyChangeAudioTrack(str, -1, null);
    }

    public boolean notifyChangeAudioTrack(String str, long j) {
        return notifyChangeAudioTrack(str, j, null);
    }

    public boolean notifyChangeAudioTrack(String str, long j, Map<String, String> map) {
        try {
            return notifyChangeAudioTrackNative(this.a, str, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyChangeAudioTrack(String str, Map<String, String> map) {
        return notifyChangeAudioTrack(str, -1, map);
    }

    public boolean notifyChangeBitrate(int i) {
        return notifyChangeBitrate(i, -1, null);
    }

    public boolean notifyChangeBitrate(int i, long j) {
        return notifyChangeBitrate(i, j, null);
    }

    public boolean notifyChangeBitrate(int i, long j, Map<String, String> map) {
        try {
            return notifyChangeBitrateNative(this.a, i, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyChangeBitrate(int i, Map<String, String> map) {
        return notifyChangeBitrate(i, -1, map);
    }

    public boolean notifyChangeCDN(String str) {
        return notifyChangeCDN(str, -1, null);
    }

    public boolean notifyChangeCDN(String str, long j) {
        return notifyChangeCDN(str, j, null);
    }

    public boolean notifyChangeCDN(String str, long j, Map<String, String> map) {
        try {
            return notifyChangeCDNNative(this.a, str, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyChangeCDN(String str, Map<String, String> map) {
        return notifyChangeCDN(str, -1, map);
    }

    public boolean notifyChangePlaybackRate(int i) {
        return notifyChangePlaybackRate(i, -1, null);
    }

    public boolean notifyChangePlaybackRate(int i, long j) {
        return notifyChangePlaybackRate(i, j, null);
    }

    public boolean notifyChangePlaybackRate(int i, long j, Map<String, String> map) {
        try {
            return notifyChangePlaybackRateNative(this.a, i, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyChangePlaybackRate(int i, Map<String, String> map) {
        return notifyChangePlaybackRate(i, -1, map);
    }

    public boolean notifyChangeSubtitleTrack(String str) {
        return notifyChangeSubtitleTrack(str, -1, null);
    }

    public boolean notifyChangeSubtitleTrack(String str, long j) {
        return notifyChangeSubtitleTrack(str, j, null);
    }

    public boolean notifyChangeSubtitleTrack(String str, long j, Map<String, String> map) {
        try {
            return notifyChangeSubtitleTrackNative(this.a, str, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyChangeSubtitleTrack(String str, Map<String, String> map) {
        return notifyChangeSubtitleTrack(str, -1, map);
    }

    public boolean notifyChangeVideoTrack(String str) {
        return notifyChangeVideoTrack(str, -1, null);
    }

    public boolean notifyChangeVideoTrack(String str, long j) {
        return notifyChangeVideoTrack(str, j, null);
    }

    public boolean notifyChangeVideoTrack(String str, long j, Map<String, String> map) {
        try {
            return notifyChangeVideoTrackNative(this.a, str, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyChangeVideoTrack(String str, Map<String, String> map) {
        return notifyChangeVideoTrack(str, -1, map);
    }

    public boolean notifyChangeVolume(int i) {
        return notifyChangeVolume(i, -1, null);
    }

    public boolean notifyChangeVolume(int i, long j) {
        return notifyChangeVolume(i, j, null);
    }

    public boolean notifyChangeVolume(int i, long j, Map<String, String> map) {
        try {
            return notifyChangeVolumeNative(this.a, i, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyChangeVolume(int i, Map<String, String> map) {
        return notifyChangeVolume(i, -1, map);
    }

    public boolean notifyChangeWindowState(String str) {
        return notifyChangeWindowState(str, -1, null);
    }

    public boolean notifyChangeWindowState(String str, long j) {
        return notifyChangeWindowState(str, j, null);
    }

    public boolean notifyChangeWindowState(String str, long j, Map<String, String> map) {
        try {
            return notifyChangeWindowStateNative(this.a, str, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyChangeWindowState(String str, Map<String, String> map) {
        return notifyChangeWindowState(str, -1, map);
    }

    public boolean notifyCustomEvent() {
        return notifyCustomEvent(-1, null);
    }

    public boolean notifyCustomEvent(long j) {
        return notifyCustomEvent(j, null);
    }

    public boolean notifyCustomEvent(long j, Map<String, String> map) {
        try {
            return notifyCustomEventNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyCustomEvent(Map<String, String> map) {
        return notifyCustomEvent(-1, map);
    }

    public boolean notifyDRMApprove() {
        return notifyDRMApprove(-1, null);
    }

    public boolean notifyDRMApprove(long j) {
        return notifyDRMApprove(j, null);
    }

    public boolean notifyDRMApprove(long j, Map<String, String> map) {
        try {
            return notifyDRMApproveNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyDRMApprove(Map<String, String> map) {
        return notifyDRMApprove(-1, map);
    }

    public boolean notifyDRMDeny() {
        return notifyDRMDeny(-1, null);
    }

    public boolean notifyDRMDeny(long j) {
        return notifyDRMDeny(j, null);
    }

    public boolean notifyDRMDeny(long j, Map<String, String> map) {
        try {
            return notifyDRMDenyNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyDRMDeny(Map<String, String> map) {
        return notifyDRMDeny(-1, map);
    }

    public boolean notifyDRMFail() {
        return notifyDRMFail(-1, null);
    }

    public boolean notifyDRMFail(long j) {
        return notifyDRMFail(j, null);
    }

    public boolean notifyDRMFail(long j, Map<String, String> map) {
        try {
            return notifyDRMFailNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyDRMFail(Map<String, String> map) {
        return notifyDRMFail(-1, map);
    }

    public boolean notifyEnd() {
        return notifyEnd(-1, null);
    }

    public boolean notifyEnd(long j) {
        return notifyEnd(j, null);
    }

    public boolean notifyEnd(long j, Map<String, String> map) {
        try {
            return notifyEndNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyEnd(Map<String, String> map) {
        return notifyEnd(-1, map);
    }

    public boolean notifyEngage() {
        return notifyEngage(-1, null);
    }

    public boolean notifyEngage(long j) {
        return notifyEngage(j, null);
    }

    public boolean notifyEngage(long j, Map<String, String> map) {
        try {
            return notifyEngageNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyEngage(Map<String, String> map) {
        return notifyEngage(-1, map);
    }

    public boolean notifyError() {
        return notifyError(-1, null);
    }

    public boolean notifyError(long j) {
        return notifyError(j, null);
    }

    public boolean notifyError(long j, Map<String, String> map) {
        try {
            return notifyErrorNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyError(Map<String, String> map) {
        return notifyError(-1, map);
    }

    public boolean notifyLoad() {
        return notifyLoad(-1, null);
    }

    public boolean notifyLoad(long j) {
        return notifyLoad(j, null);
    }

    public boolean notifyLoad(long j, Map<String, String> map) {
        try {
            return notifyLoadNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyLoad(Map<String, String> map) {
        return notifyLoad(-1, map);
    }

    public boolean notifyPause() {
        return notifyPause(-1, null);
    }

    public boolean notifyPause(long j) {
        return notifyPause(j, null);
    }

    public boolean notifyPause(long j, Map<String, String> map) {
        try {
            return notifyPauseNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyPause(Map<String, String> map) {
        return notifyPause(-1, map);
    }

    public boolean notifyPlay() {
        return notifyPlay(-1, null);
    }

    public boolean notifyPlay(long j) {
        return notifyPlay(j, null);
    }

    public boolean notifyPlay(long j, Map<String, String> map) {
        try {
            return notifyPlayNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyPlay(Map<String, String> map) {
        return notifyPlay(-1, map);
    }

    public boolean notifySeekStart() {
        return notifySeekStart(-1, null);
    }

    public boolean notifySeekStart(long j) {
        return notifySeekStart(j, null);
    }

    public boolean notifySeekStart(long j, Map<String, String> map) {
        try {
            return notifySeekStartNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifySeekStart(Map<String, String> map) {
        return notifySeekStart(-1, map);
    }

    public boolean notifySkipAd() {
        return notifySkipAd(-1, null);
    }

    public boolean notifySkipAd(long j) {
        return notifySkipAd(j, null);
    }

    public boolean notifySkipAd(long j, Map<String, String> map) {
        try {
            return notifySkipAdNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifySkipAd(Map<String, String> map) {
        return notifySkipAd(-1, map);
    }

    public boolean notifyTransferPlayback() {
        return notifyTransferPlayback(-1, null);
    }

    public boolean notifyTransferPlayback(long j) {
        return notifyTransferPlayback(j, null);
    }

    public boolean notifyTransferPlayback(long j, Map<String, String> map) {
        try {
            return notifyTransferPlaybackNative(this.a, j, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean notifyTransferPlayback(Map<String, String> map) {
        return notifyTransferPlayback(-1, map);
    }

    public void removeAllLabels() {
        try {
            removeAllLabelsNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeLabel(String str) {
        try {
            removeLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeListener(StreamingListener streamingListener) {
        try {
            removeListenerNative(this.a, streamingListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void reset() {
        try {
            resetNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setDVRWindowLength(long j) {
        try {
            setDVRWindowLengthNative(this.a, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setDVRWindowOffset(long j) {
        try {
            setDVRWindowOffsetNative(this.a, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setHeartbeatIntervals(ArrayList<HashMap<String, Long>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            loop0:
            while (it.hasNext()) {
                Iterator it2 = ((Map) it.next()).entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Entry entry = (Entry) it2.next();
                        if (entry.getKey() instanceof String) {
                            if (!(entry.getValue() instanceof Long)) {
                                break loop0;
                            }
                        } else {
                            break loop0;
                        }
                    }
                }
                throw new IllegalArgumentException("intervals must be and object of type ArrayList<HashMap<String, Long>>");
            }
            try {
                setHeartbeatIntervalsNative(this.a, arrayList);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setKeepAliveInterval(long j) {
        try {
            setKeepAliveIntervalNative(this.a, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLabel(String str, String str2) {
        if (str2 != null) {
            try {
                setLabelNative(this.a, str, str2);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
            return;
        }
        removeLabel(str);
    }

    public void setLabels(Map<String, String> map) {
        Map mapOfStrings = MapUtils.mapOfStrings(map);
        HashMap hashMap = new HashMap();
        try {
            for (Entry entry : mapOfStrings.entrySet()) {
                if (entry.getValue() == null) {
                    removeLabel((String) entry.getKey());
                } else {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            setLabelsNative(this.a, hashMap);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLoadTimeOffset(long j) {
        try {
            setLoadTimeOffsetNative(this.a, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPauseOnBufferingEnabled(boolean z) {
        try {
            setPauseOnBufferingNative(this.a, z);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPauseOnBufferingInterval(long j) {
        try {
            setPauseOnBufferingIntervalNative(this.a, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPlaybackIntervalMergeTolerance(long j) {
        try {
            setPlaybackIntervalMergeToleranceNative(this.a, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setThrottling(boolean z) {
        try {
            setThrottlingNative(this.a, z);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setThrottlingDelay(long j) {
        try {
            setThrottlingDelayNative(this.a, j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
