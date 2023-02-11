package org.globolist.entities;

public class WarcUrl {

    String url;
    Host host;
    String surtKey;
    String protocol;
    String port;
    String path;
    String query;

    class Host {
        String name;
        String tld;
        String secondLastPart;
        String thirdLastPart;
        String forthLastPart;
        String fifthLastPart;
        String registrySuffix;
        String registeredDomain;
        String privateSuffix;
        String privateDomain;
        String nameReversed;
    }
}
