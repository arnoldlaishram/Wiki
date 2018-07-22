package com.moneytap.assignment.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Query {

    @SerializedName("redirects")
    @Expose
    private List<Redirect> redirects = null;
    @SerializedName("pages")
    @Expose
    private List<Page> pages = null;

    /**
     * No args constructor for use in serialization
     */
    public Query() {
    }

    /**
     * @param pages
     * @param redirects
     */
    public Query(List<Redirect> redirects, List<Page> pages) {
        super();
        this.redirects = redirects;
        this.pages = pages;
    }

    public List<Redirect> getRedirects() {
        return redirects;
    }

    public void setRedirects(List<Redirect> redirects) {
        this.redirects = redirects;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

}