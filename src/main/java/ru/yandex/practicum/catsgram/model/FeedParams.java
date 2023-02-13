package ru.yandex.practicum.catsgram.model;

import java.util.List;

public class FeedParams {
    private String sort;
    private Integer size;
    private List<String> friendsEmails;

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<String> getFriendsEmails() {
        return friendsEmails;
    }

    public void setFriendsEmails(List<String> friendsEmails) {
        this.friendsEmails = friendsEmails;
    }
}
