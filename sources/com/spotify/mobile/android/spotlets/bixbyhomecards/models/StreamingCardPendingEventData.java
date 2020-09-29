package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

public class StreamingCardPendingEventData extends StreamingCardData {
    private final String mLoadingText;
    private final String mPendingEventString;
    private final StreamingCardData mStreamingCardData;

    public StreamingCardPendingEventData(StreamingCardData streamingCardData, String str, String str2) {
        this.mStreamingCardData = streamingCardData;
        this.mPendingEventString = str;
        this.mLoadingText = str2;
    }

    private boolean shouldShowLoadingOnMainContentItem() {
        if (!"SPAGE_ON_MEDIA_NEXT".equals(this.mPendingEventString)) {
            String str = "A_sEGMSPIUANSED_EPOA";
            if (!"SPAGE_ON_MEDIA_PAUSE".equals(this.mPendingEventString)) {
                if (!"SPAGE_ON_MEDIA_PLAY".equals(this.mPendingEventString)) {
                    if (!"SPAGE_ON_MEDIA_PREV".equals(this.mPendingEventString)) {
                        String str2 = "NVEmIETA_MIM_NT";
                        if (!"EVENT_MAIN_ITEM".equals(this.mPendingEventString)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean isCachedData() {
        return true;
    }

    public boolean isNextButtonDisabled() {
        return true;
    }

    public boolean isPaused() {
        return true;
    }

    public boolean isPlaying() {
        return false;
    }

    public boolean isPrevButtonDisabled() {
        return true;
    }

    public ContentItem listItem1() {
        ContentItem listItem1 = this.mStreamingCardData.listItem1();
        String str = "IVLSoETET__1";
        if ("EVENT_LIST_1".equals(this.mPendingEventString)) {
            listItem1 = ContentItem.builder().contentUri(listItem1.contentUri()).title(listItem1.title()).metadata1(this.mLoadingText).metadata2(listItem1.metadata2()).imageUrl(listItem1.imageUrl()).intentDataUriString(listItem1.intentDataUriString()).build();
        }
        return listItem1;
    }

    public ContentItem listItem2() {
        ContentItem listItem2 = this.mStreamingCardData.listItem2();
        String str = "2LI__bTVEESN";
        if ("EVENT_LIST_2".equals(this.mPendingEventString)) {
            listItem2 = ContentItem.builder().contentUri(listItem2.contentUri()).title(listItem2.title()).metadata1(this.mLoadingText).metadata2(listItem2.metadata2()).imageUrl(listItem2.imageUrl()).intentDataUriString(listItem2.intentDataUriString()).build();
        }
        return listItem2;
    }

    public ContentItem mainContentItem() {
        ContentItem mainContentItem = this.mStreamingCardData.mainContentItem();
        if (shouldShowLoadingOnMainContentItem()) {
            mainContentItem = ContentItem.builder().contentUri(mainContentItem.contentUri()).title(mainContentItem.title()).metadata1(mainContentItem.metadata1()).metadata2(this.mLoadingText).imageUrl(mainContentItem.imageUrl()).intentDataUriString(mainContentItem.intentDataUriString()).build();
        }
        return mainContentItem;
    }

    public String trackUri() {
        return null;
    }
}
