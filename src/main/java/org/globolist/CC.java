package org.globolist;

import org.globolist.entities.WarcContent;

public class CC {
    String crawl;
    String subset;
    String Segment;
    String filename;
    Integer recordOffset;
    Integer recordLength;

    //crawl/*/segment/subset/filename
    //"s3://commoncrawl/crawl-data/CC-MAIN-2017-39/segments/1505818689752.21/warc/CC-MAIN-20170923160736-20170923180736-00256.warc.gz"

    /**
     * Returns a single page of content from CC. Requires all parameters to be stored in db.
     */
    public WarcContent getContent(String crawl, String subset, String Segment, String filename, Integer recordOffset, Integer recordLength) {
        this.crawl = crawl;
        this.subset = subset;
        this.Segment = Segment;
        this.filename = filename;
        this.recordOffset = recordOffset;
        this.recordLength = recordLength;
        WarcContent warcContent = new WarcContent();
        return warcContent;
    }

    /**
     * Gets most recent archive for given url.
     */
//    public WarcContent getContent(int url) {
//        return getContent(getLocationForUrl(url));
//    }

    /**
     * Returns all version of a page for a given url. Requires that all of CC is in database (less content)
     */
    public int getContents(int url) {
        return 0;
    }

    public int getContents(String warcId) {
        return 0;
    }

}
