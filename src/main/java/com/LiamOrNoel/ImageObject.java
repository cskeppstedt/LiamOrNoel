/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LiamOrNoel;

/**
 *
 * @author jonatan
 */
public class ImageObject {

    private final long id;
    private final String url;
    private final String name;

    public ImageObject(long id, String url, String name) {
        this.id = id;
        this.url = url;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

}
